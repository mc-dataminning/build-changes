import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dob extends dnl<dps> {
   public dob(Codec<dps> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dps> $$0) {
      cqe $$1 = $$0.b();
      gv $$2 = $$0.e();
      dps $$3 = $$0.f();
      art $$4 = $$0.d();
      if (!dnh.a($$1, $$2)) {
         return false;
      } else {
         Optional<djx> $$5 = djx.a($$1, $$2, $$3.b, dnh::c, dnh::a);
         if ($$5.isPresent() && $$5.get() instanceof djx.b) {
            djx.b $$6 = (djx.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = aro.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = aro.b($$4, $$3.c.a(), $$8);
               dob.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               dob.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               dob.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new dob.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = dob.b.a();
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

   private static dob.a a(gv $$0, boolean $$1, art $$2, int $$3, bfr $$4, bfr $$5) {
      return new dob.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(cqe $$0, gv $$1, djx.b $$2, dob.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), csl.cz.n(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), csl.ch.n(), 2);

      for (gv.a $$4 = $$1.h($$2.f() + 2).j(); $$4.v() < $$2.e() - 1; $$4.c(hb.b)) {
         gv $$5 = $$3.a($$4);
         if (dnh.a($$0, $$5) || $$0.a_($$5).a(csl.rt)) {
            $$0.a($$5, csl.gM.n(), 2);
         }
      }
   }

   static final class a {
      private gv a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(gv $$0, boolean $$1, int $$2, double $$3, double $$4) {
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

      boolean a(cqe $$0, dob.b $$1) {
         while (this.c > 1) {
            gv.a $$2 = this.a.j();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(csl.H)) {
                  return false;
               }

               if (dnh.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? hb.a : hb.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)dnh.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(cqe $$0, art $$1, dob.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = aro.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * aro.b($$1, 0.8F, 1.0F));
                     }

                     gv.a $$7 = this.a.b($$3, 0, $$4).j();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(dkh.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        gv $$11 = $$2.a($$7);
                        if (dnh.b($$0, $$11)) {
                           $$8 = true;
                           csk $$12 = csl.rt;
                           $$0.a($$11, $$12.n(), 2);
                        } else if ($$8 && $$0.a_($$11).a(apj.bd)) {
                           break;
                        }

                        $$7.c(this.b ? hb.b : hb.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(dps $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final ehf b;

      b(int $$0, art $$1, bfr $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = aro.b($$1, 0.0F, (float) Math.PI);
         this.b = new ehf((double)(aro.b($$4) * $$3), 0.0, (double)(aro.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static dob.b a() {
         return new dob.b();
      }

      gv a(gv $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            ehf $$2 = this.b.a((double)$$1);
            return $$0.b(aro.a($$2.c), 0, aro.a($$2.e));
         }
      }
   }
}
