import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjs extends ckc implements btu {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final buu d = new buu(c, "Attacking speed boost", 0.15F, buu.a.a);
   private static final int e = 400;
   private static final int bY = 600;
   private static final akj<Optional<dsb>> bZ = akn.a(cjs.class, akl.j);
   private static final akj<Boolean> ca = akn.a(cjs.class, akl.k);
   private static final akj<Boolean> cb = akn.a(cjs.class, akl.k);
   private int cc = Integer.MIN_VALUE;
   private int cd;
   private static final bqe ce = azy.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cjs(bsz<? extends cjs> $$0, dbx $$1) {
      super($$0, $$1);
      this.a(eol.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cag(this));
      this.bS.a(1, new cjs.a(this));
      this.bS.a(2, new caw(this, 1.0, false));
      this.bS.a(7, new cbz(this, 1.0, 0.0F));
      this.bS.a(8, new cau(this, cmw.class, 8.0F));
      this.bS.a(8, new cbh(this));
      this.bS.a(10, new cjs.b(this));
      this.bS.a(11, new cjs.d(this));
      this.bT.a(1, new cjs.c(this, this::a_));
      this.bT.a(2, new cce(this));
      this.bT.a(3, new ccf<>(this, cjt.class, true, false));
      this.bT.a(4, new ccl<>(this, false));
   }

   public static buv.a s() {
      return ckc.gw().a(buw.q, 40.0).a(buw.r, 0.3F).a(buw.c, 7.0).a(buw.k, 64.0).a(buw.v, 1.0);
   }

   @Override
   public void h(@Nullable bto $$0) {
      super.h($$0);
      bus $$1 = this.f(buw.r);
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
   protected void a(akn.a $$0) {
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
            this.dP().a(this.du(), this.dy(), this.dA(), avz.in, this.de(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akj<?> $$0) {
      if (ca.equals($$0) && this.gs() && this.dP().B) {
         this.u();
      }

      super.a($$0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      dsb $$1 = this.gq();
      if ($$1 != null) {
         $$0.a("carriedBlockState", vg.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      dsb $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = vg.a(this.dP().a(lq.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dP(), $$0);
   }

   boolean g(cmw $$0) {
      cuo $$1 = $$0.gc().i.get(3);
      if ($$1.a(dfa.ee.r())) {
         return false;
      } else {
         evq $$2 = $$0.f(1.0F).d();
         evq $$3 = new evq(this.du() - $$0.du(), this.dy() - $$0.dy(), this.dA() - $$0.dA());
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
            this.dP().a(li.ac, this.d(0.5), this.dx() - 0.25, this.g(0.5), (this.ah.j() - 0.5) * 2.0, -this.ah.j(), (this.ah.j() - 0.5) * 2.0);
         }
      }

      this.bn = false;
      if (!this.dP().B) {
         this.a((are)this.dP(), true);
      }

      super.n_();
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   protected void Z() {
      if (this.dP().R() && this.ai >= this.cd + 600) {
         float $$0 = this.bt();
         if ($$0 > 0.5F && this.dP().h(this.dp()) && this.ah.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.y();
         }
      }

      super.Z();
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

   boolean b(bst $$0) {
      evq $$1 = new evq(this.du() - $$0.du(), this.e(0.5) - $$0.dy(), this.dA() - $$0.dA());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.du() + (this.ah.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dw() + (double)(this.ah.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dA() + (this.ah.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      iz.a $$3 = new iz.a($$0, $$1, $$2);

      while ($$3.v() > this.dP().I_() && !this.dP().a_($$3).d()) {
         $$3.c(je.a);
      }

      dsb $$4 = this.dP().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(awu.a);
      if ($$5 && !$$6) {
         evq $$7 = this.dn();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dP().a(dwu.R, $$7, dwu.a.a(this));
            if (!this.aW()) {
               this.dP().a(null, this.L, this.M, this.N, avz.io, this.de(), 1.0F, 1.0F);
               this.a(avz.io, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected avy v() {
      return this.gr() ? avz.im : avz.ij;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.il;
   }

   @Override
   protected avy o_() {
      return avz.ik;
   }

   @Override
   protected void a(brm $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dsb $$3 = this.gq();
      if ($$3 != null) {
         cuo $$4 = new cuo(cur.pi);
         $$4.a(dac.v, 1);
         eqk.a $$5 = new eqk.a((are)this.dP()).a(etd.f, this.dn()).a(etd.i, $$4).b(etd.a, this);

         for (cuo $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dsb $$0) {
      this.ao.a(bZ, Optional.ofNullable($$0));
   }

   @Nullable
   public dsb gq() {
      return this.ao.a(bZ).orElse(null);
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof coa;
         if (!$$0.a(awq.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dP().x_() && !($$0.d() instanceof bto) && this.ah.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (coa)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(brm $$0, coa $$1, float $$2) {
      cuo $$3 = $$1.p();
      cwp $$4 = $$3.a(km.G, cwp.a);
      return $$4.a(cwq.a) ? super.a($$0, $$2) : false;
   }

   public boolean gr() {
      return this.ao.a(ca);
   }

   public boolean gs() {
      return this.ao.a(cb);
   }

   public void gt() {
      this.ao.a(cb, true);
   }

   @Override
   public boolean W() {
      return super.W() || this.gq() != null;
   }

   static class a extends cam {
      private final cjs a;
      @Nullable
      private bto b;

      public a(cjs $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cam.a.c, cam.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.p();
         if (!(this.b instanceof cmw)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.g((cmw)this.b);
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

   static class b extends cam {
      private final cjs a;

      public b(cjs $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gq() == null) {
            return false;
         } else {
            return !this.a.dP().ab().b(dbt.c) ? false : this.a.el().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         azg $$0 = this.a.el();
         dbx $$1 = this.a.dP();
         int $$2 = ayy.a(this.a.du() - 1.0 + $$0.j() * 2.0);
         int $$3 = ayy.a(this.a.dw() + $$0.j() * 2.0);
         int $$4 = ayy.a(this.a.dA() - 1.0 + $$0.j() * 2.0);
         iz $$5 = new iz($$2, $$3, $$4);
         dsb $$6 = $$1.a_($$5);
         iz $$7 = $$5.d();
         dsb $$8 = $$1.a_($$7);
         dsb $$9 = this.a.gq();
         if ($$9 != null) {
            $$9 = dey.b($$9, this.a.dP(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dwu.i, $$5, dwu.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(dbx $$0, iz $$1, dsb $$2, dsb $$3, dsb $$4, iz $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(dfa.F) && $$4.r($$0, $$5) && $$2.a((dca)$$0, $$1) && $$0.a_(this.a, evl.a(evq.a($$1))).isEmpty();
      }
   }

   static class c extends ccf<cmw> {
      private final cjs i;
      @Nullable
      private cmw j;
      private int k;
      private int l;
      private final cef m;
      private final cef n = cef.a().d();
      private final Predicate<bto> o;

      public c(cjs $$0, @Nullable Predicate<bto> $$1) {
         super($$0, cmw.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cmw)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = cef.a().a(this.l()).a(this.o);
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
         this.i.gt();
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
               if (this.i.g((cmw)this.c)) {
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

   static class d extends cam {
      private final cjs a;

      public d(cjs $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gq() != null) {
            return false;
         } else {
            return !this.a.dP().ab().b(dbt.c) ? false : this.a.el().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         azg $$0 = this.a.el();
         dbx $$1 = this.a.dP();
         int $$2 = ayy.a(this.a.du() - 2.0 + $$0.j() * 4.0);
         int $$3 = ayy.a(this.a.dw() + $$0.j() * 3.0);
         int $$4 = ayy.a(this.a.dA() - 2.0 + $$0.j() * 4.0);
         iz $$5 = new iz($$2, $$3, $$4);
         dsb $$6 = $$1.a_($$5);
         evq $$7 = new evq((double)this.a.dt() + 0.5, (double)$$3 + 0.5, (double)this.a.dz() + 0.5);
         evq $$8 = new evq((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         evm $$9 = $$1.a(new dbg($$7, $$8, dbg.a.b, dbg.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(awo.al) && $$10) {
            $$1.a($$5, false);
            $$1.a(dwu.f, $$5, dwu.a.a(this.a, $$6));
            this.a.d($$6.b().o());
         }
      }
   }
}
