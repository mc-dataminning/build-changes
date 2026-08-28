import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class eds extends edc<efj> {
   public eds(Codec<efj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<efj> $$0) {
      dep $$1 = $$0.b();
      je $$2 = $$0.e();
      efj $$3 = $$0.f();
      azk $$4 = $$0.d();
      if (!ecx.a($$1, $$2)) {
         return false;
      } else {
         Optional<dzm> $$5 = dzm.a($$1, $$2, $$3.b, ecx::c, ecx::a);
         if (!$$5.isEmpty() && $$5.get() instanceof dzm.b) {
            dzm.b $$6 = (dzm.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = azc.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = azc.b($$4, $$3.c.a(), $$8);
               eds.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               eds.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               eds.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new eds.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = eds.b.a();
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

   private static eds.a a(je $$0, boolean $$1, azk $$2, int $$3, bqn $$4, bqn $$5) {
      return new eds.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(dep $$0, je $$1, dzm.b $$2, eds.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), dgx.cz.o(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), dgx.ch.o(), 2);

      for (je.a $$4 = $$1.h($$2.f() + 2).k(); $$4.v() < $$2.e() - 1; $$4.c(jj.b)) {
         je $$5 = $$3.a($$4);
         if (ecx.a($$0, $$5) || $$0.a_($$5).a(dgx.su)) {
            $$0.a($$5, dgx.gM.o(), 2);
         }
      }
   }

   static final class a {
      private je a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(je $$0, boolean $$1, int $$2, double $$3, double $$4) {
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

      boolean a(dep $$0, eds.b $$1) {
         while (this.c > 1) {
            je.a $$2 = this.a.k();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(dgx.H)) {
                  return false;
               }

               if (ecx.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? jj.a : jj.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)ecx.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(dep $$0, azk $$1, eds.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = azc.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * azc.b($$1, 0.8F, 1.0F));
                     }

                     je.a $$7 = this.a.b($$3, 0, $$4).k();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(dzw.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        je $$11 = $$2.a($$7);
                        if (ecx.b($$0, $$11)) {
                           $$8 = true;
                           dgv $$12 = dgx.su;
                           $$0.a($$11, $$12.o(), 2);
                        } else if ($$8 && $$0.a_($$11).a(aws.bf)) {
                           break;
                        }

                        $$7.c(this.b ? jj.b : jj.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(efj $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final eye b;

      b(int $$0, azk $$1, bqn $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = azc.b($$1, 0.0F, (float) Math.PI);
         this.b = new eye((double)(azc.b($$4) * $$3), 0.0, (double)(azc.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static eds.b a() {
         return new eds.b();
      }

      je a(je $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            eye $$2 = this.b.c((double)$$1);
            return $$0.b(azc.a($$2.d), 0, azc.a($$2.f));
         }
      }
   }
}
