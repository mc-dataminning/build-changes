import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdw extends bsa implements brk, bsd<iv<cdx>> {
   private static final ajk<Boolean> cc = ajo.a(cdw.class, ajm.k);
   private static final ajk<Integer> cd = ajo.a(cdw.class, ajm.b);
   private static final ajk<Integer> ce = ajo.a(cdw.class, ajm.b);
   private static final ajk<iv<cdx>> cf = ajo.a(cdw.class, ajm.y);
   public static final Predicate<bre> cb = $$0 -> {
      bqr<?> $$1 = $$0.ai();
      return $$1 == bqr.aI || $$1 == bqr.aF || $$1 == bqr.Q;
   };
   private static final float cg = 8.0F;
   private static final float ch = 40.0F;
   private static final float ci = 0.125F;
   private float cj;
   private float ck;
   private boolean cl;
   private boolean cm;
   private float cn;
   private float co;
   private static final bob cp = ayv.a(20, 39);
   @Nullable
   private UUID cq;

   public cdw(bqr<? extends cdw> $$0, czu $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(emi.f, -1.0F);
      this.a(emi.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bxv(this));
      this.bS.a(1, new cdw.c(1.5));
      this.bS.a(2, new bzg(this));
      this.bS.a(3, new cdw.a<>(this, cfa.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new byh(this, 0.4F));
      this.bS.a(5, new byl(this, 1.0, true));
      this.bS.a(6, new bxz(this, 1.0, 10.0F, 2.0F, false));
      this.bS.a(7, new bxn(this, 1.0));
      this.bS.a(8, new bzo(this, 1.0));
      this.bS.a(9, new bxj(this, 8.0F));
      this.bS.a(10, new byj(this, ckl.class, 8.0F));
      this.bS.a(10, new byw(this));
      this.bT.a(1, new bzy(this));
      this.bT.a(2, new bzz(this));
      this.bT.a(3, new bzt(this).a());
      this.bT.a(4, new bzu<>(this, ckl.class, 10, true, false, this::a_));
      this.bT.a(5, new bzx<>(this, cct.class, false, cb));
      this.bT.a(6, new bzx<>(this, cdu.class, false, cdu.bZ));
      this.bT.a(7, new bzu<>(this, cgz.class, false));
      this.bT.a(8, new caa<>(this, true));
   }

   public akf gv() {
      cdx $$0 = this.gw().a();
      return this.r() ? $$0.b() : (this.Z_() ? $$0.c() : $$0.a());
   }

   public iv<cdx> gw() {
      return this.ao.a(cf);
   }

   @Override
   public void i(iv<cdx> $$0) {
      this.ao.a(cf, $$0);
   }

   public static bsk.a gx() {
      return brg.A().a(bsl.r, 0.3F).a(bsl.q, 8.0).a(bsl.c, 4.0);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cf, this.dP().d(ld.m).g(cdy.a));
      $$0.a(cc, false);
      $$0.a(cd, cqw.o.a());
      $$0.a(ce, 0);
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.CD, 0.15F, 1.0F);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gA().a());
      $$0.a("variant", this.gw().e().orElse(cdy.a).a().toString());
      this.c($$0);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      Optional.ofNullable(akf.a($$0.l("variant"))).map($$0x -> ake.a(ld.m, $$0x)).flatMap($$0x -> this.dP().d(ld.m).b($$0x)).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(cqw.a($$0.h("CollarColor")));
      }

      this.a(this.dN(), $$0);
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      iv<dat> $$4 = $$0.t(this.dn());
      iv<cdx> $$6;
      if ($$3 instanceof cdw.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cdy.a(this.dP(), $$4);
         $$3 = new cdw.b($$6);
      }

      this.i($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected auy v() {
      if (this.Z_()) {
         return auz.Cy;
      } else if (this.ah.a(3) == 0) {
         return this.r() && this.ey() < 20.0F ? auz.CE : auz.CB;
      } else {
         return auz.Cw;
      }
   }

   @Override
   protected auy d(bpj $$0) {
      return this.h($$0) ? auz.Cu : auz.CA;
   }

   @Override
   protected auy o_() {
      return auz.Cx;
   }

   @Override
   protected float fc() {
      return 0.4F;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dN().B && this.cl && !this.cm && !this.gl() && this.aC()) {
         this.cm = true;
         this.cn = 0.0F;
         this.co = 0.0F;
         this.dN().a(this, (byte)8);
      }

      if (!this.dN().B) {
         this.a((aqe)this.dN(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bB()) {
         this.ck = this.cj;
         if (this.gC()) {
            this.cj = this.cj + (1.0F - this.cj) * 0.4F;
         } else {
            this.cj = this.cj + (0.0F - this.cj) * 0.4F;
         }

         if (this.be()) {
            this.cl = true;
            if (this.cm && !this.dN().B) {
               this.dN().a(this, (byte)56);
               this.gD();
            }
         } else if ((this.cl || this.cm) && this.cm) {
            if (this.cn == 0.0F) {
               this.a(auz.CC, this.fc(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               this.a(dur.u);
            }

            this.co = this.cn;
            this.cn += 0.05F;
            if (this.co >= 2.0F) {
               this.cl = false;
               this.cm = false;
               this.co = 0.0F;
               this.cn = 0.0F;
            }

            if (this.cn > 0.4F) {
               float $$0 = (float)this.du();
               int $$1 = (int)(axw.a((this.cn - 0.4F) * (float) Math.PI) * 7.0F);
               etf $$2 = this.dq();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ah.i() * 2.0F - 1.0F) * this.dh() * 0.5F;
                  float $$5 = (this.ah.i() * 2.0F - 1.0F) * this.dh() * 0.5F;
                  this.dN().a(kw.aj, this.ds() + (double)$$4, (double)($$0 + 0.8F), this.dy() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gD() {
      this.cm = false;
      this.cn = 0.0F;
      this.co = 0.0F;
   }

   @Override
   public void a(bpj $$0) {
      this.cl = false;
      this.cm = false;
      this.co = 0.0F;
      this.cn = 0.0F;
      super.a($$0);
   }

   public boolean gy() {
      return this.cl;
   }

   public float G(float $$0) {
      return Math.min(0.5F + axw.i($$0, this.co, this.cn) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (axw.i($$0, this.co, this.cn) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return axw.a($$2 * (float) Math.PI) * axw.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float H(float $$0) {
      return axw.i($$0, this.ck, this.cj) * 0.15F * (float) Math.PI;
   }

   @Override
   public int Z() {
      return this.y() ? 20 : super.Z();
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dN().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void f(bpj $$0, float $$1) {
      if (!this.h($$0)) {
         super.f($$0, $$1);
      } else {
         csd $$2 = this.fQ();
         int $$3 = $$2.m();
         int $$4 = $$2.n();
         $$2.a(axw.f($$1), this, bqs.g);
         if (bqj.b.a($$3, $$4) != bqj.b.a(this.fQ())) {
            this.a(auz.Ct);
            if (this.dN() instanceof aqe $$5) {
               $$5.a(new ks(kw.Q, csg.oq.x()), this.ds(), this.du() + 1.0, this.dy(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean h(bpj $$0) {
      return this.gB() && !$$0.a(avq.D);
   }

   @Override
   public boolean C(bql $$0) {
      boolean $$1 = $$0.a(this.dO().b((bre)this), (float)((int)this.g(bsl.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   protected void u() {
      if (this.r()) {
         this.f(bsl.q).a(40.0);
         this.t(40.0F);
      } else {
         this.f(bsl.q).a(8.0);
      }
   }

   @Override
   protected void b(bpj $$0, float $$1) {
      this.a($$0, $$1, new bqs[]{bqs.g});
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      cry $$3 = $$2.f();
      if (!this.dN().B || this.p_() && this.o($$2)) {
         if (this.r()) {
            if (this.o($$2) && this.ey() < this.eP()) {
               $$2.a(1, $$0);
               this.c(2.0F * (float)$$3.z().a());
               return boq.a(this.dN().x_());
            } else {
               if ($$3 instanceof cqx $$5 && this.j($$0)) {
                  cqw $$6 = $$5.c();
                  if ($$6 != this.gA()) {
                     this.a($$6);
                     $$2.a(1, $$0);
                     return boq.a;
                  }

                  return super.b($$0, $$1);
               }

               if ($$2.a(csg.or) && this.j($$0) && !this.gB() && !this.p_()) {
                  this.m($$2.c(1));
                  $$2.a(1, $$0);
                  return boq.a;
               } else if ($$2.a(csg.rV) && this.j($$0) && this.gB() && !cxo.f(this.fQ())) {
                  $$2.a(1, $$0, d($$1));
                  this.a(auz.az);
                  csd $$7 = this.fQ();
                  this.m(csd.i);
                  this.b($$7);
                  return boq.a;
               } else if (cpu.h.a().d().get().a($$2) && this.y() && this.gB() && this.j($$0) && this.fQ().l()) {
                  $$2.g(1);
                  this.a(auz.Cv);
                  csd $$8 = this.fQ();
                  int $$9 = (int)((float)$$8.n() * 0.125F);
                  $$8.b(Math.max(0, $$8.m() - $$9));
                  return boq.a;
               } else {
                  boq $$10 = super.b($$0, $$1);
                  if (!$$10.a() && this.j($$0)) {
                     this.y(!this.gp());
                     this.bo = false;
                     this.bR.n();
                     this.h(null);
                     return boq.a;
                  } else {
                     return $$10;
                  }
               }
            }
         } else if ($$2.a(csg.rz) && !this.Z_()) {
            $$2.a(1, $$0);
            this.h($$0);
            return boq.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         boolean $$4 = this.j($$0) || this.r() || $$2.a(csg.rz) && !this.r() && !this.Z_();
         return $$4 ? boq.b : boq.d;
      }
   }

   private void h(ckl $$0) {
      if (this.ah.a(3) == 0) {
         this.f($$0);
         this.bR.n();
         this.h(null);
         this.y(true);
         this.dN().a(this, (byte)7);
      } else {
         this.dN().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.cm = true;
         this.cn = 0.0F;
         this.co = 0.0F;
      } else if ($$0 == 56) {
         this.gD();
      } else {
         super.b($$0);
      }
   }

   public float gz() {
      if (this.Z_()) {
         return 1.5393804F;
      } else if (this.r()) {
         float $$0 = this.eP();
         float $$1 = ($$0 - this.ey()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean o(csd $$0) {
      cry $$1 = $$0.f();
      return $$1.y() && $$1.z().c();
   }

   @Override
   public int fP() {
      return 8;
   }

   @Override
   public int a() {
      return this.ao.a(ce);
   }

   @Override
   public void a(int $$0) {
      this.ao.a(ce, $$0);
   }

   @Override
   public void c() {
      this.a(cp.a(this.ah));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cq;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cq = $$0;
   }

   public cqw gA() {
      return cqw.a(this.ao.a(cd));
   }

   public boolean gB() {
      return !this.fQ().d();
   }

   private void a(cqw $$0) {
      this.ao.a(cd, $$0.a());
   }

   @Nullable
   public cdw b(aqe $$0, bqf $$1) {
      cdw $$2 = bqr.br.a((czu)$$0);
      if ($$2 != null && $$1 instanceof cdw $$3) {
         if (this.ah.h()) {
            $$2.i(this.gw());
         } else {
            $$2.i($$3.gw());
         }

         if (this.r()) {
            $$2.b(this.W_());
            $$2.b(true, true);
            if (this.ah.h()) {
               $$2.a(this.gA());
            } else {
               $$2.a($$3.gA());
            }
         }
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.ao.a(cc, $$0);
   }

   @Override
   public boolean a(cct $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.r()) {
         return false;
      } else if (!($$0 instanceof cdw $$1)) {
         return false;
      } else if (!$$1.r()) {
         return false;
      } else {
         return $$1.y() ? false : this.gt() && $$1.gt();
      }
   }

   public boolean gC() {
      return this.ao.a(cc);
   }

   @Override
   public boolean a(bre $$0, bre $$1) {
      if ($$0 instanceof chd || $$0 instanceof chl || $$0 instanceof cgl) {
         return false;
      } else if ($$0 instanceof cdw $$2) {
         return !$$2.r() || $$2.P_() != $$1;
      } else {
         if ($$0 instanceof ckl $$3 && $$1 instanceof ckl $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cex $$5 && $$5.gE()) {
            return false;
         }

         if ($$0 instanceof bsa $$6 && $$6.r()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean a(ckl $$0) {
      return !this.Z_() && super.a($$0);
   }

   @Override
   public etf cK() {
      return new etf(0.0, (double)(0.6F * this.cJ()), (double)(this.dh() * 0.4F));
   }

   public static boolean c(bqr<cdw> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return $$1.a_($$3.d()).a(avo.bZ) && a($$1, $$3);
   }

   class a<T extends bre> extends bxi<T> {
      private final cdw j;

      public a(cdw $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof cfa ? !this.j.r() && this.a((cfa)this.b) : false;
      }

      private boolean a(cfa $$0) {
         return $$0.gz() >= cdw.this.ah.a(5);
      }

      @Override
      public void c() {
         cdw.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         cdw.this.h(null);
         super.e();
      }
   }

   public static class b extends bqf.a {
      public final iv<cdx> a;

      public b(iv<cdx> $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class c extends byu {
      public c(double $$0) {
         super(cdw.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dC() || this.b.bO();
      }
   }
}
