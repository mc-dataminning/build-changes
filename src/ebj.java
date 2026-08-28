import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class ebj extends eat<eda> {
   public ebj(Codec<eda> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<eda> $$0) {
      dco $$1 = $$0.b();
      iz $$2 = $$0.e();
      eda $$3 = $$0.f();
      azc $$4 = $$0.d();
      if (!eap.a($$1, $$2)) {
         return false;
      } else {
         Optional<dxf> $$5 = dxf.a($$1, $$2, $$3.b, eap::c, eap::a);
         if (!$$5.isEmpty() && $$5.get() instanceof dxf.b) {
            dxf.b $$6 = (dxf.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = ayu.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = ayu.b($$4, $$3.c.a(), $$8);
               ebj.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               ebj.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               ebj.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new ebj.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = ebj.b.a();
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

   private static ebj.a a(iz $$0, boolean $$1, azc $$2, int $$3, bps $$4, bps $$5) {
      return new ebj.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(dco $$0, iz $$1, dxf.b $$2, ebj.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), dew.cz.n(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), dew.ch.n(), 2);

      for (iz.a $$4 = $$1.h($$2.f() + 2).j(); $$4.v() < $$2.e() - 1; $$4.c(je.b)) {
         iz $$5 = $$3.a($$4);
         if (eap.a($$0, $$5) || $$0.a_($$5).a(dew.su)) {
            $$0.a($$5, dew.gM.n(), 2);
         }
      }
   }

   static final class a {
      private iz a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(iz $$0, boolean $$1, int $$2, double $$3, double $$4) {
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

      boolean a(dco $$0, ebj.b $$1) {
         while (this.c > 1) {
            iz.a $$2 = this.a.j();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(dew.H)) {
                  return false;
               }

               if (eap.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? je.a : je.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)eap.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(dco $$0, azc $$1, ebj.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = ayu.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * ayu.b($$1, 0.8F, 1.0F));
                     }

                     iz.a $$7 = this.a.b($$3, 0, $$4).j();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(dxp.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        iz $$11 = $$2.a($$7);
                        if (eap.b($$0, $$11)) {
                           $$8 = true;
                           deu $$12 = dew.su;
                           $$0.a($$11, $$12.n(), 2);
                        } else if ($$8 && $$0.a_($$11).a(awl.be)) {
                           break;
                        }

                        $$7.c(this.b ? je.b : je.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(eda $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final evm b;

      b(int $$0, azc $$1, bps $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = ayu.b($$1, 0.0F, (float) Math.PI);
         this.b = new evm((double)(ayu.b($$4) * $$3), 0.0, (double)(ayu.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static ebj.b a() {
         return new ebj.b();
      }

      iz a(iz $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            evm $$2 = this.b.a((double)$$1);
            return $$0.b(ayu.a($$2.c), 0, ayu.a($$2.e));
         }
      }
   }
}
