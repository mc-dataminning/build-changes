import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cwj extends cwb {
   public static final MapCodec<cwj> a = b(cwj::new);
   public static final dka b = dak.aE;
   public static final dkg c = djw.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<cwj> a() {
      return a;
   }

   public cwj(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ic.c));
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(cto $$0, cfh $$1, hx $$2, djg $$3, @Nullable dgu $$4, cmx $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dgr $$6) {
         if (crk.a(crm.v, $$5) == 0) {
            $$6.a($$1, $$3, dgr.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((ane)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(cto $$0, hx $$1) {
      eln $$2 = new eln($$1).c(8.0, 6.0, 8.0);
      List<bxy> $$3 = $$0.a(bxy.class, $$2);
      if (!$$3.isEmpty()) {
         List<cfh> $$4 = $$0.a(cfh.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (bxy $$5 : $$3) {
            if ($$5.q() == null) {
               cfh $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(cto $$0, hx $$1) {
      a($$0, $$1, new cmx(cna.wn, 3));
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      cmx $$6 = $$3.b($$4);
      int $$7 = $$0.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cms $$9 = $$6.d();
         if ($$6.a(cna.rS)) {
            $$1.a($$3, $$3.dr(), $$3.dt(), $$3.dx(), arr.bI, ars.e, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, dnq.M, $$2);
         } else if ($$6.a(cna.si)) {
            $$6.h(1);
            $$1.a($$3, $$3.dr(), $$3.dt(), $$3.dx(), arr.ci, ars.e, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new cmx(cna.wq));
            } else if (!$$3.fS().e(new cmx(cna.wq))) {
               $$3.a(new cmx(cna.wq), false);
            }

            $$8 = true;
            $$1.a($$3, dnq.y, $$2);
         }

         if (!$$1.y_() && $$8) {
            $$3.b(asb.c.b($$9));
         }
      }

      if ($$8) {
         if (!cxd.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, dgr.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return bka.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(cto $$0, hx $$1) {
      return $$0.c_($$1) instanceof dgr $$3 ? !$$3.d() : false;
   }

   public void a(cto $$0, djg $$1, hx $$2, @Nullable cfh $$3, dgr.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dgr $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cto $$0, djg $$1, hx $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cto $$0, hx $$1, djg $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         eml $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ic.a.b);
         if ($$4 >= 1.0 && !$$2.a(asg.an)) {
            double $$5 = $$3.b(ic.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               hx $$6 = $$1.d();
               djg $$7 = $$0.a_($$6);
               eml $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ic.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cto $$0, hx $$1, eml $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ic.a.a), (double)$$1.u() + $$2.c(ic.a.a), (double)$$1.w() + $$2.b(ic.a.c), (double)$$1.w() + $$2.c(ic.a.c), $$3);
   }

   private void a(cto $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(jx.as, aun.d($$0.z.j(), $$1, $$2), $$5, aun.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c, b);
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Nullable
   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dgr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return $$0.B ? null : a($$2, dgw.H, dgr::a);
   }

   @Override
   public djg a(cto $$0, hx $$1, djg $$2, cfh $$3) {
      if (!$$0.B && $$3.f() && $$0.Z().b(ctk.h) && $$0.c_($$1) instanceof dgr $$5) {
         cmx $$6 = new cmx(this);
         int $$7 = $$2.c(c);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               sn $$9 = new sn();
               $$9.a("Bees", $$5.l());
               ckq.a($$6, dgw.H, $$9);
            }

            sn $$10 = new sn();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            cbt $$11 = new cbt($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.u();
            $$0.b($$11);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cmx> a(djg $$0, ehb.a $$1) {
      blu $$2 = $$1.b(ejg.a);
      if ($$2 instanceof cbu || $$2 instanceof cca || $$2 instanceof cgn || $$2 instanceof cbh || $$2 instanceof chl) {
         dgu $$3 = $$1.b(ejg.h);
         if ($$3 instanceof dgr $$4) {
            $$4.a(null, $$0, dgr.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$3.a_($$5).b() instanceof czp && $$3.c_($$4) instanceof dgr $$7) {
         $$7.a(null, $$0, dgr.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
