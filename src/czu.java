import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class czu extends czm {
   public static final MapCodec<czu> a = b(czu::new);
   public static final dnt b = ddv.aE;
   public static final dnz c = dnp.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<czu> a() {
      return a;
   }

   public czu(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ih.c));
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(cwz $$0, cis $$1, ib $$2, dmz $$3, @Nullable dkg $$4, cqk $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dkd $$6) {
         if (cuv.a(cux.v, $$5) == 0) {
            $$6.a($$1, $$3, dkd.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((apg)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(cwz $$0, ib $$1) {
      epm $$2 = new epm($$1).c(8.0, 6.0, 8.0);
      List<cbe> $$3 = $$0.a(cbe.class, $$2);
      if (!$$3.isEmpty()) {
         List<cis> $$4 = $$0.a(cis.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cbe $$5 : $$3) {
            if ($$5.p() == null) {
               cis $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(cwz $$0, ib $$1) {
      a($$0, $$1, new cqk(cqn.wr, 3));
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cqf $$9 = $$0.d();
         if ($$0.a(cqn.rU)) {
            $$2.a($$4, $$4.dr(), $$4.dt(), $$4.dx(), aty.bX, atz.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bpo.d($$5));
            $$8 = true;
            $$2.a($$4, drn.M, $$3);
         } else if ($$0.a(cqn.sk)) {
            $$0.h(1);
            $$2.a($$4, $$4.dr(), $$4.dt(), $$4.dx(), aty.cx, atz.e, 1.0F, 1.0F);
            if ($$0.b()) {
               $$4.a($$5, new cqk(cqn.wu));
            } else if (!$$4.fZ().e(new cqk(cqn.wu))) {
               $$4.a(new cqk(cqn.wu), false);
            }

            $$8 = true;
            $$2.a($$4, drn.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(aui.c.b($$9));
         }
      }

      if ($$8) {
         if (!dao.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dkd.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bne.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(cwz $$0, ib $$1) {
      return $$0.c_($$1) instanceof dkd $$3 ? !$$3.c() : false;
   }

   public void a(cwz $$0, dmz $$1, ib $$2, @Nullable cis $$3, dkd.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dkd $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cwz $$0, dmz $$1, ib $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cwz $$0, ib $$1, dmz $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         eqk $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ih.a.b);
         if ($$4 >= 1.0 && !$$2.a(aun.ao)) {
            double $$5 = $$3.b(ih.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ib $$6 = $$1.d();
               dmz $$7 = $$0.a_($$6);
               eqk $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ih.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cwz $$0, ib $$1, eqk $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ih.a.a), (double)$$1.u() + $$2.c(ih.a.a), (double)$$1.w() + $$2.b(ih.a.c), (double)$$1.w() + $$2.c(ih.a.c), $$3);
   }

   private void a(cwz $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(kc.at, aww.d($$0.z.j(), $$1, $$2), $$5, aww.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Nullable
   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dkd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return $$0.B ? null : a($$2, dki.H, dkd::a);
   }

   @Override
   public dmz a(cwz $$0, ib $$1, dmz $$2, cis $$3) {
      if (!$$0.B && $$3.f() && $$0.Z().b(cwv.h) && $$0.c_($$1) instanceof dkd $$5) {
         cqk $$6 = new cqk(this);
         int $$7 = $$2.c(c);
         boolean $$8 = !$$5.c();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               ta $$9 = new ta();
               $$9.a("Bees", $$5.k());
               cof.a($$6, dki.H, $$9);
            }

            ta $$10 = new ta();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            cfd $$11 = new cfd($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.s();
            $$0.b($$11);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cqk> a(dmz $$0, ela.a $$1) {
      bow $$2 = $$1.b(enf.a);
      if ($$2 instanceof cfe || $$2 instanceof cfk || $$2 instanceof cjy || $$2 instanceof cer || $$2 instanceof ckz) {
         dkg $$3 = $$1.b(enf.h);
         if ($$3 instanceof dkd $$4) {
            $$4.a(null, $$0, dkd.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$3.a_($$5).b() instanceof dda && $$3.c_($$4) instanceof dkd $$7) {
         $$7.a(null, $$0, dkd.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
