import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;

public class dys extends dyc {
   private static final int b = 32;
   public static final int a = 32;
   private static final int c = 34;
   private static final int d = 16;
   private static final int e = 8;
   private static final int f = 5;
   private static final int g = 20;
   private static final int h = 5;
   private static final int i = 100;
   private static final int j = 10;
   private static final int k = 10;
   private static final int l = 50;
   private static final int m = 2;
   private static final int q = 64;
   private static final int r = 30;
   private static final Optional<cqd> s = Optional.empty();
   @Nullable
   private Either<cqd, UUID> t;
   private long u;
   private int v;
   private int w;
   @Nullable
   private ffq x;
   private int y;

   public dys(iv $$0, ebe $$1) {
      super(dye.k, $$0, $$1);
   }

   public static void a(djx $$0, iv $$1, ebe $$2, dys $$3) {
      $$3.u++;
      if ($$0 instanceof ars $$4) {
         int $$6 = $$3.f();
         if ($$3.y != $$6) {
            $$3.y = $$6;
            $$0.b($$1, dne.cE);
         }

         if ($$3.w > 0) {
            if ($$3.w > 50) {
               $$3.a($$4, 1, true);
               $$3.a($$4, 1, false);
            }

            if ($$3.w % 10 == 0 && $$3.x != null) {
               $$3.s().ifPresent($$1x -> $$3.x = $$1x.cR().f());
               ffq $$7 = ffq.b($$1);
               float $$8 = 0.2F + 0.8F * (float)(100 - $$3.w) / 100.0F;
               ffq $$9 = $$7.d($$3.x).c((double)$$8).e($$3.x);
               iv $$10 = iv.a((jp)$$9);
               float $$11 = (float)$$3.w / 2.0F / 100.0F + 0.5F;
               $$4.a(null, $$10, awp.gA, awq.e, $$11, 1.0F);
            }

            $$3.w--;
         }

         if ($$3.v-- < 0) {
            $$3.v = $$3.n == null ? 20 : $$3.n.A.a(5) + 20;
            ebe $$12 = a($$0, $$2, $$1, $$3);
            if ($$12 != $$2) {
               $$0.a($$1, $$12, 3);
               if ($$12.c(doy.c) == eby.a) {
                  return;
               }
            }

            if ($$3.t == null) {
               if ($$12.c(doy.c) == eby.c) {
                  if ($$0.an() != buo.a) {
                     if ($$4.O().c(djt.f)) {
                        crx $$15 = $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 32.0, false);
                        if ($$15 != null) {
                           cqd $$16 = a($$4, $$3);
                           if ($$16 != null) {
                              $$3.a($$16);
                              $$16.b(awp.gu);
                              $$0.a(null, $$3.aB_(), awp.gE, awq.e, 1.0F, 1.0F);
                           }
                        }
                     }
                  }
               }
            } else {
               Optional<cqd> $$13 = $$3.s();
               if ($$13.isPresent()) {
                  cqd $$14 = $$13.get();
                  if (!doy.a($$0) && !$$14.gd() || $$3.j() > 34.0 || $$14.t()) {
                     $$3.a(null);
                  }
               }
            }
         }
      }
   }

   private static ebe a(djx $$0, ebe $$1, iv $$2, dys $$3) {
      if (!doy.b($$1, $$0, $$2) && $$3.t == null) {
         return $$1.b(doy.c, eby.a);
      } else {
         boolean $$4 = doy.a($$0);
         return $$1.b(doy.c, $$4 ? eby.c : eby.b);
      }
   }

   private double j() {
      return this.s().map($$0 -> Math.sqrt($$0.g(ffq.c(this.aB_())))).orElse(0.0);
   }

   private void k() {
      this.t = null;
      this.e();
   }

   public void a(cqd $$0) {
      this.t = Either.left($$0);
      this.e();
   }

   public void a(UUID $$0) {
      this.t = Either.right($$0);
      this.u = 0L;
      this.e();
   }

   private Optional<cqd> s() {
      if (this.t == null) {
         return s;
      } else {
         if (this.t.left().isPresent()) {
            cqd $$0 = (cqd)this.t.left().get();
            if (!$$0.dQ()) {
               return Optional.of($$0);
            }

            this.a($$0.cG());
         }

         if (this.n instanceof ars $$1 && this.t.right().isPresent()) {
            UUID $$2 = (UUID)this.t.right().get();
            if ($$1.b($$2) instanceof cqd $$4) {
               this.a($$4);
               return Optional.of($$4);
            }

            if (this.u >= 30L) {
               this.k();
            }

            return s;
         }

         return s;
      }
   }

   @Nullable
   private static cqd a(ars $$0, dys $$1) {
      iv $$2 = $$1.aB_();
      Optional<cqd> $$3 = baj.a(bxc.E, bxb.c, $$0, $$2, 5, 16, 8, baj.a.c, true);
      if ($$3.isEmpty()) {
         return null;
      } else {
         cqd $$4 = $$3.get();
         $$0.a($$4, ege.t, $$4.dt());
         $$0.a($$4, (byte)60);
         $$4.h($$2);
         return $$4;
      }
   }

   public acc a() {
      return acc.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.e($$0);
   }

   public void c() {
      if (this.s().orElse(null) instanceof cqd $$0) {
         if (this.n instanceof ars $$2) {
            if (this.w <= 0) {
               this.a($$2, 20, false);
               if (this.m().c(doy.c) == eby.c) {
                  int $$4 = this.n.G_().a(2, 3);

                  for (int $$5 = 0; $$5 < $$4; $$5++) {
                     this.t().ifPresent($$0x -> {
                        this.n.a(null, $$0x, awp.yO, awq.e, 1.0F, 1.0F);
                        this.n.a(ege.i, $$0x, ege.a.a(this.m()));
                     });
                  }
               }

               this.w = 100;
               this.x = $$0.cR().f();
            }
         }
      }
   }

   private Optional<iv> t() {
      Mutable<iv> $$0 = new MutableObject(null);
      iv.a(this.o, 2, 64, ($$0x, $$1) -> {
         for (jb $$2 : ag.b(jb.values(), this.n.A)) {
            iv $$3 = $$0x.a($$2);
            if (this.n.a_($$3).a(axe.w)) {
               $$1.accept($$3);
            }
         }
      }, $$1 -> {
         if (!this.n.a_($$1).a(axe.w)) {
            return iv.b.a;
         } else {
            for (jb $$2 : ag.b(jb.values(), this.n.A)) {
               iv $$3 = $$1.a($$2);
               ebe $$4 = this.n.a_($$3);
               jb $$5 = $$2.g();
               if ($$4.l()) {
                  $$4 = dne.fz.m();
               } else if ($$4.a(dne.J) && $$4.y().b()) {
                  $$4 = dne.fz.m().b(dsi.c, Boolean.valueOf(true));
               }

               if ($$4.a(dne.fz) && !dsi.a($$4, $$5)) {
                  this.n.a($$3, $$4.b(dsi.b($$5), Boolean.valueOf(true)), 3);
                  $$0.setValue($$3);
                  return iv.b.c;
               }
            }

            return iv.b.a;
         }
      });
      return Optional.ofNullable((iv)$$0.getValue());
   }

   private void a(ars $$0, int $$1, boolean $$2) {
      if (this.s().orElse(null) instanceof cqd $$3) {
         int $$5 = $$2 ? 16545810 : 6250335;
         azx $$6 = $$0.A;

         for (double $$7 = 0.0; $$7 < (double)$$1; $$7++) {
            ffl $$8 = $$3.cR();
            ffq $$9 = $$8.h().b($$6.j() * $$8.b(), $$6.j() * $$8.c(), $$6.j() * $$8.d());
            ffq $$10 = ffq.a(this.aB_()).b($$6.j(), $$6.j(), $$6.j());
            if ($$2) {
               ffq $$11 = $$9;
               $$9 = $$10;
               $$10 = $$11;
            }

            md $$12 = new md($$10, $$5, $$6.a(40) + 10);
            $$0.a($$12, true, true, $$9.d, $$9.e, $$9.f, 1, 0.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(iv $$0, ebe $$1) {
      this.a(null);
   }

   public void a(@Nullable bvi $$0) {
      if (this.s().orElse(null) instanceof cqd $$1) {
         if ($$0 == null) {
            $$1.q();
         } else {
            $$1.j($$0);
            $$1.gu();
            $$1.d(0.0F);
         }

         this.k();
      }
   }

   public boolean b(cqd $$0) {
      return this.s().map($$1 -> $$1 == $$0).orElse(false);
   }

   public int d() {
      return this.y;
   }

   public int f() {
      if (this.t != null && !this.s().isEmpty()) {
         double $$0 = this.j();
         double $$1 = Math.clamp($$0, 0.0, 32.0) / 32.0;
         return 15 - (int)Math.floor($$1 * 15.0);
      } else {
         return 0;
      }
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      $$0.<UUID>a("creaking", jz.a).ifPresentOrElse(this::a, this::k);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (this.t != null) {
         $$0.a("creaking", jz.a, (UUID)this.t.map(bwt::cG, $$0x -> $$0x));
      }
   }
}
