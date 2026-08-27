import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bya extends bnf implements bni<byb> {
   public static final double bW = 0.6;
   public static final double bX = 0.8;
   public static final double bY = 1.33;
   private static final cpy bZ = cpy.a(cna.qW, cna.qX);
   private static final agm<byb> ca = agp.a(bya.class, ago.w);
   private static final agm<Boolean> cb = agp.a(bya.class, ago.k);
   private static final agm<Boolean> cc = agp.a(bya.class, ago.k);
   private static final agm<Integer> cd = agp.a(bya.class, ago.b);
   private bya.a<cfh> ce;
   @Nullable
   private buo cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;

   public bya(bly<? extends bya> $$0, cto $$1) {
      super($$0, $$1);
   }

   public ahg gk() {
      return this.gl().a();
   }

   @Override
   protected void B() {
      this.cf = new bya.c(this, 0.6, bZ, true);
      this.bO.a(1, new bta(this));
      this.bO.a(1, new btz(this, 1.5));
      this.bO.a(2, new bul(this));
      this.bO.a(3, new bya.b(this));
      this.bO.a(4, this.cf);
      this.bO.a(5, new bst(this, 1.1, 8));
      this.bO.a(6, new bte(this, 1.0, 10.0F, 5.0F, false));
      this.bO.a(7, new bsu(this, 0.8));
      this.bO.a(8, new btm(this, 0.3F));
      this.bO.a(9, new btw(this));
      this.bO.a(10, new bss(this, 0.8));
      this.bO.a(11, new but(this, 0.8, 1.0000001E-5F));
      this.bO.a(12, new bto(this, cfh.class, 10.0F));
      this.bP.a(1, new bvc<>(this, byr.class, false, null));
      this.bP.a(1, new bvc<>(this, byy.class, false, byy.bU));
   }

   public byb gl() {
      return this.an.b(ca);
   }

   public void a(byb $$0) {
      this.an.b(ca, $$0);
   }

   public void A(boolean $$0) {
      this.an.b(cb, $$0);
   }

   public boolean gm() {
      return this.an.b(cb);
   }

   public void B(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public boolean gn() {
      return this.an.b(cc);
   }

   public cll go() {
      return cll.a(this.an.b(cd));
   }

   public void a(cll $$0) {
      this.an.b(cd, $$0.a());
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, kd.ak.e(byb.b));
      this.an.a(cb, false);
      this.an.a(cc, false);
      this.an.a(cd, cll.o.a());
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("variant", kd.ak.b(this.gl()).toString());
      $$0.a("CollarColor", (byte)this.go().a());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      byb $$1 = kd.ak.a(ahg.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(cll.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Z() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(bmw.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bmw.a);
            this.g(true);
         } else {
            this.b(bmw.a);
            this.g(false);
         }
      } else {
         this.b(bmw.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected arq y() {
      if (this.u()) {
         if (this.gi()) {
            return arr.dz;
         } else {
            return this.ag.a(4) == 0 ? arr.dA : arr.ds;
         }
      } else {
         return arr.dt;
      }
   }

   @Override
   public int Q() {
      return 120;
   }

   public void gp() {
      this.a(arr.dw, this.eW(), this.eX());
   }

   @Override
   protected arq d(bks $$0) {
      return arr.dy;
   }

   @Override
   protected arq n_() {
      return arr.du;
   }

   public static bnp.a gq() {
      return bmm.C().a(bnq.l, 10.0).a(bnq.m, 0.3F).a(bnq.c, 3.0);
   }

   @Override
   protected void a(cfh $$0, bjz $$1, cmx $$2) {
      if (this.m($$2)) {
         this.a(arr.dv, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gr() {
      return (float)this.b(bnq.c);
   }

   @Override
   public boolean C(blu $$0) {
      return $$0.a(this.dN().b((bmk)this), this.gr());
   }

   @Override
   public void l() {
      super.l();
      if (this.cf != null && this.cf.i() && !this.u() && this.ah % 100 == 0) {
         this.a(arr.dx, 1.0F, 1.0F);
      }

      this.gs();
   }

   private void gs() {
      if ((this.gm() || this.gn()) && this.ah % 5 == 0) {
         this.a(arr.dz, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
      }

      this.gt();
      this.gu();
   }

   private void gt() {
      this.ch = this.cg;
      this.cj = this.ci;
      if (this.gm()) {
         this.cg = Math.min(1.0F, this.cg + 0.15F);
         this.ci = Math.min(1.0F, this.ci + 0.08F);
      } else {
         this.cg = Math.max(0.0F, this.cg - 0.22F);
         this.ci = Math.max(0.0F, this.ci - 0.13F);
      }
   }

   private void gu() {
      this.cl = this.ck;
      if (this.gn()) {
         this.ck = Math.min(1.0F, this.ck + 0.1F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.13F);
      }
   }

   public float E(float $$0) {
      return aun.i($$0, this.ch, this.cg);
   }

   public float F(float $$0) {
      return aun.i($$0, this.cj, this.ci);
   }

   public float G(float $$0) {
      return aun.i($$0, this.cl, this.ck);
   }

   @Nullable
   public bya b(and $$0, blp $$1) {
      bya $$2 = bly.n.a((cto)$$0);
      if ($$2 != null && $$1 instanceof bya $$3) {
         if (this.ag.h()) {
            $$2.a(this.gl());
         } else {
            $$2.a($$3.gl());
         }

         if (this.u()) {
            $$2.b(this.d());
            $$2.x(true);
            if (this.ag.h()) {
               $$2.a(this.go());
            } else {
               $$2.a($$3.go());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(bxx $$0) {
      if (!this.u()) {
         return false;
      } else {
         return !($$0 instanceof bya $$1) ? false : $$1.u() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      boolean $$5 = $$0.ap() > 0.9F;
      asv<byb> $$6 = $$5 ? ash.b : ash.a;
      kd.ak.b($$6).flatMap($$1x -> $$1x.a($$0.F_())).ifPresent($$0x -> this.a((byb)$$0x.a()));
      and $$7 = $$0.E();
      if ($$7.a().a(this.dm(), asr.n).b()) {
         this.a(kd.ak.e(byb.k));
         this.fJ();
      }

      return $$3;
   }

   @Override
   public bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      cms $$3 = $$2.d();
      if (this.dM().B) {
         if (this.u() && this.j($$0)) {
            return bka.a;
         } else {
            return !this.m($$2) || !(this.ev() < this.eM()) && this.u() ? bka.d : bka.a;
         }
      } else {
         if (this.u()) {
            if (this.j($$0)) {
               if (!($$3 instanceof clm)) {
                  if ($$3.u() && this.m($$2) && this.ev() < this.eM()) {
                     this.a($$0, $$1, $$2);
                     this.b((float)$$3.v().a());
                     return bka.b;
                  }

                  bka $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.o_()) {
                     this.z(!this.ge());
                  }

                  return $$5;
               }

               cll $$4 = ((clm)$$3).d();
               if ($$4 != this.go()) {
                  this.a($$4);
                  if (!$$0.fT().d) {
                     $$2.h(1);
                  }

                  this.fJ();
                  return bka.b;
               }
            }
         } else if (this.m($$2)) {
            this.a($$0, $$1, $$2);
            if (this.ag.a(3) == 0) {
               this.f($$0);
               this.z(true);
               this.dM().a(this, (byte)7);
            } else {
               this.dM().a(this, (byte)6);
            }

            this.fJ();
            return bka.b;
         }

         bka $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fJ();
         }

         return $$6;
      }
   }

   @Override
   public boolean m(cmx $$0) {
      return bZ.a($$0);
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && this.ah > 2400;
   }

   @Override
   protected void w() {
      if (this.ce == null) {
         this.ce = new bya.a<>(this, cfh.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.ce);
      if (!this.u()) {
         this.bO.a(4, this.ce);
      }
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }

   static class a<T extends bmk> extends bsn<T> {
      private final bya i;

      public a(bya $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, blx.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.u() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.u() && super.b();
      }
   }

   static class b extends btg {
      private final bya a;
      @Nullable
      private cfh b;
      @Nullable
      private hx c;
      private int d;

      public b(bya $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.u()) {
            return false;
         } else if (this.a.ge()) {
            return false;
         } else {
            bmk $$0 = this.a.R_();
            if ($$0 instanceof cfh) {
               this.b = (cfh)$$0;
               if (!$$0.fD()) {
                  return false;
               }

               if (this.a.f((blu)this.b) > 100.0) {
                  return false;
               }

               hx $$1 = this.b.dm();
               djg $$2 = this.a.dM().a_($$1);
               if ($$2.a(asg.R)) {
                  this.c = $$2.d(cwi.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new hx($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (bya $$1 : this.a.dM().a(bya.class, new eln(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gm() || $$1.gn())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.u() && !this.a.ge() && this.b != null && this.b.fD() && this.c != null && !this.h();
      }

      @Override
      public void c() {
         if (this.c != null) {
            this.a.y(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void d() {
         this.a.A(false);
         float $$0 = this.a.dM().f(1.0F);
         if (this.b.fW() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dM().F_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.N().n();
      }

      private void i() {
         auu $$0 = this.a.eg();
         hx.a $$1 = new hx.a();
         $$1.g(this.a.fS() ? this.a.fT().dm() : this.a.dm());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dm());
         ehd $$2 = this.a.dM().o().aJ().getLootTable(egt.aw);
         ehb $$3 = new ehb.a((and)this.a.dM()).a(ejg.f, this.a.dk()).a(ejg.a, this.a).a(ejf.i);

         for (cmx $$5 : $$2.a($$3)) {
            this.a
               .dM()
               .b(
                  new cbt(
                     this.a.dM(),
                     (double)$$1.u() - (double)aun.a(this.a.aU * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)aun.b(this.a.aU * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void e() {
         if (this.b != null && this.c != null) {
            this.a.y(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.f((blu)this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.A(true);
                  this.a.B(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.B(true);
               }
            } else {
               this.a.A(false);
            }
         }
      }
   }

   static class c extends buo {
      @Nullable
      private cfh c;
      private final bya d;

      public c(bya $$0, double $$1, cpy $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.eg().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.eg().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.u();
      }
   }
}
