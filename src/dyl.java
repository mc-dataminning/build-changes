import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dyl extends dxv<eac> {
   public dyl(Codec<eac> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<eac> $$0) {
      czs $$1 = $$0.b();
      ib $$2 = $$0.e();
      eac $$3 = $$0.f();
      axr $$4 = $$0.d();
      if (!dxr.a($$1, $$2)) {
         return false;
      } else {
         Optional<duh> $$5 = duh.a($$1, $$2, $$3.b, dxr::c, dxr::a);
         if (!$$5.isEmpty() && $$5.get() instanceof duh.b) {
            duh.b $$6 = (duh.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = axk.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = axk.b($$4, $$3.c.a(), $$8);
               dyl.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               dyl.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               dyl.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new dyl.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = dyl.b.a();
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

   private static dyl.a a(ib $$0, boolean $$1, axr $$2, int $$3, bnd $$4, bnd $$5) {
      return new dyl.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(czs $$0, ib $$1, duh.b $$2, dyl.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), dca.cz.n(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), dca.ch.n(), 2);

      for (ib.a $$4 = $$1.h($$2.f() + 2).j(); $$4.v() < $$2.e() - 1; $$4.c(ih.b)) {
         ib $$5 = $$3.a($$4);
         if (dxr.a($$0, $$5) || $$0.a_($$5).a(dca.su)) {
            $$0.a($$5, dca.gM.n(), 2);
         }
      }
   }

   static final class a {
      private ib a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(ib $$0, boolean $$1, int $$2, double $$3, double $$4) {
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

      boolean a(czs $$0, dyl.b $$1) {
         while (this.c > 1) {
            ib.a $$2 = this.a.j();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(dca.H)) {
                  return false;
               }

               if (dxr.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? ih.a : ih.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)dxr.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(czs $$0, axr $$1, dyl.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = axk.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * axk.b($$1, 0.8F, 1.0F));
                     }

                     ib.a $$7 = this.a.b($$3, 0, $$4).j();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(dur.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        ib $$11 = $$2.a($$7);
                        if (dxr.b($$0, $$11)) {
                           $$8 = true;
                           dby $$12 = dca.su;
                           $$0.a($$11, $$12.n(), 2);
                        } else if ($$8 && $$0.a_($$11).a(avc.be)) {
                           break;
                        }

                        $$7.c(this.b ? ih.b : ih.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(eac $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final esa b;

      b(int $$0, axr $$1, bnd $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = axk.b($$1, 0.0F, (float) Math.PI);
         this.b = new esa((double)(axk.b($$4) * $$3), 0.0, (double)(axk.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static dyl.b a() {
         return new dyl.b();
      }

      ib a(ib $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            esa $$2 = this.b.a((double)$$1);
            return $$0.b(axk.a($$2.c), 0, axk.a($$2.e));
         }
      }
   }
}
