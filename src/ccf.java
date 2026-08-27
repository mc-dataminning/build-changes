import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccf extends bxg implements bmt<Optional<ckv>>, cbr {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bmz bT = new bmz(e, "Covered armor bonus", 20.0, bmz.a.a);
   protected static final afz<ia> b = agc.a(ccf.class, agb.p);
   protected static final afz<Byte> c = agc.a(ccf.class, agb.a);
   protected static final afz<Byte> d = agc.a(ccf.class, agb.a);
   private static final int bU = 6;
   private static final byte bV = 16;
   private static final byte bW = 16;
   private static final int bX = 8;
   private static final int bY = 8;
   private static final int bZ = 5;
   private static final float ca = 0.05F;
   static final Vector3f cb = ac.a(() -> {
      iz $$0 = ia.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private float cc;
   private float cd;
   @Nullable
   private hv ce;
   private int cf;
   private static final float cg = 1.0F;

   public ccf(blj<? extends ccf> $$0, csy $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bK = new ccf.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsz(this, cer.class, 8.0F, 0.02F, true));
      this.bO.a(4, new ccf.a());
      this.bO.a(7, new ccf.f());
      this.bO.a(8, new btm(this));
      this.bP.a(1, new buj(this, this.getClass()).a());
      this.bP.a(2, new ccf.e(this));
      this.bP.a(3, new ccf.c(this));
   }

   @Override
   protected blf.b aW() {
      return blf.b.a;
   }

   @Override
   public ard db() {
      return ard.f;
   }

   @Override
   protected arb y() {
      return arc.vO;
   }

   @Override
   public void R() {
      if (!this.gj()) {
         super.R();
      }
   }

   @Override
   protected arb n_() {
      return arc.vU;
   }

   @Override
   protected arb d(bkd $$0) {
      return this.gj() ? arc.vW : arc.vV;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, ia.a);
      this.an.a(c, (byte)0);
      this.an.a(d, (byte)16);
   }

   public static bna.a u() {
      return blx.C().a(bnb.l, 30.0);
   }

   @Override
   protected brp H() {
      return new ccf.b(this);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.a(ia.a($$0.f("AttachFace")));
      this.an.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.b(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.A().d());
      $$0.a("Peek", this.an.b(c));
      $$0.a("Color", this.an.b(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B && !this.bO() && !this.a(this.dm(), this.A())) {
         this.gg();
      }

      if (this.gh()) {
         this.gi();
      }

      if (this.dM().B) {
         if (this.cf > 0) {
            this.cf--;
         } else {
            this.ce = null;
         }
      }
   }

   private void gg() {
      ia $$0 = this.i(this.dm());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.w();
      }
   }

   @Override
   protected ekw aq() {
      float $$0 = G(this.cd);
      ia $$1 = this.A().g();
      float $$2 = this.ai().k() / 2.0F;
      return a($$1, $$0).d(this.dr() - (double)$$2, this.dt(), this.dx() - (double)$$2);
   }

   private static float G(float $$0) {
      return 0.5F - aty.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gh() {
      this.cc = this.cd;
      float $$0 = (float)this.gl() * 0.01F;
      if (this.cd == $$0) {
         return false;
      } else {
         if (this.cd > $$0) {
            this.cd = aty.a(this.cd - 0.05F, $$0, 1.0F);
         } else {
            this.cd = aty.a(this.cd + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gi() {
      this.ar();
      float $$0 = G(this.cd);
      float $$1 = G(this.cc);
      ia $$2 = this.A().g();
      float $$3 = $$0 - $$1;
      if (!($$3 <= 0.0F)) {
         for (blf $$5 : this.dM().a(this, a($$2, $$1, $$0).d(this.dr() - 0.5, this.dt(), this.dx() - 0.5), bli.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof ccf) && !$$5.af) {
               $$5.a(bmb.e, new elb((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ekw a(ia $$0, float $$1) {
      return a($$0, -1.0F, $$1);
   }

   public static ekw a(ia $$0, float $$1, float $$2) {
      double $$3 = (double)Math.max($$1, $$2);
      double $$4 = (double)Math.min($$1, $$2);
      return new ekw(hv.b)
         .b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3)
         .a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
   }

   @Override
   public boolean a(blf $$0, boolean $$1) {
      if (this.dM().y_()) {
         this.ce = null;
         this.cf = 0;
      }

      this.a(ia.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ac() {
      super.ac();
      if (this.dM().B) {
         this.ce = this.dm();
      }

      this.aV = 0.0F;
      this.aU = 0.0F;
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      this.r(0.0F);
      this.aW = this.dC();
      this.bp();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bmb $$0, elb $$1) {
      if ($$0 == bmb.d) {
         this.w();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public elb dp() {
      return elb.b;
   }

   @Override
   public void g(elb $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      hv $$3 = this.dm();
      if (this.bO()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)aty.a($$0) + 0.5, (double)aty.a($$1 + 0.5), (double)aty.a($$2) + 0.5);
      }

      if (this.ah != 0) {
         hv $$4 = this.dm();
         if (!$$4.equals($$3)) {
            this.an.b(c, (byte)0);
            this.au = true;
            if (this.dM().B && !this.bO() && !$$4.equals(this.ce)) {
               this.ce = $$3;
               this.cf = 6;
               this.ac = this.dr();
               this.ad = this.dt();
               this.ae = this.dx();
            }
         }
      }
   }

   @Nullable
   protected ia i(hv $$0) {
      for (ia $$1 : ia.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(hv $$0, ia $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         ia $$2 = $$1.g();
         if (!this.dM().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ekw $$3 = a($$2, 1.0F).a($$0).h(1.0E-6);
            return this.dM().a(this, $$3);
         }
      }
   }

   private boolean j(hv $$0) {
      dip $$1 = this.dM().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(cwb.bQ) && $$0.equals(this.dm());
         return !$$2;
      }
   }

   protected boolean w() {
      if (!this.fU() && this.bx()) {
         hv $$0 = this.dm();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            hv $$2 = $$0.b(aty.b(this.ag, -8, 8), aty.b(this.ag, -8, 8), aty.b(this.ag, -8, 8));
            if ($$2.v() > this.dM().J_() && this.dM().t($$2) && this.dM().D_().a($$2) && this.dM().a(this, new ekw($$2).h(1.0E-6))) {
               ia $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ag();
                  this.a($$3);
                  this.a(arc.vZ, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dM().a(dmz.R, $$0, dmz.a.a(this));
                  this.an.b(c, (byte)0);
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
   public boolean a(bkd $$0, float $$1) {
      if (this.gj()) {
         blf $$2 = $$0.c();
         if ($$2 instanceof cex) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ev() < (double)this.eM() * 0.5 && this.ag.a(4) == 0) {
            this.w();
         } else if ($$0.a(art.k)) {
            blf $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == blj.aI) {
               this.gk();
            }
         }

         return true;
      }
   }

   private boolean gj() {
      return this.gl() == 0;
   }

   private void gk() {
      elb $$0 = this.dk();
      ekw $$1 = this.cH();
      if (!this.gj() && this.w()) {
         int $$2 = this.dM().a(blj.aH, $$1.g(8.0), blf::bx).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dM().z.i() < $$3)) {
            ccf $$4 = blj.aH.a(this.dM());
            if ($$4 != null) {
               $$4.a(this.ge());
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

   public ia A() {
      return this.an.b(b);
   }

   private void a(ia $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(afz<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.aq());
      }

      super.a($$0);
   }

   private int gl() {
      return this.an.b(c);
   }

   void b(int $$0) {
      if (!this.dM().B) {
         this.a(bnb.a).b(bT.a());
         if ($$0 == 0) {
            this.a(bnb.a).c(bT);
            this.a(arc.vT, 1.0F, 1.0F);
            this.a(dmz.j);
         } else {
            this.a(arc.vX, 1.0F, 1.0F);
            this.a(dmz.k);
         }
      }

      this.an.b(c, (byte)$$0);
   }

   public float E(float $$0) {
      return aty.i($$0, this.cc, this.cd);
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return 0.5F;
   }

   @Override
   public void a(yp $$0) {
      super.a($$0);
      this.aU = 0.0F;
      this.aV = 0.0F;
   }

   @Override
   public int aa() {
      return 180;
   }

   @Override
   public int ab() {
      return 180;
   }

   @Override
   public void g(blf $$0) {
   }

   public Optional<elb> F(float $$0) {
      if (this.ce != null && this.cf > 0) {
         double $$1 = (double)((float)this.cf - $$0) / 6.0;
         $$1 *= $$1;
         hv $$2 = this.dm();
         double $$3 = (double)($$2.u() - this.ce.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ce.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ce.w()) * $$1;
         return Optional.of(new elb(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   public void a(Optional<ckv> $$0) {
      this.an.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<ckv> ge() {
      return Optional.ofNullable(this.gf());
   }

   @Nullable
   public ckv gf() {
      byte $$0 = this.an.b(d);
      return $$0 != 16 && $$0 <= 15 ? ckv.a($$0) : null;
   }

   class a extends bsr {
      private int b;

      public a() {
         this.a(EnumSet.of(bsr.a.a, bsr.a.b));
      }

      @Override
      public boolean a() {
         blv $$0 = ccf.this.q();
         return $$0 != null && $$0.bx() ? ccf.this.dM().aj() != bji.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         ccf.this.b(100);
      }

      @Override
      public void d() {
         ccf.this.b(0);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         if (ccf.this.dM().aj() != bji.a) {
            this.b--;
            blv $$0 = ccf.this.q();
            if ($$0 != null) {
               ccf.this.I().a($$0, 180.0F, 180.0F);
               double $$1 = ccf.this.f((blf)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + ccf.this.ag.a(10) * 20 / 2;
                     ccf.this.dM().b(new cfl(ccf.this.dM(), ccf.this, $$0, ccf.this.A().o()));
                     ccf.this.a(arc.vY, 2.0F, (ccf.this.ag.i() - ccf.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  ccf.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends brp {
      public b(blx $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends buk<blv> {
      public c(ccf $$0) {
         super($$0, blv.class, 10, true, false, $$0x -> $$0x instanceof cbr);
      }

      @Override
      public boolean a() {
         return this.e.cg() == null ? false : super.a();
      }

      @Override
      protected ekw a(double $$0) {
         ia $$1 = ((ccf)this.e).A();
         if ($$1.o() == ia.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ia.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends brt {
      public d(blx $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ia $$0 = ccf.this.A().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(ccf.cb));
         iz $$2 = $$0.q();
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
            : Optional.of((float)(aty.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends buk<cer> {
      public e(ccf $$0) {
         super($$0, cer.class, true);
      }

      @Override
      public boolean a() {
         return ccf.this.dM().aj() == bji.a ? false : super.a();
      }

      @Override
      protected ekw a(double $$0) {
         ia $$1 = ((ccf)this.e).A();
         if ($$1.o() == ia.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ia.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bsr {
      private int b;

      @Override
      public boolean a() {
         return ccf.this.q() == null && ccf.this.ag.a(b(40)) == 0 && ccf.this.a(ccf.this.dm(), ccf.this.A());
      }

      @Override
      public boolean b() {
         return ccf.this.q() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + ccf.this.ag.a(3)));
         ccf.this.b(30);
      }

      @Override
      public void d() {
         if (ccf.this.q() == null) {
            ccf.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
