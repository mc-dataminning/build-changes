import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class cqu extends cpa implements csr {
   private static final Logger c = LogUtils.getLogger();
   public static final dcv a = crm.a;
   public static final dcs b = dcr.c;
   private final boolean d;

   public cqu(dca.d $$0, boolean $$1) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
      this.d = $$1;
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      czx $$2 = new czx($$0, $$1);
      $$2.b(this.d);
      return $$2;
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof czx $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.v() != czx.a.a) {
               if ($$8) {
                  $$7.j();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$1.c_($$2) instanceof czx $$5) {
         cln $$6 = $$5.c();
         boolean $$7 = !aps.b($$6.m());
         czx.a $$8 = $$5.v();
         boolean $$9 = $$5.i();
         if ($$8 == czx.a.b) {
            $$5.j();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == czx.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dcb $$0, cmm $$1, gu $$2, cln $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(a));
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      czn $$6 = $$1.c_($$2);
      if ($$6 instanceof czx && $$3.gk()) {
         $$3.a((czx)$$6);
         return bdx.a($$1.B);
      } else {
         return bdx.d;
      }
   }

   @Override
   public boolean d_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cmm $$1, gu $$2) {
      czn $$3 = $$1.c_($$2);
      return $$3 instanceof czx ? ((czx)$$3).c().k() : 0;
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
      if ($$0.c_($$1) instanceof czx $$6) {
         cln $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (cds.a($$4) == null) {
               $$7.a($$0.X().b(cmi.o));
               $$6.b(this.d);
            }

            if ($$6.v() == czx.a.a) {
               boolean $$8 = $$0.B($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dcb a(cih $$0) {
      return this.n().a(a, $$0.d().g());
   }

   private static void a(cmm $$0, gu $$1, ha $$2) {
      gu.a $$3 = $$1.j();
      cmi $$4 = $$0.X();
      int $$5 = $$4.c(cmi.w);

      while ($$5-- > 0) {
         $$3.c($$2);
         dcb $$6 = $$0.a_($$3);
         cpn $$7 = $$6.b();
         if (!$$6.a(cpo.kH) || !($$0.c_($$3) instanceof czx $$9) || $$9.v() != czx.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            cln $$10 = $$9.c();
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
         int $$11 = Math.max($$4.c(cmi.w), 0);
         c.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
