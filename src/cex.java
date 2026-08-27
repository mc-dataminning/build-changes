import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cex extends bzv implements bph<Optional<cnr>>, cej {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bpn bT = new bpn(e, "Covered armor bonus", 20.0, bpn.a.a);
   protected static final aie<ie> b = aih.a(cex.class, aig.p);
   protected static final aie<Byte> c = aih.a(cex.class, aig.a);
   protected static final aie<Byte> d = aih.a(cex.class, aig.a);
   private static final int bU = 6;
   private static final byte bV = 16;
   private static final byte bW = 16;
   private static final int bX = 8;
   private static final int bY = 8;
   private static final int bZ = 5;
   private static final float ca = 0.05F;
   static final Vector3f cb = ac.a(() -> {
      jd $$0 = ie.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float cc = 3.0F;
   private float cd;
   private float ce;
   @Nullable
   private hz cf;
   private int cg;
   private static final float ch = 1.0F;

   public cex(bnw<? extends cex> $$0, cvr $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bK = new cex.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bvn(this, chl.class, 8.0F, 0.02F, true));
      this.bO.a(4, new cex.a());
      this.bO.a(7, new cex.f());
      this.bO.a(8, new bwa(this));
      this.bP.a(1, new bwx(this, this.getClass()).a());
      this.bP.a(2, new cex.e(this));
      this.bP.a(3, new cex.c(this));
   }

   @Override
   protected bnq.b aW() {
      return bnq.b.a;
   }

   @Override
   public atm db() {
      return atm.f;
   }

   @Override
   protected atk y() {
      return atl.we;
   }

   @Override
   public void R() {
      if (!this.gl()) {
         super.R();
      }
   }

   @Override
   protected atk n_() {
      return atl.wk;
   }

   @Override
   protected atk d(bmp $$0) {
      return this.gl() ? atl.wm : atl.wl;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, ie.a);
      this.am.a(c, (byte)0);
      this.am.a(d, (byte)16);
   }

   public static bpo.a u() {
      return bok.C().a(bpp.n, 30.0);
   }

   @Override
   protected bud H() {
      return new cex.b(this);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a(ie.a($$0.f("AttachFace")));
      this.am.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.am.b(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.A().d());
      $$0.a("Peek", this.am.b(c));
      $$0.a("Color", this.am.b(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B && !this.bO() && !this.a(this.dm(), this.A())) {
         this.gi();
      }

      if (this.gj()) {
         this.gk();
      }

      if (this.dM().B) {
         if (this.cg > 0) {
            this.cg--;
         } else {
            this.cf = null;
         }
      }
   }

   private void gi() {
      ie $$0 = this.i(this.dm());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.w();
      }
   }

   @Override
   protected enu aq() {
      float $$0 = G(this.ce);
      ie $$1 = this.A().g();
      float $$2 = this.dg() / 2.0F;
      return a(this.ea(), $$1, $$0).d(this.dr() - (double)$$2, this.dt(), this.dx() - (double)$$2);
   }

   private static float G(float $$0) {
      return 0.5F - awi.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gj() {
      this.cd = this.ce;
      float $$0 = (float)this.gn() * 0.01F;
      if (this.ce == $$0) {
         return false;
      } else {
         if (this.ce > $$0) {
            this.ce = awi.a(this.ce - 0.05F, $$0, 1.0F);
         } else {
            this.ce = awi.a(this.ce + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gk() {
      this.ar();
      float $$0 = G(this.ce);
      float $$1 = G(this.cd);
      ie $$2 = this.A().g();
      float $$3 = ($$0 - $$1) * this.ea();
      if (!($$3 <= 0.0F)) {
         for (bnq $$5 : this.dM().a(this, a(this.ea(), $$2, $$1, $$0).d(this.dr() - 0.5, this.dt(), this.dx() - 0.5), bnv.f.and($$0x -> !$$0x.x(this)))) {
            if (!($$5 instanceof cex) && !$$5.ae) {
               $$5.a(bon.e, new enz((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static enu a(float $$0, ie $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static enu a(float $$0, ie $$1, float $$2, float $$3) {
      enu $$4 = new enu(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bnq $$0, boolean $$1) {
      if (this.dM().y_()) {
         this.cf = null;
         this.cg = 0;
      }

      this.a(ie.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ac() {
      super.ac();
      if (this.dM().B) {
         this.cf = this.dm();
      }

      this.aV = 0.0F;
      this.aU = 0.0F;
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      this.r(0.0F);
      this.aW = this.dC();
      this.bp();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bon $$0, enz $$1) {
      if ($$0 == bon.d) {
         this.w();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public enz dp() {
      return enz.b;
   }

   @Override
   public void g(enz $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      hz $$3 = this.dm();
      if (this.bO()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)awi.a($$0) + 0.5, (double)awi.a($$1 + 0.5), (double)awi.a($$2) + 0.5);
      }

      if (this.ag != 0) {
         hz $$4 = this.dm();
         if (!$$4.equals($$3)) {
            this.am.b(c, (byte)0);
            this.at = true;
            if (this.dM().B && !this.bO() && !$$4.equals(this.cf)) {
               this.cf = $$3;
               this.cg = 6;
               this.ab = this.dr();
               this.ac = this.dt();
               this.ad = this.dx();
            }
         }
      }
   }

   @Nullable
   protected ie i(hz $$0) {
      for (ie $$1 : ie.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(hz $$0, ie $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         ie $$2 = $$1.g();
         if (!this.dM().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            enu $$3 = a(this.ea(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dM().a(this, $$3);
         }
      }
   }

   private boolean j(hz $$0) {
      dlj $$1 = this.dM().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(cyu.bQ) && $$0.equals(this.dm());
         return !$$2;
      }
   }

   protected boolean w() {
      if (!this.fW() && this.bx()) {
         hz $$0 = this.dm();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            hz $$2 = $$0.b(awi.b(this.af, -8, 8), awi.b(this.af, -8, 8), awi.b(this.af, -8, 8));
            if ($$2.v() > this.dM().J_() && this.dM().u($$2) && this.dM().D_().a($$2) && this.dM().a(this, new enu($$2).h(1.0E-6))) {
               ie $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ag();
                  this.a($$3);
                  this.a(atl.wp, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dM().a(dpw.R, $$0, dpw.a.a(this));
                  this.am.b(c, (byte)0);
                  this.h(null);
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.bn = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if (this.gl()) {
         bnq $$2 = $$0.c();
         if ($$2 instanceof chr) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ew() < (double)this.eN() * 0.5 && this.af.a(4) == 0) {
            this.w();
         } else if ($$0.a(auc.k)) {
            bnq $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bnw.aJ) {
               this.gm();
            }
         }

         return true;
      }
   }

   private boolean gl() {
      return this.gn() == 0;
   }

   private void gm() {
      enz $$0 = this.dk();
      enu $$1 = this.cH();
      if (!this.gl() && this.w()) {
         int $$2 = this.dM().a(bnw.aI, $$1.g(8.0), bnq::bx).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dM().z.i() < $$3)) {
            cex $$4 = bnw.aI.a(this.dM());
            if ($$4 != null) {
               $$4.a(this.gg());
               $$4.e($$0);
               this.dM().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bz() {
      return this.bx();
   }

   public ie A() {
      return this.am.b(b);
   }

   private void a(ie $$0) {
      this.am.b(b, $$0);
   }

   @Override
   public void a(aie<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.aq());
      }

      super.a($$0);
   }

   private int gn() {
      return this.am.b(c);
   }

   void b(int $$0) {
      if (!this.dM().B) {
         this.f(bpp.a).b(bT.a());
         if ($$0 == 0) {
            this.f(bpp.a).d(bT);
            this.a(atl.wj, 1.0F, 1.0F);
            this.b(dpw.j);
         } else {
            this.a(atl.wn, 1.0F, 1.0F);
            this.b(dpw.k);
         }
      }

      this.am.b(c, (byte)$$0);
   }

   public float E(float $$0) {
      return awi.i($$0, this.cd, this.ce);
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      this.aU = 0.0F;
      this.aV = 0.0F;
   }

   @Override
   public int ab() {
      return 180;
   }

   @Override
   public int fH() {
      return 180;
   }

   @Override
   public void g(bnq $$0) {
   }

   public Optional<enz> F(float $$0) {
      if (this.cf != null && this.cg > 0) {
         double $$1 = (double)((float)this.cg - $$0) / 6.0;
         $$1 *= $$1;
         hz $$2 = this.dm();
         double $$3 = (double)($$2.u() - this.cf.u()) * $$1;
         double $$4 = (double)($$2.v() - this.cf.v()) * $$1;
         double $$5 = (double)($$2.w() - this.cf.w()) * $$1;
         return Optional.of(new enz(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cnr> $$0) {
      this.am.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cnr> gg() {
      return Optional.ofNullable(this.gh());
   }

   @Nullable
   public cnr gh() {
      byte $$0 = this.am.b(d);
      return $$0 != 16 && $$0 <= 15 ? cnr.a($$0) : null;
   }

   class a extends bvf {
      private int b;

      public a() {
         this.a(EnumSet.of(bvf.a.a, bvf.a.b));
      }

      @Override
      public boolean a() {
         boi $$0 = cex.this.q();
         return $$0 != null && $$0.bx() ? cex.this.dM().aj() != blt.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         cex.this.b(100);
      }

      @Override
      public void d() {
         cex.this.b(0);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         if (cex.this.dM().aj() != blt.a) {
            this.b--;
            boi $$0 = cex.this.q();
            if ($$0 != null) {
               cex.this.I().a($$0, 180.0F, 180.0F);
               double $$1 = cex.this.f((bnq)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cex.this.af.a(10) * 20 / 2;
                     cex.this.dM().b(new cig(cex.this.dM(), cex.this, $$0, cex.this.A().o()));
                     cex.this.a(atl.wo, 2.0F, (cex.this.af.i() - cex.this.af.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cex.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bud {
      public b(bok $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends bwy<boi> {
      public c(cex $$0) {
         super($$0, boi.class, 10, true, false, $$0x -> $$0x instanceof cej);
      }

      @Override
      public boolean a() {
         return this.e.cg() == null ? false : super.a();
      }

      @Override
      protected enu a(double $$0) {
         ie $$1 = ((cex)this.e).A();
         if ($$1.o() == ie.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ie.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends buh {
      public d(bok $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ie $$0 = cex.this.A().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cex.cb));
         jd $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dr();
         double $$5 = this.f - this.a.dv();
         double $$6 = this.g - this.a.dx();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(awi.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends bwy<chl> {
      public e(cex $$0) {
         super($$0, chl.class, true);
      }

      @Override
      public boolean a() {
         return cex.this.dM().aj() == blt.a ? false : super.a();
      }

      @Override
      protected enu a(double $$0) {
         ie $$1 = ((cex)this.e).A();
         if ($$1.o() == ie.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ie.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bvf {
      private int b;

      @Override
      public boolean a() {
         return cex.this.q() == null && cex.this.af.a(b(40)) == 0 && cex.this.a(cex.this.dm(), cex.this.A());
      }

      @Override
      public boolean b() {
         return cex.this.q() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + cex.this.af.a(3)));
         cex.this.b(30);
      }

      @Override
      public void d() {
         if (cex.this.q() == null) {
            cex.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
