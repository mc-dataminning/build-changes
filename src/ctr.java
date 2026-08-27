import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ctr extends crx implements cvo {
   private static final Logger c = LogUtils.getLogger();
   public static final dfs a = cuj.a;
   public static final dfp b = dfo.c;
   private final boolean d;

   public ctr(dex.d $$0, boolean $$1) {
      super($$0);
      this.k(this.C.b().a(a, hb.c).a(b, Boolean.valueOf(false)));
      this.d = $$1;
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      dcu $$2 = new dcu($$0, $$1);
      $$2.b(this.d);
      return $$2;
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dcu $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.v() != dcu.a.a) {
               if ($$8) {
                  $$7.j();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$1.c_($$2) instanceof dcu $$5) {
         cok $$6 = $$5.c();
         boolean $$7 = !asg.b($$6.m());
         dcu.a $$8 = $$5.v();
         boolean $$9 = $$5.i();
         if ($$8 == dcu.a.b) {
            $$5.j();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dcu.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dey $$0, cpk $$1, gv $$2, cok $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(a));
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      dck $$6 = $$1.c_($$2);
      if ($$6 instanceof dcu && $$3.gn()) {
         $$3.a((dcu)$$6);
         return bgo.a($$1.B);
      } else {
         return bgo.d;
      }
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      dck $$3 = $$1.c_($$2);
      return $$3 instanceof dcu ? ((dcu)$$3).c().k() : 0;
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, biw $$3, ciw $$4) {
      if ($$0.c_($$1) instanceof dcu $$6) {
         cok $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (cgp.a($$4) == null) {
               $$7.a($$0.X().b(cpg.o));
               $$6.b(this.d);
            }

            if ($$6.v() == dcu.a.a) {
               boolean $$8 = $$0.B($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dey a(cle $$0) {
      return this.n().a(a, $$0.d().g());
   }

   private static void a(cpk $$0, gv $$1, hb $$2) {
      gv.a $$3 = $$1.j();
      cpg $$4 = $$0.X();
      int $$5 = $$4.c(cpg.w);

      while ($$5-- > 0) {
         $$3.c($$2);
         dey $$6 = $$0.a_($$3);
         csk $$7 = $$6.b();
         if (!$$6.a(csl.kH) || !($$0.c_($$3) instanceof dcu $$9) || $$9.v() != dcu.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            cok $$10 = $$9.c();
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
         int $$11 = Math.max($$4.c(cpg.w), 0);
         c.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
