import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmr extends cly {
   private static final alj a = alj.b("baby");
   private static final bwn b = new bwn(a, 0.5, bwn.a.b);
   private static final alj c = alj.b("reinforcement_caller_charge");
   private static final bwn cb = new bwn(alj.b("reinforcement_callee_charge"), -0.05F, bwn.a.a);
   private static final alj cc = alj.b("leader_zombie_bonus");
   private static final alj cd = alj.b("zombie_random_spawn_bonus");
   private static final akm<Boolean> ce = akq.a(cmr.class, ako.k);
   private static final akm<Integer> cf = akq.a(cmr.class, ako.b);
   private static final akm<Boolean> cg = akq.a(cmr.class, ako.k);
   public static final float d = 0.05F;
   public static final int bY = 50;
   public static final int bZ = 40;
   public static final int ca = 7;
   private static final buo ch = bus.bK.n().a(0.5F).b(0.93F);
   private static final float ci = 0.1F;
   private static final Predicate<bsh> cj = $$0 -> $$0 == bsh.d;
   private final cbp ck = new cbp(this, cj);
   private boolean cl;
   private int cm;
   private int cn;

   public cmr(bus<? extends cmr> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cmr(dfm $$0) {
      this(bus.bK, $$0);
   }

   @Override
   protected void B() {
      this.bS.a(4, new cmr.a(this, 1.0, 3));
      this.bS.a(8, new ccn(this, cou.class, 8.0F));
      this.bS.a(8, new cda(this));
      this.q();
   }

   protected void q() {
      this.bS.a(2, new cdu(this, 1.0, false));
      this.bS.a(6, new ccr(this, 1.0, true, 4, this::gu));
      this.bS.a(7, new cds(this, 1.0));
      this.bT.a(1, new cdx(this).a(cmt.class));
      this.bT.a(2, new cdy<>(this, cou.class, true));
      this.bT.a(3, new cdy<>(this, coa.class, false));
      this.bT.a(3, new cdy<>(this, chk.class, true));
      this.bT.a(5, new cdy<>(this, chz.class, 10, true, false, chz.bY));
   }

   public static bwo.a gq() {
      return cly.gs().a(bwp.m, 35.0).a(bwp.v, 0.23F).a(bwp.c, 3.0).a(bwp.a, 2.0).a(bwp.A);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(ce, false);
      $$0.a(cf, 0);
      $$0.a(cg, false);
   }

   public boolean gt() {
      return this.au().a(cg);
   }

   public boolean gu() {
      return this.cl;
   }

   public void y(boolean $$0) {
      if (cgd.a(this)) {
         if (this.cl != $$0) {
            this.cl = $$0;
            ((ces)this.L()).b($$0);
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
   public boolean e_() {
      return this.au().a(ce);
   }

   @Override
   protected int e(arp $$0) {
      if (this.e_()) {
         this.bN = (int)((double)this.bN * 2.5);
      }

      return super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(ce, $$0);
      if (this.dV() != null && !this.dV().C) {
         bwl $$1 = this.g(bwp.v);
         $$1.c(a);
         if ($$0) {
            $$1.b(b);
         }
      }
   }

   @Override
   public void a(akm<?> $$0) {
      if (ce.equals($$0)) {
         this.l_();
      }

      super.a($$0);
   }

   protected boolean go() {
      return true;
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bL() && !this.fZ()) {
         if (this.gt()) {
            this.cn--;
            if (this.cn < 0) {
               this.ah_();
            }
         } else if (this.go()) {
            if (this.a(axi.a)) {
               this.cm++;
               if (this.cm >= 600) {
                  this.r(300);
               }
            } else {
               this.cm = -1;
            }
         }
      }

      super.h();
   }

   @Override
   public void d_() {
      if (this.bL()) {
         boolean $$0 = this.ai_() && this.ge();
         if ($$0) {
            cwm $$1 = this.a(but.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  cwi $$2 = $$1.h();
                  $$1.b($$1.o() + this.ae.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, but.f);
                     this.a(but.f, cwm.k);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.d(8.0F);
            }
         }
      }

      super.d_();
   }

   private void r(int $$0) {
      this.cn = $$0;
      this.au().a(cg, true);
   }

   protected void ah_() {
      this.b(bus.J);
      if (!this.bb()) {
         this.dV().a(null, 1040, this.dv(), 0);
      }
   }

   protected void b(bus<? extends cmr> $$0) {
      this.a($$0, bug.a(this, true, true), $$0x -> $$0x.J($$0x.dV().d_($$0x.dv()).d()));
   }

   @VisibleForTesting
   public boolean a(arp $$0, cof $$1) {
      cms $$2 = $$1.a(bus.bM, bug.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dv()), bur.i, new cmr.b(false, true));
         $$2x.a($$1.gx());
         $$2x.a($$1.gG().a(uz.a));
         $$2x.a($$1.go().a());
         $$2x.s($$1.q());
         if (!this.bb()) {
            $$0.a(null, 1026, this.dv(), 0);
         }
      });
      return $$2 != null;
   }

   protected boolean ai_() {
      return true;
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         bvh $$3 = this.aa_();
         if ($$3 == null && $$1.d() instanceof bvh) {
            $$3 = (bvh)$$1.d();
         }

         if ($$3 != null && $$0.ak() == bsh.d && (double)this.ae.i() < this.h(bwp.A) && $$0.N().b(dfi.e)) {
            int $$4 = azm.a(this.dA());
            int $$5 = azm.a(this.dC());
            int $$6 = azm.a(this.dG());
            bus<? extends cmr> $$7 = this.aq();
            cmr $$8 = $$7.a($$0, bur.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + azm.a(this.ae, 7, 40) * azm.a(this.ae, -1, 1);
               int $$11 = $$5 + azm.a(this.ae, 7, 40) * azm.a(this.ae, -1, 1);
               int $$12 = $$6 + azm.a(this.ae, 7, 40) * azm.a(this.ae, -1, 1);
               jh $$13 = new jh($$10, $$11, $$12);
               if (bwd.a($$7, $$0, $$13) && bwd.a($$7, $$0, bur.j, $$13, $$0.A)) {
                  $$8.a_((double)$$10, (double)$$11, (double)$$12);
                  if (!$$0.a((double)$$10, (double)$$11, (double)$$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.gm() || !$$0.d($$8.cR()))) {
                     $$8.h($$3);
                     $$8.a($$0, $$0.d_($$8.dv()), bur.j, null);
                     $$0.a_($$8);
                     bwl $$14 = this.g(bwp.A);
                     bwn $$15 = $$14.a(c);
                     double $$16 = $$15 != null ? $$15.c() : 0.0;
                     $$14.c(c);
                     $$14.d(new bwn(c, $$16 - 0.05, bwn.a.a));
                     $$8.g(bwp.A).d(cb);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(arp $$0, bul $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2) {
         float $$3 = this.dV().d_(this.dv()).b();
         if (this.eX().f() && this.bY() && this.ae.i() < $$3 * 0.3F) {
            $$1.d((float)(2 * (int)$$3));
         }
      }

      return $$2;
   }

   @Override
   protected awm t() {
      return awn.Dx;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.DH;
   }

   @Override
   protected awm n_() {
      return awn.DC;
   }

   protected awm v() {
      return awn.DN;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(this.v(), 0.15F, 1.0F);
   }

   @Override
   public bus<? extends cmr> aq() {
      return (bus<? extends cmr>)super.aq();
   }

   protected boolean gm() {
      return false;
   }

   @Override
   protected void a(azu $$0, bsi $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.dV().ak() == bsh.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(but.a, new cwm(cwq.pc));
         } else {
            this.a(but.a, new cwm(cwq.pd));
         }
      }
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.e_());
      $$0.a("CanBreakDoors", this.gu());
      $$0.a("InWaterTime", this.bj() ? this.cm : -1);
      $$0.a("DrownedConversionTime", this.gt() ? this.cn : -1);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CanBreakDoors"));
      this.cm = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.r($$0.h("DrownedConversionTime"));
      }
   }

   @Override
   public boolean a(arp $$0, bvh $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ak() == bsh.c || $$0.ak() == bsh.d) && $$1 instanceof cof $$3) {
         if ($$0.ak() != bsh.d && this.ae.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? ch : super.e($$0);
   }

   @Override
   public boolean g(cwm $$0) {
      return $$0.a(cwq.qS) && this.e_() && this.bZ() ? false : super.g($$0);
   }

   @Override
   public boolean c(arp $$0, cwm $$1) {
      return $$1.a(cwq.rx) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      azu $$4 = $$0.G_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bur.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cmr.b(a($$4), true);
      }

      if ($$3 instanceof cmr.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ((double)$$4.i() < 0.05) {
                  List<chd> $$7 = $$0.a(chd.class, this.cR().c(5.0, 3.0, 5.0), buq.c);
                  if (!$$7.isEmpty()) {
                     chd $$8 = $$7.get(0);
                     $$8.x(true);
                     this.n($$8);
                  }
               } else if ((double)$$4.i() < 0.05) {
                  chd $$9 = bus.z.a(this.dV(), bur.g);
                  if ($$9 != null) {
                     $$9.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
                     $$9.a($$0, $$1, bur.g, null);
                     $$9.x(true);
                     this.n($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.y($$4.i() < $$5 * 0.1F);
         if ($$2 != bur.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(but.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(but.f, new cwm($$4.i() < 0.1F ? dis.ef : dis.ee));
            this.bV[but.f.b()] = 0.0F;
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

   public static boolean a(azu $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gv();
      this.g(bwp.p).c(new bwn(bL, this.ae.j() * 0.05F, bwn.a.a));
      double $$1 = this.ae.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.g(bwp.m).c(new bwn(cd, $$1, bwn.a.c));
      }

      if (this.ae.i() < $$0 * 0.05F) {
         this.g(bwp.A).c(new bwn(cc, this.ae.j() * 0.25 + 0.5, bwn.a.a));
         this.g(bwp.s).c(new bwn(cc, this.ae.j() * 3.0 + 1.0, bwn.a.c));
         this.y(true);
      }
   }

   protected void gv() {
      this.g(bwp.A).a(this.ae.j() * 0.1F);
   }

   @Override
   protected void a(arp $$0, btb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof clk $$4 && $$4.go()) {
         cwm $$5 = this.gn();
         if (!$$5.f()) {
            $$4.gp();
            this.a($$0, $$5);
         }
      }
   }

   protected cwm gn() {
      return new cwm(cwq.uG);
   }

   class a extends cdh {
      a(final bvp $$0, final double $$1, final int $$2) {
         super(dis.mf, $$0, $$1, $$2);
      }

      @Override
      public void a(dfn $$0, jh $$1) {
         $$0.a(null, $$1, awn.DD, awo.f, 0.5F, 0.9F + cmr.this.ae.i() * 0.2F);
      }

      @Override
      public void a(dfm $$0, jh $$1) {
         $$0.a(null, $$1, awn.Am, awo.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bwa {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
