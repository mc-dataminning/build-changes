import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chh extends chr implements brk {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bsj d = new bsj(c, "Attacking speed boost", 0.15F, bsj.a.a);
   private static final int e = 400;
   private static final int bY = 600;
   private static final ajk<Optional<dpy>> bZ = ajo.a(chh.class, ajm.j);
   private static final ajk<Boolean> ca = ajo.a(chh.class, ajm.k);
   private static final ajk<Boolean> cb = ajo.a(chh.class, ajm.k);
   private int cc = Integer.MIN_VALUE;
   private int cd;
   private static final bob ce = ayv.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public chh(bqr<? extends chh> $$0, czu $$1) {
      super($$0, $$1);
      this.a(emi.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bS.a(0, new bxv(this));
      this.bS.a(1, new chh.a(this));
      this.bS.a(2, new byl(this, 1.0, false));
      this.bS.a(7, new bzo(this, 1.0, 0.0F));
      this.bS.a(8, new byj(this, ckl.class, 8.0F));
      this.bS.a(8, new byw(this));
      this.bS.a(10, new chh.b(this));
      this.bS.a(11, new chh.d(this));
      this.bT.a(1, new chh.c(this, this::a_));
      this.bT.a(2, new bzt(this));
      this.bT.a(3, new bzu<>(this, chi.class, true, false));
      this.bT.a(4, new caa<>(this, false));
   }

   public static bsk.a r() {
      return chr.gv().a(bsl.q, 40.0).a(bsl.r, 0.3F).a(bsl.c, 7.0).a(bsl.k, 64.0).a(bsl.v, 1.0);
   }

   @Override
   public void h(@Nullable bre $$0) {
      super.h($$0);
      bsh $$1 = this.f(bsl.r);
      if ($$0 == null) {
         this.cd = 0;
         this.ao.a(ca, false);
         this.ao.a(cb, false);
         $$1.b(d.b());
      } else {
         this.cd = this.ai;
         this.ao.a(ca, true);
         if (!$$1.a(d)) {
            $$1.c(d);
         }
      }
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(bZ, Optional.empty());
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void c() {
      this.a(ce.a(this.ah));
   }

   @Override
   public void a(int $$0) {
      this.cf = $$0;
   }

   @Override
   public int a() {
      return this.cf;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   public void u() {
      if (this.ai >= this.cc + 400) {
         this.cc = this.ai;
         if (!this.aU()) {
            this.dN().a(this.ds(), this.dw(), this.dy(), auz.ii, this.dc(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(ajk<?> $$0) {
      if (ca.equals($$0) && this.gr() && this.dN().B) {
         this.u();
      }

      super.a($$0);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      dpy $$1 = this.gp();
      if ($$1 != null) {
         $$0.a("carriedBlockState", un.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      dpy $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = un.a(this.dN().a(ld.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dN(), $$0);
   }

   boolean g(ckl $$0) {
      csd $$1 = $$0.ga().j.get(3);
      if ($$1.a(dcx.ee.p())) {
         return false;
      } else {
         etf $$2 = $$0.f(1.0F).d();
         etf $$3 = new etf(this.ds() - $$0.ds(), this.dw() - $$0.dw(), this.dy() - $$0.dy());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   public void n_() {
      if (this.dN().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dN().a(kw.Z, this.d(0.5), this.dv() - 0.25, this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      }

      this.bo = false;
      if (!this.dN().B) {
         this.a((aqe)this.dN(), true);
      }

      super.n_();
   }

   @Override
   public boolean fn() {
      return true;
   }

   @Override
   protected void Y() {
      if (this.dN().Q() && this.ai >= this.cd + 600) {
         float $$0 = this.br();
         if ($$0 > 0.5F && this.dN().h(this.dn()) && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.y();
         }
      }

      super.Y();
   }

   protected boolean y() {
      if (!this.dN().x_() && this.bB()) {
         double $$0 = this.ds() + (this.ah.j() - 0.5) * 64.0;
         double $$1 = this.du() + (double)(this.ah.a(64) - 32);
         double $$2 = this.dy() + (this.ah.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bql $$0) {
      etf $$1 = new etf(this.ds() - $$0.ds(), this.e(0.5) - $$0.dw(), this.dy() - $$0.dy());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.ds() + (this.ah.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.du() + (double)(this.ah.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dy() + (this.ah.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      im.a $$3 = new im.a($$0, $$1, $$2);

      while ($$3.v() > this.dN().I_() && !this.dN().a_($$3).d()) {
         $$3.c(ir.a);
      }

      dpy $$4 = this.dN().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(avt.a);
      if ($$5 && !$$6) {
         etf $$7 = this.dl();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dN().a(dur.R, $$7, dur.a.a(this));
            if (!this.aU()) {
               this.dN().a(null, this.L, this.M, this.N, auz.ij, this.dc(), 1.0F, 1.0F);
               this.a(auz.ij, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected auy v() {
      return this.gq() ? auz.ih : auz.ie;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.ig;
   }

   @Override
   protected auy o_() {
      return auz.if;
   }

   @Override
   protected void a(bpj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dpy $$3 = this.gp();
      if ($$3 != null) {
         csd $$4 = new csd(csg.pi);
         $$4.a(cxq.v, 1);
         eog.a $$5 = new eog.a((aqe)this.dN()).a(eqt.f, this.dl()).a(eqt.i, $$4).b(eqt.a, this);

         for (csd $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dpy $$0) {
      this.ao.a(bZ, Optional.ofNullable($$0));
   }

   @Nullable
   public dpy gp() {
      return this.ao.a(bZ).orElse(null);
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof clp;
         if (!$$0.a(avq.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dN().x_() && !($$0.d() instanceof bre) && this.ah.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (clp)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bpj $$0, clp $$1, float $$2) {
      csd $$3 = $$1.p();
      cuc $$4 = $$3.a(jz.x, cuc.a);
      return $$4.a(cud.a) ? super.a($$0, $$2) : false;
   }

   public boolean gq() {
      return this.ao.a(ca);
   }

   public boolean gr() {
      return this.ao.a(cb);
   }

   public void gs() {
      this.ao.a(cb, true);
   }

   @Override
   public boolean V() {
      return super.V() || this.gp() != null;
   }

   static class a extends byb {
      private final chh a;
      @Nullable
      private bre b;

      public a(chh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byb.a.c, byb.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.p();
         if (!(this.b instanceof ckl)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.g((ckl)this.b);
         }
      }

      @Override
      public void c() {
         this.a.K().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.b.ds(), this.b.dw(), this.b.dy());
      }
   }

   static class b extends byb {
      private final chh a;

      public b(chh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gp() == null) {
            return false;
         } else {
            return !this.a.dN().aa().b(czq.c) ? false : this.a.ej().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         ayd $$0 = this.a.ej();
         czu $$1 = this.a.dN();
         int $$2 = axw.a(this.a.ds() - 1.0 + $$0.j() * 2.0);
         int $$3 = axw.a(this.a.du() + $$0.j() * 2.0);
         int $$4 = axw.a(this.a.dy() - 1.0 + $$0.j() * 2.0);
         im $$5 = new im($$2, $$3, $$4);
         dpy $$6 = $$1.a_($$5);
         im $$7 = $$5.d();
         dpy $$8 = $$1.a_($$7);
         dpy $$9 = this.a.gp();
         if ($$9 != null) {
            $$9 = dcv.b($$9, this.a.dN(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dur.i, $$5, dur.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(czu $$0, im $$1, dpy $$2, dpy $$3, dpy $$4, im $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(dcx.F) && $$4.r($$0, $$5) && $$2.a((czx)$$0, $$1) && $$0.a_(this.a, eta.a(etf.a($$1))).isEmpty();
      }
   }

   static class c extends bzu<ckl> {
      private final chh i;
      @Nullable
      private ckl j;
      private int k;
      private int l;
      private final cbu m;
      private final cbu n = cbu.a().d();
      private final Predicate<bre> o;

      public c(chh $$0, @Nullable Predicate<bre> $$1) {
         super($$0, ckl.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((ckl)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = cbu.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dN().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void c() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gs();
      }

      @Override
      public void d() {
         this.j = null;
         super.d();
      }

      @Override
      public boolean b() {
         if (this.j != null) {
            if (!this.o.test(this.j)) {
               return false;
            } else {
               this.i.a(this.j, 10.0F, 10.0F);
               return true;
            }
         } else {
            if (this.c != null) {
               if (this.i.z(this.c)) {
                  return false;
               }

               if (this.n.a(this.i, this.c)) {
                  return true;
               }
            }

            return super.b();
         }
      }

      @Override
      public void e() {
         if (this.i.p() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.c();
            }
         } else {
            if (this.c != null && !this.i.bP()) {
               if (this.i.g((ckl)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.y();
                  }

                  this.l = 0;
               } else if (this.c.g(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.b(this.c)) {
                  this.l = 0;
               }
            }

            super.e();
         }
      }
   }

   static class d extends byb {
      private final chh a;

      public d(chh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gp() != null) {
            return false;
         } else {
            return !this.a.dN().aa().b(czq.c) ? false : this.a.ej().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         ayd $$0 = this.a.ej();
         czu $$1 = this.a.dN();
         int $$2 = axw.a(this.a.ds() - 2.0 + $$0.j() * 4.0);
         int $$3 = axw.a(this.a.du() + $$0.j() * 3.0);
         int $$4 = axw.a(this.a.dy() - 2.0 + $$0.j() * 4.0);
         im $$5 = new im($$2, $$3, $$4);
         dpy $$6 = $$1.a_($$5);
         etf $$7 = new etf((double)this.a.dr() + 0.5, (double)$$3 + 0.5, (double)this.a.dx() + 0.5);
         etf $$8 = new etf((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         etb $$9 = $$1.a(new czd($$7, $$8, czd.a.b, czd.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(avo.al) && $$10) {
            $$1.a($$5, false);
            $$1.a(dur.f, $$5, dur.a.a(this.a, $$6));
            this.a.d($$6.b().n());
         }
      }
   }
}
