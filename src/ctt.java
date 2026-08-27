import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ctt extends crz implements cvq {
   private static final Logger c = LogUtils.getLogger();
   public static final dfu a = cul.a;
   public static final dfr b = dfq.c;
   private final boolean d;

   public ctt(dez.d $$0, boolean $$1) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
      this.d = $$1;
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      dcw $$2 = new dcw($$0, $$1);
      $$2.b(this.d);
      return $$2;
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dcw $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.v() != dcw.a.a) {
               if ($$8) {
                  $$7.j();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.c_($$2) instanceof dcw $$5) {
         com $$6 = $$5.c();
         boolean $$7 = !asi.b($$6.m());
         dcw.a $$8 = $$5.v();
         boolean $$9 = $$5.i();
         if ($$8 == dcw.a.b) {
            $$5.j();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dcw.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dfa $$0, cpm $$1, gu $$2, com $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(a));
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      dcm $$6 = $$1.c_($$2);
      if ($$6 instanceof dcw && $$3.gn()) {
         $$3.a((dcw)$$6);
         return bgq.a($$1.B);
      } else {
         return bgq.d;
      }
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      dcm $$3 = $$1.c_($$2);
      return $$3 instanceof dcw ? ((dcw)$$3).c().k() : 0;
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, biy $$3, ciy $$4) {
      if ($$0.c_($$1) instanceof dcw $$6) {
         com $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (cgr.a($$4) == null) {
               $$7.a($$0.X().b(cpi.o));
               $$6.b(this.d);
            }

            if ($$6.v() == dcw.a.a) {
               boolean $$8 = $$0.B($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dfa a(clg $$0) {
      return this.n().a(a, $$0.d().g());
   }

   private static void a(cpm $$0, gu $$1, ha $$2) {
      gu.a $$3 = $$1.j();
      cpi $$4 = $$0.X();
      int $$5 = $$4.c(cpi.w);

      while ($$5-- > 0) {
         $$3.c($$2);
         dfa $$6 = $$0.a_($$3);
         csm $$7 = $$6.b();
         if (!$$6.a(csn.kH) || !($$0.c_($$3) instanceof dcw $$9) || $$9.v() != dcw.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            com $$10 = $$9.c();
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
         int $$11 = Math.max($$4.c(cpi.w), 0);
         c.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
