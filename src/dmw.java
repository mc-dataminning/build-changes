import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmw extends dmo {
   public static final MapCodec<dmw> a = b(dmw::new);
   public static final ecc<jb> b = drd.e;
   public static final ece c = ebu.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   public dmw(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)).b(b, jb.c));
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(djx $$0, crx $$1, iv $$2, ebe $$3, @Nullable dyc $$4, czy $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dxz $$6) {
         if (!dgn.a($$5, axg.q)) {
            $$6.a($$1, $$3, dxz.b.c);
            bun.a($$3, $$0, $$2);
            this.b($$0, $$2);
         }

         aq.L.a((art)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, djq $$3, BiConsumer<czy, iv> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(djx $$0, iv $$1) {
      ffl $$2 = new ffl($$1).c(8.0, 6.0, 8.0);
      List<cjl> $$3 = $$0.a(cjl.class, $$2);
      if (!$$3.isEmpty()) {
         List<crx> $$4 = $$0.a(crx.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cjl $$5 : $$3) {
            if ($$5.f() == null) {
               crx $$6 = ag.a($$4, $$0.A);
               $$5.g($$6);
            }
         }
      }
   }

   public static void a(djx $$0, iv $$1) {
      a($$0, $$1, new czy(dac.xL, 3));
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         czu $$9 = $$0.h();
         if ($$0.a(dac.td)) {
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awp.bX, awq.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bxu.d($$5));
            $$8 = true;
            $$2.a($$4, ege.M, $$3);
         } else if ($$0.a(dac.ts)) {
            $$0.h(1);
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awp.cC, awq.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new czy(dac.xO));
            } else if (!$$4.gj().g(new czy(dac.xO))) {
               $$4.a(new czy(dac.xO), false);
            }

            $$8 = true;
            $$2.a($$4, ege.y, $$3);
         }

         if (!$$2.A_() && $$8) {
            $$4.b(awz.c.b($$9));
         }
      }

      if ($$8) {
         if (!dns.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dxz.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bur.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(djx $$0, iv $$1) {
      return $$0.c_($$1) instanceof dxz $$3 ? !$$3.c() : false;
   }

   public void a(djx $$0, ebe $$1, iv $$2, @Nullable crx $$3, dxz.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dxz $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(djx $$0, ebe $$1, iv $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(djx $$0, iv $$1, ebe $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fgk $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jb.a.b);
         if ($$4 >= 1.0 && !$$2.a(axe.ar)) {
            double $$5 = $$3.b(jb.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               iv $$6 = $$1.e();
               ebe $$7 = $$0.a_($$6);
               fgk $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jb.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(djx $$0, iv $$1, fgk $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jb.a.a), (double)$$1.u() + $$2.c(jb.a.a), (double)$$1.w() + $$2.b(jb.a.c), (double)$$1.w() + $$2.c(jb.a.c), $$3);
   }

   private void a(djx $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(ly.ay, azo.d($$0.A.j(), $$1, $$2), $$5, azo.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dxz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return $$0.C ? null : a($$2, dye.I, dxz::a);
   }

   @Override
   public ebe a(djx $$0, iv $$1, ebe $$2, crx $$3) {
      if ($$0 instanceof ars $$4 && $$3.gl() && $$4.O().c(djt.i) && $$0.c_($$1) instanceof dxz $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            czy $$9 = new czy(this);
            $$9.b($$6.q());
            $$9.b(kk.aq, dby.a.a(c, $$7));
            coc $$10 = new coc($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.j();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<czy> a(ebe $$0, fak.a $$1) {
      bwt $$2 = $$1.b(fdb.a);
      if ($$2 instanceof cod || $$2 instanceof cok || $$2 instanceof cth || $$2 instanceof cnp || $$2 instanceof cuy) {
         dyc $$3 = $$1.b(fdb.h);
         if ($$3 instanceof dxz $$4) {
            $$4.a(null, $$0, dxz.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      czy $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$3) {
         $$4.b(kk.aq, dby.a.a(c, $$2.c(c)));
      }

      return $$4;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$1.a_($$5).b() instanceof dqe && $$1.c_($$3) instanceof dxz $$9) {
         $$9.a(null, $$0, dxz.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
