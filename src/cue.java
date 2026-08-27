import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class cue extends csk implements cwb {
   private static final Logger c = LogUtils.getLogger();
   public static final dgf a = cuw.a;
   public static final dgc b = dgb.c;
   private final boolean d;

   public cue(dfk.d $$0, boolean $$1) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
      this.d = $$1;
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      ddh $$2 = new ddh($$0, $$1);
      $$2.b(this.d);
      return $$2;
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof ddh $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.v() != ddh.a.a) {
               if ($$8) {
                  $$7.j();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$1.c_($$2) instanceof ddh $$5) {
         coy $$6 = $$5.c();
         boolean $$7 = !ass.b($$6.m());
         ddh.a $$8 = $$5.v();
         boolean $$9 = $$5.i();
         if ($$8 == ddh.a.b) {
            $$5.j();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == ddh.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dfl $$0, cpx $$1, gw $$2, coy $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(a));
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      dcx $$6 = $$1.c_($$2);
      if ($$6 instanceof ddh && $$3.go()) {
         $$3.a((ddh)$$6);
         return bha.a($$1.B);
      } else {
         return bha.d;
      }
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      dcx $$3 = $$1.c_($$2);
      return $$3 instanceof ddh ? ((ddh)$$3).c().k() : 0;
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bji $$3, cjh $$4) {
      if ($$0.c_($$1) instanceof ddh $$6) {
         coy $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (cha.a($$4) == null) {
               $$7.a($$0.X().b(cpt.o));
               $$6.b(this.d);
            }

            if ($$6.v() == ddh.a.a) {
               boolean $$8 = $$0.B($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dfl a(clp $$0) {
      return this.n().a(a, $$0.d().g());
   }

   private static void a(cpx $$0, gw $$1, hc $$2) {
      gw.a $$3 = $$1.j();
      cpt $$4 = $$0.X();
      int $$5 = $$4.c(cpt.w);

      while ($$5-- > 0) {
         $$3.c($$2);
         dfl $$6 = $$0.a_($$3);
         csx $$7 = $$6.b();
         if (!$$6.a(csy.kH) || !($$0.c_($$3) instanceof ddh $$9) || $$9.v() != ddh.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            coy $$10 = $$9.c();
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
         int $$11 = Math.max($$4.c(cpt.w), 0);
         c.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
