import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;

public class dwb extends dvl {
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
   private static final Optional<coo> s = Optional.empty();
   @Nullable
   private Either<coo, UUID> t;
   private long u;
   private int v;
   private int w;
   @Nullable
   private fcu x;
   private int y;

   public dwb(jj $$0, dym $$1) {
      super(dvn.k, $$0, $$1);
   }

   public static void a(dhp $$0, jj $$1, dym $$2, dwb $$3) {
      $$3.u++;
      if ($$0 instanceof arn $$4) {
         int $$6 = $$3.f();
         if ($$3.y != $$6) {
            $$3.y = $$6;
            $$0.b($$1, dkw.cB);
         }

         if ($$3.w > 0) {
            if ($$3.w > 50) {
               $$3.a($$4, 1, true);
               $$3.a($$4, 1, false);
            }

            if ($$3.w % 10 == 0 && $$3.x != null) {
               $$3.s().ifPresent($$1x -> $$3.x = $$1x.cR().f());
               fcu $$7 = fcu.b($$1);
               float $$8 = 0.2F + 0.8F * (float)(100 - $$3.w) / 100.0F;
               fcu $$9 = $$7.d($$3.x).c((double)$$8).e($$3.x);
               jj $$10 = jj.a((kc)$$9);
               float $$11 = (float)$$3.w / 2.0F / 100.0F + 0.5F;
               $$4.a(null, $$10, awk.gy, awl.e, $$11, 1.0F);
            }

            $$3.w--;
         }

         if ($$3.v-- < 0) {
            $$3.v = $$3.n == null ? 20 : $$3.n.A.a(5) + 20;
            dym $$12 = a($$0, $$2, $$1, $$3);
            if ($$12 != $$2) {
               $$0.a($$1, $$12, 3);
               if ($$12.c(dmp.c) == dzg.a) {
                  return;
               }
            }

            if ($$3.t == null) {
               if ($$12.c(dmp.c) == dzg.c) {
                  if ($$0.an() != btn.a) {
                     if ($$4.O().c(dhl.e)) {
                        cqi $$15 = $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 32.0, false);
                        if ($$15 != null) {
                           coo $$16 = a($$4, $$3);
                           if ($$16 != null) {
                              $$3.a($$16);
                              $$16.b(awk.gs);
                              $$0.a(null, $$3.aw_(), awk.gC, awl.e, 1.0F, 1.0F);
                           }
                        }
                     }
                  }
               }
            } else {
               Optional<coo> $$13 = $$3.s();
               if ($$13.isPresent()) {
                  coo $$14 = $$13.get();
                  if (!dmp.a($$0) && !$$14.fZ() || $$3.j() > 34.0 || $$14.t()) {
                     $$3.a(null);
                  }
               }
            }
         }
      }
   }

   private static dym a(dhp $$0, dym $$1, jj $$2, dwb $$3) {
      if (!dmp.b($$1, $$0, $$2) && $$3.t == null) {
         return $$1.b(dmp.c, dzg.a);
      } else {
         boolean $$4 = dmp.a($$0);
         return $$1.b(dmp.c, $$4 ? dzg.c : dzg.b);
      }
   }

   private double j() {
      return this.s().map($$0 -> Math.sqrt($$0.g(fcu.c(this.aw_())))).orElse(0.0);
   }

   private void k() {
      this.t = null;
      this.e();
   }

   public void a(coo $$0) {
      this.t = Either.left($$0);
      this.e();
   }

   public void a(UUID $$0) {
      this.t = Either.right($$0);
      this.u = 0L;
      this.e();
   }

   private Optional<coo> s() {
      if (this.t == null) {
         return s;
      } else {
         if (this.t.left().isPresent()) {
            coo $$0 = (coo)this.t.left().get();
            if (!$$0.dQ()) {
               return Optional.of($$0);
            }

            this.a($$0.cG());
         }

         if (this.n instanceof arn $$1 && this.t.right().isPresent()) {
            UUID $$2 = (UUID)this.t.right().get();
            if ($$1.b($$2) instanceof coo $$4) {
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
   private static coo a(arn $$0, dwb $$1) {
      jj $$2 = $$1.aw_();
      Optional<coo> $$3 = bad.a(bwb.D, bwa.c, $$0, $$2, 5, 16, 8, bad.a.c, true);
      if ($$3.isEmpty()) {
         return null;
      } else {
         coo $$4 = $$3.get();
         $$0.a($$4, edm.t, $$4.dt());
         $$0.a($$4, (byte)60);
         $$4.i($$2);
         return $$4;
      }
   }

   public abx a() {
      return abx.a(this);
   }

   @Override
   public tw a(ju.a $$0) {
      return this.e($$0);
   }

   public void c() {
      if (this.s().orElse(null) instanceof coo $$0) {
         if (this.n instanceof arn $$2) {
            if (this.w <= 0) {
               this.a($$2, 20, false);
               if (this.m().c(dmp.c) == dzg.c) {
                  int $$4 = this.n.C_().a(2, 3);

                  for (int $$5 = 0; $$5 < $$4; $$5++) {
                     this.t().ifPresent($$0x -> {
                        this.n.a(null, $$0x, awk.yI, awl.e, 1.0F, 1.0F);
                        this.n.a(edm.i, $$0x, edm.a.a(this.m()));
                     });
                  }
               }

               this.w = 100;
               this.x = $$0.cR().f();
            }
         }
      }
   }

   private Optional<jj> t() {
      Mutable<jj> $$0 = new MutableObject(null);
      jj.a(this.o, 2, 64, ($$0x, $$1) -> {
         for (jo $$2 : af.b(jo.values(), this.n.A)) {
            jj $$3 = $$0x.a($$2);
            if (this.n.a_($$3).a(awz.w)) {
               $$1.accept($$3);
            }
         }
      }, $$1 -> {
         if (!this.n.a_($$1).a(awz.w)) {
            return jj.b.a;
         } else {
            for (jo $$2 : af.b(jo.values(), this.n.A)) {
               jj $$3 = $$1.a($$2);
               dym $$4 = this.n.a_($$3);
               jo $$5 = $$2.g();
               if ($$4.l()) {
                  $$4 = dkw.fv.m();
               } else if ($$4.a(dkw.J) && $$4.y().b()) {
                  $$4 = dkw.fv.m().b(dpy.c, Boolean.valueOf(true));
               }

               if ($$4.a(dkw.fv) && !dpy.a($$4, $$5)) {
                  this.n.a($$3, $$4.b(dpy.b($$5), Boolean.valueOf(true)), 3);
                  $$0.setValue($$3);
                  return jj.b.c;
               }
            }

            return jj.b.a;
         }
      });
      return Optional.ofNullable((jj)$$0.getValue());
   }

   private void a(arn $$0, int $$1, boolean $$2) {
      if (this.s().orElse(null) instanceof coo $$3) {
         int $$5 = $$2 ? 16545810 : 6250335;
         azs $$6 = $$0.A;

         for (double $$7 = 0.0; $$7 < (double)$$1; $$7++) {
            fcp $$8 = $$3.cR();
            fcu $$9 = $$8.h().b($$6.j() * $$8.b(), $$6.j() * $$8.c(), $$6.j() * $$8.d());
            fcu $$10 = fcu.a(this.aw_()).b($$6.j(), $$6.j(), $$6.j());
            if ($$2) {
               fcu $$11 = $$9;
               $$9 = $$10;
               $$10 = $$11;
            }

            ma $$12 = new ma($$10, $$5, $$6.a(40) + 10);
            $$0.a($$12, true, true, $$9.d, $$9.e, $$9.f, 1, 0.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(jj $$0, dym $$1) {
      this.a(null);
   }

   public void a(@Nullable buh $$0) {
      if (this.s().orElse(null) instanceof coo $$1) {
         if ($$0 == null) {
            $$1.q();
         } else {
            $$1.k($$0);
            $$1.gq();
            $$1.d(0.0F);
         }

         this.k();
      }
   }

   public boolean b(coo $$0) {
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
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("creaking")) {
         this.a($$0.a("creaking"));
      } else {
         this.k();
      }
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      if (this.t != null) {
         $$0.a("creaking", (UUID)this.t.map(bvs::cG, $$0x -> $$0x));
      }
   }
}
