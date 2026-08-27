import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class doh extends dnr<dpy> {
   public doh(Codec<dpy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dpy> $$0) {
      cqk $$1 = $$0.b();
      gw $$2 = $$0.e();
      dpy $$3 = $$0.f();
      arx $$4 = $$0.d();
      if (!dnn.a($$1, $$2)) {
         return false;
      } else {
         Optional<dkd> $$5 = dkd.a($$1, $$2, $$3.b, dnn::c, dnn::a);
         if (!$$5.isEmpty() && $$5.get() instanceof dkd.b) {
            dkd.b $$6 = (dkd.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = ars.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = ars.b($$4, $$3.c.a(), $$8);
               doh.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               doh.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               doh.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new doh.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = doh.b.a();
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

   private static doh.a a(gw $$0, boolean $$1, arx $$2, int $$3, bfw $$4, bfw $$5) {
      return new doh.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(cqk $$0, gw $$1, dkd.b $$2, doh.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), csr.cz.n(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), csr.ch.n(), 2);

      for (gw.a $$4 = $$1.h($$2.f() + 2).j(); $$4.v() < $$2.e() - 1; $$4.c(hc.b)) {
         gw $$5 = $$3.a($$4);
         if (dnn.a($$0, $$5) || $$0.a_($$5).a(csr.rt)) {
            $$0.a($$5, csr.gM.n(), 2);
         }
      }
   }

   static final class a {
      private gw a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(gw $$0, boolean $$1, int $$2, double $$3, double $$4) {
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

      boolean a(cqk $$0, doh.b $$1) {
         while (this.c > 1) {
            gw.a $$2 = this.a.j();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(csr.H)) {
                  return false;
               }

               if (dnn.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? hc.a : hc.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)dnn.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(cqk $$0, arx $$1, doh.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = ars.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * ars.b($$1, 0.8F, 1.0F));
                     }

                     gw.a $$7 = this.a.b($$3, 0, $$4).j();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(dkn.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        gw $$11 = $$2.a($$7);
                        if (dnn.b($$0, $$11)) {
                           $$8 = true;
                           csq $$12 = csr.rt;
                           $$0.a($$11, $$12.n(), 2);
                        } else if ($$8 && $$0.a_($$11).a(apo.bd)) {
                           break;
                        }

                        $$7.c(this.b ? hc.b : hc.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(dpy $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final ehi b;

      b(int $$0, arx $$1, bfw $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = ars.b($$1, 0.0F, (float) Math.PI);
         this.b = new ehi((double)(ars.b($$4) * $$3), 0.0, (double)(ars.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static doh.b a() {
         return new doh.b();
      }

      gw a(gw $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            ehi $$2 = this.b.a((double)$$1);
            return $$0.b(ars.a($$2.c), 0, ars.a($$2.e));
         }
      }
   }
}
