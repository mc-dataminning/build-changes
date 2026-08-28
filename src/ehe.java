import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class ehe extends ego<eiv> {
   public ehe(Codec<eiv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egq<eiv> $$0) {
      dhy $$1 = $$0.b();
      jh $$2 = $$0.e();
      eiv $$3 = $$0.f();
      bam $$4 = $$0.d();
      if (!egj.a($$1, $$2)) {
         return false;
      } else {
         Optional<ecy> $$5 = ecy.a($$1, $$2, $$3.b, egj::c, egj::a);
         if (!$$5.isEmpty() && $$5.get() instanceof ecy.b) {
            ecy.b $$6 = (ecy.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = bae.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = bae.b($$4, $$3.c.a(), $$8);
               ehe.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               ehe.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               ehe.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new ehe.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = ehe.b.a();
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

   private static ehe.a a(jh $$0, boolean $$1, bam $$2, int $$3, bsh $$4, bsh $$5) {
      return new ehe.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(dhy $$0, jh $$1, ecy.b $$2, ehe.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), dkg.cH.m(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), dkg.co.m(), 2);

      for (jh.a $$4 = $$1.h($$2.f() + 2).k(); $$4.v() < $$2.e() - 1; $$4.c(jm.b)) {
         jh $$5 = $$3.a($$4);
         if (egj.a($$0, $$5) || $$0.a_($$5).a(dkg.sP)) {
            $$0.a($$5, dkg.hc.m(), 2);
         }
      }
   }

   static final class a {
      private jh a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(jh $$0, boolean $$1, int $$2, double $$3, double $$4) {
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

      boolean a(dhy $$0, ehe.b $$1) {
         while (this.c > 1) {
            jh.a $$2 = this.a.k();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(dkg.K)) {
                  return false;
               }

               if (egj.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? jm.a : jm.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)egj.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(dhy $$0, bam $$1, ehe.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = bae.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * bae.b($$1, 0.8F, 1.0F));
                     }

                     jh.a $$7 = this.a.b($$3, 0, $$4).k();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(edi.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        jh $$11 = $$2.a($$7);
                        if (egj.b($$0, $$11)) {
                           $$8 = true;
                           dke $$12 = dkg.sP;
                           $$0.a($$11, $$12.m(), 2);
                        } else if ($$8 && $$0.a_($$11).a(axu.bg)) {
                           break;
                        }

                        $$7.c(this.b ? jm.b : jm.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(eiv $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final fbs b;

      b(int $$0, bam $$1, bsh $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = bae.b($$1, 0.0F, (float) Math.PI);
         this.b = new fbs((double)(bae.b($$4) * $$3), 0.0, (double)(bae.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static ehe.b a() {
         return new ehe.b();
      }

      jh a(jh $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            fbs $$2 = this.b.c((double)$$1);
            return $$0.b(bae.a($$2.d), 0, bae.a($$2.f));
         }
      }
   }
}
