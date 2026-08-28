import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class clb extends cfs implements bve<Optional<cue>>, ckn {
   private static final alb e = alb.b("covered");
   private static final bvk bZ = new bvk(e, 20.0, bvk.a.a);
   protected static final akg<jj> b = akk.a(clb.class, aki.q);
   protected static final akg<Byte> c = akk.a(clb.class, aki.a);
   protected static final akg<Byte> d = akk.a(clb.class, aki.a);
   private static final int ca = 6;
   private static final byte cb = 16;
   private static final byte cc = 16;
   private static final int cd = 8;
   private static final int ce = 8;
   private static final int cf = 5;
   private static final float cg = 0.05F;
   static final Vector3f ch = ad.a(() -> {
      ki $$0 = jj.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float ci = 3.0F;
   private float cj;
   private float ck;
   @Nullable
   private je cl;
   private int cm;
   private static final float cn = 1.0F;

   public clb(btq<? extends clb> $$0, dds $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.bP = new clb.d(this);
   }

   @Override
   protected void D() {
      this.bT.a(1, new cbk(this, cnp.class, 8.0F, 0.02F, true));
      this.bT.a(4, new clb.a());
      this.bT.a(7, new clb.f());
      this.bT.a(8, new cbx(this));
      this.bU.a(1, new ccu(this, this.getClass()).a());
      this.bU.a(2, new clb.e(this));
      this.bU.a(3, new clb.c(this));
   }

   @Override
   protected btj.b bf() {
      return btj.b.a;
   }

   @Override
   public awe di() {
      return awe.f;
   }

   @Override
   protected awc w() {
      return awd.wM;
   }

   @Override
   public void U() {
      if (!this.gt()) {
         super.U();
      }
   }

   @Override
   protected awc n_() {
      return awd.wS;
   }

   @Override
   protected awc d(bsb $$0) {
      return this.gt() ? awd.wU : awd.wT;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, jj.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static bvl.a q() {
      return buh.E().a(bvm.s, 30.0);
   }

   @Override
   protected caa J() {
      return new clb.b(this);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(jj.a($$0.f("AttachFace")));
      this.am.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.am.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.y().d());
      $$0.a("Peek", this.am.a(c));
      $$0.a("Color", this.am.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dS().B && !this.bW() && !this.a(this.ds(), this.y())) {
         this.gq();
      }

      if (this.gr()) {
         this.gs();
      }

      if (this.dS().B) {
         if (this.cm > 0) {
            this.cm--;
         } else {
            this.cl = null;
         }
      }
   }

   private void gq() {
      jj $$0 = this.h(this.ds());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   @Override
   protected exz aw() {
      float $$0 = L(this.ck);
      jj $$1 = this.y().g();
      float $$2 = this.dn() / 2.0F;
      return a(this.ef(), $$1, $$0).d(this.dx() - (double)$$2, this.dz(), this.dD() - (double)$$2);
   }

   private static float L(float $$0) {
      return 0.5F - azc.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gr() {
      this.cj = this.ck;
      float $$0 = (float)this.gv() * 0.01F;
      if (this.ck == $$0) {
         return false;
      } else {
         if (this.ck > $$0) {
            this.ck = azc.a(this.ck - 0.05F, $$0, 1.0F);
         } else {
            this.ck = azc.a(this.ck + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gs() {
      this.ax();
      float $$0 = L(this.ck);
      float $$1 = L(this.cj);
      jj $$2 = this.y().g();
      float $$3 = ($$0 - $$1) * this.ef();
      if (!($$3 <= 0.0F)) {
         for (btj $$5 : this.dS().a(this, a(this.ef(), $$2, $$1, $$0).d(this.dx() - 0.5, this.dz(), this.dD() - 0.5), bto.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof clb) && !$$5.ae) {
               $$5.a(buj.e, new eye((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static exz a(float $$0, jj $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static exz a(float $$0, jj $$1, float $$2, float $$3) {
      exz $$4 = new exz(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(btj $$0, boolean $$1) {
      if (this.dS().w_()) {
         this.cl = null;
         this.cm = 0;
      }

      this.a(jj.a);
      return super.a($$0, $$1);
   }

   @Override
   public void af() {
      super.af();
      if (this.dS().B) {
         this.cl = this.ds();
      }

      this.aV = 0.0F;
      this.aU = 0.0F;
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      this.v(0.0F);
      this.aW = this.dI();
      this.by();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(buj $$0, eye $$1) {
      if ($$0 == buj.d) {
         this.t();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public eye dv() {
      return eye.c;
   }

   @Override
   public void h(eye $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      je $$3 = this.ds();
      if (this.bW()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azc.a($$0) + 0.5, (double)azc.a($$1 + 0.5), (double)azc.a($$2) + 0.5);
      }

      if (this.ag != 0) {
         je $$4 = this.ds();
         if (!$$4.equals($$3)) {
            this.am.a(c, (byte)0);
            this.as = true;
            if (this.dS().B && !this.bW() && !$$4.equals(this.cl)) {
               this.cl = $$3;
               this.cm = 6;
               this.ab = this.dx();
               this.ac = this.dz();
               this.ad = this.dD();
            }
         }
      }
   }

   @Nullable
   protected jj h(je $$0) {
      for (jj $$1 : jj.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(je $$0, jj $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         jj $$2 = $$1.g();
         if (!this.dS().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            exz $$3 = a(this.ef(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dS().a(this, $$3);
         }
      }
   }

   private boolean i(je $$0) {
      dua $$1 = this.dS().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dgx.bQ) && $$0.equals(this.ds());
         return !$$2;
      }
   }

   protected boolean t() {
      if (!this.gd() && this.bI()) {
         je $$0 = this.ds();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            je $$2 = $$0.b(azc.b(this.af, -8, 8), azc.b(this.af, -8, 8), azc.b(this.af, -8, 8));
            if ($$2.v() > this.dS().G_() && this.dS().u($$2) && this.dS().A_().a($$2) && this.dS().a(this, new exz($$2).h(1.0E-6))) {
               jj $$3 = this.h($$2);
               if ($$3 != null) {
                  this.am();
                  this.a($$3);
                  this.a(awd.wX, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dS().a(dyx.R, $$0, dyx.a.a(this));
                  this.am.a(c, (byte)0);
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
      this.bo = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.gt()) {
         btj $$2 = $$0.c();
         if ($$2 instanceof cnw) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eA() < (double)this.eQ() * 0.5 && this.af.a(4) == 0) {
            this.t();
         } else if ($$0.a(awu.j)) {
            btj $$3 = $$0.c();
            if ($$3 != null && $$3.ao() == btq.aL) {
               this.gu();
            }
         }

         return true;
      }
   }

   private boolean gt() {
      return this.gv() == 0;
   }

   private void gu() {
      eye $$0 = this.dq();
      exz $$1 = this.cO();
      if (!this.gt() && this.t()) {
         int $$2 = this.dS().a(btq.aK, $$1.g(8.0), btj::bI).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dS().z.i() < $$3)) {
            clb $$4 = btq.aK.a(this.dS(), btp.e);
            if ($$4 != null) {
               $$4.a(this.go());
               $$4.e($$0);
               this.dS().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bK() {
      return this.bI();
   }

   public jj y() {
      return this.am.a(b);
   }

   private void a(jj $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void a(akg<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.aw());
      }

      super.a($$0);
   }

   private int gv() {
      return this.am.a(c);
   }

   void b(int $$0) {
      if (!this.dS().B) {
         this.g(bvm.a).c(e);
         if ($$0 == 0) {
            this.g(bvm.a).d(bZ);
            this.a(awd.wR, 1.0F, 1.0F);
            this.a(dyx.j);
         } else {
            this.a(awd.wV, 1.0F, 1.0F);
            this.a(dyx.k);
         }
      }

      this.am.a(c, (byte)$$0);
   }

   public float J(float $$0) {
      return azc.h($$0, this.cj, this.ck);
   }

   @Override
   public void a(aca $$0) {
      super.a($$0);
      this.aU = 0.0F;
      this.aV = 0.0F;
   }

   @Override
   public int ae() {
      return 180;
   }

   @Override
   public int ag() {
      return 180;
   }

   @Override
   public void h(btj $$0) {
   }

   @Nullable
   public eye K(float $$0) {
      if (this.cl != null && this.cm > 0) {
         double $$1 = (double)((float)this.cm - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.ef();
         je $$2 = this.ds();
         double $$3 = (double)($$2.u() - this.cl.u()) * $$1;
         double $$4 = (double)($$2.v() - this.cl.v()) * $$1;
         double $$5 = (double)($$2.w() - this.cl.w()) * $$1;
         return new eye(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cue> $$0) {
      this.am.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cue> go() {
      return Optional.ofNullable(this.gp());
   }

   @Nullable
   public cue gp() {
      byte $$0 = this.am.a(d);
      return $$0 != 16 && $$0 <= 15 ? cue.a($$0) : null;
   }

   class a extends cbc {
      private int b;

      public a() {
         this.a(EnumSet.of(cbc.a.a, cbc.a.b));
      }

      @Override
      public boolean b() {
         buf $$0 = clb.this.m();
         return $$0 != null && $$0.bI() ? clb.this.dS().am() != brh.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         clb.this.b(100);
      }

      @Override
      public void e() {
         clb.this.b(0);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         if (clb.this.dS().am() != brh.a) {
            this.b--;
            buf $$0 = clb.this.m();
            if ($$0 != null) {
               clb.this.K().a($$0, 180.0F, 180.0F);
               double $$1 = clb.this.g((btj)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + clb.this.af.a(10) * 20 / 2;
                     clb.this.dS().b(new col(clb.this.dS(), clb.this, $$0, clb.this.y().o()));
                     clb.this.a(awd.wW, 2.0F, (clb.this.af.i() - clb.this.af.i()) * 0.2F + 1.0F);
                  }
               } else {
                  clb.this.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends caa {
      public b(buh $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends ccv<buf> {
      public c(clb $$0) {
         super($$0, buf.class, 10, true, false, $$0x -> $$0x instanceof ckn);
      }

      @Override
      public boolean b() {
         return this.e.co() == null ? false : super.b();
      }

      @Override
      protected exz a(double $$0) {
         jj $$1 = ((clb)this.e).y();
         if ($$1.o() == jj.a.a) {
            return this.e.cO().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jj.a.c ? this.e.cO().c($$0, $$0, 4.0) : this.e.cO().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cae {
      public d(final buh $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jj $$0 = clb.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(clb.ch));
         ki $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dx();
         double $$5 = this.f - this.a.dB();
         double $$6 = this.g - this.a.dD();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(azc.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends ccv<cnp> {
      public e(final clb $$0) {
         super($$0, cnp.class, true);
      }

      @Override
      public boolean b() {
         return clb.this.dS().am() == brh.a ? false : super.b();
      }

      @Override
      protected exz a(double $$0) {
         jj $$1 = ((clb)this.e).y();
         if ($$1.o() == jj.a.a) {
            return this.e.cO().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jj.a.c ? this.e.cO().c($$0, $$0, 4.0) : this.e.cO().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cbc {
      private int b;

      @Override
      public boolean b() {
         return clb.this.m() == null && clb.this.af.a(b(40)) == 0 && clb.this.a(clb.this.ds(), clb.this.y());
      }

      @Override
      public boolean c() {
         return clb.this.m() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + clb.this.af.a(3)));
         clb.this.b(30);
      }

      @Override
      public void e() {
         if (clb.this.m() == null) {
            clb.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
