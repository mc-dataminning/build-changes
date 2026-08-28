import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmo extends clv {
   private static final all b = all.b("baby");
   private static final bwk c = new bwk(b, 0.5, bwk.a.b);
   private static final all d = all.b("reinforcement_caller_charge");
   private static final bwk cb = new bwk(all.b("reinforcement_callee_charge"), -0.05F, bwk.a.a);
   private static final all cc = all.b("leader_zombie_bonus");
   private static final all cd = all.b("zombie_random_spawn_bonus");
   private static final ako<Boolean> ce = aks.a(cmo.class, akq.k);
   private static final ako<Integer> cf = aks.a(cmo.class, akq.b);
   private static final ako<Boolean> cg = aks.a(cmo.class, akq.k);
   public static final float e = 0.05F;
   public static final int bY = 50;
   public static final int bZ = 40;
   public static final int ca = 7;
   private static final bul ch = bup.bu.n().a(0.5F).b(0.93F);
   private static final float ci = 0.1F;
   private static final Predicate<bse> cj = $$0 -> $$0 == bse.d;
   private final cbm ck = new cbm(this, cj);
   private boolean cl;
   private int cm;
   private int cn;

   public cmo(bup<? extends cmo> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cmo(dff $$0) {
      this(bup.bu, $$0);
   }

   @Override
   protected void D() {
      this.bS.a(4, new cmo.a(this, 1.0, 3));
      this.bS.a(8, new cck(this, cor.class, 8.0F));
      this.bS.a(8, new ccx(this));
      this.t();
   }

   protected void t() {
      this.bS.a(2, new cdr(this, 1.0, false));
      this.bS.a(6, new cco(this, 1.0, true, 4, this::gC));
      this.bS.a(7, new cdp(this, 1.0));
      this.bT.a(1, new cdu(this).a(cmq.class));
      this.bT.a(2, new cdv<>(this, cor.class, true));
      this.bT.a(3, new cdv<>(this, cnx.class, false));
      this.bT.a(3, new cdv<>(this, chh.class, true));
      this.bT.a(5, new cdv<>(this, chw.class, 10, true, false, chw.bY));
   }

   public static bwl.a gy() {
      return clv.gB().a(bwm.m, 35.0).a(bwm.v, 0.23F).a(bwm.c, 3.0).a(bwm.a, 2.0).a(bwm.A);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, 0);
      $$0.a(cg, false);
   }

   public boolean gz() {
      return this.aw().a(cg);
   }

   public boolean gC() {
      return this.cl;
   }

   public void y(boolean $$0) {
      if (cga.a(this)) {
         if (this.cl != $$0) {
            this.cl = $$0;
            ((cep)this.P()).b($$0);
            if ($$0) {
               this.bS.a(1, this.ck);
            } else {
               this.bS.a(this.ck);
            }
         }
      } else if (this.cl) {
         this.bS.a(this.ck);
         this.cl = false;
      }
   }

   @Override
   public boolean p_() {
      return this.aw().a(ce);
   }

   @Override
   protected int er() {
      if (this.p_()) {
         this.bN = (int)((double)this.bN * 2.5);
      }

      return super.er();
   }

   @Override
   public void a(boolean $$0) {
      this.aw().a(ce, $$0);
      if (this.dY() != null && !this.dY().C) {
         bwi $$1 = this.g(bwm.v);
         $$1.c(b);
         if ($$0) {
            $$1.b(c);
         }
      }
   }

   @Override
   public void a(ako<?> $$0) {
      if (ce.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   protected boolean gw() {
      return true;
   }

   @Override
   public void l() {
      if (!this.dY().C && this.bN() && !this.gi()) {
         if (this.gz()) {
            this.cn--;
            if (this.cn < 0) {
               this.ah_();
            }
         } else if (this.gw()) {
            if (this.a(axj.a)) {
               this.cm++;
               if (this.cm >= 600) {
                  this.s(300);
               }
            } else {
               this.cm = -1;
            }
         }
      }

      super.l();
   }

   @Override
   public void n_() {
      if (this.bN()) {
         boolean $$0 = this.ai_() && this.gn();
         if ($$0) {
            cwf $$1 = this.a(buq.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cwb $$2 = $$1.h();
                  $$1.b($$1.o() + this.af.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, buq.f);
                     this.a(buq.f, cwf.k);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.d(8.0F);
            }
         }
      }

      super.n_();
   }

   private void s(int $$0) {
      this.cn = $$0;
      this.aw().a(cg, true);
   }

   protected void ah_() {
      this.b(bup.B);
      if (!this.bd()) {
         this.dY().a(null, 1040, this.dy(), 0);
      }
   }

   protected void b(bup<? extends cmo> $$0) {
      this.a($$0, bud.a(this, true, true), $$0x -> $$0x.J($$0x.dY().d_($$0x.dy()).d()));
   }

   @VisibleForTesting
   public boolean a(arq $$0, coc $$1) {
      cmp $$2 = $$1.a(bup.bw, bud.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dy()), buo.i, new cmo.b(false, true));
         $$2x.a($$1.gF());
         $$2x.a($$1.gP().a(vb.a));
         $$2x.a($$1.gx().a());
         $$2x.t($$1.t());
         if (!this.bd()) {
            $$0.a(null, 1026, this.dy(), 0);
         }
      });
      return $$2 != null;
   }

   protected boolean ai_() {
      return true;
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (this.dY() instanceof arq $$2) {
         bve $$4 = this.m();
         if ($$4 == null && $$0.d() instanceof bve) {
            $$4 = (bve)$$0.d();
         }

         if ($$4 != null && this.dY().ak() == bse.d && (double)this.af.i() < this.h(bwm.A) && this.dY().ac().b(dfb.e)) {
            int $$5 = azn.a(this.dD());
            int $$6 = azn.a(this.dF());
            int $$7 = azn.a(this.dJ());
            bup<? extends cmo> $$8 = this.ar();
            cmo $$9 = $$8.a(this.dY(), buo.j);
            if ($$9 == null) {
               return true;
            }

            for (int $$10 = 0; $$10 < 50; $$10++) {
               int $$11 = $$5 + azn.a(this.af, 7, 40) * azn.a(this.af, -1, 1);
               int $$12 = $$6 + azn.a(this.af, 7, 40) * azn.a(this.af, -1, 1);
               int $$13 = $$7 + azn.a(this.af, 7, 40) * azn.a(this.af, -1, 1);
               jh $$14 = new jh($$11, $$12, $$13);
               if (bwa.a($$8, this.dY(), $$14) && bwa.a($$8, $$2, buo.j, $$14, this.dY().A)) {
                  $$9.a_((double)$$11, (double)$$12, (double)$$13);
                  if (!this.dY().a((double)$$11, (double)$$12, (double)$$13, 7.0) && this.dY().f($$9) && this.dY().g($$9) && !this.dY().d($$9.cT())) {
                     $$9.h($$4);
                     $$9.a($$2, this.dY().d_($$9.dy()), buo.j, null);
                     $$2.a_($$9);
                     bwi $$15 = this.g(bwm.A);
                     bwk $$16 = $$15.a(d);
                     double $$17 = $$16 != null ? $$16.c() : 0.0;
                     $$15.c(d);
                     $$15.d(new bwk(d, $$17 - 0.05, bwk.a.a));
                     $$9.g(bwm.A).d(cb);
                     break;
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean E(bui $$0) {
      boolean $$1 = super.E($$0);
      if ($$1) {
         float $$2 = this.dY().d_(this.dy()).b();
         if (this.fc().f() && this.ca() && this.af.i() < $$2 * 0.3F) {
            $$0.d((float)(2 * (int)$$2));
         }
      }

      return $$1;
   }

   @Override
   protected awn w() {
      return awo.Dx;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.DH;
   }

   @Override
   protected awn o_() {
      return awo.DC;
   }

   protected awn y() {
      return awo.DN;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(this.y(), 0.15F, 1.0F);
   }

   @Override
   public bup<? extends cmo> ar() {
      return (bup<? extends cmo>)super.ar();
   }

   @Override
   protected void a(azv $$0, bsf $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dY().ak() == bse.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(buq.a, new cwf(cwj.pc));
         } else {
            this.a(buq.a, new cwf(cwj.pd));
         }
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.p_());
      $$0.a("CanBreakDoors", this.gC());
      $$0.a("InWaterTime", this.bl() ? this.cm : -1);
      $$0.a("DrownedConversionTime", this.gz() ? this.cn : -1);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CanBreakDoors"));
      this.cm = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.s($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(arq $$0, bve $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ak() == bse.c || $$0.ak() == bse.d) && $$1 instanceof coc $$3) {
         if ($$0.ak() != bse.d && this.af.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bul e(bvq $$0) {
      return this.p_() ? ch : super.e($$0);
   }

   @Override
   public boolean h(cwf $$0) {
      return $$0.a(cwj.qS) && this.p_() && this.cb() ? false : super.h($$0);
   }

   @Override
   public boolean i(cwf $$0) {
      return $$0.a(cwj.rx) ? false : super.i($$0);
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      azv $$4 = $$0.E_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != buo.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cmo.b(a($$4), true);
      }

      if ($$3 instanceof cmo.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<cha> $$7 = $$0.a(cha.class, this.cT().c(5.0, 3.0, 5.0), bun.c);
                  if (!$$7.isEmpty()) {
                     cha $$8 = $$7.get(0);
                     $$8.x(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  cha $$9 = bup.t.a(this.dY(), buo.g);
                  if ($$9 != null) {
                     $$9.b(this.dD(), this.dF(), this.dJ(), this.dO(), 0.0F);
                     $$9.a($$0, $$1, buo.g, null);
                     $$9.x(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.y($$4.i() < $$5 * 0.1F);
         if ($$2 != buo.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(buq.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(buq.f, new cwf($$4.i() < 0.1F ? dil.ef : dil.ee));
            this.bV[buq.f.b()] = 0.0F;
         }
      }

      this.J($$5);
      return $$3;
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.cm = $$0;
   }

   @VisibleForTesting
   public void c(int $$0) {
      this.cn = $$0;
   }

   public static boolean a(azv $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gD();
      this.g(bwm.p).c(new bwk(bL, this.af.j() * 0.05F, bwk.a.a));
      double $$1 = this.af.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bwm.m).c(new bwk(cd, $$1, bwk.a.c));
      }

      if (this.af.i() < $$0 * 0.05F) {
         this.g(bwm.A).c(new bwk(cc, this.af.j() * 0.25 + 0.5, bwk.a.a));
         this.g(bwm.s).c(new bwk(cc, this.af.j() * 3.0 + 1.0, bwk.a.c));
         this.y(true);
      }
   }

   protected void gD() {
      this.g(bwm.A).a(this.af.j() * 0.1F);
   }

   @Override
   protected void a(arq $$0, bsy $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof clh $$4 && $$4.gx()) {
         cwf $$5 = this.gv();
         if (!$$5.f()) {
            $$4.gy();
            this.b($$5);
         }
      }
   }

   protected cwf gv() {
      return new cwf(cwj.uG);
   }

   class a extends cde {
      a(final bvm $$0, final double $$1, final int $$2) {
         super(dil.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(dfg $$0, jh $$1) {
         $$0.a(null, $$1, awo.DD, awp.f, 0.5F, 0.9F + cmo.this.af.i() * 0.2F);
      }

      @Override
      public void a(dff $$0, jh $$1) {
         $$0.a(null, $$1, awo.Am, awp.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bvx {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
