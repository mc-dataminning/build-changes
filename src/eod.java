import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eod extends gfb {
   private static final aew a = new aew("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final eyk y;
   @Nullable
   private emw z;
   private final long A;
   private final tl[] B = new tl[]{tl.c("mco.brokenworld.message.line1"), tl.c("mco.brokenworld.message.line2")};
   private int C;
   private final List<Integer> D = Lists.newArrayList();
   private int E;

   public eod(eyk $$0, long $$1, boolean $$2) {
      super($$2 ? tl.c("mco.brokenworld.minigame.title") : tl.c("mco.brokenworld.title"));
      this.y = $$0;
      this.A = $$1;
   }

   @Override
   public void aH_() {
      this.C = this.g / 2 - 150;
      this.d(esq.a(tk.k, $$0 -> this.az_()).a((this.g - 150) / 2, h(13) - 5, 150, 20).a());
      if (this.z == null) {
         this.a(this.A);
      } else {
         this.D();
      }
   }

   @Override
   public tl g() {
      return tn.a(Stream.concat(Stream.of(this.e), Stream.of(this.B)).collect(Collectors.toList()), tk.u);
   }

   private void D() {
      for (Entry<Integer, end> $$0 : this.z.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.z.n || this.z.m == emw.c.b;
         esq $$3;
         if ($$2) {
            $$3 = esq.a(tl.c("mco.brokenworld.play"), $$1x -> this.f.a(new eom(this.y, new eqc(this.z.a, $$1, this::e)))).a(this.a($$1), h(8), 80, 20).a();
            $$3.i = !this.z.i.get($$1).l;
         } else {
            $$3 = esq.a(tl.c("mco.brokenworld.download"), $$1x -> {
               tl $$2x = tl.c("mco.configure.world.restore.download.question.line1");
               tl $$3x = tl.c("mco.configure.world.restore.download.question.line2");
               this.f.a(new eol($$1xx -> {
                  if ($$1xx) {
                     this.b($$1);
                  } else {
                     this.f.a(this);
                  }
               }, eol.a.b, $$2x, $$3x, true));
            }).a(this.a($$1), h(8), 80, 20).a();
         }

         if (this.D.contains($$1)) {
            $$3.i = false;
            $$3.b(tl.c("mco.brokenworld.downloaded"));
         }

         this.d($$3);
      }
   }

   @Override
   public void c() {
      this.E++;
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.B.length; $$4++) {
         $$0.a(this.i, this.B[$$4], this.g / 2, h(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.z != null) {
         for (Entry<Integer, end> $$5 : this.z.i.entrySet()) {
            if ($$5.getValue().k != null && $$5.getValue().j != -1L) {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  h(1) + 5,
                  $$1,
                  $$2,
                  this.z.n == $$5.getKey() && !this.E(),
                  $$5.getValue().a($$5.getKey()),
                  $$5.getKey(),
                  $$5.getValue().j,
                  $$5.getValue().k,
                  $$5.getValue().l
               );
            } else {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  h(1) + 5,
                  $$1,
                  $$2,
                  this.z.n == $$5.getKey() && !this.E(),
                  $$5.getValue().a($$5.getKey()),
                  $$5.getKey(),
                  -1L,
                  null,
                  $$5.getValue().l
               );
            }
         }
      }
   }

   private int a(int $$0) {
      return this.C + ($$0 - 1) * 110;
   }

   private void a(long $$0) {
      new Thread(() -> {
         emf $$1 = emf.a();

         try {
            this.z = $$1.a($$0);
            this.D();
         } catch (ens var5) {
            b.error("Couldn't get own world", var5);
            this.f.a(new eoj(var5, this.y));
         }
      }).start();
   }

   public void e() {
      new Thread(() -> {
         emf $$0 = emf.a();
         if (this.z.e == emw.b.a) {
            this.f.execute(() -> this.f.a(new eom(this, new epw(this.z, this, true, this.f))));
         } else {
            try {
               emw $$1 = $$0.a(this.A);
               this.f.execute(() -> ema.a($$1, this));
            } catch (ens var3) {
               b.error("Couldn't get own world", var3);
               this.f.execute(() -> this.f.a(this.y));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      emf $$1 = emf.a();

      try {
         enm $$2 = $$1.b(this.z.a, $$0);
         eoi $$3 = new eoi(this, $$2, this.z.a($$0), $$1x -> {
            if ($$1x) {
               this.D.add($$0);
               this.n();
               this.D();
            } else {
               this.f.a(this);
            }
         });
         this.f.a($$3);
      } catch (ens var5) {
         b.error("Couldn't download world data", var5);
         this.f.a(new eoj(var5, this));
      }
   }

   @Override
   public void az_() {
      this.f.a(this.y);
   }

   private boolean E() {
      return this.z != null && this.z.m == emw.c.b;
   }

   private void a(esf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      aew $$11;
      if ($$10) {
         $$11 = eny.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = epl.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = eny.b;
      } else if ($$7 == 2) {
         $$11 = eny.c;
      } else if ($$7 == 3) {
         $$11 = eny.d;
      } else {
         $$11 = epl.a(String.valueOf(this.z.p), this.z.q);
      }

      if (!$$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      } else if ($$5) {
         float $$17 = 0.9F + 0.1F * arw.b((float)this.E * 0.2F);
         $$0.a($$17, $$17, $$17, 1.0F);
      }

      $$0.a($$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
      if ($$5) {
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a(a, $$1, $$2, 80, 80);
      $$0.a(this.i, $$6, $$1 + 40, $$2 + 66, -1);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
