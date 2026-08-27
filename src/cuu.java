import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cuu extends cum {
   public static final MapCodec<cuu> a = b(cuu::new);
   public static final dic b = cyv.aE;
   public static final dii c = dhy.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<cuu> a() {
      return a;
   }

   public cuu(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, hx.c));
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(csa $$0, cdu $$1, ht $$2, dhi $$3, @Nullable dfd $$4, clj $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dfa $$6) {
         if (cpw.a(cpy.v, $$5) == 0) {
            $$6.a($$1, $$3, dfa.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         al.K.a((amf)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(csa $$0, ht $$1) {
      ejp $$2 = new ejp($$1).c(8.0, 6.0, 8.0);
      List<bws> $$3 = $$0.a(bws.class, $$2);
      if (!$$3.isEmpty()) {
         List<cdu> $$4 = $$0.a(cdu.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (bws $$5 : $$3) {
            if ($$5.q() == null) {
               cdu $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(csa $$0, ht $$1) {
      a($$0, $$1, new clj(clm.wm, 3));
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      clj $$6 = $$3.b($$4);
      int $$7 = $$0.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cle $$9 = $$6.d();
         if ($$6.a(clm.rS)) {
            $$1.a($$3, $$3.ds(), $$3.du(), $$3.dy(), aqr.bI, aqs.e, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, dls.M, $$2);
         } else if ($$6.a(clm.si)) {
            $$6.h(1);
            $$1.a($$3, $$3.ds(), $$3.du(), $$3.dy(), aqr.ci, aqs.e, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new clj(clm.wp));
            } else if (!$$3.fT().e(new clj(clm.wp))) {
               $$3.a(new clj(clm.wp), false);
            }

            $$8 = true;
            $$1.a($$3, dls.y, $$2);
         }

         if (!$$1.x_() && $$8) {
            $$3.b(arb.c.b($$9));
         }
      }

      if ($$8) {
         if (!cvo.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, dfa.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return bix.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(csa $$0, ht $$1) {
      return $$0.c_($$1) instanceof dfa $$3 ? !$$3.d() : false;
   }

   public void a(csa $$0, dhi $$1, ht $$2, @Nullable cdu $$3, dfa.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dfa $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(csa $$0, dhi $$1, ht $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(csa $$0, ht $$1, dhi $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         ekn $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(hx.a.b);
         if ($$4 >= 1.0 && !$$2.a(arg.an)) {
            double $$5 = $$3.b(hx.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ht $$6 = $$1.d();
               dhi $$7 = $$0.a_($$6);
               ekn $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(hx.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(csa $$0, ht $$1, ekn $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(hx.a.a), (double)$$1.u() + $$2.c(hx.a.a), (double)$$1.w() + $$2.b(hx.a.c), (double)$$1.w() + $$2.c(hx.a.c), $$3);
   }

   private void a(csa $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(js.aq, atm.d($$0.z.j(), $$1, $$2), $$5, atm.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c, b);
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Nullable
   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dfa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return $$0.B ? null : a($$2, dff.H, dfa::a);
   }

   @Override
   public dhi a(csa $$0, ht $$1, dhi $$2, cdu $$3) {
      if (!$$0.B && $$3.f() && $$0.Y().b(crw.h) && $$0.c_($$1) instanceof dfa $$5) {
         clj $$6 = new clj(this);
         int $$7 = $$2.c(c);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               rz $$9 = new rz();
               $$9.a("Bees", $$5.j());
               cjc.a($$6, dff.H, $$9);
            }

            rz $$10 = new rz();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            can $$11 = new can($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.u();
            $$0.b($$11);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<clj> a(dhi $$0, efd.a $$1) {
      bkq $$2 = $$1.b(ehi.a);
      if ($$2 instanceof cao || $$2 instanceof cau || $$2 instanceof cez || $$2 instanceof cab || $$2 instanceof cfx) {
         dfd $$3 = $$1.b(ehi.h);
         if ($$3 instanceof dfa $$4) {
            $$4.a(null, $$0, dfa.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$3.a_($$5).b() instanceof cya && $$3.c_($$4) instanceof dfa $$7) {
         $$7.a(null, $$0, dfa.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
