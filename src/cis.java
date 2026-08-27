import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cis extends cjc implements bsu {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final btu d = new btu(c, "Attacking speed boost", 0.15F, btu.a.a);
   private static final int e = 400;
   private static final int bY = 600;
   private static final ajr<Optional<drb>> bZ = ajv.a(cis.class, ajt.j);
   private static final ajr<Boolean> ca = ajv.a(cis.class, ajt.k);
   private static final ajr<Boolean> cb = ajv.a(cis.class, ajt.k);
   private int cc = Integer.MIN_VALUE;
   private int cd;
   private static final bpf ce = azc.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cis(bsa<? extends cis> $$0, dax $$1) {
      super($$0, $$1);
      this.a(enl.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bS.a(0, new bzg(this));
      this.bS.a(1, new cis.a(this));
      this.bS.a(2, new bzw(this, 1.0, false));
      this.bS.a(7, new caz(this, 1.0, 0.0F));
      this.bS.a(8, new bzu(this, clw.class, 8.0F));
      this.bS.a(8, new cah(this));
      this.bS.a(10, new cis.b(this));
      this.bS.a(11, new cis.d(this));
      this.bT.a(1, new cis.c(this, this::a_));
      this.bT.a(2, new cbe(this));
      this.bT.a(3, new cbf<>(this, cit.class, true, false));
      this.bT.a(4, new cbl<>(this, false));
   }

   public static btv.a s() {
      return cjc.gv().a(btw.q, 40.0).a(btw.r, 0.3F).a(btw.c, 7.0).a(btw.k, 64.0).a(btw.v, 1.0);
   }

   @Override
   public void h(@Nullable bso $$0) {
      super.h($$0);
      bts $$1 = this.f(btw.r);
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
   protected void a(ajv.a $$0) {
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
         if (!this.aW()) {
            this.dP().a(this.du(), this.dy(), this.dA(), avh.in, this.de(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(ajr<?> $$0) {
      if (ca.equals($$0) && this.gr() && this.dP().B) {
         this.u();
      }

      super.a($$0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      drb $$1 = this.gp();
      if ($$1 != null) {
         $$0.a("carriedBlockState", us.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      drb $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = us.a(this.dP().a(lf.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dP(), $$0);
   }

   boolean g(clw $$0) {
      cto $$1 = $$0.gc().i.get(3);
      if ($$1.a(dea.ee.q())) {
         return false;
      } else {
         euk $$2 = $$0.f(1.0F).d();
         euk $$3 = new euk(this.du() - $$0.du(), this.dy() - $$0.dy(), this.dA() - $$0.dA());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   public void n_() {
      if (this.dP().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dP().a(ky.ac, this.d(0.5), this.dx() - 0.25, this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      }

      this.bo = false;
      if (!this.dP().B) {
         this.a((aqm)this.dP(), true);
      }

      super.n_();
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   protected void Y() {
      if (this.dP().Q() && this.ai >= this.cd + 600) {
         float $$0 = this.bt();
         if ($$0 > 0.5F && this.dP().h(this.dp()) && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.y();
         }
      }

      super.Y();
   }

   protected boolean y() {
      if (!this.dP().x_() && this.bD()) {
         double $$0 = this.du() + (this.ah.j() - 0.5) * 64.0;
         double $$1 = this.dw() + (double)(this.ah.a(64) - 32);
         double $$2 = this.dA() + (this.ah.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean b(bru $$0) {
      euk $$1 = new euk(this.du() - $$0.du(), this.e(0.5) - $$0.dy(), this.dA() - $$0.dA());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.du() + (this.ah.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dw() + (double)(this.ah.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dA() + (this.ah.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      io.a $$3 = new io.a($$0, $$1, $$2);

      while ($$3.v() > this.dP().I_() && !this.dP().a_($$3).d()) {
         $$3.c(it.a);
      }

      drb $$4 = this.dP().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(awb.a);
      if ($$5 && !$$6) {
         euk $$7 = this.dn();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dP().a(dvu.R, $$7, dvu.a.a(this));
            if (!this.aW()) {
               this.dP().a(null, this.L, this.M, this.N, avh.io, this.de(), 1.0F, 1.0F);
               this.a(avh.io, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected avg v() {
      return this.gq() ? avh.im : avh.ij;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.il;
   }

   @Override
   protected avg o_() {
      return avh.ik;
   }

   @Override
   protected void a(bqn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      drb $$3 = this.gp();
      if ($$3 != null) {
         cto $$4 = new cto(ctr.pi);
         $$4.a(czc.v, 1);
         epi.a $$5 = new epi.a((aqm)this.dP()).a(erx.f, this.dn()).a(erx.i, $$4).b(erx.a, this);

         for (cto $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable drb $$0) {
      this.ao.a(bZ, Optional.ofNullable($$0));
   }

   @Nullable
   public drb gp() {
      return this.ao.a(bZ).orElse(null);
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cna;
         if (!$$0.a(avy.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dP().x_() && !($$0.d() instanceof bso) && this.ah.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cna)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bqn $$0, cna $$1, float $$2) {
      cto $$3 = $$1.p();
      cvp $$4 = $$3.a(kb.F, cvp.a);
      return $$4.a(cvq.a) ? super.a($$0, $$2) : false;
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

   static class a extends bzm {
      private final cis a;
      @Nullable
      private bso b;

      public a(cis $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzm.a.c, bzm.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.p();
         if (!(this.b instanceof clw)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.g((clw)this.b);
         }
      }

      @Override
      public void c() {
         this.a.K().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.b.du(), this.b.dy(), this.b.dA());
      }
   }

   static class b extends bzm {
      private final cis a;

      public b(cis $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gp() == null) {
            return false;
         } else {
            return !this.a.dP().aa().b(dat.c) ? false : this.a.el().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         ayk $$0 = this.a.el();
         dax $$1 = this.a.dP();
         int $$2 = ayd.a(this.a.du() - 1.0 + $$0.j() * 2.0);
         int $$3 = ayd.a(this.a.dw() + $$0.j() * 2.0);
         int $$4 = ayd.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         io $$5 = new io($$2, $$3, $$4);
         drb $$6 = $$1.a_($$5);
         io $$7 = $$5.d();
         drb $$8 = $$1.a_($$7);
         drb $$9 = this.a.gp();
         if ($$9 != null) {
            $$9 = ddy.b($$9, this.a.dP(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dvu.i, $$5, dvu.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(dax $$0, io $$1, drb $$2, drb $$3, drb $$4, io $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(dea.F) && $$4.r($$0, $$5) && $$2.a((dba)$$0, $$1) && $$0.a_(this.a, euf.a(euk.a($$1))).isEmpty();
      }
   }

   static class c extends cbf<clw> {
      private final cis i;
      @Nullable
      private clw j;
      private int k;
      private int l;
      private final cdf m;
      private final cdf n = cdf.a().d();
      private final Predicate<bso> o;

      public c(cis $$0, @Nullable Predicate<bso> $$1) {
         super($$0, clw.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((clw)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = cdf.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dP().a(this.m, this.i);
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
            if (this.c != null && !this.i.bR()) {
               if (this.i.g((clw)this.c)) {
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

   static class d extends bzm {
      private final cis a;

      public d(cis $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gp() != null) {
            return false;
         } else {
            return !this.a.dP().aa().b(dat.c) ? false : this.a.el().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         ayk $$0 = this.a.el();
         dax $$1 = this.a.dP();
         int $$2 = ayd.a(this.a.du() - 2.0 + $$0.j() * 4.0);
         int $$3 = ayd.a(this.a.dw() + $$0.j() * 3.0);
         int $$4 = ayd.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         io $$5 = new io($$2, $$3, $$4);
         drb $$6 = $$1.a_($$5);
         euk $$7 = new euk((double)this.a.dt() + 0.5, (double)$$3 + 0.5, (double)this.a.dz() + 0.5);
         euk $$8 = new euk((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         eug $$9 = $$1.a(new dag($$7, $$8, dag.a.b, dag.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(avw.al) && $$10) {
            $$1.a($$5, false);
            $$1.a(dvu.f, $$5, dvu.a.a(this.a, $$6));
            this.a.d($$6.b().n());
         }
      }
   }
}
