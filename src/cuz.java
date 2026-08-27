import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cuz extends cur {
   public static final MapCodec<cuz> a = b(cuz::new);
   public static final dih b = cza.aE;
   public static final din c = did.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<cuz> a() {
      return a;
   }

   public cuz(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ib.c));
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(csf $$0, cdz $$1, hx $$2, dhn $$3, @Nullable dfi $$4, clo $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dff $$6) {
         if (cqb.a(cqd.v, $$5) == 0) {
            $$6.a($$1, $$3, dff.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         al.K.a((amj)$$1, $$3, $$5, $$6.g());
      }
   }

   private void b(csf $$0, hx $$1) {
      eju $$2 = new eju($$1).c(8.0, 6.0, 8.0);
      List<bwx> $$3 = $$0.a(bwx.class, $$2);
      if (!$$3.isEmpty()) {
         List<cdz> $$4 = $$0.a(cdz.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (bwx $$5 : $$3) {
            if ($$5.q() == null) {
               cdz $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(csf $$0, hx $$1) {
      a($$0, $$1, new clo(clr.wm, 3));
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      clo $$6 = $$3.b($$4);
      int $$7 = $$0.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         clj $$9 = $$6.d();
         if ($$6.a(clr.rS)) {
            $$1.a($$3, $$3.ds(), $$3.du(), $$3.dy(), aqv.bI, aqw.e, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, dlx.M, $$2);
         } else if ($$6.a(clr.si)) {
            $$6.h(1);
            $$1.a($$3, $$3.ds(), $$3.du(), $$3.dy(), aqv.ci, aqw.e, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new clo(clr.wp));
            } else if (!$$3.fT().e(new clo(clr.wp))) {
               $$3.a(new clo(clr.wp), false);
            }

            $$8 = true;
            $$1.a($$3, dlx.y, $$2);
         }

         if (!$$1.y_() && $$8) {
            $$3.b(arf.c.b($$9));
         }
      }

      if ($$8) {
         if (!cvt.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, dff.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return bjb.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(csf $$0, hx $$1) {
      return $$0.c_($$1) instanceof dff $$3 ? !$$3.d() : false;
   }

   public void a(csf $$0, dhn $$1, hx $$2, @Nullable cdz $$3, dff.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dff $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(csf $$0, dhn $$1, hx $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(csf $$0, hx $$1, dhn $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         eks $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ib.a.b);
         if ($$4 >= 1.0 && !$$2.a(ark.an)) {
            double $$5 = $$3.b(ib.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               hx $$6 = $$1.d();
               dhn $$7 = $$0.a_($$6);
               eks $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ib.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(csf $$0, hx $$1, eks $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ib.a.a), (double)$$1.u() + $$2.c(ib.a.a), (double)$$1.w() + $$2.b(ib.a.c), (double)$$1.w() + $$2.c(ib.a.c), $$3);
   }

   private void a(csf $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(jw.aq, atq.d($$0.z.j(), $$1, $$2), $$5, atq.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c, b);
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Nullable
   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dff($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return $$0.B ? null : a($$2, dfk.H, dff::a);
   }

   @Override
   public dhn a(csf $$0, hx $$1, dhn $$2, cdz $$3) {
      if (!$$0.B && $$3.f() && $$0.Y().b(csb.h) && $$0.c_($$1) instanceof dff $$5) {
         clo $$6 = new clo(this);
         int $$7 = $$2.c(c);
         boolean $$8 = !$$5.d();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               sd $$9 = new sd();
               $$9.a("Bees", $$5.l());
               cjh.a($$6, dfk.H, $$9);
            }

            sd $$10 = new sd();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            cas $$11 = new cas($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.u();
            $$0.b($$11);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<clo> a(dhn $$0, efi.a $$1) {
      bkv $$2 = $$1.b(ehn.a);
      if ($$2 instanceof cat || $$2 instanceof caz || $$2 instanceof cfe || $$2 instanceof cag || $$2 instanceof cgc) {
         dfi $$3 = $$1.b(ehn.h);
         if ($$3 instanceof dff $$4) {
            $$4.a(null, $$0, dff.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$3.a_($$5).b() instanceof cyf && $$3.c_($$4) instanceof dff $$7) {
         $$7.a(null, $$0, dff.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
