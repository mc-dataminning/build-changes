import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class cuc extends csi implements cvz {
   private static final Logger c = LogUtils.getLogger();
   public static final dgd a = cuu.a;
   public static final dga b = dfz.c;
   private final boolean d;

   public cuc(dfi.d $$0, boolean $$1) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
      this.d = $$1;
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      ddf $$2 = new ddf($$0, $$1);
      $$2.b(this.d);
      return $$2;
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof ddf $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.v() != ddf.a.a) {
               if ($$8) {
                  $$7.j();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if ($$1.c_($$2) instanceof ddf $$5) {
         cow $$6 = $$5.c();
         boolean $$7 = !asq.b($$6.m());
         ddf.a $$8 = $$5.v();
         boolean $$9 = $$5.i();
         if ($$8 == ddf.a.b) {
            $$5.j();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == ddf.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dfj $$0, cpv $$1, gw $$2, cow $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(a));
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      dcv $$6 = $$1.c_($$2);
      if ($$6 instanceof ddf && $$3.go()) {
         $$3.a((ddf)$$6);
         return bgy.a($$1.B);
      } else {
         return bgy.d;
      }
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      dcv $$3 = $$1.c_($$2);
      return $$3 instanceof ddf ? ((ddf)$$3).c().k() : 0;
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, bjg $$3, cjf $$4) {
      if ($$0.c_($$1) instanceof ddf $$6) {
         cow $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (cgy.a($$4) == null) {
               $$7.a($$0.X().b(cpr.o));
               $$6.b(this.d);
            }

            if ($$6.v() == ddf.a.a) {
               boolean $$8 = $$0.B($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dfj a(cln $$0) {
      return this.n().a(a, $$0.d().g());
   }

   private static void a(cpv $$0, gw $$1, ha $$2) {
      gw.a $$3 = $$1.j();
      cpr $$4 = $$0.X();
      int $$5 = $$4.c(cpr.w);

      while ($$5-- > 0) {
         $$3.c($$2);
         dfj $$6 = $$0.a_($$3);
         csv $$7 = $$6.b();
         if (!$$6.a(csw.kH) || !($$0.c_($$3) instanceof ddf $$9) || $$9.v() != ddf.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            cow $$10 = $$9.c();
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
         int $$11 = Math.max($$4.c(cpr.w), 0);
         c.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
