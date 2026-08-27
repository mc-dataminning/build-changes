import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ctx extends csd implements cvu {
   private static final Logger c = LogUtils.getLogger();
   public static final dfy a = cup.a;
   public static final dfv b = dfu.c;
   private final boolean d;

   public ctx(dfd.d $$0, boolean $$1) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
      this.d = $$1;
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      dda $$2 = new dda($$0, $$1);
      $$2.b(this.d);
      return $$2;
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dda $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.v() != dda.a.a) {
               if ($$8) {
                  $$7.j();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$1.c_($$2) instanceof dda $$5) {
         cor $$6 = $$5.c();
         boolean $$7 = !asl.b($$6.m());
         dda.a $$8 = $$5.v();
         boolean $$9 = $$5.i();
         if ($$8 == dda.a.b) {
            $$5.j();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dda.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dfe $$0, cpq $$1, gw $$2, cor $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(a));
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      dcq $$6 = $$1.c_($$2);
      if ($$6 instanceof dda && $$3.gn()) {
         $$3.a((dda)$$6);
         return bgt.a($$1.B);
      } else {
         return bgt.d;
      }
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      dcq $$3 = $$1.c_($$2);
      return $$3 instanceof dda ? ((dda)$$3).c().k() : 0;
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bjb $$3, cja $$4) {
      if ($$0.c_($$1) instanceof dda $$6) {
         cor $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (cgt.a($$4) == null) {
               $$7.a($$0.X().b(cpm.o));
               $$6.b(this.d);
            }

            if ($$6.v() == dda.a.a) {
               boolean $$8 = $$0.B($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dfe a(cli $$0) {
      return this.n().a(a, $$0.d().g());
   }

   private static void a(cpq $$0, gw $$1, hc $$2) {
      gw.a $$3 = $$1.j();
      cpm $$4 = $$0.X();
      int $$5 = $$4.c(cpm.w);

      while ($$5-- > 0) {
         $$3.c($$2);
         dfe $$6 = $$0.a_($$3);
         csq $$7 = $$6.b();
         if (!$$6.a(csr.kH) || !($$0.c_($$3) instanceof dda $$9) || $$9.v() != dda.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            cor $$10 = $$9.c();
            if ($$9.j()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.c($$3, $$7);
            } else if ($$9.w()) {
               $$10.a(0);
            }
         }

         $$2 = $$6.c(a);
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.c(cpm.w), 0);
         c.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
