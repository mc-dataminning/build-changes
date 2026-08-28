import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dni extends dna {
   public static final MapCodec<dni> a = b(dni::new);
   public static final eco<jc> b = drp.e;
   public static final ecq c = ecg.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   public dni(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)).b(b, jc.c));
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dkj $$0, csi $$1, iw $$2, ebq $$3, @Nullable dyo $$4, dak $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dyl $$6) {
         if (!dgz.a($$5, axp.q)) {
            $$6.a($$1, $$3, dyl.b.c);
            buy.a($$3, $$0, $$2);
            this.b($$0, $$2);
         }

         aq.L.a((asc)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, dkc $$3, BiConsumer<dak, iw> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dkj $$0, iw $$1) {
      ffx $$2 = new ffx($$1).c(8.0, 6.0, 8.0);
      List<cjw> $$3 = $$0.a(cjw.class, $$2);
      if (!$$3.isEmpty()) {
         List<csi> $$4 = $$0.a(csi.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cjw $$5 : $$3) {
            if ($$5.e() == null) {
               csi $$6 = ag.a($$4, $$0.A);
               $$5.g($$6);
            }
         }
      }
   }

   public static void a(dkj $$0, iw $$1) {
      a($$0, $$1, new dak(dao.xL, 3));
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         dag $$9 = $$0.h();
         if ($$0.a(dao.td)) {
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awy.bX, awz.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, byf.d($$5));
            $$8 = true;
            $$2.a($$4, egq.M, $$3);
         } else if ($$0.a(dao.ts)) {
            $$0.h(1);
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awy.cC, awz.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new dak(dao.xO));
            } else if (!$$4.gj().g(new dak(dao.xO))) {
               $$4.a(new dak(dao.xO), false);
            }

            $$8 = true;
            $$2.a($$4, egq.y, $$3);
         }

         if (!$$2.A_() && $$8) {
            $$4.b(axi.c.b($$9));
         }
      }

      if ($$8) {
         if (!doe.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dyl.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bvc.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dkj $$0, iw $$1) {
      return $$0.c_($$1) instanceof dyl $$3 ? !$$3.c() : false;
   }

   public void a(dkj $$0, ebq $$1, iw $$2, @Nullable csi $$3, dyl.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dyl $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dkj $$0, ebq $$1, iw $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dkj $$0, iw $$1, ebq $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fgw $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jc.a.b);
         if ($$4 >= 1.0 && !$$2.a(axn.ar)) {
            double $$5 = $$3.b(jc.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               iw $$6 = $$1.e();
               ebq $$7 = $$0.a_($$6);
               fgw $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jc.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dkj $$0, iw $$1, fgw $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jc.a.a), (double)$$1.u() + $$2.c(jc.a.a), (double)$$1.w() + $$2.b(jc.a.c), (double)$$1.w() + $$2.c(jc.a.c), $$3);
   }

   private void a(dkj $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lz.ay, azz.d($$0.A.j(), $$1, $$2), $$5, azz.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dyl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return $$0.C ? null : a($$2, dyq.I, dyl::a);
   }

   @Override
   public ebq a(dkj $$0, iw $$1, ebq $$2, csi $$3) {
      if ($$0 instanceof asb $$4 && $$3.gl() && $$4.O().c(dkf.i) && $$0.c_($$1) instanceof dyl $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            dak $$9 = new dak(this);
            $$9.b($$6.q());
            $$9.b(kl.aq, dck.a.a(c, $$7));
            coo $$10 = new coo($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.i();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<dak> a(ebq $$0, faw.a $$1) {
      bxe $$2 = $$1.b(fdn.a);
      if ($$2 instanceof cop || $$2 instanceof cow || $$2 instanceof cts || $$2 instanceof coa || $$2 instanceof cvj) {
         dyo $$3 = $$1.b(fdn.h);
         if ($$3 instanceof dyl $$4) {
            $$4.a(null, $$0, dyl.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      dak $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$3) {
         $$4.b(kl.aq, dck.a.a(c, $$2.c(c)));
      }

      return $$4;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$1.a_($$5).b() instanceof dqq && $$1.c_($$3) instanceof dyl $$9) {
         $$9.a(null, $$0, dyl.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
