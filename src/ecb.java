import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class ecb extends ebl<eds> {
   public ecb(Codec<eds> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<eds> $$0) {
      ddc $$1 = $$0.b();
      ja $$2 = $$0.e();
      eds $$3 = $$0.f();
      ayo $$4 = $$0.d();
      if (!ebh.a($$1, $$2)) {
         return false;
      } else {
         Optional<dxw> $$5 = dxw.a($$1, $$2, $$3.b, ebh::c, ebh::a);
         if (!$$5.isEmpty() && $$5.get() instanceof dxw.b) {
            dxw.b $$6 = (dxw.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = ayg.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = ayg.b($$4, $$3.c.a(), $$8);
               ecb.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               ecb.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               ecb.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new ecb.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = ecb.b.a();
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

   private static ecb.a a(ja $$0, boolean $$1, ayo $$2, int $$3, bpk $$4, bpk $$5) {
      return new ecb.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(ddc $$0, ja $$1, dxw.b $$2, ecb.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), dfk.cz.o(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), dfk.ch.o(), 2);

      for (ja.a $$4 = $$1.h($$2.f() + 2).j(); $$4.v() < $$2.e() - 1; $$4.c(jf.b)) {
         ja $$5 = $$3.a($$4);
         if (ebh.a($$0, $$5) || $$0.a_($$5).a(dfk.su)) {
            $$0.a($$5, dfk.gM.o(), 2);
         }
      }
   }

   static final class a {
      private ja a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(ja $$0, boolean $$1, int $$2, double $$3, double $$4) {
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

      boolean a(ddc $$0, ecb.b $$1) {
         while (this.c > 1) {
            ja.a $$2 = this.a.j();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(dfk.H)) {
                  return false;
               }

               if (ebh.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? jf.a : jf.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)ebh.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(ddc $$0, ayo $$1, ecb.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = ayg.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * ayg.b($$1, 0.8F, 1.0F));
                     }

                     ja.a $$7 = this.a.b($$3, 0, $$4).j();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(dyg.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        ja $$11 = $$2.a($$7);
                        if (ebh.b($$0, $$11)) {
                           $$8 = true;
                           dfi $$12 = dfk.su;
                           $$0.a($$11, $$12.o(), 2);
                        } else if ($$8 && $$0.a_($$11).a(avw.be)) {
                           break;
                        }

                        $$7.c(this.b ? jf.b : jf.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(eds $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final ewh b;

      b(int $$0, ayo $$1, bpk $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = ayg.b($$1, 0.0F, (float) Math.PI);
         this.b = new ewh((double)(ayg.b($$4) * $$3), 0.0, (double)(ayg.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static ecb.b a() {
         return new ecb.b();
      }

      ja a(ja $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            ewh $$2 = this.b.a((double)$$1);
            return $$0.b(ayg.a($$2.c), 0, ayg.a($$2.e));
         }
      }
   }
}
