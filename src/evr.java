import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evr extends gob {
   private static final ajc a = new ajc("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final fgh v;
   @Nullable
   private euk w;
   private final long x;
   private final vs[] y = new vs[]{vs.c("mco.brokenworld.message.line1"), vs.c("mco.brokenworld.message.line2")};
   private int z;
   private final List<Integer> A = Lists.newArrayList();
   private int B;

   public evr(fgh $$0, long $$1, boolean $$2) {
      super($$2 ? vs.c("mco.brokenworld.minigame.title") : vs.c("mco.brokenworld.title"));
      this.v = $$0;
      this.x = $$1;
   }

   @Override
   public void aP_() {
      this.z = this.g / 2 - 150;
      this.c(fak.a(vr.k, $$0 -> this.d()).a((this.g - 150) / 2, g(13) - 5, 150, 20).a());
      if (this.w == null) {
         this.a(this.x);
      } else {
         this.E();
      }
   }

   @Override
   public vs i() {
      return vv.a(Stream.concat(Stream.of(this.e), Stream.of(this.y)).collect(Collectors.toList()), vr.v);
   }

   private void E() {
      for (Entry<Integer, eur> $$0 : this.w.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.w.n || this.w.m == euk.d.b;
         fak $$3;
         if ($$2) {
            $$3 = fak.a(vs.c("mco.brokenworld.play"), $$1x -> this.f.a(new ewa(this.v, new exs(this.w.a, $$1, this::b)))).a(this.a($$1), g(8), 80, 20).a();
            $$3.j = !this.w.i.get($$1).n;
         } else {
            $$3 = fak.a(vs.c("mco.brokenworld.download"), $$1x -> {
               vs $$2x = vs.c("mco.configure.world.restore.download.question.line1");
               vs $$3x = vs.c("mco.configure.world.restore.download.question.line2");
               this.f.a(new evz($$1xx -> {
                  if ($$1xx) {
                     this.b($$1);
                  } else {
                     this.f.a(this);
                  }
               }, evz.a.b, $$2x, $$3x, true));
            }).a(this.a($$1), g(8), 80, 20).a();
         }

         if (this.A.contains($$1)) {
            $$3.j = false;
            $$3.b(vs.c("mco.brokenworld.downloaded"));
         }

         this.c($$3);
      }
   }

   @Override
   public void e() {
      this.B++;
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.y.length; $$4++) {
         $$0.a(this.i, this.y[$$4], this.g / 2, g(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.w != null) {
         for (Entry<Integer, eur> $$5 : this.w.i.entrySet()) {
            if ($$5.getValue().m != null && $$5.getValue().l != -1L) {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.w.n == $$5.getKey() && !this.H(),
                  $$5.getValue().a($$5.getKey()),
                  $$5.getKey(),
                  $$5.getValue().l,
                  $$5.getValue().m,
                  $$5.getValue().n
               );
            } else {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.w.n == $$5.getKey() && !this.H(),
                  $$5.getValue().a($$5.getKey()),
                  $$5.getKey(),
                  -1L,
                  null,
                  $$5.getValue().n
               );
            }
         }
      }
   }

   private int a(int $$0) {
      return this.z + ($$0 - 1) * 110;
   }

   private void a(long $$0) {
      new Thread(() -> {
         ett $$1 = ett.a();

         try {
            this.w = $$1.a($$0);
            this.E();
         } catch (evg var5) {
            b.error("Couldn't get own world", var5);
            this.f.a(new evx(var5, this.v));
         }
      }).start();
   }

   public void b() {
      new Thread(() -> {
         ett $$0 = ett.a();
         if (this.w.e == euk.c.a) {
            this.f.execute(() -> this.f.a(new ewa(this, new exl(this.w, this, true, this.f))));
         } else {
            try {
               euk $$1 = $$0.a(this.x);
               this.f.execute(() -> eto.a($$1, this));
            } catch (evg var3) {
               b.error("Couldn't get own world", var3);
               this.f.execute(() -> this.f.a(this.v));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      ett $$1 = ett.a();

      try {
         eva $$2 = $$1.b(this.w.a, $$0);
         evw $$3 = new evw(this, $$2, this.w.a($$0), $$1x -> {
            if ($$1x) {
               this.A.add($$0);
               this.r();
               this.E();
            } else {
               this.f.a(this);
            }
         });
         this.f.a($$3);
      } catch (evg var5) {
         b.error("Couldn't download world data", var5);
         this.f.a(new evx(var5, this));
      }
   }

   @Override
   public void d() {
      this.f.a(this.v);
   }

   private boolean H() {
      return this.w != null && this.w.m == euk.d.b;
   }

   private void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      ajc $$11;
      if ($$10) {
         $$11 = evm.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = ewz.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = evm.b;
      } else if ($$7 == 2) {
         $$11 = evm.c;
      } else if ($$7 == 3) {
         $$11 = evm.d;
      } else {
         $$11 = ewz.a(String.valueOf(this.w.p), this.w.q);
      }

      if (!$$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      } else if ($$5) {
         float $$17 = 0.9F + 0.1F * awm.b((float)this.B * 0.2F);
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
