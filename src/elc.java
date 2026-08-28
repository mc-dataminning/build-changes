import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class elc extends ekm<emu> {
   public elc(Codec<emu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<emu> $$0) {
      dky $$1 = $$0.b();
      iw $$2 = $$0.e();
      emu $$3 = $$0.f();
      azz $$4 = $$0.d();
      if (!ekg.a($$1, $$2)) {
         return false;
      } else {
         Optional<egv> $$5 = egv.a($$1, $$2, $$3.b, ekg::c, ekg::a);
         if (!$$5.isEmpty() && $$5.get() instanceof egv.b) {
            egv.b $$6 = (egv.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = azq.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = azq.b($$4, $$3.c.a(), $$8);
               elc.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               elc.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               elc.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new elc.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = elc.b.a();
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

   private static elc.a a(iw $$0, boolean $$1, azz $$2, int $$3, btw $$4, btw $$5) {
      return new elc.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(dky $$0, iw $$1, egv.b $$2, elc.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), dng.cK.m(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), dng.cr.m(), 2);

      for (iw.a $$4 = $$1.h($$2.f() + 2).k(); $$4.v() < $$2.e() - 1; $$4.c(jc.b)) {
         iw $$5 = $$3.a($$4);
         if (ekg.a($$0, $$5) || $$0.a_($$5).a(dng.tc)) {
            $$0.a($$5, dng.hn.m(), 2);
         }
      }
   }

   static final class a {
      private iw a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(iw $$0, boolean $$1, int $$2, double $$3, double $$4) {
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

      boolean a(dky $$0, elc.b $$1) {
         while (this.c > 1) {
            iw.a $$2 = this.a.k();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(dng.K)) {
                  return false;
               }

               if (ekg.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? jc.a : jc.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)ekg.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(dky $$0, azz $$1, elc.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = azq.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * azq.b($$1, 0.8F, 1.0F));
                     }

                     iw.a $$7 = this.a.b($$3, 0, $$4).k();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(ehf.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        iw $$11 = $$2.a($$7);
                        if (ekg.b($$0, $$11)) {
                           $$8 = true;
                           dne $$12 = dng.tc;
                           $$0.a($$11, $$12.m(), 2);
                        } else if ($$8 && $$0.a_($$11).a(axg.bh)) {
                           break;
                        }

                        $$7.c(this.b ? jc.b : jc.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(emu $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final ffs b;

      b(int $$0, azz $$1, btw $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = azq.b($$1, 0.0F, (float) Math.PI);
         this.b = new ffs((double)(azq.b($$4) * $$3), 0.0, (double)(azq.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static elc.b a() {
         return new elc.b();
      }

      iw a(iw $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            ffs $$2 = this.b.c((double)$$1);
            return $$0.b(azq.a($$2.d), 0, azq.a($$2.f));
         }
      }
   }
}
