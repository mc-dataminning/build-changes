import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class clg extends cfx implements bvj<Optional<cuj>>, cks {
   private static final alc e = alc.b("covered");
   private static final bvp bY = new bvp(e, 20.0, bvp.a.a);
   protected static final akg<jj> b = akk.a(clg.class, aki.q);
   protected static final akg<Byte> c = akk.a(clg.class, aki.a);
   protected static final akg<Byte> d = akk.a(clg.class, aki.a);
   private static final int bZ = 6;
   private static final byte ca = 16;
   private static final byte cb = 16;
   private static final int cc = 8;
   private static final int cd = 8;
   private static final int ce = 5;
   private static final float cf = 0.05F;
   static final Vector3f cg = ad.a(() -> {
      ki $$0 = jj.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float ch = 3.0F;
   private float ci;
   private float cj;
   @Nullable
   private je ck;
   private int cl;
   private static final float cm = 1.0F;

   public clg(btv<? extends clg> $$0, deg $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bO = new clg.d(this);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbp(this, cnu.class, 8.0F, 0.02F, true));
      this.bS.a(4, new clg.a());
      this.bS.a(7, new clg.f());
      this.bS.a(8, new ccc(this));
      this.bT.a(1, new ccz(this, this.getClass()).a());
      this.bT.a(2, new clg.e(this));
      this.bT.a(3, new clg.c(this));
   }

   @Override
   protected bto.b bf() {
      return bto.b.a;
   }

   @Override
   public awf di() {
      return awf.f;
   }

   @Override
   protected awd w() {
      return awe.wM;
   }

   @Override
   public void U() {
      if (!this.gu()) {
         super.U();
      }
   }

   @Override
   protected awd n_() {
      return awe.wS;
   }

   @Override
   protected awd d(bsg $$0) {
      return this.gu() ? awe.wU : awe.wT;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, jj.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static bvq.a q() {
      return bum.E().a(bvr.s, 30.0);
   }

   @Override
   protected caf J() {
      return new clg.b(this);
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
         this.gr();
      }

      if (this.gs()) {
         this.gt();
      }

      if (this.dS().B) {
         if (this.cl > 0) {
            this.cl--;
         } else {
            this.ck = null;
         }
      }
   }

   private void gr() {
      jj $$0 = this.h(this.ds());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   @Override
   protected eyn aw() {
      float $$0 = L(this.cj);
      jj $$1 = this.y().g();
      float $$2 = this.dn() / 2.0F;
      return a(this.ef(), $$1, $$0).d(this.dx() - (double)$$2, this.dz(), this.dD() - (double)$$2);
   }

   private static float L(float $$0) {
      return 0.5F - azd.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gs() {
      this.ci = this.cj;
      float $$0 = (float)this.gw() * 0.01F;
      if (this.cj == $$0) {
         return false;
      } else {
         if (this.cj > $$0) {
            this.cj = azd.a(this.cj - 0.05F, $$0, 1.0F);
         } else {
            this.cj = azd.a(this.cj + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gt() {
      this.ax();
      float $$0 = L(this.cj);
      float $$1 = L(this.ci);
      jj $$2 = this.y().g();
      float $$3 = ($$0 - $$1) * this.ef();
      if (!($$3 <= 0.0F)) {
         for (bto $$5 : this.dS().a(this, a(this.ef(), $$2, $$1, $$0).d(this.dx() - 0.5, this.dz(), this.dD() - 0.5), btt.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof clg) && !$$5.ae) {
               $$5.a(buo.e, new eys((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static eyn a(float $$0, jj $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static eyn a(float $$0, jj $$1, float $$2, float $$3) {
      eyn $$4 = new eyn(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bto $$0, boolean $$1) {
      if (this.dS().w_()) {
         this.ck = null;
         this.cl = 0;
      }

      this.a(jj.a);
      return super.a($$0, $$1);
   }

   @Override
   public void af() {
      super.af();
      if (this.dS().B) {
         this.ck = this.ds();
      }

      this.aU = 0.0F;
      this.aT = 0.0F;
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      this.v(0.0F);
      this.aV = this.dI();
      this.by();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(buo $$0, eys $$1) {
      if ($$0 == buo.d) {
         this.t();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public eys dv() {
      return eys.c;
   }

   @Override
   public void h(eys $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      je $$3 = this.ds();
      if (this.bW()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azd.a($$0) + 0.5, (double)azd.a($$1 + 0.5), (double)azd.a($$2) + 0.5);
      }

      if (this.ag != 0) {
         je $$4 = this.ds();
         if (!$$4.equals($$3)) {
            this.am.a(c, (byte)0);
            this.as = true;
            if (this.dS().B && !this.bW() && !$$4.equals(this.ck)) {
               this.ck = $$3;
               this.cl = 6;
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
            eyn $$3 = a(this.ef(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dS().a(this, $$3);
         }
      }
   }

   private boolean i(je $$0) {
      duo $$1 = this.dS().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dhl.bQ) && $$0.equals(this.ds());
         return !$$2;
      }
   }

   protected boolean t() {
      if (!this.ge() && this.bI()) {
         je $$0 = this.ds();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            je $$2 = $$0.b(azd.b(this.af, -8, 8), azd.b(this.af, -8, 8), azd.b(this.af, -8, 8));
            if ($$2.v() > this.dS().G_() && this.dS().u($$2) && this.dS().A_().a($$2) && this.dS().a(this, new eyn($$2).h(1.0E-6))) {
               jj $$3 = this.h($$2);
               if ($$3 != null) {
                  this.am();
                  this.a($$3);
                  this.a(awe.wX, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dS().a(dzl.R, $$0, dzl.a.a(this));
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
      this.bn = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.gu()) {
         bto $$2 = $$0.c();
         if ($$2 instanceof cob) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eA() < (double)this.eQ() * 0.5 && this.af.a(4) == 0) {
            this.t();
         } else if ($$0.a(awv.j)) {
            bto $$3 = $$0.c();
            if ($$3 != null && $$3.ao() == btv.aL) {
               this.gv();
            }
         }

         return true;
      }
   }

   private boolean gu() {
      return this.gw() == 0;
   }

   private void gv() {
      eys $$0 = this.dq();
      eyn $$1 = this.cO();
      if (!this.gu() && this.t()) {
         int $$2 = this.dS().a(btv.aK, $$1.g(8.0), bto::bI).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dS().z.i() < $$3)) {
            clg $$4 = btv.aK.a(this.dS(), btu.e);
            if ($$4 != null) {
               $$4.a(this.gp());
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

   private int gw() {
      return this.am.a(c);
   }

   void b(int $$0) {
      if (!this.dS().B) {
         this.g(bvr.a).c(e);
         if ($$0 == 0) {
            this.g(bvr.a).d(bY);
            this.a(awe.wR, 1.0F, 1.0F);
            this.a(dzl.j);
         } else {
            this.a(awe.wV, 1.0F, 1.0F);
            this.a(dzl.k);
         }
      }

      this.am.a(c, (byte)$$0);
   }

   public float J(float $$0) {
      return azd.h($$0, this.ci, this.cj);
   }

   @Override
   public void a(aca $$0) {
      super.a($$0);
      this.aT = 0.0F;
      this.aU = 0.0F;
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
   public void h(bto $$0) {
   }

   @Nullable
   public eys K(float $$0) {
      if (this.ck != null && this.cl > 0) {
         double $$1 = (double)((float)this.cl - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.ef();
         je $$2 = this.ds();
         double $$3 = (double)($$2.u() - this.ck.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ck.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ck.w()) * $$1;
         return new eys(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cuj> $$0) {
      this.am.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cuj> gp() {
      return Optional.ofNullable(this.gq());
   }

   @Nullable
   public cuj gq() {
      byte $$0 = this.am.a(d);
      return $$0 != 16 && $$0 <= 15 ? cuj.a($$0) : null;
   }

   class a extends cbh {
      private int b;

      public a() {
         this.a(EnumSet.of(cbh.a.a, cbh.a.b));
      }

      @Override
      public boolean b() {
         buk $$0 = clg.this.m();
         return $$0 != null && $$0.bI() ? clg.this.dS().am() != brm.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         clg.this.b(100);
      }

      @Override
      public void e() {
         clg.this.b(0);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         if (clg.this.dS().am() != brm.a) {
            this.b--;
            buk $$0 = clg.this.m();
            if ($$0 != null) {
               clg.this.K().a($$0, 180.0F, 180.0F);
               double $$1 = clg.this.g((bto)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + clg.this.af.a(10) * 20 / 2;
                     clg.this.dS().b(new cor(clg.this.dS(), clg.this, $$0, clg.this.y().o()));
                     clg.this.a(awe.wW, 2.0F, (clg.this.af.i() - clg.this.af.i()) * 0.2F + 1.0F);
                  }
               } else {
                  clg.this.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends caf {
      public b(bum $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cda<buk> {
      public c(clg $$0) {
         super($$0, buk.class, 10, true, false, $$0x -> $$0x instanceof cks);
      }

      @Override
      public boolean b() {
         return this.e.co() == null ? false : super.b();
      }

      @Override
      protected eyn a(double $$0) {
         jj $$1 = ((clg)this.e).y();
         if ($$1.o() == jj.a.a) {
            return this.e.cO().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jj.a.c ? this.e.cO().c($$0, $$0, 4.0) : this.e.cO().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends caj {
      public d(final bum $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jj $$0 = clg.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(clg.cg));
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
            : Optional.of((float)(azd.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cda<cnu> {
      public e(final clg $$0) {
         super($$0, cnu.class, true);
      }

      @Override
      public boolean b() {
         return clg.this.dS().am() == brm.a ? false : super.b();
      }

      @Override
      protected eyn a(double $$0) {
         jj $$1 = ((clg)this.e).y();
         if ($$1.o() == jj.a.a) {
            return this.e.cO().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jj.a.c ? this.e.cO().c($$0, $$0, 4.0) : this.e.cO().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cbh {
      private int b;

      @Override
      public boolean b() {
         return clg.this.m() == null && clg.this.af.a(b(40)) == 0 && clg.this.a(clg.this.ds(), clg.this.y());
      }

      @Override
      public boolean c() {
         return clg.this.m() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + clg.this.af.a(3)));
         clg.this.b(30);
      }

      @Override
      public void e() {
         if (clg.this.m() == null) {
            clg.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
