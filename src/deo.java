import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class deo extends deg {
   public static final MapCodec<deo> a = b(deo::new);
   public static final dsr b = diq.aE;
   public static final dsx c = dsn.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<deo> a() {
      return a;
   }

   public deo(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, je.c));
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dbt $$0, cms $$1, iz $$2, drx $$3, @Nullable dpc $$4, cuk $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof doz $$6) {
         if (czw.a(czy.v, $$5) == 0) {
            $$6.a($$1, $$3, doz.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((arc)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(dbt $$0, iz $$1) {
      evh $$2 = new evh($$1).c(8.0, 6.0, 8.0);
      List<cfb> $$3 = $$0.a(cfb.class, $$2);
      if (!$$3.isEmpty()) {
         List<cms> $$4 = $$0.a(cms.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cfb $$5 : $$3) {
            if ($$5.p() == null) {
               cms $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dbt $$0, iz $$1) {
      a($$0, $$1, new cuk(cun.ww, 3));
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cuf $$9 = $$0.g();
         if ($$0.a(cun.rV)) {
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), avw.bX, avx.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, btk.d($$5));
            $$8 = true;
            $$2.a($$4, dwq.M, $$3);
         } else if ($$0.a(cun.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), avw.cC, avx.e, 1.0F, 1.0F);
            if ($$0.e()) {
               $$4.a($$5, new cuk(cun.wz));
            } else if (!$$4.gc().f(new cuk(cun.wz))) {
               $$4.a(new cuk(cun.wz), false);
            }

            $$8 = true;
            $$2.a($$4, dwq.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(awg.c.b($$9));
         }
      }

      if ($$8) {
         if (!dfi.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, doz.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bqr.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dbt $$0, iz $$1) {
      return $$0.c_($$1) instanceof doz $$3 ? !$$3.c() : false;
   }

   public void a(dbt $$0, drx $$1, iz $$2, @Nullable cms $$3, doz.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof doz $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dbt $$0, drx $$1, iz $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dbt $$0, iz $$1, drx $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         ewf $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(je.a.b);
         if ($$4 >= 1.0 && !$$2.a(awl.ao)) {
            double $$5 = $$3.b(je.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               iz $$6 = $$1.d();
               drx $$7 = $$0.a_($$6);
               ewf $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(je.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dbt $$0, iz $$1, ewf $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(je.a.a), (double)$$1.u() + $$2.c(je.a.a), (double)$$1.w() + $$2.b(je.a.c), (double)$$1.w() + $$2.c(je.a.c), $$3);
   }

   private void a(dbt $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lj.av, ayu.d($$0.z.j(), $$1, $$2), $$5, ayu.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Nullable
   @Override
   public dpc a(iz $$0, drx $$1) {
      return new doz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return $$0.B ? null : a($$2, dpe.H, doz::a);
   }

   @Override
   public drx a(dbt $$0, iz $$1, drx $$2, cms $$3) {
      if (!$$0.B && $$3.f() && $$0.ab().b(dbp.h) && $$0.c_($$1) instanceof doz $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cuk $$8 = new cuk(this);
            $$8.b($$5.s());
            $$8.b(km.aa, cwv.a.a(c, $$6));
            cjc $$9 = new cjc($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cuk> a(drx $$0, eqg.a $$1) {
      bsp $$2 = $$1.b(esz.a);
      if ($$2 instanceof cjd || $$2 instanceof cjk || $$2 instanceof cny || $$2 instanceof ciq || $$2 instanceof cpa) {
         dpc $$3 = $$1.b(esz.h);
         if ($$3 instanceof doz $$4) {
            $$4.a(null, $$0, doz.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$3.a_($$5).b() instanceof dhu && $$3.c_($$4) instanceof doz $$7) {
         $$7.a(null, $$0, doz.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
