import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class clo extends cly implements bvm {
   private static final alj c = alj.b("attacking");
   private static final bwn d = new bwn(c, 0.15F, bwn.a.a);
   private static final int bY = 400;
   private static final int bZ = 600;
   private static final akm<Optional<dvv>> ca = akq.a(clo.class, ako.j);
   private static final akm<Boolean> cb = akq.a(clo.class, ako.k);
   private static final akm<Boolean> cc = akq.a(clo.class, ako.k);
   private int cd = Integer.MIN_VALUE;
   private int ce;
   private static final brv cf = bao.a(20, 39);
   private int cg;
   @Nullable
   private UUID ch;

   public clo(bus<? extends clo> $$0, dfm $$1) {
      super($$0, $$1);
      this.a(esm.j, -1.0F);
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new clo.a(this));
      this.bS.a(2, new ccp(this, 1.0, false));
      this.bS.a(7, new cds(this, 1.0, 0.0F));
      this.bS.a(8, new ccn(this, cou.class, 8.0F));
      this.bS.a(8, new cda(this));
      this.bS.a(10, new clo.b(this));
      this.bS.a(11, new clo.d(this));
      this.bT.a(1, new clo.c(this, this::a));
      this.bT.a(2, new cdx(this));
      this.bT.a(3, new cdy<>(this, clp.class, true, false));
      this.bT.a(4, new cee<>(this, false));
   }

   public static bwo.a n() {
      return cly.gs().a(bwp.s, 40.0).a(bwp.v, 0.3F).a(bwp.c, 7.0).a(bwp.m, 64.0).a(bwp.B, 1.0);
   }

   @Override
   public void h(@Nullable bvh $$0) {
      super.h($$0);
      bwl $$1 = this.g(bwp.v);
      if ($$0 == null) {
         this.ce = 0;
         this.al.a(cb, false);
         this.al.a(cc, false);
         $$1.c(c);
      } else {
         this.ce = this.af;
         this.al.a(cb, true);
         if (!$$1.b(c)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(ca, Optional.empty());
      $$0.a(cb, false);
      $$0.a(cc, false);
   }

   @Override
   public void c() {
      this.a(cf.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.cg = $$0;
   }

   @Override
   public int a() {
      return this.cg;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ch;
   }

   public void q() {
      if (this.af >= this.cd + 400) {
         this.cd = this.af;
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awn.io, this.dm(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akm<?> $$0) {
      if (cb.equals($$0) && this.go() && this.dV().C) {
         this.q();
      }

      super.a($$0);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      dvv $$1 = this.gm();
      if ($$1 != null) {
         $$0.a("carriedBlockState", va.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      dvv $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = va.a(this.dV().a(ma.f), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dV(), $$0);
   }

   boolean a(cou $$0) {
      cwm $$1 = $$0.gg().h.get(3);
      if ($$1.a(dis.ee.j())) {
         return false;
      } else {
         ezy $$2 = $$0.g(1.0F).d();
         ezy $$3 = new ezy(this.dA() - $$0.dA(), this.dE() - $$0.dE(), this.dG() - $$0.dG());
         double $$4 = $$3.g();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   public void d_() {
      if (this.dV().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dV().a(ls.ac, this.d(0.5), this.dD() - 0.25, this.g(0.5), (this.ae.j() - 0.5) * 2.0, -this.ae.j(), (this.ae.j() - 0.5) * 2.0);
         }
      }

      this.bm = false;
      if (!this.dV().C) {
         this.a((arp)this.dV(), true);
      }

      super.d_();
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   protected void a(arp $$0) {
      if ($$0.T() && this.af >= this.ce + 600) {
         float $$1 = this.by();
         if ($$1 > 0.5F && $$0.h(this.dv()) && this.ae.i() * 30.0F < ($$1 - 0.4F) * 2.0F) {
            this.h(null);
            this.v();
         }
      }

      super.a($$0);
   }

   protected boolean v() {
      if (!this.dV().A_() && this.bL()) {
         double $$0 = this.dA() + (this.ae.j() - 0.5) * 64.0;
         double $$1 = this.dC() + (double)(this.ae.a(64) - 32);
         double $$2 = this.dG() + (this.ae.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bul $$0) {
      ezy $$1 = new ezy(this.dA() - $$0.dA(), this.e(0.5) - $$0.dE(), this.dG() - $$0.dG());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dA() + (this.ae.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dC() + (double)(this.ae.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dG() + (this.ae.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      jh.a $$3 = new jh.a($$0, $$1, $$2);

      while ($$3.v() > this.dV().K_() && !this.dV().a_($$3).d()) {
         $$3.c(jm.a);
      }

      dvv $$4 = this.dV().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(axi.a);
      if ($$5 && !$$6) {
         ezy $$7 = this.dt();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dV().a(ear.R, $$7, ear.a.a(this));
            if (!this.bb()) {
               this.dV().a(null, this.K, this.L, this.M, awn.ip, this.dm(), 1.0F, 1.0F);
               this.a(awn.ip, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected awm t() {
      return this.gn() ? awn.in : awn.ik;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.im;
   }

   @Override
   protected awm n_() {
      return awn.il;
   }

   @Override
   protected void a(arp $$0, btb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dvv $$3 = this.gm();
      if ($$3 != null) {
         cwm $$4 = new cwm(cwq.pk);
         dcf.a($$4, $$0.J_(), ddr.g, $$0.d_(this.dv()), this.dY());
         euq.a $$5 = new euq.a((arp)this.dV()).a(exj.f, this.dt()).a(exj.i, $$4).b(exj.a, this);

         for (cwm $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable dvv $$0) {
      this.al.a(ca, Optional.ofNullable($$0));
   }

   @Nullable
   public dvv gm() {
      return this.al.a(ca).orElse(null);
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         boolean $$3 = $$1.c() instanceof cpz;
         if (!$$1.a(axe.j) && !$$3) {
            boolean $$6 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof bvh) && this.ae.a(10) != 0) {
               this.v();
            }

            return $$6;
         } else {
            boolean $$4 = $$3 && this.a($$0, $$1, (cpz)$$1.c(), $$2);

            for (int $$5 = 0; $$5 < 64; $$5++) {
               if (this.v()) {
                  return true;
               }
            }

            return $$4;
         }
      }
   }

   private boolean a(arp $$0, btb $$1, cpz $$2, float $$3) {
      cwm $$4 = $$2.j();
      cyl $$5 = $$4.a(ku.Q, cyl.a);
      return $$5.a(cym.a) ? super.a($$0, $$1, $$3) : false;
   }

   public boolean gn() {
      return this.al.a(cb);
   }

   public boolean go() {
      return this.al.a(cc);
   }

   public void gp() {
      this.al.a(cc, true);
   }

   @Override
   public boolean W() {
      return super.W() || this.gm() != null;
   }

   static class a extends ccf {
      private final clo a;
      @Nullable
      private bvh b;

      public a(clo $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccf.a.c, ccf.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.aa_();
         if (!(this.b instanceof cou)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.a((cou)this.b);
         }
      }

      @Override
      public void d() {
         this.a.L().o();
      }

      @Override
      public void a() {
         this.a.H().a(this.b.dA(), this.b.dE(), this.b.dG());
      }
   }

   static class b extends ccf {
      private final clo a;

      public b(clo $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gm() == null) {
            return false;
         } else {
            return !a(this.a).N().b(dfi.c) ? false : this.a.dY().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azu $$0 = this.a.dY();
         dfm $$1 = this.a.dV();
         int $$2 = azm.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         int $$3 = azm.a(this.a.dC() + $$0.j() * 2.0);
         int $$4 = azm.a(this.a.dG() - 1.0 + $$0.j() * 2.0);
         jh $$5 = new jh($$2, $$3, $$4);
         dvv $$6 = $$1.a_($$5);
         jh $$7 = $$5.e();
         dvv $$8 = $$1.a_($$7);
         dvv $$9 = this.a.gm();
         if ($$9 != null) {
            $$9 = diq.b($$9, this.a.dV(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(ear.i, $$5, ear.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dfm $$0, jh $$1, dvv $$2, dvv $$3, dvv $$4, jh $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dis.F) && $$4.m($$0, $$5) && $$2.a((dfp)$$0, $$1) && $$0.a_(this.a, ezt.a(ezy.a($$1))).isEmpty();
      }
   }

   static class c extends cdy<cou> {
      private final clo i;
      @Nullable
      private cou j;
      private int k;
      private int l;
      private final cfy m;
      private final cfy n = cfy.a().d();
      private final cfy.a o;

      public c(clo $$0, @Nullable cfy.a $$1) {
         super($$0, cou.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.a((cou)$$1x) || $$0.a($$1x, $$2)) && !$$0.A($$1x);
         this.m = cfy.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean b() {
         this.j = a(this.i).a(this.m.a(this.l()), this.i);
         return this.j != null;
      }

      @Override
      public void d() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gp();
      }

      @Override
      public void e() {
         this.j = null;
         super.e();
      }

      @Override
      public boolean c() {
         if (this.j != null) {
            if (!this.o.test(this.j, a(this.i))) {
               return false;
            } else {
               this.i.a(this.j, 10.0F, 10.0F);
               return true;
            }
         } else {
            if (this.c != null) {
               if (this.i.A(this.c)) {
                  return false;
               }

               if (this.n.a(a(this.i), this.i, this.c)) {
                  return true;
               }
            }

            return super.c();
         }
      }

      @Override
      public void a() {
         if (this.i.aa_() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.d();
            }
         } else {
            if (this.c != null && !this.i.bZ()) {
               if (this.i.a((cou)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.v();
                  }

                  this.l = 0;
               } else if (this.c.g(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.b(this.c)) {
                  this.l = 0;
               }
            }

            super.a();
         }
      }
   }

   static class d extends ccf {
      private final clo a;

      public d(clo $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.gm() != null) {
            return false;
         } else {
            return !a(this.a).N().b(dfi.c) ? false : this.a.dY().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azu $$0 = this.a.dY();
         dfm $$1 = this.a.dV();
         int $$2 = azm.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         int $$3 = azm.a(this.a.dC() + $$0.j() * 3.0);
         int $$4 = azm.a(this.a.dG() - 2.0 + $$0.j() * 4.0);
         jh $$5 = new jh($$2, $$3, $$4);
         dvv $$6 = $$1.a_($$5);
         ezy $$7 = new ezy((double)this.a.dz() + 0.5, (double)$$3 + 0.5, (double)this.a.dF() + 0.5);
         ezy $$8 = new ezy((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ezu $$9 = $$1.a(new deu($$7, $$8, deu.a.b, deu.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(axc.an) && $$10) {
            $$1.a($$5, false);
            $$1.a(ear.f, $$5, ear.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
