import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class ekj extends ejt<ema> {
   public ekj(Codec<ema> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejv<ema> $$0) {
      dkg $$1 = $$0.b();
      iv $$2 = $$0.e();
      ema $$3 = $$0.f();
      azv $$4 = $$0.d();
      if (!ejo.a($$1, $$2)) {
         return false;
      } else {
         Optional<egd> $$5 = egd.a($$1, $$2, $$3.b, ejo::c, ejo::a);
         if (!$$5.isEmpty() && $$5.get() instanceof egd.b) {
            egd.b $$6 = (egd.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = azm.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = azm.b($$4, $$3.c.a(), $$8);
               ekj.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               ekj.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               ekj.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new ekj.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = ekj.b.a();
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

   private static ekj.a a(iv $$0, boolean $$1, azv $$2, int $$3, btj $$4, btj $$5) {
      return new ekj.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(dkg $$0, iv $$1, egd.b $$2, ekj.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), dmo.cK.m(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), dmo.cr.m(), 2);

      for (iv.a $$4 = $$1.h($$2.f() + 2).k(); $$4.v() < $$2.e() - 1; $$4.c(jb.b)) {
         iv $$5 = $$3.a($$4);
         if (ejo.a($$0, $$5) || $$0.a_($$5).a(dmo.tc)) {
            $$0.a($$5, dmo.hn.m(), 2);
         }
      }
   }

   static final class a {
      private iv a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(iv $$0, boolean $$1, int $$2, double $$3, double $$4) {
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

      boolean a(dkg $$0, ekj.b $$1) {
         while (this.c > 1) {
            iv.a $$2 = this.a.k();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(dmo.K)) {
                  return false;
               }

               if (ejo.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? jb.a : jb.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)ejo.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(dkg $$0, azv $$1, ekj.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = azm.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * azm.b($$1, 0.8F, 1.0F));
                     }

                     iv.a $$7 = this.a.b($$3, 0, $$4).k();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(egn.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        iv $$11 = $$2.a($$7);
                        if (ejo.b($$0, $$11)) {
                           $$8 = true;
                           dmm $$12 = dmo.tc;
                           $$0.a($$11, $$12.m(), 2);
                        } else if ($$8 && $$0.a_($$11).a(axc.bh)) {
                           break;
                        }

                        $$7.c(this.b ? jb.b : jb.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(ema $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final fex b;

      b(int $$0, azv $$1, btj $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = azm.b($$1, 0.0F, (float) Math.PI);
         this.b = new fex((double)(azm.b($$4) * $$3), 0.0, (double)(azm.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static ekj.b a() {
         return new ekj.b();
      }

      iv a(iv $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            fex $$2 = this.b.c((double)$$1);
            return $$0.b(azm.a($$2.d), 0, azm.a($$2.f));
         }
      }
   }
}
