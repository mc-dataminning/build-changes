import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cwd extends cvv {
   public static final MapCodec<cwd> a = b(cwd::new);
   public static final dju b = dae.aE;
   public static final dka c = djq.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<cwd> a() {
      return a;
   }

   public cwd(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ic.c));
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(cti $$0, cfb $$1, hx $$2, dja $$3, @Nullable dgo $$4, cmr $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dgl $$6) {
         if (cre.a(crg.v, $$5) == 0) {
            $$6.a($$1, $$3, dgl.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((ana)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(cti $$0, hx $$1) {
      elh $$2 = new elh($$1).c(8.0, 6.0, 8.0);
      List<bxt> $$3 = $$0.a(bxt.class, $$2);
      if (!$$3.isEmpty()) {
         List<cfb> $$4 = $$0.a(cfb.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (bxt $$5 : $$3) {
            if ($$5.q() == null) {
               cfb $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(cti $$0, hx $$1) {
      a($$0, $$1, new cmr(cmu.wn, 3));
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      cmr $$6 = $$3.b($$4);
      int $$7 = $$0.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cmm $$9 = $$6.d();
         if ($$6.a(cmu.rS)) {
            $$1.a($$3, $$3.dr(), $$3.dt(), $$3.dx(), arm.bI, arn.e, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, dnk.M, $$2);
         } else if ($$6.a(cmu.si)) {
            $$6.h(1);
            $$1.a($$3, $$3.dr(), $$3.dt(), $$3.dx(), arm.ci, arn.e, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new cmr(cmu.wq));
            } else if (!$$3.fS().e(new cmr(cmu.wq))) {
               $$3.a(new cmr(cmu.wq), false);
            }

            $$8 = true;
            $$1.a($$3, dnk.y, $$2);
         }

         if (!$$1.y_() && $$8) {
            $$3.b(arw.c.b($$9));
         }
      }

      if ($$8) {
         if (!cwx.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, dgl.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return bjv.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(cti $$0, hx $$1) {
      return $$0.c_($$1) instanceof dgl $$3 ? !$$3.d() : false;
   }

   public void a(cti $$0, dja $$1, hx $$2, @Nullable cfb $$3, dgl.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dgl $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cti $$0, dja $$1, hx $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cti $$0, hx $$1, dja $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         emf $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ic.a.b);
         if ($$4 >= 1.0 && !$$2.a(asb.an)) {
            double $$5 = $$3.b(ic.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               hx $$6 = $$1.d();
               dja $$7 = $$0.a_($$6);
               emf $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ic.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cti $$0, hx $$1, emf $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ic.a.a), (double)$$1.u() + $$2.c(ic.a.a), (double)$$1.w() + $$2.b(ic.a.c), (double)$$1.w() + $$2.c(ic.a.c), $$3);
   }

   private void a(cti $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(jx.as, aui.d($$0.z.j(), $$1, $$2), $$5, aui.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c, b);
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Nullable
   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dgl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return $$0.B ? null : a($$2, dgq.H, dgl::a);
   }

   @Override
   public dja a(cti $$0, hx $$1, dja $$2, cfb $$3) {
      if (!$$0.B && $$3.f() && $$0.Z().b(cte.h) && $$0.c_($$1) instanceof dgl $$5) {
         cmr $$6 = new cmr(this);
         int $$7 = $$2.c(c);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               sl $$9 = new sl();
               $$9.a("Bees", $$5.l());
               ckk.a($$6, dgq.H, $$9);
            }

            sl $$10 = new sl();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            cbo $$11 = new cbo($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.u();
            $$0.b($$11);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cmr> a(dja $$0, egv.a $$1) {
      blp $$2 = $$1.b(eja.a);
      if ($$2 instanceof cbp || $$2 instanceof cbv || $$2 instanceof cgh || $$2 instanceof cbc || $$2 instanceof chf) {
         dgo $$3 = $$1.b(eja.h);
         if ($$3 instanceof dgl $$4) {
            $$4.a(null, $$0, dgl.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$3.a_($$5).b() instanceof czj && $$3.c_($$4) instanceof dgl $$7) {
         $$7.a(null, $$0, dgl.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
