import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;

public class dup extends dua {
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
   private static final Optional<cnd> s = Optional.empty();
   @Nullable
   private Either<cnd, UUID> t;
   private long u;
   private int v;
   private int w;
   @Nullable
   private fbb x;
   private int y;

   public dup(ji $$0, dwy $$1) {
      super(duc.k, $$0, $$1);
   }

   public static void a(dgj $$0, ji $$1, dwy $$2, dup $$3) {
      $$3.u++;
      if ($$0 instanceof ard $$4) {
         int $$6 = $$3.f();
         if ($$3.y != $$6) {
            $$3.y = $$6;
            $$0.c($$1, djp.cB);
         }

         if ($$3.w > 0) {
            if ($$3.w > 50) {
               $$3.a($$4, 1, true);
               $$3.a($$4, 1, false);
            }

            if ($$3.w % 10 == 0 && $$3.x != null) {
               $$3.s().ifPresent($$1x -> $$3.x = $$1x.cR().f());
               fbb $$7 = fbb.b($$1);
               float $$8 = 0.2F + 0.8F * (float)(100 - $$3.w) / 100.0F;
               fbb $$9 = $$7.d($$3.x).c((double)$$8).e($$3.x);
               ji $$10 = ji.a((kb)$$9);
               float $$11 = (float)$$3.w / 2.0F / 100.0F + 0.5F;
               $$4.a(null, $$10, awa.gy, awb.e, $$11, 1.0F);
            }

            $$3.w--;
         }

         if ($$3.v-- < 0) {
            $$3.v = $$3.n == null ? 20 : $$3.n.A.a(5) + 20;
            if ($$3.t == null) {
               if (!dli.b($$2, $$0, $$1)) {
                  $$0.a($$1, $$2.b(dli.c, Boolean.valueOf(false)), 3);
               } else if ($$2.c(dli.c)) {
                  if (dli.a($$0)) {
                     if ($$0.am() != bsi.a) {
                        if ($$4.O().b(dgf.e)) {
                           coy $$14 = $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 32.0, false);
                           if ($$14 != null) {
                              cnd $$15 = a($$4, $$3);
                              if ($$15 != null) {
                                 $$3.a($$15);
                                 $$15.b(awa.gs);
                                 $$0.a(null, $$3.aA_(), awa.gC, awb.e, 1.0F, 1.0F);
                              }
                           }
                        }
                     }
                  }
               }
            } else {
               Optional<cnd> $$12 = $$3.s();
               if ($$12.isPresent()) {
                  cnd $$13 = $$12.get();
                  if (!dli.a($$0) || $$3.j() > 34.0 || $$13.gs()) {
                     $$3.a(null);
                     return;
                  }

                  if (!dli.b($$2, $$0, $$1) && $$3.t == null) {
                     $$0.a($$1, $$2.b(dli.c, Boolean.valueOf(false)), 3);
                  }
               }
            }
         }
      }
   }

   private double j() {
      return this.s().map($$0 -> Math.sqrt($$0.g(fbb.c(this.aA_())))).orElse(0.0);
   }

   private void k() {
      this.t = null;
      this.e();
   }

   public void a(cnd $$0) {
      this.t = Either.left($$0);
      this.e();
   }

   public void a(UUID $$0) {
      this.t = Either.right($$0);
      this.u = 0L;
      this.e();
   }

   private Optional<cnd> s() {
      if (this.t == null) {
         return s;
      } else {
         if (this.t.left().isPresent()) {
            cnd $$0 = (cnd)this.t.left().get();
            if (!$$0.dQ()) {
               return Optional.of($$0);
            }

            this.a($$0.cG());
         }

         if (this.n instanceof ard $$1 && this.t.right().isPresent()) {
            UUID $$2 = (UUID)this.t.right().get();
            if ($$1.a($$2) instanceof cnd $$4) {
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
   private static cnd a(ard $$0, dup $$1) {
      ji $$2 = $$1.aA_();
      Optional<cnd> $$3 = azs.a(but.D, bus.c, $$0, $$2, 5, 16, 8, azs.a.c, true);
      if ($$3.isEmpty()) {
         return null;
      } else {
         cnd $$4 = $$3.get();
         $$0.a($$4, ebu.t, $$4.dt());
         $$0.a($$4, (byte)60);
         $$4.h($$2);
         return $$4;
      }
   }

   public abs b() {
      return abs.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return this.e($$0);
   }

   public void c() {
      if (this.s().orElse(null) instanceof cnd $$0) {
         if (this.n instanceof ard $$2) {
            if (this.w <= 0) {
               this.a($$2, 20, false);
               int $$4 = this.n.H_().a(2, 3);

               for (int $$5 = 0; $$5 < $$4; $$5++) {
                  this.t().ifPresent($$0x -> {
                     this.n.a(null, $$0x, awa.yy, awb.e, 1.0F, 1.0F);
                     this.n.a(ebu.i, $$0x, ebu.a.a(this.n.a_($$0x)));
                  });
               }

               this.w = 100;
               this.x = $$0.cR().f();
            }
         }
      }
   }

   private Optional<ji> t() {
      Mutable<ji> $$0 = new MutableObject(null);
      ji.a(this.o, 2, 64, ($$0x, $$1) -> {
         for (jn $$2 : af.b(jn.values(), this.n.A)) {
            ji $$3 = $$0x.a($$2);
            if (this.n.a_($$3).a(awp.w)) {
               $$1.accept($$3);
            }
         }
      }, $$1 -> {
         if (!this.n.a_($$1).a(awp.w)) {
            return ji.b.a;
         } else {
            for (jn $$2 : af.b(jn.values(), this.n.A)) {
               ji $$3 = $$1.a($$2);
               dwy $$4 = this.n.a_($$3);
               jn $$5 = $$2.g();
               if ($$4.l()) {
                  $$4 = djp.fv.m();
               } else if ($$4.a(djp.J) && $$4.y().b()) {
                  $$4 = djp.fv.m().b(dop.c, Boolean.valueOf(true));
               }

               if ($$4.a(djp.fv) && !dop.a($$4, $$5)) {
                  this.n.a($$3, $$4.b(dop.b($$5), Boolean.valueOf(true)), 3);
                  $$0.setValue($$3);
                  return ji.b.c;
               }
            }

            return ji.b.a;
         }
      });
      return Optional.ofNullable((ji)$$0.getValue());
   }

   private void a(ard $$0, int $$1, boolean $$2) {
      if (this.s().orElse(null) instanceof cnd $$3) {
         int $$5 = $$2 ? 16545810 : 6250335;
         azh $$6 = $$0.A;

         for (double $$7 = 0.0; $$7 < (double)$$1; $$7++) {
            faw $$8 = $$3.cR();
            fbb $$9 = $$8.h().b($$6.j() * $$8.b(), $$6.j() * $$8.c(), $$6.j() * $$8.d());
            fbb $$10 = fbb.a(this.aA_()).b($$6.j(), $$6.j(), $$6.j());
            if ($$2) {
               fbb $$11 = $$9;
               $$9 = $$10;
               $$10 = $$11;
            }

            ly $$12 = new ly($$10, $$5, $$6.a(40) + 10);
            $$0.a($$12, true, true, $$9.d, $$9.e, $$9.f, 1, 0.0, 0.0, 0.0, 0.0);
         }
      }
   }

   public void a(@Nullable btc $$0) {
      if (this.s().orElse(null) instanceof cnd $$1) {
         if ($$0 == null) {
            $$1.x();
         } else {
            $$1.k($$0);
            $$1.gu();
            $$1.x(0.0F);
         }

         this.k();
      }
   }

   public boolean b(cnd $$0) {
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
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("creaking")) {
         this.a($$0.a("creaking"));
      } else {
         this.k();
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (this.t != null) {
         $$0.a("creaking", (UUID)this.t.map(bum::cG, $$0x -> $$0x));
      }
   }
}
