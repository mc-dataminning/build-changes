import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dpe extends doo<dqv> {
   public dpe(Codec<dqv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doq<dqv> $$0) {
      crt $$1 = $$0.b();
      ht $$2 = $$0.e();
      dqv $$3 = $$0.f();
      ate $$4 = $$0.d();
      if (!dok.a($$1, $$2)) {
         return false;
      } else {
         Optional<dla> $$5 = dla.a($$1, $$2, $$3.b, dok::c, dok::a);
         if (!$$5.isEmpty() && $$5.get() instanceof dla.b) {
            dla.b $$6 = (dla.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = asy.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = asy.b($$4, $$3.c.a(), $$8);
               dpe.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               dpe.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               dpe.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new dpe.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = dpe.b.a();
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

   private static dpe.a a(ht $$0, boolean $$1, ate $$2, int $$3, bhe $$4, bhe $$5) {
      return new dpe.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(crt $$0, ht $$1, dla.b $$2, dpe.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), cuc.cz.o(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), cuc.ch.o(), 2);

      for (ht.a $$4 = $$1.h($$2.f() + 2).j(); $$4.v() < $$2.e() - 1; $$4.c(hx.b)) {
         ht $$5 = $$3.a($$4);
         if (dok.a($$0, $$5) || $$0.a_($$5).a(cuc.rt)) {
            $$0.a($$5, cuc.gM.o(), 2);
         }
      }
   }

   static final class a {
      private ht a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(ht $$0, boolean $$1, int $$2, double $$3, double $$4) {
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

      boolean a(crt $$0, dpe.b $$1) {
         while (this.c > 1) {
            ht.a $$2 = this.a.j();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(cuc.H)) {
                  return false;
               }

               if (dok.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? hx.a : hx.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)dok.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(crt $$0, ate $$1, dpe.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = asy.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * asy.b($$1, 0.8F, 1.0F));
                     }

                     ht.a $$7 = this.a.b($$3, 0, $$4).j();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(dlk.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        ht $$11 = $$2.a($$7);
                        if (dok.b($$0, $$11)) {
                           $$8 = true;
                           cua $$12 = cuc.rt;
                           $$0.a($$11, $$12.o(), 2);
                        } else if ($$8 && $$0.a_($$11).a(aqs.bd)) {
                           break;
                        }

                        $$7.c(this.b ? hx.b : hx.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(dqv $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final eif b;

      b(int $$0, ate $$1, bhe $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = asy.b($$1, 0.0F, (float) Math.PI);
         this.b = new eif((double)(asy.b($$4) * $$3), 0.0, (double)(asy.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static dpe.b a() {
         return new dpe.b();
      }

      ht a(ht $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            eif $$2 = this.b.a((double)$$1);
            return $$0.b(asy.a($$2.c), 0, asy.a($$2.e));
         }
      }
   }
}
