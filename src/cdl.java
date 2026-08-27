import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdl extends brp implements bqz, brs<in<cdm>> {
   private static final aja<Boolean> cb = aje.a(cdl.class, ajc.k);
   private static final aja<Integer> cc = aje.a(cdl.class, ajc.b);
   private static final aja<Integer> cd = aje.a(cdl.class, ajc.b);
   private static final aja<in<cdm>> ce = aje.a(cdl.class, ajc.x);
   public static final Predicate<bqt> ca = $$0 -> {
      bqg<?> $$1 = $$0.ai();
      return $$1 == bqg.aI || $$1 == bqg.aF || $$1 == bqg.Q;
   };
   private static final float cf = 8.0F;
   private static final float cg = 40.0F;
   private static final float ch = 0.125F;
   private float ci;
   private float cj;
   private boolean ck;
   private boolean cl;
   private float cm;
   private float cn;
   private static final bnq co = ayl.a(20, 39);
   @Nullable
   private UUID cp;

   public cdl(bqg<? extends cdl> $$0, czg $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(els.f, -1.0F);
      this.a(els.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxk(this));
      this.bR.a(1, new cdl.c(1.5));
      this.bR.a(2, new byv(this));
      this.bR.a(3, new cdl.a<>(this, cep.class, 24.0F, 1.5, 1.5));
      this.bR.a(4, new bxw(this, 0.4F));
      this.bR.a(5, new bya(this, 1.0, true));
      this.bR.a(6, new bxo(this, 1.0, 10.0F, 2.0F, false));
      this.bR.a(7, new bxc(this, 1.0));
      this.bR.a(8, new bzd(this, 1.0));
      this.bR.a(9, new bwy(this, 8.0F));
      this.bR.a(10, new bxy(this, cka.class, 8.0F));
      this.bR.a(10, new byl(this));
      this.bS.a(1, new bzn(this));
      this.bS.a(2, new bzo(this));
      this.bS.a(3, new bzi(this).a());
      this.bS.a(4, new bzj<>(this, cka.class, 10, true, false, this::a_));
      this.bS.a(5, new bzm<>(this, cci.class, false, ca));
      this.bS.a(6, new bzm<>(this, cdj.class, false, cdj.bY));
      this.bS.a(7, new bzj<>(this, cgo.class, false));
      this.bS.a(8, new bzp<>(this, true));
   }

   public ajv gt() {
      cdm $$0 = this.gu().a();
      return this.r() ? $$0.b() : (this.Z_() ? $$0.c() : $$0.a());
   }

   public in<cdm> gu() {
      return this.an.a(ce);
   }

   @Override
   public void i(in<cdm> $$0) {
      this.an.a(ce, $$0);
   }

   public static brz.a gv() {
      return bqv.A().a(bsa.r, 0.3F).a(bsa.q, 8.0).a(bsa.c, 4.0);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(ce, this.dO().d(ku.m).g(cdn.a));
      $$0.a(cb, false);
      $$0.a(cc, cql.o.a());
      $$0.a(cd, 0);
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.Cw, 0.15F, 1.0F);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gy().a());
      $$0.a("variant", this.gu().e().orElse(cdn.a).a().toString());
      this.c($$0);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      Optional.ofNullable(ajv.a($$0.l("variant"))).map($$0x -> aju.a(ku.m, $$0x)).flatMap($$0x -> this.dO().d(ku.m).b($$0x)).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(cql.a($$0.h("CollarColor")));
      }

      this.a(this.dM(), $$0);
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      in<daf> $$4 = $$0.t(this.dm());
      in<cdm> $$6;
      if ($$3 instanceof cdl.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cdn.a(this.dO(), $$4);
         $$3 = new cdl.b($$6);
      }

      this.i($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected aun v() {
      if (this.Z_()) {
         return auo.Cr;
      } else if (this.ag.a(3) == 0) {
         return this.r() && this.ex() < 20.0F ? auo.Cx : auo.Cu;
      } else {
         return auo.Cp;
      }
   }

   @Override
   protected aun d(boy $$0) {
      return this.h($$0) ? auo.Cn : auo.Ct;
   }

   @Override
   protected aun o_() {
      return auo.Cq;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dM().B && this.ck && !this.cl && !this.gj() && this.aC()) {
         this.cl = true;
         this.cm = 0.0F;
         this.cn = 0.0F;
         this.dM().a(this, (byte)8);
      }

      if (!this.dM().B) {
         this.a((apu)this.dM(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bA()) {
         this.cj = this.ci;
         if (this.gA()) {
            this.ci = this.ci + (1.0F - this.ci) * 0.4F;
         } else {
            this.ci = this.ci + (0.0F - this.ci) * 0.4F;
         }

         if (this.be()) {
            this.ck = true;
            if (this.cl && !this.dM().B) {
               this.dM().a(this, (byte)56);
               this.gB();
            }
         } else if ((this.ck || this.cl) && this.cl) {
            if (this.cm == 0.0F) {
               this.a(auo.Cv, this.fb(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.a(dub.u);
            }

            this.cn = this.cm;
            this.cm += 0.05F;
            if (this.cn >= 2.0F) {
               this.ck = false;
               this.cl = false;
               this.cn = 0.0F;
               this.cm = 0.0F;
            }

            if (this.cm > 0.4F) {
               float $$0 = (float)this.dt();
               int $$1 = (int)(axm.a((this.cm - 0.4F) * (float) Math.PI) * 7.0F);
               esj $$2 = this.dp();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.dg() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.dg() * 0.5F;
                  this.dM().a(kn.ak, this.dr() + (double)$$4, (double)($$0 + 0.8F), this.dx() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gB() {
      this.cl = false;
      this.cm = 0.0F;
      this.cn = 0.0F;
   }

   @Override
   public void a(boy $$0) {
      this.ck = false;
      this.cl = false;
      this.cn = 0.0F;
      this.cm = 0.0F;
      super.a($$0);
   }

   public boolean gw() {
      return this.ck;
   }

   public float G(float $$0) {
      return Math.min(0.5F + axm.i($$0, this.cn, this.cm) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (axm.i($$0, this.cn, this.cm) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return axm.a($$2 * (float) Math.PI) * axm.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float H(float $$0) {
      return axm.i($$0, this.cj, this.ci) * 0.15F * (float) Math.PI;
   }

   @Override
   public int Z() {
      return this.y() ? 20 : super.Z();
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void f(boy $$0, float $$1) {
      if (!this.h($$0)) {
         super.f($$0, $$1);
      } else {
         crs $$2 = this.fP();
         int $$3 = $$2.m();
         int $$4 = $$2.n();
         $$2.a(axm.f($$1), this, bqh.g);
         if (bpy.b.a($$3, $$4) != bpy.b.a(this.fP())) {
            this.a(auo.Cm);
            if (this.dM() instanceof apu $$5) {
               $$5.a(new kj(kn.R, crv.op.x()), this.dr(), this.dt() + 1.0, this.dx(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean h(boy $$0) {
      return this.gz() && !$$0.a(avg.D);
   }

   @Override
   public boolean C(bqa $$0) {
      boolean $$1 = $$0.a(this.dN().b((bqt)this), (float)((int)this.g(bsa.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   protected void u() {
      if (this.r()) {
         this.f(bsa.q).a(40.0);
         this.t(40.0F);
      } else {
         this.f(bsa.q).a(8.0);
      }
   }

   @Override
   protected void b(boy $$0, float $$1) {
      this.a($$0, $$1, new bqh[]{bqh.g});
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      crn $$3 = $$2.f();
      if (this.dM().B) {
         boolean $$4 = this.j($$0) || this.r() || $$2.a(crv.ry) && !this.r() && !this.Z_();
         return $$4 ? bof.b : bof.d;
      } else if (this.r()) {
         if (this.o($$2) && this.ex() < this.eO()) {
            $$2.a(1, $$0);
            this.c(2.0F * (float)$$3.z().a());
            return bof.a;
         } else {
            if ($$3 instanceof cqm $$5 && this.j($$0)) {
               cql $$6 = $$5.c();
               if ($$6 != this.gy()) {
                  this.a($$6);
                  $$2.a(1, $$0);
                  return bof.a;
               }

               return super.b($$0, $$1);
            }

            if ($$2.a(crv.oq) && this.j($$0) && !this.gz() && !this.p_()) {
               this.m($$2.c(1));
               $$2.a(1, $$0);
               return bof.a;
            } else if ($$2.a(crv.rU) && this.j($$0) && this.gz() && !cxa.f(this.fP())) {
               $$2.a(1, $$0, d($$1));
               this.a(auo.az);
               crs $$7 = this.fP();
               this.m(crs.i);
               this.b($$7);
               return bof.a;
            } else if (cpj.h.a().d().get().a($$2) && this.y() && this.gz() && this.j($$0) && this.fP().l()) {
               $$2.g(1);
               this.a(auo.Co);
               crs $$8 = this.fP();
               int $$9 = (int)((float)$$8.n() * 0.125F);
               $$8.b(Math.max(0, $$8.m() - $$9));
               return bof.a;
            } else {
               bof $$10 = super.b($$0, $$1);
               if ((!$$10.a() || this.p_()) && this.j($$0)) {
                  this.y(!this.gn());
                  this.bm = false;
                  this.bQ.n();
                  this.h(null);
                  return bof.a;
               } else {
                  return $$10;
               }
            }
         }
      } else if ($$2.a(crv.ry) && !this.Z_()) {
         $$2.a(1, $$0);
         if (this.ag.a(3) == 0) {
            this.f($$0);
            this.bQ.n();
            this.h(null);
            this.y(true);
            this.dM().a(this, (byte)7);
         } else {
            this.dM().a(this, (byte)6);
         }

         return bof.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.cl = true;
         this.cm = 0.0F;
         this.cn = 0.0F;
      } else if ($$0 == 56) {
         this.gB();
      } else {
         super.b($$0);
      }
   }

   public float gx() {
      if (this.Z_()) {
         return 1.5393804F;
      } else if (this.r()) {
         float $$0 = this.eO();
         float $$1 = ($$0 - this.ex()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean o(crs $$0) {
      crn $$1 = $$0.f();
      return $$1.y() && $$1.z().c();
   }

   @Override
   public int fO() {
      return 8;
   }

   @Override
   public int a() {
      return this.an.a(cd);
   }

   @Override
   public void a(int $$0) {
      this.an.a(cd, $$0);
   }

   @Override
   public void c() {
      this.a(co.a(this.ag));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cp;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cp = $$0;
   }

   public cql gy() {
      return cql.a(this.an.a(cc));
   }

   public boolean gz() {
      return !this.fP().d();
   }

   public void a(cql $$0) {
      this.an.a(cc, $$0.a());
   }

   @Nullable
   public cdl b(apu $$0, bpu $$1) {
      cdl $$2 = bqg.br.a((czg)$$0);
      if ($$2 != null && $$1 instanceof cdl $$3) {
         if (this.ag.h()) {
            $$2.i(this.gu());
         } else {
            $$2.i($$3.gu());
         }

         if (this.r()) {
            $$2.b(this.W_());
            $$2.b(true, true);
            if (this.ag.h()) {
               $$2.a(this.gy());
            } else {
               $$2.a($$3.gy());
            }
         }
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.an.a(cb, $$0);
   }

   @Override
   public boolean a(cci $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.r()) {
         return false;
      } else if (!($$0 instanceof cdl $$1)) {
         return false;
      } else if (!$$1.r()) {
         return false;
      } else {
         return $$1.y() ? false : this.gr() && $$1.gr();
      }
   }

   public boolean gA() {
      return this.an.a(cb);
   }

   @Override
   public boolean a(bqt $$0, bqt $$1) {
      if ($$0 instanceof cgs || $$0 instanceof cha) {
         return false;
      } else if ($$0 instanceof cdl $$2) {
         return !$$2.r() || $$2.P_() != $$1;
      } else if ($$0 instanceof cka && $$1 instanceof cka && !((cka)$$1).a((cka)$$0)) {
         return false;
      } else {
         return $$0 instanceof cem && ((cem)$$0).gC() ? false : !($$0 instanceof brp) || !((brp)$$0).r();
      }
   }

   @Override
   public boolean a(cka $$0) {
      return !this.Z_() && super.a($$0);
   }

   @Override
   public esj cJ() {
      return new esj(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   public static boolean c(bqg<cdl> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return $$1.a_($$3.d()).a(ave.bZ) && a($$1, $$3);
   }

   class a<T extends bqt> extends bwx<T> {
      private final cdl j;

      public a(cdl $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof cep ? !this.j.r() && this.a((cep)this.b) : false;
      }

      private boolean a(cep $$0) {
         return $$0.gx() >= cdl.this.ag.a(5);
      }

      @Override
      public void c() {
         cdl.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         cdl.this.h(null);
         super.e();
      }
   }

   public static class b extends bpu.a {
      public final in<cdm> a;

      public b(in<cdm> $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class c extends byj {
      public c(double $$0) {
         super(cdl.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dB() || this.b.bN();
      }
   }
}
