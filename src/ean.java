import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class ean extends dzx<ece> {
   public ean(Codec<ece> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<ece> $$0) {
      dbs $$1 = $$0.b();
      io $$2 = $$0.e();
      ece $$3 = $$0.f();
      ayk $$4 = $$0.d();
      if (!dzt.a($$1, $$2)) {
         return false;
      } else {
         Optional<dwj> $$5 = dwj.a($$1, $$2, $$3.b, dzt::c, dzt::a);
         if (!$$5.isEmpty() && $$5.get() instanceof dwj.b) {
            dwj.b $$6 = (dwj.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = ayd.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = ayd.b($$4, $$3.c.a(), $$8);
               ean.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               ean.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               ean.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new ean.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = ean.b.a();
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

   private static ean.a a(io $$0, boolean $$1, ayk $$2, int $$3, box $$4, box $$5) {
      return new ean.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(dbs $$0, io $$1, dwj.b $$2, ean.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), dea.cz.n(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), dea.ch.n(), 2);

      for (io.a $$4 = $$1.h($$2.f() + 2).j(); $$4.v() < $$2.e() - 1; $$4.c(it.b)) {
         io $$5 = $$3.a($$4);
         if (dzt.a($$0, $$5) || $$0.a_($$5).a(dea.su)) {
            $$0.a($$5, dea.gM.n(), 2);
         }
      }
   }

   static final class a {
      private io a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(io $$0, boolean $$1, int $$2, double $$3, double $$4) {
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

      boolean a(dbs $$0, ean.b $$1) {
         while (this.c > 1) {
            io.a $$2 = this.a.j();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(dea.H)) {
                  return false;
               }

               if (dzt.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? it.a : it.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)dzt.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(dbs $$0, ayk $$1, ean.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = ayd.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * ayd.b($$1, 0.8F, 1.0F));
                     }

                     io.a $$7 = this.a.b($$3, 0, $$4).j();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(dwt.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        io $$11 = $$2.a($$7);
                        if (dzt.b($$0, $$11)) {
                           $$8 = true;
                           ddy $$12 = dea.su;
                           $$0.a($$11, $$12.n(), 2);
                        } else if ($$8 && $$0.a_($$11).a(avw.be)) {
                           break;
                        }

                        $$7.c(this.b ? it.b : it.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(ece $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final euk b;

      b(int $$0, ayk $$1, box $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = ayd.b($$1, 0.0F, (float) Math.PI);
         this.b = new euk((double)(ayd.b($$4) * $$3), 0.0, (double)(ayd.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static ean.b a() {
         return new ean.b();
      }

      io a(io $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            euk $$2 = this.b.a((double)$$1);
            return $$0.b(ayd.a($$2.c), 0, ayd.a($$2.e));
         }
      }
   }
}
