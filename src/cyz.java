import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cyz extends cyr {
   public static final MapCodec<cyz> a = b(cyz::new);
   public static final dmy b = dda.aE;
   public static final dne c = dmu.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<cyz> a() {
      return a;
   }

   public cyz(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, ih.c));
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(cwe $$0, cia $$1, ib $$2, dme $$3, @Nullable djl $$4, cpq $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dji $$6) {
         if (cua.a(cuc.v, $$5) == 0) {
            $$6.a($$1, $$3, dji.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((apb)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(cwe $$0, ib $$1) {
      eoq $$2 = new eoq($$1).c(8.0, 6.0, 8.0);
      List<can> $$3 = $$0.a(can.class, $$2);
      if (!$$3.isEmpty()) {
         List<cia> $$4 = $$0.a(cia.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (can $$5 : $$3) {
            if ($$5.q() == null) {
               cia $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(cwe $$0, ib $$1) {
      a($$0, $$1, new cpq(cpt.wq, 3));
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cpl $$9 = $$0.d();
         if ($$0.a(cpt.rU)) {
            $$2.a($$4, $$4.do(), $$4.dq(), $$4.du(), atp.bV, atq.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, box.d($$5));
            $$8 = true;
            $$2.a($$4, dqr.M, $$3);
         } else if ($$0.a(cpt.sk)) {
            $$0.h(1);
            $$2.a($$4, $$4.do(), $$4.dq(), $$4.du(), atp.cv, atq.e, 1.0F, 1.0F);
            if ($$0.b()) {
               $$4.a($$5, new cpq(cpt.wt));
            } else if (!$$4.fV().e(new cpq(cpt.wt))) {
               $$4.a(new cpq(cpt.wt), false);
            }

            $$8 = true;
            $$2.a($$4, dqr.y, $$3);
         }

         if (!$$2.y_() && $$8) {
            $$4.b(atz.c.b($$9));
         }
      }

      if ($$8) {
         if (!czt.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dji.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bmn.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(cwe $$0, ib $$1) {
      return $$0.c_($$1) instanceof dji $$3 ? !$$3.c() : false;
   }

   public void a(cwe $$0, dme $$1, ib $$2, @Nullable cia $$3, dji.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dji $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(cwe $$0, dme $$1, ib $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(cwe $$0, ib $$1, dme $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         epo $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(ih.a.b);
         if ($$4 >= 1.0 && !$$2.a(aue.an)) {
            double $$5 = $$3.b(ih.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ib $$6 = $$1.d();
               dme $$7 = $$0.a_($$6);
               epo $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(ih.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(cwe $$0, ib $$1, epo $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(ih.a.a), (double)$$1.u() + $$2.c(ih.a.a), (double)$$1.w() + $$2.b(ih.a.c), (double)$$1.w() + $$2.c(ih.a.c), $$3);
   }

   private void a(cwe $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(kb.as, awm.d($$0.z.j(), $$1, $$2), $$5, awm.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Nullable
   @Override
   public djl a(ib $$0, dme $$1) {
      return new dji($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return $$0.B ? null : a($$2, djn.H, dji::a);
   }

   @Override
   public dme a(cwe $$0, ib $$1, dme $$2, cia $$3) {
      if (!$$0.B && $$3.f() && $$0.Z().b(cwa.h) && $$0.c_($$1) instanceof dji $$5) {
         cpq $$6 = new cpq(this);
         int $$7 = $$2.c(c);
         boolean $$8 = !$$5.c();
         if ($$8 || $$7 > 0) {
            if ($$8) {
               sy $$9 = new sy();
               $$9.a("Bees", $$5.k());
               cnl.a($$6, djn.H, $$9);
            }

            sy $$10 = new sy();
            $$10.a("honey_level", $$7);
            $$6.a("BlockStateTag", $$10);
            cel $$11 = new cel($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
            $$11.u();
            $$0.b($$11);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cpq> a(dme $$0, eke.a $$1) {
      bof $$2 = $$1.b(emj.a);
      if ($$2 instanceof cem || $$2 instanceof ces || $$2 instanceof cjh || $$2 instanceof cdz || $$2 instanceof ckf) {
         djl $$3 = $$1.b(emj.h);
         if ($$3 instanceof dji $$4) {
            $$4.a(null, $$0, dji.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$3.a_($$5).b() instanceof dcf && $$3.c_($$4) instanceof dji $$7) {
         $$7.a(null, $$0, dji.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
