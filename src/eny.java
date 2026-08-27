import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eny extends gew {
   private static final aeu a = new aeu("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final eyf y;
   private final elv z;
   @Nullable
   private emr A;
   private final long B;
   private final ti[] C = new ti[]{ti.c("mco.brokenworld.message.line1"), ti.c("mco.brokenworld.message.line2")};
   private int D;
   private final List<Integer> E = Lists.newArrayList();
   private int F;

   public eny(eyf $$0, elv $$1, long $$2, boolean $$3) {
      super($$3 ? ti.c("mco.brokenworld.minigame.title") : ti.c("mco.brokenworld.title"));
      this.y = $$0;
      this.z = $$1;
      this.B = $$2;
   }

   @Override
   public void aD_() {
      this.D = this.g / 2 - 150;
      this.d(esl.a(th.k, $$0 -> this.au_()).a((this.g - 150) / 2, h(13) - 5, 150, 20).a());
      if (this.A == null) {
         this.a(this.B);
      } else {
         this.C();
      }
   }

   @Override
   public ti g() {
      return tk.a(Stream.concat(Stream.of(this.e), Stream.of(this.C)).collect(Collectors.toList()), th.u);
   }

   private void C() {
      for (Entry<Integer, emy> $$0 : this.A.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.A.n || this.A.m == emr.c.b;
         esl $$3;
         if ($$2) {
            $$3 = esl.a(ti.c("mco.brokenworld.play"), $$1x -> this.f.a(new eoh(this.y, new epx(this.A.a, $$1, this::e)))).a(this.a($$1), h(8), 80, 20).a();
            $$3.i = !this.A.i.get($$1).l;
         } else {
            $$3 = esl.a(ti.c("mco.brokenworld.download"), $$1x -> {
               ti $$2x = ti.c("mco.configure.world.restore.download.question.line1");
               ti $$3x = ti.c("mco.configure.world.restore.download.question.line2");
               this.f.a(new eog($$1xx -> {
                  if ($$1xx) {
                     this.b($$1);
                  } else {
                     this.f.a(this);
                  }
               }, eog.a.b, $$2x, $$3x, true));
            }).a(this.a($$1), h(8), 80, 20).a();
         }

         if (this.E.contains($$1)) {
            $$3.i = false;
            $$3.b(ti.c("mco.brokenworld.downloaded"));
         }

         this.d($$3);
      }
   }

   @Override
   public void c() {
      this.F++;
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.C.length; $$4++) {
         $$0.a(this.i, this.C[$$4], this.g / 2, h(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.A != null) {
         for (Entry<Integer, emy> $$5 : this.A.i.entrySet()) {
            if ($$5.getValue().k != null && $$5.getValue().j != -1L) {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  h(1) + 5,
                  $$1,
                  $$2,
                  this.A.n == $$5.getKey() && !this.D(),
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
                  this.A.n == $$5.getKey() && !this.D(),
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
      return this.D + ($$0 - 1) * 110;
   }

   private void a(long $$0) {
      new Thread(() -> {
         ema $$1 = ema.a();

         try {
            this.A = $$1.a($$0);
            this.C();
         } catch (enn var5) {
            b.error("Couldn't get own world", var5);
            this.f.a(new eoe(var5, this.y));
         }
      }).start();
   }

   public void e() {
      new Thread(() -> {
         ema $$0 = ema.a();
         if (this.A.e == emr.b.a) {
            this.f.execute(() -> this.f.a(new eoh(this, new epr(this.A, this, this.z, true, this.f))));
         } else {
            try {
               emr $$1 = $$0.a(this.B);
               this.f.execute(() -> this.z.h().a($$1, this));
            } catch (enn var3) {
               b.error("Couldn't get own world", var3);
               this.f.execute(() -> this.f.a(this.y));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      ema $$1 = ema.a();

      try {
         enh $$2 = $$1.b(this.A.a, $$0);
         eod $$3 = new eod(this, $$2, this.A.a($$0), $$1x -> {
            if ($$1x) {
               this.E.add($$0);
               this.n();
               this.C();
            } else {
               this.f.a(this);
            }
         });
         this.f.a($$3);
      } catch (enn var5) {
         b.error("Couldn't download world data", var5);
         this.f.a(new eoe(var5, this));
      }
   }

   @Override
   public void au_() {
      this.f.a(this.y);
   }

   private boolean D() {
      return this.A != null && this.A.m == emr.c.b;
   }

   private void a(esa $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      aeu $$11;
      if ($$10) {
         $$11 = ent.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = epg.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = ent.b;
      } else if ($$7 == 2) {
         $$11 = ent.c;
      } else if ($$7 == 3) {
         $$11 = ent.d;
      } else {
         $$11 = epg.a(String.valueOf(this.A.p), this.A.q);
      }

      if (!$$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      } else if ($$5) {
         float $$17 = 0.9F + 0.1F * ars.b((float)this.F * 0.2F);
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
