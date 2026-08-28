import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dev extends den {
   public static final MapCodec<dev> a = b(dev::new);
   public static final dsy b = dix.aE;
   public static final dte c = dsu.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   public dev(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, je.c));
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dca $$0, cmz $$1, iz $$2, dse $$3, @Nullable dpj $$4, cur $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dpg $$6) {
         if (dad.a(daf.v, $$5) == 0) {
            $$6.a($$1, $$3, dpg.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((arg)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(dca $$0, iz $$1) {
      evo $$2 = new evo($$1).c(8.0, 6.0, 8.0);
      List<cfi> $$3 = $$0.a(cfi.class, $$2);
      if (!$$3.isEmpty()) {
         List<cmz> $$4 = $$0.a(cmz.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cfi $$5 : $$3) {
            if ($$5.p() == null) {
               cmz $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dca $$0, iz $$1) {
      a($$0, $$1, new cur(cuu.ww, 3));
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cum $$9 = $$0.g();
         if ($$0.a(cuu.rV)) {
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), awa.bX, awb.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, btr.d($$5));
            $$8 = true;
            $$2.a($$4, dwx.M, $$3);
         } else if ($$0.a(cuu.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.du(), $$4.dw(), $$4.dA(), awa.cC, awb.e, 1.0F, 1.0F);
            if ($$0.e()) {
               $$4.a($$5, new cur(cuu.wz));
            } else if (!$$4.gc().f(new cur(cuu.wz))) {
               $$4.a(new cur(cuu.wz), false);
            }

            $$8 = true;
            $$2.a($$4, dwx.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(awk.c.b($$9));
         }
      }

      if ($$8) {
         if (!dfp.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dpg.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bqy.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dca $$0, iz $$1) {
      return $$0.c_($$1) instanceof dpg $$3 ? !$$3.c() : false;
   }

   public void a(dca $$0, dse $$1, iz $$2, @Nullable cmz $$3, dpg.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dpg $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dca $$0, dse $$1, iz $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dca $$0, iz $$1, dse $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         ewm $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(je.a.b);
         if ($$4 >= 1.0 && !$$2.a(awp.ao)) {
            double $$5 = $$3.b(je.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               iz $$6 = $$1.d();
               dse $$7 = $$0.a_($$6);
               ewm $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(je.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dca $$0, iz $$1, ewm $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(je.a.a), (double)$$1.u() + $$2.c(je.a.a), (double)$$1.w() + $$2.b(je.a.c), (double)$$1.w() + $$2.c(je.a.c), $$3);
   }

   private void a(dca $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(li.av, ayz.d($$0.z.j(), $$1, $$2), $$5, ayz.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Nullable
   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dpg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return $$0.B ? null : a($$2, dpl.H, dpg::a);
   }

   @Override
   public dse a(dca $$0, iz $$1, dse $$2, cmz $$3) {
      if (!$$0.B && $$3.f() && $$0.ab().b(dbw.h) && $$0.c_($$1) instanceof dpg $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cur $$8 = new cur(this);
            $$8.b($$5.s());
            $$8.b(km.ab, cxc.a.a(c, $$6));
            cjj $$9 = new cjj($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cur> a(dse $$0, eqn.a $$1) {
      bsw $$2 = $$1.b(etg.a);
      if ($$2 instanceof cjk || $$2 instanceof cjr || $$2 instanceof cof || $$2 instanceof cix || $$2 instanceof cph) {
         dpj $$3 = $$1.b(etg.h);
         if ($$3 instanceof dpg $$4) {
            $$4.a(null, $$0, dpg.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$3.a_($$5).b() instanceof dib && $$3.c_($$4) instanceof dpg $$7) {
         $$7.a(null, $$0, dpg.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
