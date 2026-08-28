import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;

public class dun extends dty {
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
   private static final int n = 64;
   private static final int r = 30;
   private static final Optional<cnb> s = Optional.empty();
   @Nullable
   private Either<cnb, UUID> t;
   private long u;
   private int v;
   private int w;
   @Nullable
   private faz x;
   private int y;

   public dun(ji $$0, dww $$1) {
      super(dua.k, $$0, $$1);
   }

   public static void a(dgh $$0, ji $$1, dww $$2, dun $$3) {
      $$3.u++;
      if ($$0 instanceof ard $$4) {
         int $$6 = $$3.f();
         if ($$3.y != $$6) {
            $$3.y = $$6;
            $$0.c($$1, djn.cB);
         }

         if ($$3.w > 0) {
            if ($$3.w > 50) {
               $$3.a($$4, 1, true);
               $$3.a($$4, 1, false);
            }

            if ($$3.w % 10 == 0 && $$3.x != null) {
               $$3.s().ifPresent($$1x -> $$3.x = $$1x.cR().f());
               faz $$7 = faz.b($$1);
               float $$8 = 0.2F + 0.8F * (float)(100 - $$3.w) / 100.0F;
               faz $$9 = $$7.d($$3.x).c((double)$$8).e($$3.x);
               ji $$10 = ji.a((kb)$$9);
               float $$11 = (float)$$3.w / 2.0F / 100.0F + 0.5F;
               $$4.a(null, $$10, awa.gy, awb.e, $$11, 1.0F);
            }

            $$3.w--;
         }

         if ($$3.v-- < 0) {
            $$3.v = $$3.o == null ? 20 : $$3.o.A.a(5) + 20;
            if ($$3.t == null) {
               if (!dlg.b($$2, $$0, $$1)) {
                  $$0.a($$1, $$2.b(dlg.c, Boolean.valueOf(false)), 3);
               } else if ($$2.c(dlg.c)) {
                  if (dlg.a($$0)) {
                     if ($$0.am() != bsg.a) {
                        if ($$4.O().b(dgd.e)) {
                           cow $$14 = $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 32.0, false);
                           if ($$14 != null) {
                              cnb $$15 = a($$4, $$3);
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
               Optional<cnb> $$12 = $$3.s();
               if ($$12.isPresent()) {
                  cnb $$13 = $$12.get();
                  if (!dlg.a($$0) || $$3.j() > 34.0 || $$13.gs()) {
                     $$3.a(null);
                     return;
                  }

                  if (!dlg.b($$2, $$0, $$1) && $$3.t == null) {
                     $$0.a($$1, $$2.b(dlg.c, Boolean.valueOf(false)), 3);
                  }
               }
            }
         }
      }
   }

   private double j() {
      return this.s().map($$0 -> Math.sqrt($$0.g(faz.c(this.aA_())))).orElse(0.0);
   }

   private void k() {
      this.t = null;
      this.e();
   }

   public void a(cnb $$0) {
      this.t = Either.left($$0);
      this.e();
   }

   public void a(UUID $$0) {
      this.t = Either.right($$0);
      this.u = 0L;
      this.e();
   }

   private Optional<cnb> s() {
      if (this.t == null) {
         return s;
      } else {
         if (this.t.left().isPresent()) {
            cnb $$0 = (cnb)this.t.left().get();
            if (!$$0.dQ()) {
               return Optional.of($$0);
            }

            this.a($$0.cG());
         }

         if (this.o instanceof ard $$1 && this.t.right().isPresent()) {
            UUID $$2 = (UUID)this.t.right().get();
            if ($$1.a($$2) instanceof cnb $$4) {
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
   private static cnb a(ard $$0, dun $$1) {
      ji $$2 = $$1.aA_();
      Optional<cnb> $$3 = azs.a(bur.D, buq.c, $$0, $$2, 5, 16, 8, azs.a.c, true);
      if ($$3.isEmpty()) {
         return null;
      } else {
         cnb $$4 = $$3.get();
         $$0.a($$4, ebs.t, $$4.dt());
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
      if (this.s().orElse(null) instanceof cnb $$0) {
         if (this.o instanceof ard $$2) {
            if (this.w <= 0) {
               this.a($$2, 20, false);
               int $$4 = this.o.H_().a(2, 3);

               for (int $$5 = 0; $$5 < $$4; $$5++) {
                  this.t().ifPresent($$0x -> {
                     this.o.a(null, $$0x, awa.yy, awb.e, 1.0F, 1.0F);
                     this.o.a(ebs.i, $$0x, ebs.a.a(this.o.a_($$0x)));
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
      ji.a(this.p, 2, 64, ($$0x, $$1) -> {
         for (jn $$2 : af.b(jn.values(), this.o.A)) {
            ji $$3 = $$0x.a($$2);
            if (this.o.a_($$3).a(awp.w)) {
               $$1.accept($$3);
            }
         }
      }, $$1 -> {
         if (!this.o.a_($$1).a(awp.w)) {
            return ji.b.a;
         } else {
            for (jn $$2 : af.b(jn.values(), this.o.A)) {
               ji $$3 = $$1.a($$2);
               dww $$4 = this.o.a_($$3);
               jn $$5 = $$2.g();
               if ($$4.l()) {
                  $$4 = djn.fv.m();
               } else if ($$4.a(djn.J) && $$4.y().b()) {
                  $$4 = djn.fv.m().b(don.c, Boolean.valueOf(true));
               }

               if ($$4.a(djn.fv) && !don.a($$4, $$5)) {
                  this.o.a($$3, $$4.b(don.b($$5), Boolean.valueOf(true)), 3);
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
      if (this.s().orElse(null) instanceof cnb $$3) {
         int $$5 = $$2 ? 16545810 : 6250335;
         azh $$6 = $$0.A;

         for (double $$7 = 0.0; $$7 < (double)$$1; $$7++) {
            fau $$8 = $$3.cR();
            faz $$9 = $$8.h().b($$6.j() * $$8.b(), $$6.j() * $$8.c(), $$6.j() * $$8.d());
            faz $$10 = faz.a(this.aA_()).b($$6.j(), $$6.j(), $$6.j());
            if ($$2) {
               faz $$11 = $$9;
               $$9 = $$10;
               $$10 = $$11;
            }

            ly $$12 = new ly($$10, $$5, $$6.a(40) + 10);
            $$0.a($$12, true, true, $$9.d, $$9.e, $$9.f, 1, 0.0, 0.0, 0.0, 0.0);
         }
      }
   }

   public void a(@Nullable bta $$0) {
      if (this.s().orElse(null) instanceof cnb $$1) {
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

   public boolean b(cnb $$0) {
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
         $$0.a("creaking", (UUID)this.t.map(buk::cG, $$0x -> $$0x));
      }
   }
}
