import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class ecr extends eca<een> {
   public ecr(Codec<een> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<een> $$0) {
      dcv $$1 = $$0.b();
      ir $$2 = $$0.e();
      een $$3 = $$0.f();
      ayt $$4 = $$0.d();
      dla $$5 = $$3.k;
      if (!ebv.a($$1, $$2)) {
         return false;
      } else {
         Optional<dyk> $$6 = dyk.a($$1, $$2, $$3.b, ebv::c, $$0x -> ebv.a($$0x));
         if ($$6.isEmpty()) {
            return false;
         } else if ($$6.get() instanceof dyk.b || $$5 == dfe.tF && $$6.get().c().isPresent()) {
            dyk $$7 = $$6.get();
            double $$9 = $$7 instanceof dyk.b $$8 ? (double)$$8.g() : (double)aym.b($$4, 10.0F, 20.0F);
            if ($$9 < 4.0) {
               return false;
            } else {
               int $$10 = (int)($$9 * (double)$$3.e);
               int $$11 = aym.a($$10, $$3.c.a(), $$3.c.b());
               int $$12 = aym.b($$4, $$3.c.a(), $$11);
               Optional<ecr.a> $$13;
               if ($$7.b().isPresent()) {
                  $$13 = Optional.of(a($$2.h($$7.b().getAsInt() - 1), false, $$4, $$12, $$3.f, $$3.d));
               } else {
                  $$13 = Optional.empty();
               }

               ecr.a $$15 = a($$2.h($$7.c().getAsInt() + 1), true, $$4, $$12, $$3.g, $$3.d);
               ecr.b $$16;
               if ($$13.isPresent() && $$13.get().a($$3) && $$15.a($$3)) {
                  $$16 = new ecr.b($$2.v(), $$4, $$3.h);
               } else {
                  $$16 = ecr.b.a();
               }

               boolean $$18 = $$13.isPresent() && $$13.get().a($$1, $$16);
               boolean $$19 = $$15.a($$1, $$16);
               if ($$13.isPresent() && $$18) {
                  $$13.get().a($$5, $$1, $$4, $$16);
               }

               if ($$19) {
                  $$15.a($$5, $$1, $$4, $$16);
               }

               return true;
            }
         } else {
            return false;
         }
      }
   }

   private static ecr.a a(ir $$0, boolean $$1, ayt $$2, int $$3, bpd $$4, bpd $$5) {
      return new ecr.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(dcv $$0, ir $$1, dyk.b $$2, ecr.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), dfe.dk.n(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), dfe.cS.n(), 2);

      for (ir.a $$4 = $$1.h($$2.f() + 2).j(); $$4.v() < $$2.e() - 1; $$4.d(iw.b)) {
         ir $$5 = $$3.a($$4);
         if (ebv.a($$0, $$5) || $$0.a_($$5).a(dfe.tR)) {
            $$0.a($$5, dfe.hG.n(), 2);
         }
      }
   }

   static final class a {
      private ir a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(ir $$0, boolean $$1, int $$2, double $$3, double $$4) {
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

      boolean a(dcv $$0, ecr.b $$1) {
         while (this.c > 1) {
            ir.a $$2 = this.a.j();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(dfe.am)) {
                  return false;
               }

               if (ebv.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.d(this.b ? iw.a : iw.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)ebv.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(dla $$0, dcv $$1, ayt $$2, ecr.b $$3) {
         for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
            for (int $$5 = -this.c; $$5 <= this.c; $$5++) {
               float $$6 = aym.c((float)($$4 * $$4 + $$5 * $$5));
               if (!($$6 > (float)this.c)) {
                  int $$7 = this.a($$6);
                  if ($$7 > 0) {
                     if ((double)$$2.i() < 0.2) {
                        $$7 = (int)((float)$$7 * aym.b($$2, 0.8F, 1.0F));
                     }

                     ir.a $$8 = this.a.b($$4, 0, $$5).j();
                     boolean $$9 = false;
                     int $$10 = this.b && $$0 == dfe.tE ? $$1.a(dyu.a.a, $$8.u(), $$8.w()) : Integer.MAX_VALUE;

                     for (int $$11 = 0; $$11 < $$7 && $$8.v() < $$10; $$11++) {
                        ir $$12 = $$3.a($$8);
                        if (Math.abs($$12.w() - this.a.w()) > 16 || Math.abs($$12.u() - this.a.u()) > 16) {
                           $$12 = $$8;
                        }

                        if (ebv.b($$1, $$12)) {
                           $$9 = true;
                           dfc $$13 = $$0.c();
                           $$1.a($$12, $$13.n(), 2);
                        } else if ($$9 && $$1.a_($$12).a(awe.bg)) {
                           break;
                        }

                        $$8.d(this.b ? iw.b : iw.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(een $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final ewu b;

      b(int $$0, ayt $$1, bpd $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = aym.b($$1, 0.0F, (float) Math.PI);
         this.b = new ewu((double)(aym.b($$4) * $$3), 0.0, (double)(aym.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static ecr.b a() {
         return new ecr.b();
      }

      ir a(ir $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            ewu $$2 = this.b.a((double)$$1);
            return $$0.b(aym.a($$2.c), 0, aym.a($$2.e));
         }
      }
   }
}
