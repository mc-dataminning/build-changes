import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class deu extends dem {
   public static final MapCodec<deu> a = b(deu::new);
   public static final dsx b = diw.aE;
   public static final dtd c = dst.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   public deu(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, je.c));
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dbz $$0, cmy $$1, iz $$2, dsd $$3, @Nullable dpi $$4, cuq $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dpf $$6) {
         if (dac.a(dae.v, $$5) == 0) {
            $$6.a($$1, $$3, dpf.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((arg)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(dbz $$0, iz $$1) {
      evn $$2 = new evn($$1).c(8.0, 6.0, 8.0);
      List<cfh> $$3 = $$0.a(cfh.class, $$2);
      if (!$$3.isEmpty()) {
         List<cmy> $$4 = $$0.a(cmy.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cfh $$5 : $$3) {
            if ($$5.p() == null) {
               cmy $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dbz $$0, iz $$1) {
      a($$0, $$1, new cuq(cut.ww, 3));
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cul $$9 = $$0.g();
         if ($$0.a(cut.rV)) {
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), awa.bX, awb.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, btq.d($$5));
            $$8 = true;
            $$2.a($$4, dww.M, $$3);
         } else if ($$0.a(cut.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), awa.cC, awb.e, 1.0F, 1.0F);
            if ($$0.e()) {
               $$4.a($$5, new cuq(cut.wz));
            } else if (!$$4.gc().f(new cuq(cut.wz))) {
               $$4.a(new cuq(cut.wz), false);
            }

            $$8 = true;
            $$2.a($$4, dww.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(awk.c.b($$9));
         }
      }

      if ($$8) {
         if (!dfo.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dpf.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bqx.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dbz $$0, iz $$1) {
      return $$0.c_($$1) instanceof dpf $$3 ? !$$3.c() : false;
   }

   public void a(dbz $$0, dsd $$1, iz $$2, @Nullable cmy $$3, dpf.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dpf $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dbz $$0, dsd $$1, iz $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dbz $$0, iz $$1, dsd $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         ewl $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(je.a.b);
         if ($$4 >= 1.0 && !$$2.a(awp.ao)) {
            double $$5 = $$3.b(je.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               iz $$6 = $$1.d();
               dsd $$7 = $$0.a_($$6);
               ewl $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(je.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dbz $$0, iz $$1, ewl $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(je.a.a), (double)$$1.u() + $$2.c(je.a.a), (double)$$1.w() + $$2.b(je.a.c), (double)$$1.w() + $$2.c(je.a.c), $$3);
   }

   private void a(dbz $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(li.av, ayz.d($$0.z.j(), $$1, $$2), $$5, ayz.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Nullable
   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dpf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return $$0.B ? null : a($$2, dpk.H, dpf::a);
   }

   @Override
   public dsd a(dbz $$0, iz $$1, dsd $$2, cmy $$3) {
      if (!$$0.B && $$3.f() && $$0.ab().b(dbv.h) && $$0.c_($$1) instanceof dpf $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cuq $$8 = new cuq(this);
            $$8.b($$5.s());
            $$8.b(km.ab, cxb.a.a(c, $$6));
            cji $$9 = new cji($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cuq> a(dsd $$0, eqm.a $$1) {
      bsv $$2 = $$1.b(etf.a);
      if ($$2 instanceof cjj || $$2 instanceof cjq || $$2 instanceof coe || $$2 instanceof ciw || $$2 instanceof cpg) {
         dpi $$3 = $$1.b(etf.h);
         if ($$3 instanceof dpf $$4) {
            $$4.a(null, $$0, dpf.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$3.a_($$5).b() instanceof dia && $$3.c_($$4) instanceof dpf $$7) {
         $$7.a(null, $$0, dpf.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
