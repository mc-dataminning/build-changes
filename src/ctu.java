import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ctu extends ctm {
   public static final MapCodec<ctu> a = b(ctu::new);
   public static final dgv b = cxu.aE;
   public static final dhb c = dgr.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<ctu> a() {
      return a;
   }

   public ctu(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, hx.c));
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(cqz $$0, ccx $$1, ht $$2, dgb $$3, @Nullable ddx $$4, ckj $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof ddu $$6) {
         if (cov.a(cox.v, $$5) == 0) {
            $$6.a($$1, $$3, ddu.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         al.K.a((alr)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(cqz $$0, ht $$1) {
      eia $$2 = new eia($$1).c(8.0, 6.0, 8.0);
      List<bvv> $$3 = $$0.a(bvv.class, $$2);
      if (!$$3.isEmpty()) {
         List<ccx> $$4 = $$0.a(ccx.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (bvv $$5 : $$3) {
            if ($$5.q() == null) {
               ccx $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(cqz $$0, ht $$1) {
      a($$0, $$1, new ckj(ckm.vA, 3));
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      ckj $$6 = $$3.b($$4);
      int $$7 = $$0.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cke $$9 = $$6.d();
         if ($$6.a(ckm.rg)) {
            $$1.a($$3, $$3.dq(), $$3.ds(), $$3.dw(), aqd.bI, aqe.e, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, dkl.M, $$2);
         } else if ($$6.a(ckm.rw)) {
            $$6.h(1);
            $$1.a($$3, $$3.dq(), $$3.ds(), $$3.dw(), aqd.ci, aqe.e, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new ckj(ckm.vD));
            } else if (!$$3.fS().e(new ckj(ckm.vD))) {
               $$3.a(new ckj(ckm.vD), false);
            }

            $$8 = true;
            $$1.a($$3, dkl.y, $$2);
         }

         if (!$$1.x_() && $$8) {
            $$3.b(aqn.c.b($$9));
         }
      }

      if ($$8) {
         if (!cuo.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, ddu.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return bib.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(cqz $$0, ht $$1) {
      return $$0.c_($$1) instanceof ddu $$3 ? !$$3.d() : false;
   }

   public void a(cqz $$0, dgb $$1, ht $$2, @Nullable ccx $$3, ddu.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof ddu $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cqz $$0, dgb $$1, ht $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cqz $$0, ht $$1, dgb $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         eiy $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(hx.a.b);
         if ($$4 >= 1.0 && !$$2.a(aqs.an)) {
            double $$5 = $$3.b(hx.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ht $$6 = $$1.d();
               dgb $$7 = $$0.a_($$6);
               eiy $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(hx.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cqz $$0, ht $$1, eiy $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(hx.a.a), (double)$$1.u() + $$2.c(hx.a.a), (double)$$1.w() + $$2.b(hx.a.c), (double)$$1.w() + $$2.c(hx.a.c), $$3);
   }

   private void a(cqz $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(js.ap, asy.d($$0.z.j(), $$1, $$2), $$5, asy.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c, b);
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Nullable
   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new ddu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return $$0.B ? null : a($$2, ddz.H, ddu::a);
   }

   @Override
   public dgb a(cqz $$0, ht $$1, dgb $$2, ccx $$3) {
      if (!$$0.B && $$3.f() && $$0.X().b(cqv.g) && $$0.c_($$1) instanceof ddu $$5) {
         ckj $$6 = new ckj(this);
         int $$7 = $$2.c(c);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               rt $$9 = new rt();
               $$9.a("Bees", $$5.j());
               cic.a($$6, ddz.H, $$9);
            }

            rt $$10 = new rt();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            bzq $$11 = new bzq($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.t();
            $$0.b($$11);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<ckj> a(dgb $$0, edo.a $$1) {
      bjt $$2 = $$1.b(eft.a);
      if ($$2 instanceof bzr || $$2 instanceof bzx || $$2 instanceof cec || $$2 instanceof bze || $$2 instanceof cfa) {
         ddx $$3 = $$1.b(eft.h);
         if ($$3 instanceof ddu $$4) {
            $$4.a(null, $$0, ddu.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$3.a_($$5).b() instanceof cwy && $$3.c_($$4) instanceof ddu $$7) {
         $$7.a(null, $$0, ddu.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
