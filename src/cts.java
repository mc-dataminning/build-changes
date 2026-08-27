import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class cts extends cry implements cvp {
   private static final Logger c = LogUtils.getLogger();
   public static final dft a = cuk.a;
   public static final dfq b = dfp.c;
   private final boolean d;

   public cts(dey.d $$0, boolean $$1) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
      this.d = $$1;
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      dcv $$2 = new dcv($$0, $$1);
      $$2.b(this.d);
      return $$2;
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dcv $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.v() != dcv.a.a) {
               if ($$8) {
                  $$7.j();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.c_($$2) instanceof dcv $$5) {
         col $$6 = $$5.c();
         boolean $$7 = !asi.b($$6.m());
         dcv.a $$8 = $$5.v();
         boolean $$9 = $$5.i();
         if ($$8 == dcv.a.b) {
            $$5.j();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dcv.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dez $$0, cpl $$1, gu $$2, col $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(a));
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      dcl $$6 = $$1.c_($$2);
      if ($$6 instanceof dcv && $$3.gn()) {
         $$3.a((dcv)$$6);
         return bgq.a($$1.B);
      } else {
         return bgq.d;
      }
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      dcl $$3 = $$1.c_($$2);
      return $$3 instanceof dcv ? ((dcv)$$3).c().k() : 0;
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, biy $$3, cix $$4) {
      if ($$0.c_($$1) instanceof dcv $$6) {
         col $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (cgq.a($$4) == null) {
               $$7.a($$0.X().b(cph.o));
               $$6.b(this.d);
            }

            if ($$6.v() == dcv.a.a) {
               boolean $$8 = $$0.B($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dez a(clf $$0) {
      return this.n().a(a, $$0.d().g());
   }

   private static void a(cpl $$0, gu $$1, ha $$2) {
      gu.a $$3 = $$1.j();
      cph $$4 = $$0.X();
      int $$5 = $$4.c(cph.w);

      while ($$5-- > 0) {
         $$3.c($$2);
         dez $$6 = $$0.a_($$3);
         csl $$7 = $$6.b();
         if (!$$6.a(csm.kH) || !($$0.c_($$3) instanceof dcv $$9) || $$9.v() != dcv.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            col $$10 = $$9.c();
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
         int $$11 = Math.max($$4.c(cph.w), 0);
         c.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
