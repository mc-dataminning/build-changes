import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dkf extends djx {
   public static final MapCodec<dkf> a = b(dkf::new);
   public static final dyr<jm> b = doj.aF;
   public static final dyt c = dyk.aO;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dkf> a() {
      return a;
   }

   public dkf(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)).b(b, jm.c));
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dhh $$0, cpw $$1, jh $$2, dxu $$3, @Nullable duw $$4, cxo $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dut $$6) {
         if (!dea.a($$5, axx.q)) {
            $$6.a($$1, $$3, dut.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         ao.L.a((asi)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, dgz $$3, BiConsumer<cxo, jh> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dhh $$0, jh $$1) {
      fbs $$2 = new fbs($$1).c(8.0, 6.0, 8.0);
      List<chx> $$3 = $$0.a(chx.class, $$2);
      if (!$$3.isEmpty()) {
         List<cpw> $$4 = $$0.a(cpw.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (chx $$5 : $$3) {
            if ($$5.O_() == null) {
               cpw $$6 = ae.a($$4, $$0.A);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dhh $$0, jh $$1) {
      a($$0, $$1, new cxo(cxs.xq, 3));
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cxk $$9 = $$0.h();
         if ($$0.a(cxs.sJ)) {
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), axf.bX, axg.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bwf.d($$5));
            $$8 = true;
            $$2.a($$4, ecq.M, $$3);
         } else if ($$0.a(cxs.sY)) {
            $$0.h(1);
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), axf.cC, axg.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cxo(cxs.xt));
            } else if (!$$4.gg().f(new cxo(cxs.xt))) {
               $$4.a(new cxo(cxs.xt), false);
            }

            $$8 = true;
            $$2.a($$4, ecq.y, $$3);
         }

         if (!$$2.B_() && $$8) {
            $$4.b(axp.c.b($$9));
         }
      }

      if ($$8) {
         if (!dla.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dut.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bti.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dhh $$0, jh $$1) {
      return $$0.c_($$1) instanceof dut $$3 ? !$$3.c() : false;
   }

   public void a(dhh $$0, dxu $$1, jh $$2, @Nullable cpw $$3, dut.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dut $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dhh $$0, dxu $$1, jh $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dhh $$0, jh $$1, dxu $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fcr $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jm.a.b);
         if ($$4 >= 1.0 && !$$2.a(axu.ar)) {
            double $$5 = $$3.b(jm.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               jh $$6 = $$1.e();
               dxu $$7 = $$0.a_($$6);
               fcr $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jm.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dhh $$0, jh $$1, fcr $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jm.a.a), (double)$$1.u() + $$2.c(jm.a.a), (double)$$1.w() + $$2.b(jm.a.c), (double)$$1.w() + $$2.c(jm.a.c), $$3);
   }

   private void a(dhh $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(ls.aw, bae.d($$0.A.j(), $$1, $$2), $$5, bae.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Nullable
   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dut($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return $$0.C ? null : a($$2, duy.I, dut::a);
   }

   @Override
   public dxu a(dhh $$0, jh $$1, dxu $$2, cpw $$3) {
      if ($$0 instanceof ash $$4 && $$3.b() && $$4.N().b(dhd.h) && $$0.c_($$1) instanceof dut $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            cxo $$9 = new cxo(this);
            $$9.b($$6.r());
            $$9.b(ku.am, czq.a.a(c, $$7));
            cma $$10 = new cma($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.s();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cxo> a(dxu $$0, ewr.a $$1) {
      bvj $$2 = $$1.b(ezi.a);
      if ($$2 instanceof cmb || $$2 instanceof cmi || $$2 instanceof crd || $$2 instanceof cln || $$2 instanceof csj) {
         duw $$3 = $$1.b(ezi.h);
         if ($$3 instanceof dut $$4) {
            $$4.a(null, $$0, dut.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$1.a_($$5).b() instanceof dnm && $$1.c_($$3) instanceof dut $$9) {
         $$9.a(null, $$0, dut.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
      super.a($$0, $$1, $$2, $$3);
      czq $$4 = $$0.a(ku.am, czq.a);
      int $$5 = Objects.requireNonNullElse($$4.a(c), 0);
      int $$6 = $$0.a(ku.an, List.of()).size();
      $$2.add(xv.a("container.beehive.bees", $$6, 3).a(n.h));
      $$2.add(xv.a("container.beehive.honey", $$5, 5).a(n.h));
   }
}
