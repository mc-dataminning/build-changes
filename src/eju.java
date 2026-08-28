import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class eju extends eje<ell> {
   public eju(Codec<ell> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<ell> $$0) {
      dju $$1 = $$0.b();
      iu $$2 = $$0.e();
      ell $$3 = $$0.f();
      azv $$4 = $$0.d();
      if (!eiz.a($$1, $$2)) {
         return false;
      } else {
         Optional<efo> $$5 = efo.a($$1, $$2, $$3.b, eiz::c, eiz::a);
         if (!$$5.isEmpty() && $$5.get() instanceof efo.b) {
            efo.b $$6 = (efo.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = azm.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = azm.b($$4, $$3.c.a(), $$8);
               eju.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               eju.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               eju.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new eju.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = eju.b.a();
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

   private static eju.a a(iu $$0, boolean $$1, azv $$2, int $$3, bte $$4, bte $$5) {
      return new eju.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(dju $$0, iu $$1, efo.b $$2, eju.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), dmc.cI.m(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), dmc.cp.m(), 2);

      for (iu.a $$4 = $$1.h($$2.f() + 2).k(); $$4.v() < $$2.e() - 1; $$4.c(ja.b)) {
         iu $$5 = $$3.a($$4);
         if (eiz.a($$0, $$5) || $$0.a_($$5).a(dmc.sZ)) {
            $$0.a($$5, dmc.hk.m(), 2);
         }
      }
   }

   static final class a {
      private iu a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(iu $$0, boolean $$1, int $$2, double $$3, double $$4) {
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

      boolean a(dju $$0, eju.b $$1) {
         while (this.c > 1) {
            iu.a $$2 = this.a.k();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(dmc.K)) {
                  return false;
               }

               if (eiz.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? ja.a : ja.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)eiz.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(dju $$0, azv $$1, eju.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = azm.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * azm.b($$1, 0.8F, 1.0F));
                     }

                     iu.a $$7 = this.a.b($$3, 0, $$4).k();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(efy.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        iu $$11 = $$2.a($$7);
                        if (eiz.b($$0, $$11)) {
                           $$8 = true;
                           dma $$12 = dmc.sZ;
                           $$0.a($$11, $$12.m(), 2);
                        } else if ($$8 && $$0.a_($$11).a(axc.bg)) {
                           break;
                        }

                        $$7.c(this.b ? ja.b : ja.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(ell $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final fei b;

      b(int $$0, azv $$1, bte $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = azm.b($$1, 0.0F, (float) Math.PI);
         this.b = new fei((double)(azm.b($$4) * $$3), 0.0, (double)(azm.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static eju.b a() {
         return new eju.b();
      }

      iu a(iu $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            fei $$2 = this.b.c((double)$$1);
            return $$0.b(azm.a($$2.d), 0, azm.a($$2.f));
         }
      }
   }
}
