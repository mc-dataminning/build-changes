import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccp extends bxq implements bnd<Optional<clf>>, ccb {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bnj bT = new bnj(e, "Covered armor bonus", 20.0, bnj.a.a);
   protected static final agj<ic> b = agm.a(ccp.class, agl.p);
   protected static final agj<Byte> c = agm.a(ccp.class, agl.a);
   protected static final agj<Byte> d = agm.a(ccp.class, agl.a);
   private static final int bU = 6;
   private static final byte bV = 16;
   private static final byte bW = 16;
   private static final int bX = 8;
   private static final int bY = 8;
   private static final int bZ = 5;
   private static final float ca = 0.05F;
   static final Vector3f cb = ac.a(() -> {
      jb $$0 = ic.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private float cc;
   private float cd;
   @Nullable
   private hx ce;
   private int cf;
   private static final float cg = 1.0F;

   public ccp(blt<? extends ccp> $$0, cti $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bK = new ccp.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new btj(this, cfb.class, 8.0F, 0.02F, true));
      this.bO.a(4, new ccp.a());
      this.bO.a(7, new ccp.f());
      this.bO.a(8, new btw(this));
      this.bP.a(1, new but(this, this.getClass()).a());
      this.bP.a(2, new ccp.e(this));
      this.bP.a(3, new ccp.c(this));
   }

   @Override
   protected blp.b aW() {
      return blp.b.a;
   }

   @Override
   public arn db() {
      return arn.f;
   }

   @Override
   protected arl y() {
      return arm.vO;
   }

   @Override
   public void R() {
      if (!this.gj()) {
         super.R();
      }
   }

   @Override
   protected arl n_() {
      return arm.vU;
   }

   @Override
   protected arl d(bkn $$0) {
      return this.gj() ? arm.vW : arm.vV;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, ic.a);
      this.an.a(c, (byte)0);
      this.an.a(d, (byte)16);
   }

   public static bnk.a u() {
      return bmh.C().a(bnl.l, 30.0);
   }

   @Override
   protected brz H() {
      return new ccp.b(this);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.a(ic.a($$0.f("AttachFace")));
      this.an.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.b(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(sl $$0) {
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
      ic $$0 = this.i(this.dm());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.w();
      }
   }

   @Override
   protected elh aq() {
      float $$0 = G(this.cd);
      ic $$1 = this.A().g();
      float $$2 = this.ai().k() / 2.0F;
      return a($$1, $$0).d(this.dr() - (double)$$2, this.dt(), this.dx() - (double)$$2);
   }

   private static float G(float $$0) {
      return 0.5F - aui.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gh() {
      this.cc = this.cd;
      float $$0 = (float)this.gl() * 0.01F;
      if (this.cd == $$0) {
         return false;
      } else {
         if (this.cd > $$0) {
            this.cd = aui.a(this.cd - 0.05F, $$0, 1.0F);
         } else {
            this.cd = aui.a(this.cd + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gi() {
      this.ar();
      float $$0 = G(this.cd);
      float $$1 = G(this.cc);
      ic $$2 = this.A().g();
      float $$3 = $$0 - $$1;
      if (!($$3 <= 0.0F)) {
         for (blp $$5 : this.dM().a(this, a($$2, $$1, $$0).d(this.dr() - 0.5, this.dt(), this.dx() - 0.5), bls.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof ccp) && !$$5.af) {
               $$5.a(bml.e, new elm((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static elh a(ic $$0, float $$1) {
      return a($$0, -1.0F, $$1);
   }

   public static elh a(ic $$0, float $$1, float $$2) {
      double $$3 = (double)Math.max($$1, $$2);
      double $$4 = (double)Math.min($$1, $$2);
      return new elh(hx.b)
         .b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3)
         .a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
   }

   @Override
   public boolean a(blp $$0, boolean $$1) {
      if (this.dM().y_()) {
         this.ce = null;
         this.cf = 0;
      }

      this.a(ic.a);
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
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      this.r(0.0F);
      this.aW = this.dC();
      this.bp();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bml $$0, elm $$1) {
      if ($$0 == bml.d) {
         this.w();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public elm dp() {
      return elm.b;
   }

   @Override
   public void g(elm $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      hx $$3 = this.dm();
      if (this.bO()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)aui.a($$0) + 0.5, (double)aui.a($$1 + 0.5), (double)aui.a($$2) + 0.5);
      }

      if (this.ah != 0) {
         hx $$4 = this.dm();
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
   protected ic i(hx $$0) {
      for (ic $$1 : ic.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(hx $$0, ic $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         ic $$2 = $$1.g();
         if (!this.dM().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            elh $$3 = a($$2, 1.0F).a($$0).h(1.0E-6);
            return this.dM().a(this, $$3);
         }
      }
   }

   private boolean j(hx $$0) {
      dja $$1 = this.dM().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(cwl.bQ) && $$0.equals(this.dm());
         return !$$2;
      }
   }

   protected boolean w() {
      if (!this.fU() && this.bx()) {
         hx $$0 = this.dm();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            hx $$2 = $$0.b(aui.b(this.ag, -8, 8), aui.b(this.ag, -8, 8), aui.b(this.ag, -8, 8));
            if ($$2.v() > this.dM().J_() && this.dM().u($$2) && this.dM().D_().a($$2) && this.dM().a(this, new elh($$2).h(1.0E-6))) {
               ic $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ag();
                  this.a($$3);
                  this.a(arm.vZ, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dM().a(dnk.R, $$0, dnk.a.a(this));
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
   public boolean a(bkn $$0, float $$1) {
      if (this.gj()) {
         blp $$2 = $$0.c();
         if ($$2 instanceof cfh) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ev() < (double)this.eM() * 0.5 && this.ag.a(4) == 0) {
            this.w();
         } else if ($$0.a(asd.k)) {
            blp $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == blt.aI) {
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
      elm $$0 = this.dk();
      elh $$1 = this.cH();
      if (!this.gj() && this.w()) {
         int $$2 = this.dM().a(blt.aH, $$1.g(8.0), blp::bx).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dM().z.i() < $$3)) {
            ccp $$4 = blt.aH.a(this.dM());
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

   public ic A() {
      return this.an.b(b);
   }

   private void a(ic $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(agj<?> $$0) {
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
         this.a(bnl.a).b(bT.a());
         if ($$0 == 0) {
            this.a(bnl.a).c(bT);
            this.a(arm.vT, 1.0F, 1.0F);
            this.a(dnk.j);
         } else {
            this.a(arm.vX, 1.0F, 1.0F);
            this.a(dnk.k);
         }
      }

      this.an.b(c, (byte)$$0);
   }

   public float E(float $$0) {
      return aui.i($$0, this.cc, this.cd);
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return 0.5F;
   }

   @Override
   public void a(yy $$0) {
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
   public void g(blp $$0) {
   }

   public Optional<elm> F(float $$0) {
      if (this.ce != null && this.cf > 0) {
         double $$1 = (double)((float)this.cf - $$0) / 6.0;
         $$1 *= $$1;
         hx $$2 = this.dm();
         double $$3 = (double)($$2.u() - this.ce.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ce.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ce.w()) * $$1;
         return Optional.of(new elm(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   public void a(Optional<clf> $$0) {
      this.an.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<clf> ge() {
      return Optional.ofNullable(this.gf());
   }

   @Nullable
   public clf gf() {
      byte $$0 = this.an.b(d);
      return $$0 != 16 && $$0 <= 15 ? clf.a($$0) : null;
   }

   class a extends btb {
      private int b;

      public a() {
         this.a(EnumSet.of(btb.a.a, btb.a.b));
      }

      @Override
      public boolean a() {
         bmf $$0 = ccp.this.q();
         return $$0 != null && $$0.bx() ? ccp.this.dM().ak() != bjs.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         ccp.this.b(100);
      }

      @Override
      public void d() {
         ccp.this.b(0);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         if (ccp.this.dM().ak() != bjs.a) {
            this.b--;
            bmf $$0 = ccp.this.q();
            if ($$0 != null) {
               ccp.this.I().a($$0, 180.0F, 180.0F);
               double $$1 = ccp.this.f((blp)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + ccp.this.ag.a(10) * 20 / 2;
                     ccp.this.dM().b(new cfv(ccp.this.dM(), ccp.this, $$0, ccp.this.A().o()));
                     ccp.this.a(arm.vY, 2.0F, (ccp.this.ag.i() - ccp.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  ccp.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends brz {
      public b(bmh $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends buu<bmf> {
      public c(ccp $$0) {
         super($$0, bmf.class, 10, true, false, $$0x -> $$0x instanceof ccb);
      }

      @Override
      public boolean a() {
         return this.e.cg() == null ? false : super.a();
      }

      @Override
      protected elh a(double $$0) {
         ic $$1 = ((ccp)this.e).A();
         if ($$1.o() == ic.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ic.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bsd {
      public d(bmh $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ic $$0 = ccp.this.A().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(ccp.cb));
         jb $$2 = $$0.q();
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
            : Optional.of((float)(aui.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends buu<cfb> {
      public e(ccp $$0) {
         super($$0, cfb.class, true);
      }

      @Override
      public boolean a() {
         return ccp.this.dM().ak() == bjs.a ? false : super.a();
      }

      @Override
      protected elh a(double $$0) {
         ic $$1 = ((ccp)this.e).A();
         if ($$1.o() == ic.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ic.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends btb {
      private int b;

      @Override
      public boolean a() {
         return ccp.this.q() == null && ccp.this.ag.a(b(40)) == 0 && ccp.this.a(ccp.this.dm(), ccp.this.A());
      }

      @Override
      public boolean b() {
         return ccp.this.q() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + ccp.this.ag.a(3)));
         ccp.this.b(30);
      }

      @Override
      public void d() {
         if (ccp.this.q() == null) {
            ccp.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
