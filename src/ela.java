import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class ela extends ekk<ems> {
   public ela(Codec<ems> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<ems> $$0) {
      dkw $$1 = $$0.b();
      iv $$2 = $$0.e();
      ems $$3 = $$0.f();
      azx $$4 = $$0.d();
      if (!eke.a($$1, $$2)) {
         return false;
      } else {
         Optional<egt> $$5 = egt.a($$1, $$2, $$3.b, eke::c, eke::a);
         if (!$$5.isEmpty() && $$5.get() instanceof egt.b) {
            egt.b $$6 = (egt.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = azo.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = azo.b($$4, $$3.c.a(), $$8);
               ela.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               ela.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               ela.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new ela.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = ela.b.a();
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

   private static ela.a a(iv $$0, boolean $$1, azx $$2, int $$3, btu $$4, btu $$5) {
      return new ela.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(dkw $$0, iv $$1, egt.b $$2, ela.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), dne.cK.m(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), dne.cr.m(), 2);

      for (iv.a $$4 = $$1.h($$2.f() + 2).k(); $$4.v() < $$2.e() - 1; $$4.c(jb.b)) {
         iv $$5 = $$3.a($$4);
         if (eke.a($$0, $$5) || $$0.a_($$5).a(dne.tc)) {
            $$0.a($$5, dne.hn.m(), 2);
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

      boolean a(dkw $$0, ela.b $$1) {
         while (this.c > 1) {
            iv.a $$2 = this.a.k();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(dne.K)) {
                  return false;
               }

               if (eke.a($$0, $$1.a($$2), this.c)) {
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
         return (int)eke.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(dkw $$0, azx $$1, ela.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = azo.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * azo.b($$1, 0.8F, 1.0F));
                     }

                     iv.a $$7 = this.a.b($$3, 0, $$4).k();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(ehd.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        iv $$11 = $$2.a($$7);
                        if (eke.b($$0, $$11)) {
                           $$8 = true;
                           dnc $$12 = dne.tc;
                           $$0.a($$11, $$12.m(), 2);
                        } else if ($$8 && $$0.a_($$11).a(axe.bh)) {
                           break;
                        }

                        $$7.c(this.b ? jb.b : jb.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(ems $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final ffq b;

      b(int $$0, azx $$1, btu $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = azo.b($$1, 0.0F, (float) Math.PI);
         this.b = new ffq((double)(azo.b($$4) * $$3), 0.0, (double)(azo.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static ela.b a() {
         return new ela.b();
      }

      iv a(iv $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            ffq $$2 = this.b.c((double)$$1);
            return $$0.b(azo.a($$2.d), 0, azo.a($$2.f));
         }
      }
   }
}
