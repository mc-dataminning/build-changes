import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class det extends del {
   public static final MapCodec<det> a = b(det::new);
   public static final dsw b = div.aE;
   public static final dtc c = dss.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<det> a() {
      return a;
   }

   public det(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, je.c));
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dby $$0, cmx $$1, iz $$2, dsc $$3, @Nullable dph $$4, cup $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dpe $$6) {
         if (dab.a(dad.v, $$5) == 0) {
            $$6.a($$1, $$3, dpe.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((arg)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(dby $$0, iz $$1) {
      evm $$2 = new evm($$1).c(8.0, 6.0, 8.0);
      List<cfg> $$3 = $$0.a(cfg.class, $$2);
      if (!$$3.isEmpty()) {
         List<cmx> $$4 = $$0.a(cmx.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cfg $$5 : $$3) {
            if ($$5.p() == null) {
               cmx $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dby $$0, iz $$1) {
      a($$0, $$1, new cup(cus.ww, 3));
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cuk $$9 = $$0.g();
         if ($$0.a(cus.rV)) {
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), awa.bX, awb.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, btp.d($$5));
            $$8 = true;
            $$2.a($$4, dwv.M, $$3);
         } else if ($$0.a(cus.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), awa.cC, awb.e, 1.0F, 1.0F);
            if ($$0.e()) {
               $$4.a($$5, new cup(cus.wz));
            } else if (!$$4.gc().f(new cup(cus.wz))) {
               $$4.a(new cup(cus.wz), false);
            }

            $$8 = true;
            $$2.a($$4, dwv.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(awk.c.b($$9));
         }
      }

      if ($$8) {
         if (!dfn.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dpe.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bqw.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dby $$0, iz $$1) {
      return $$0.c_($$1) instanceof dpe $$3 ? !$$3.c() : false;
   }

   public void a(dby $$0, dsc $$1, iz $$2, @Nullable cmx $$3, dpe.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dpe $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dby $$0, dsc $$1, iz $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dby $$0, iz $$1, dsc $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         ewk $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(je.a.b);
         if ($$4 >= 1.0 && !$$2.a(awp.ao)) {
            double $$5 = $$3.b(je.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               iz $$6 = $$1.d();
               dsc $$7 = $$0.a_($$6);
               ewk $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(je.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dby $$0, iz $$1, ewk $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(je.a.a), (double)$$1.u() + $$2.c(je.a.a), (double)$$1.w() + $$2.b(je.a.c), (double)$$1.w() + $$2.c(je.a.c), $$3);
   }

   private void a(dby $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(li.av, ayz.d($$0.z.j(), $$1, $$2), $$5, ayz.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Nullable
   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dpe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return $$0.B ? null : a($$2, dpj.H, dpe::a);
   }

   @Override
   public dsc a(dby $$0, iz $$1, dsc $$2, cmx $$3) {
      if (!$$0.B && $$3.f() && $$0.ab().b(dbu.h) && $$0.c_($$1) instanceof dpe $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cup $$8 = new cup(this);
            $$8.b($$5.s());
            $$8.b(km.ab, cxa.a.a(c, $$6));
            cjh $$9 = new cjh($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cup> a(dsc $$0, eql.a $$1) {
      bsu $$2 = $$1.b(ete.a);
      if ($$2 instanceof cji || $$2 instanceof cjp || $$2 instanceof cod || $$2 instanceof civ || $$2 instanceof cpf) {
         dph $$3 = $$1.b(ete.h);
         if ($$3 instanceof dpe $$4) {
            $$4.a(null, $$0, dpe.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$3.a_($$5).b() instanceof dhz && $$3.c_($$4) instanceof dpe $$7) {
         $$7.a(null, $$0, dpe.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
