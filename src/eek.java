import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class eek extends edu<egb> {
   public eek(Codec<egb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egb> $$0) {
      dfg $$1 = $$0.b();
      jf $$2 = $$0.e();
      egb $$3 = $$0.f();
      azn $$4 = $$0.d();
      if (!edp.a($$1, $$2)) {
         return false;
      } else {
         Optional<eae> $$5 = eae.a($$1, $$2, $$3.b, edp::c, edp::a);
         if (!$$5.isEmpty() && $$5.get() instanceof eae.b) {
            eae.b $$6 = (eae.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = azf.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = azf.b($$4, $$3.c.a(), $$8);
               eek.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               eek.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               eek.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new eek.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = eek.b.a();
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

   private static eek.a a(jf $$0, boolean $$1, azn $$2, int $$3, bqv $$4, bqv $$5) {
      return new eek.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(dfg $$0, jf $$1, eae.b $$2, eek.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), dho.cz.n(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), dho.ch.n(), 2);

      for (jf.a $$4 = $$1.h($$2.f() + 2).k(); $$4.v() < $$2.e() - 1; $$4.c(jk.b)) {
         jf $$5 = $$3.a($$4);
         if (edp.a($$0, $$5) || $$0.a_($$5).a(dho.su)) {
            $$0.a($$5, dho.gM.n(), 2);
         }
      }
   }

   static final class a {
      private jf a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(jf $$0, boolean $$1, int $$2, double $$3, double $$4) {
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

      boolean a(dfg $$0, eek.b $$1) {
         while (this.c > 1) {
            jf.a $$2 = this.a.k();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(dho.H)) {
                  return false;
               }

               if (edp.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? jk.a : jk.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)edp.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(dfg $$0, azn $$1, eek.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = azf.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * azf.b($$1, 0.8F, 1.0F));
                     }

                     jf.a $$7 = this.a.b($$3, 0, $$4).k();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(eao.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        jf $$11 = $$2.a($$7);
                        if (edp.b($$0, $$11)) {
                           $$8 = true;
                           dhm $$12 = dho.su;
                           $$0.a($$11, $$12.n(), 2);
                        } else if ($$8 && $$0.a_($$11).a(awv.bf)) {
                           break;
                        }

                        $$7.c(this.b ? jk.b : jk.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(egb $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final eyw b;

      b(int $$0, azn $$1, bqv $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = azf.b($$1, 0.0F, (float) Math.PI);
         this.b = new eyw((double)(azf.b($$4) * $$3), 0.0, (double)(azf.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static eek.b a() {
         return new eek.b();
      }

      jf a(jf $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            eyw $$2 = this.b.c((double)$$1);
            return $$0.b(azf.a($$2.d), 0, azf.a($$2.f));
         }
      }
   }
}
