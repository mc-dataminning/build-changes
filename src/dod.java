import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dod extends dnn<dpu> {
   public dod(Codec<dpu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnp<dpu> $$0) {
      cqg $$1 = $$0.b();
      gu $$2 = $$0.e();
      dpu $$3 = $$0.f();
      aru $$4 = $$0.d();
      if (!dnj.a($$1, $$2)) {
         return false;
      } else {
         Optional<djz> $$5 = djz.a($$1, $$2, $$3.b, dnj::c, dnj::a);
         if (!$$5.isEmpty() && $$5.get() instanceof djz.b) {
            djz.b $$6 = (djz.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = arp.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = arp.b($$4, $$3.c.a(), $$8);
               dod.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               dod.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               dod.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new dod.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = dod.b.a();
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

   private static dod.a a(gu $$0, boolean $$1, aru $$2, int $$3, bft $$4, bft $$5) {
      return new dod.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(cqg $$0, gu $$1, djz.b $$2, dod.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), csn.cz.n(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), csn.ch.n(), 2);

      for (gu.a $$4 = $$1.h($$2.f() + 2).j(); $$4.v() < $$2.e() - 1; $$4.c(ha.b)) {
         gu $$5 = $$3.a($$4);
         if (dnj.a($$0, $$5) || $$0.a_($$5).a(csn.rt)) {
            $$0.a($$5, csn.gM.n(), 2);
         }
      }
   }

   static final class a {
      private gu a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(gu $$0, boolean $$1, int $$2, double $$3, double $$4) {
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

      boolean a(cqg $$0, dod.b $$1) {
         while (this.c > 1) {
            gu.a $$2 = this.a.j();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(csn.H)) {
                  return false;
               }

               if (dnj.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? ha.a : ha.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)dnj.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(cqg $$0, aru $$1, dod.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = arp.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * arp.b($$1, 0.8F, 1.0F));
                     }

                     gu.a $$7 = this.a.b($$3, 0, $$4).j();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(dkj.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        gu $$11 = $$2.a($$7);
                        if (dnj.b($$0, $$11)) {
                           $$8 = true;
                           csm $$12 = csn.rt;
                           $$0.a($$11, $$12.n(), 2);
                        } else if ($$8 && $$0.a_($$11).a(apl.bd)) {
                           break;
                        }

                        $$7.c(this.b ? ha.b : ha.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(dpu $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final ehe b;

      b(int $$0, aru $$1, bft $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = arp.b($$1, 0.0F, (float) Math.PI);
         this.b = new ehe((double)(arp.b($$4) * $$3), 0.0, (double)(arp.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static dod.b a() {
         return new dod.b();
      }

      gu a(gu $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            ehe $$2 = this.b.a((double)$$1);
            return $$0.b(arp.a($$2.c), 0, arp.a($$2.e));
         }
      }
   }
}
