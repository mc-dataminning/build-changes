import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class ejj extends eit<ela> {
   public ejj(Codec<ela> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<ela> $$0) {
      djo $$1 = $$0.b();
      iu $$2 = $$0.e();
      ela $$3 = $$0.f();
      azt $$4 = $$0.d();
      if (!eio.a($$1, $$2)) {
         return false;
      } else {
         Optional<efd> $$5 = efd.a($$1, $$2, $$3.b, eio::c, eio::a);
         if (!$$5.isEmpty() && $$5.get() instanceof efd.b) {
            efd.b $$6 = (efd.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = azk.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = azk.b($$4, $$3.c.a(), $$8);
               ejj.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               ejj.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               ejj.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new ejj.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = ejj.b.a();
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

   private static ejj.a a(iu $$0, boolean $$1, azt $$2, int $$3, btb $$4, btb $$5) {
      return new ejj.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(djo $$0, iu $$1, efd.b $$2, ejj.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), dlw.cH.m(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), dlw.co.m(), 2);

      for (iu.a $$4 = $$1.h($$2.f() + 2).k(); $$4.v() < $$2.e() - 1; $$4.c(ja.b)) {
         iu $$5 = $$3.a($$4);
         if (eio.a($$0, $$5) || $$0.a_($$5).a(dlw.sY)) {
            $$0.a($$5, dlw.hj.m(), 2);
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

      boolean a(djo $$0, ejj.b $$1) {
         while (this.c > 1) {
            iu.a $$2 = this.a.k();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(dlw.K)) {
                  return false;
               }

               if (eio.a($$0, $$1.a($$2), this.c)) {
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
         return (int)eio.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(djo $$0, azt $$1, ejj.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = azk.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * azk.b($$1, 0.8F, 1.0F));
                     }

                     iu.a $$7 = this.a.b($$3, 0, $$4).k();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(efn.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        iu $$11 = $$2.a($$7);
                        if (eio.b($$0, $$11)) {
                           $$8 = true;
                           dlu $$12 = dlw.sY;
                           $$0.a($$11, $$12.m(), 2);
                        } else if ($$8 && $$0.a_($$11).a(axa.bg)) {
                           break;
                        }

                        $$7.c(this.b ? ja.b : ja.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(ela $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final fdw b;

      b(int $$0, azt $$1, btb $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = azk.b($$1, 0.0F, (float) Math.PI);
         this.b = new fdw((double)(azk.b($$4) * $$3), 0.0, (double)(azk.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static ejj.b a() {
         return new ejj.b();
      }

      iu a(iu $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            fdw $$2 = this.b.c((double)$$1);
            return $$0.b(azk.a($$2.d), 0, azk.a($$2.f));
         }
      }
   }
}
