import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cvt extends cvl {
   public static final MapCodec<cvt> a = b(cvt::new);
   public static final djj b = czu.aE;
   public static final djp c = djf.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<cvt> a() {
      return a;
   }

   public cvt(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ia.c));
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(csy $$0, cer $$1, hv $$2, dip $$3, @Nullable dgd $$4, cmh $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dga $$6) {
         if (cqu.a(cqw.v, $$5) == 0) {
            $$6.a($$1, $$3, dga.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((amq)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(csy $$0, hv $$1) {
      ekw $$2 = new ekw($$1).c(8.0, 6.0, 8.0);
      List<bxj> $$3 = $$0.a(bxj.class, $$2);
      if (!$$3.isEmpty()) {
         List<cer> $$4 = $$0.a(cer.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (bxj $$5 : $$3) {
            if ($$5.q() == null) {
               cer $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(csy $$0, hv $$1) {
      a($$0, $$1, new cmh(cmk.wn, 3));
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      cmh $$6 = $$3.b($$4);
      int $$7 = $$0.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cmc $$9 = $$6.d();
         if ($$6.a(cmk.rS)) {
            $$1.a($$3, $$3.dr(), $$3.dt(), $$3.dx(), arc.bI, ard.e, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, dmz.M, $$2);
         } else if ($$6.a(cmk.si)) {
            $$6.h(1);
            $$1.a($$3, $$3.dr(), $$3.dt(), $$3.dx(), arc.ci, ard.e, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new cmh(cmk.wq));
            } else if (!$$3.fS().e(new cmh(cmk.wq))) {
               $$3.a(new cmh(cmk.wq), false);
            }

            $$8 = true;
            $$1.a($$3, dmz.y, $$2);
         }

         if (!$$1.y_() && $$8) {
            $$3.b(arm.c.b($$9));
         }
      }

      if ($$8) {
         if (!cwn.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, dga.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return bjl.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(csy $$0, hv $$1) {
      return $$0.c_($$1) instanceof dga $$3 ? !$$3.d() : false;
   }

   public void a(csy $$0, dip $$1, hv $$2, @Nullable cer $$3, dga.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dga $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(csy $$0, dip $$1, hv $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(csy $$0, hv $$1, dip $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         elu $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ia.a.b);
         if ($$4 >= 1.0 && !$$2.a(arr.an)) {
            double $$5 = $$3.b(ia.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               hv $$6 = $$1.d();
               dip $$7 = $$0.a_($$6);
               elu $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ia.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(csy $$0, hv $$1, elu $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ia.a.a), (double)$$1.u() + $$2.c(ia.a.a), (double)$$1.w() + $$2.b(ia.a.c), (double)$$1.w() + $$2.c(ia.a.c), $$3);
   }

   private void a(csy $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(jv.as, aty.d($$0.z.j(), $$1, $$2), $$5, aty.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c, b);
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Nullable
   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dga($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return $$0.B ? null : a($$2, dgf.H, dga::a);
   }

   @Override
   public dip a(csy $$0, hv $$1, dip $$2, cer $$3) {
      if (!$$0.B && $$3.f() && $$0.Y().b(csu.h) && $$0.c_($$1) instanceof dga $$5) {
         cmh $$6 = new cmh(this);
         int $$7 = $$2.c(c);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               sj $$9 = new sj();
               $$9.a("Bees", $$5.l());
               cka.a($$6, dgf.H, $$9);
            }

            sj $$10 = new sj();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            cbe $$11 = new cbe($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.u();
            $$0.b($$11);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cmh> a(dip $$0, egk.a $$1) {
      blf $$2 = $$1.b(eip.a);
      if ($$2 instanceof cbf || $$2 instanceof cbl || $$2 instanceof cfx || $$2 instanceof cas || $$2 instanceof cgv) {
         dgd $$3 = $$1.b(eip.h);
         if ($$3 instanceof dga $$4) {
            $$4.a(null, $$0, dga.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$3.a_($$5).b() instanceof cyz && $$3.c_($$4) instanceof dga $$7) {
         $$7.a(null, $$0, dga.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
