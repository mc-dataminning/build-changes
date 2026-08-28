import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class ego extends efy<eif> {
   public ego(Codec<eif> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ega<eif> $$0) {
      dhg $$1 = $$0.b();
      ji $$2 = $$0.e();
      eif $$3 = $$0.f();
      azh $$4 = $$0.d();
      if (!eft.a($$1, $$2)) {
         return false;
      } else {
         Optional<eci> $$5 = eci.a($$1, $$2, $$3.b, eft::c, eft::a);
         if (!$$5.isEmpty() && $$5.get() instanceof eci.b) {
            eci.b $$6 = (eci.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = ayz.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = ayz.b($$4, $$3.c.a(), $$8);
               ego.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               ego.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               ego.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new ego.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = ego.b.a();
               }

               boolean $$14 = $$10.a($$1, $$12);
               boolean $$15 = $$11.a($$1, $$12);
               if ($$14) {
                  $$10.a($$1, $$4, $$12);
               }

               if ($$15) {
                  $$11.a($$1, $$4, $$12);
               }

               return true;
            }
         } else {
            return false;
         }
      }
   }

   private static ego.a a(ji $$0, boolean $$1, azh $$2, int $$3, brn $$4, brn $$5) {
      return new ego.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(dhg $$0, ji $$1, eci.b $$2, ego.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), djo.cH.m(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), djo.co.m(), 2);

      for (ji.a $$4 = $$1.h($$2.f() + 2).k(); $$4.v() < $$2.e() - 1; $$4.c(jn.b)) {
         ji $$5 = $$3.a($$4);
         if (eft.a($$0, $$5) || $$0.a_($$5).a(djo.sW)) {
            $$0.a($$5, djo.hj.m(), 2);
         }
      }
   }

   static final class a {
      private ji a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(ji $$0, boolean $$1, int $$2, double $$3, double $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      private int a() {
         return this.a(0.0F);
      }

      private int b() {
         return this.b ? this.a.v() : this.a.v() - this.a();
      }

      private int c() {
         return !this.b ? this.a.v() : this.a.v() + this.a();
      }

      boolean a(dhg $$0, ego.b $$1) {
         while (this.c > 1) {
            ji.a $$2 = this.a.k();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(djo.K)) {
                  return false;
               }

               if (eft.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? jn.a : jn.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)eft.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(dhg $$0, azh $$1, ego.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = ayz.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * ayz.b($$1, 0.8F, 1.0F));
                     }

                     ji.a $$7 = this.a.b($$3, 0, $$4).k();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(ecs.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        ji $$11 = $$2.a($$7);
                        if (eft.b($$0, $$11)) {
                           $$8 = true;
                           djm $$12 = djo.sW;
                           $$0.a($$11, $$12.m(), 2);
                        } else if ($$8 && $$0.a_($$11).a(awp.bg)) {
                           break;
                        }

                        $$7.c(this.b ? jn.b : jn.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(eif $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final fba b;

      b(int $$0, azh $$1, brn $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = ayz.b($$1, 0.0F, (float) Math.PI);
         this.b = new fba((double)(ayz.b($$4) * $$3), 0.0, (double)(ayz.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static ego.b a() {
         return new ego.b();
      }

      ji a(ji $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            fba $$2 = this.b.c((double)$$1);
            return $$0.b(ayz.a($$2.d), 0, ayz.a($$2.f));
         }
      }
   }
}
