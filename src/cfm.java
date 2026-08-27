import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cfm extends cak implements bpw<Optional<cog>>, cey {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bqc bV = new bqc(e, "Covered armor bonus", 20.0, bqc.a.a);
   protected static final aii<ih> b = ail.a(cfm.class, aik.p);
   protected static final aii<Byte> c = ail.a(cfm.class, aik.a);
   protected static final aii<Byte> d = ail.a(cfm.class, aik.a);
   private static final int bW = 6;
   private static final byte bX = 16;
   private static final byte bY = 16;
   private static final int bZ = 8;
   private static final int ca = 8;
   private static final int cb = 5;
   private static final float cc = 0.05F;
   static final Vector3f cd = ac.a(() -> {
      jf $$0 = ih.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float ce = 3.0F;
   private float cf;
   private float cg;
   @Nullable
   private ib ch;
   private int ci;
   private static final float cj = 1.0F;

   public cfm(bol<? extends cfm> $$0, cwe $$1) {
      super($$0, $$1);
      this.bK = 5;
      this.bL = new cfm.d(this);
   }

   @Override
   protected void B() {
      this.bP.a(1, new bwc(this, cia.class, 8.0F, 0.02F, true));
      this.bP.a(4, new cfm.a());
      this.bP.a(7, new cfm.f());
      this.bP.a(8, new bwp(this));
      this.bQ.a(1, new bxm(this, this.getClass()).a());
      this.bQ.a(2, new cfm.e(this));
      this.bQ.a(3, new cfm.c(this));
   }

   @Override
   protected bof.b aW() {
      return bof.b.a;
   }

   @Override
   public atq cY() {
      return atq.f;
   }

   @Override
   protected ato y() {
      return atp.we;
   }

   @Override
   public void R() {
      if (!this.gq()) {
         super.R();
      }
   }

   @Override
   protected ato n_() {
      return atp.wk;
   }

   @Override
   protected ato d(bne $$0) {
      return this.gq() ? atp.wm : atp.wl;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, ih.a);
      this.am.a(c, (byte)0);
      this.am.a(d, (byte)16);
   }

   public static bqd.a u() {
      return boz.C().a(bqe.n, 30.0);
   }

   @Override
   protected bus H() {
      return new cfm.b(this);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.a(ih.a($$0.f("AttachFace")));
      this.am.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.am.b(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.A().d());
      $$0.a("Peek", this.am.b(c));
      $$0.a("Color", this.am.b(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dJ().B && !this.bL() && !this.a(this.dj(), this.A())) {
         this.gn();
      }

      if (this.go()) {
         this.gp();
      }

      if (this.dJ().B) {
         if (this.ci > 0) {
            this.ci--;
         } else {
            this.ch = null;
         }
      }
   }

   private void gn() {
      ih $$0 = this.i(this.dj());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.w();
      }
   }

   @Override
   protected eoq aq() {
      float $$0 = G(this.cg);
      ih $$1 = this.A().g();
      float $$2 = this.dd() / 2.0F;
      return a(this.dY(), $$1, $$0).d(this.do() - (double)$$2, this.dq(), this.du() - (double)$$2);
   }

   private static float G(float $$0) {
      return 0.5F - awm.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean go() {
      this.cf = this.cg;
      float $$0 = (float)this.gs() * 0.01F;
      if (this.cg == $$0) {
         return false;
      } else {
         if (this.cg > $$0) {
            this.cg = awm.a(this.cg - 0.05F, $$0, 1.0F);
         } else {
            this.cg = awm.a(this.cg + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gp() {
      this.ar();
      float $$0 = G(this.cg);
      float $$1 = G(this.cf);
      ih $$2 = this.A().g();
      float $$3 = ($$0 - $$1) * this.dY();
      if (!($$3 <= 0.0F)) {
         for (bof $$5 : this.dJ().a(this, a(this.dY(), $$2, $$1, $$0).d(this.do() - 0.5, this.dq(), this.du() - 0.5), bok.f.and($$0x -> !$$0x.x(this)))) {
            if (!($$5 instanceof cfm) && !$$5.ae) {
               $$5.a(bpc.e, new eov((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static eoq a(float $$0, ih $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static eoq a(float $$0, ih $$1, float $$2, float $$3) {
      eoq $$4 = new eoq(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bof $$0, boolean $$1) {
      if (this.dJ().y_()) {
         this.ch = null;
         this.ci = 0;
      }

      this.a(ih.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ac() {
      super.ac();
      if (this.dJ().B) {
         this.ch = this.dj();
      }

      this.aW = 0.0F;
      this.aV = 0.0F;
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      this.r(0.0F);
      this.aX = this.dz();
      this.bp();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bpc $$0, eov $$1) {
      if ($$0 == bpc.d) {
         this.w();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public eov dm() {
      return eov.b;
   }

   @Override
   public void g(eov $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      ib $$3 = this.dj();
      if (this.bL()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)awm.a($$0) + 0.5, (double)awm.a($$1 + 0.5), (double)awm.a($$2) + 0.5);
      }

      if (this.ag != 0) {
         ib $$4 = this.dj();
         if (!$$4.equals($$3)) {
            this.am.b(c, (byte)0);
            this.at = true;
            if (this.dJ().B && !this.bL() && !$$4.equals(this.ch)) {
               this.ch = $$3;
               this.ci = 6;
               this.ab = this.do();
               this.ac = this.dq();
               this.ad = this.du();
            }
         }
      }
   }

   @Nullable
   protected ih i(ib $$0) {
      for (ih $$1 : ih.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(ib $$0, ih $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         ih $$2 = $$1.g();
         if (!this.dJ().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            eoq $$3 = a(this.dY(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dJ().a(this, $$3);
         }
      }
   }

   private boolean j(ib $$0) {
      dme $$1 = this.dJ().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(czh.bQ) && $$0.equals(this.dj());
         return !$$2;
      }
   }

   protected boolean w() {
      if (!this.gb() && this.bx()) {
         ib $$0 = this.dj();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            ib $$2 = $$0.b(awm.b(this.af, -8, 8), awm.b(this.af, -8, 8), awm.b(this.af, -8, 8));
            if ($$2.v() > this.dJ().J_() && this.dJ().u($$2) && this.dJ().D_().a($$2) && this.dJ().a(this, new eoq($$2).h(1.0E-6))) {
               ih $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ag();
                  this.a($$3);
                  this.a(atp.wp, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dJ().a(dqr.R, $$0, dqr.a.a(this));
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
      this.bo = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.gq()) {
         bof $$2 = $$0.c();
         if ($$2 instanceof cig) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eu() < (double)this.eL() * 0.5 && this.af.a(4) == 0) {
            this.w();
         } else if ($$0.a(aug.k)) {
            bof $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bol.aJ) {
               this.gr();
            }
         }

         return true;
      }
   }

   private boolean gq() {
      return this.gs() == 0;
   }

   private void gr() {
      eov $$0 = this.dh();
      eoq $$1 = this.cE();
      if (!this.gq() && this.w()) {
         int $$2 = this.dJ().a(bol.aI, $$1.g(8.0), bof::bx).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dJ().z.i() < $$3)) {
            cfm $$4 = bol.aI.a(this.dJ());
            if ($$4 != null) {
               $$4.a(this.gl());
               $$4.e($$0);
               this.dJ().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bz() {
      return this.bx();
   }

   public ih A() {
      return this.am.b(b);
   }

   private void a(ih $$0) {
      this.am.b(b, $$0);
   }

   @Override
   public void a(aii<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.aq());
      }

      super.a($$0);
   }

   private int gs() {
      return this.am.b(c);
   }

   void b(int $$0) {
      if (!this.dJ().B) {
         this.f(bqe.a).b(bV.a());
         if ($$0 == 0) {
            this.f(bqe.a).d(bV);
            this.a(atp.wj, 1.0F, 1.0F);
            this.b(dqr.j);
         } else {
            this.a(atp.wn, 1.0F, 1.0F);
            this.b(dqr.k);
         }
      }

      this.am.b(c, (byte)$$0);
   }

   public float E(float $$0) {
      return awm.i($$0, this.cf, this.cg);
   }

   @Override
   public void a(aaj $$0) {
      super.a($$0);
      this.aV = 0.0F;
      this.aW = 0.0F;
   }

   @Override
   public int ab() {
      return 180;
   }

   @Override
   public int fJ() {
      return 180;
   }

   @Override
   public void g(bof $$0) {
   }

   public Optional<eov> F(float $$0) {
      if (this.ch != null && this.ci > 0) {
         double $$1 = (double)((float)this.ci - $$0) / 6.0;
         $$1 *= $$1;
         ib $$2 = this.dj();
         double $$3 = (double)($$2.u() - this.ch.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ch.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ch.w()) * $$1;
         return Optional.of(new eov(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cog> $$0) {
      this.am.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cog> gl() {
      return Optional.ofNullable(this.gm());
   }

   @Nullable
   public cog gm() {
      byte $$0 = this.am.b(d);
      return $$0 != 16 && $$0 <= 15 ? cog.a($$0) : null;
   }

   class a extends bvu {
      private int b;

      public a() {
         this.a(EnumSet.of(bvu.a.a, bvu.a.b));
      }

      @Override
      public boolean a() {
         box $$0 = cfm.this.q();
         return $$0 != null && $$0.bx() ? cfm.this.dJ().aj() != bmi.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         cfm.this.b(100);
      }

      @Override
      public void d() {
         cfm.this.b(0);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         if (cfm.this.dJ().aj() != bmi.a) {
            this.b--;
            box $$0 = cfm.this.q();
            if ($$0 != null) {
               cfm.this.I().a($$0, 180.0F, 180.0F);
               double $$1 = cfm.this.f((bof)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cfm.this.af.a(10) * 20 / 2;
                     cfm.this.dJ().b(new civ(cfm.this.dJ(), cfm.this, $$0, cfm.this.A().o()));
                     cfm.this.a(atp.wo, 2.0F, (cfm.this.af.i() - cfm.this.af.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cfm.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bus {
      public b(boz $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends bxn<box> {
      public c(cfm $$0) {
         super($$0, box.class, 10, true, false, $$0x -> $$0x instanceof cey);
      }

      @Override
      public boolean a() {
         return this.e.cd() == null ? false : super.a();
      }

      @Override
      protected eoq a(double $$0) {
         ih $$1 = ((cfm)this.e).A();
         if ($$1.o() == ih.a.a) {
            return this.e.cE().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ih.a.c ? this.e.cE().c($$0, $$0, 4.0) : this.e.cE().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends buw {
      public d(boz $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ih $$0 = cfm.this.A().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cfm.cd));
         jf $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.do();
         double $$5 = this.f - this.a.ds();
         double $$6 = this.g - this.a.du();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(awm.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends bxn<cia> {
      public e(cfm $$0) {
         super($$0, cia.class, true);
      }

      @Override
      public boolean a() {
         return cfm.this.dJ().aj() == bmi.a ? false : super.a();
      }

      @Override
      protected eoq a(double $$0) {
         ih $$1 = ((cfm)this.e).A();
         if ($$1.o() == ih.a.a) {
            return this.e.cE().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ih.a.c ? this.e.cE().c($$0, $$0, 4.0) : this.e.cE().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bvu {
      private int b;

      @Override
      public boolean a() {
         return cfm.this.q() == null && cfm.this.af.a(b(40)) == 0 && cfm.this.a(cfm.this.dj(), cfm.this.A());
      }

      @Override
      public boolean b() {
         return cfm.this.q() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + cfm.this.af.a(3)));
         cfm.this.b(30);
      }

      @Override
      public void d() {
         if (cfm.this.q() == null) {
            cfm.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
