import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cls extends cgj implements bvv<Optional<cuu>>, cle {
   private static final alh e = alh.b("covered");
   private static final bwb bY = new bwb(e, 20.0, bwb.a.a);
   protected static final akk<jl> b = ako.a(cls.class, akm.q);
   protected static final akk<Byte> c = ako.a(cls.class, akm.a);
   protected static final akk<Byte> d = ako.a(cls.class, akm.a);
   private static final int bZ = 6;
   private static final byte ca = 16;
   private static final byte cb = 16;
   private static final int cc = 8;
   private static final int cd = 8;
   private static final int ce = 5;
   private static final float cf = 0.05F;
   static final Vector3f cg = ad.a(() -> {
      kk $$0 = jl.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float ch = 3.0F;
   private float ci;
   private float cj;
   @Nullable
   private jg ck;
   private int cl;
   private static final float cm = 1.0F;

   public cls(bug<? extends cls> $$0, dev $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bO = new cls.d(this);
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccb(this, coh.class, 8.0F, 0.02F, true));
      this.bS.a(4, new cls.a());
      this.bS.a(7, new cls.f());
      this.bS.a(8, new cco(this));
      this.bT.a(1, new cdl(this, this.getClass()).a());
      this.bT.a(2, new cls.e(this));
      this.bT.a(3, new cls.c(this));
   }

   @Override
   protected btz.b bh() {
      return btz.b.a;
   }

   @Override
   public awl dn() {
      return awl.f;
   }

   @Override
   protected awj w() {
      return awk.wK;
   }

   @Override
   public void U() {
      if (!this.gA()) {
         super.U();
      }
   }

   @Override
   protected awj o_() {
      return awk.wQ;
   }

   @Override
   protected awj d(bsp $$0) {
      return this.gA() ? awk.wS : awk.wR;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, jl.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static bwc.a q() {
      return bux.E().a(bwd.s, 30.0);
   }

   @Override
   protected car J() {
      return new cls.b(this);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.a(jl.a($$0.f("AttachFace")));
      this.am.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.am.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.y().d());
      $$0.a("Peek", this.am.a(c));
      $$0.a("Color", this.am.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dX().C && !this.ca() && !this.a(this.dx(), this.y())) {
         this.gx();
      }

      if (this.gy()) {
         this.gz();
      }

      if (this.dX().C) {
         if (this.cl > 0) {
            this.cl--;
         } else {
            this.ck = null;
         }
      }
   }

   private void gx() {
      jl $$0 = this.h(this.dx());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   @Override
   protected ezc ay() {
      float $$0 = L(this.cj);
      jl $$1 = this.y().g();
      float $$2 = this.ds() / 2.0F;
      return a(this.el(), $$1, $$0).d(this.dC() - (double)$$2, this.dE(), this.dI() - (double)$$2);
   }

   private static float L(float $$0) {
      return 0.5F - azj.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gy() {
      this.ci = this.cj;
      float $$0 = (float)this.gC() * 0.01F;
      if (this.cj == $$0) {
         return false;
      } else {
         if (this.cj > $$0) {
            this.cj = azj.a(this.cj - 0.05F, $$0, 1.0F);
         } else {
            this.cj = azj.a(this.cj + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gz() {
      this.az();
      float $$0 = L(this.cj);
      float $$1 = L(this.ci);
      jl $$2 = this.y().g();
      float $$3 = ($$0 - $$1) * this.el();
      if (!($$3 <= 0.0F)) {
         for (btz $$5 : this.dX().a(this, a(this.el(), $$2, $$1, $$0).d(this.dC() - 0.5, this.dE(), this.dI() - 0.5), bue.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof cls) && !$$5.ae) {
               $$5.a(buz.e, new ezh((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ezc a(float $$0, jl $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static ezc a(float $$0, jl $$1, float $$2, float $$3) {
      ezc $$4 = new ezc(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(btz $$0, boolean $$1) {
      if (this.dX().y_()) {
         this.ck = null;
         this.cl = 0;
      }

      this.a(jl.a);
      return super.a($$0, $$1);
   }

   @Override
   public void af() {
      super.af();
      if (this.dX().C) {
         this.ck = this.dx();
      }

      this.aV = 0.0F;
      this.aU = 0.0F;
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      this.v(0.0F);
      this.aW = this.dN();
      this.bA();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(buz $$0, ezh $$1) {
      if ($$0 == buz.d) {
         this.t();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ezh dA() {
      return ezh.c;
   }

   @Override
   public void h(ezh $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      jg $$3 = this.dx();
      if (this.ca()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azj.a($$0) + 0.5, (double)azj.a($$1 + 0.5), (double)azj.a($$2) + 0.5);
      }

      if (this.ag != 0) {
         jg $$4 = this.dx();
         if (!$$4.equals($$3)) {
            this.am.a(c, (byte)0);
            this.as = true;
            if (this.dX().C && !this.ca() && !$$4.equals(this.ck)) {
               this.ck = $$3;
               this.cl = 6;
               this.ab = this.dC();
               this.ac = this.dE();
               this.ad = this.dI();
            }
         }
      }
   }

   @Nullable
   protected jl h(jg $$0) {
      for (jl $$1 : jl.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(jg $$0, jl $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         jl $$2 = $$1.g();
         if (!this.dX().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ezc $$3 = a(this.el(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dX().a(this, $$3);
         }
      }
   }

   private boolean i(jg $$0) {
      dvd $$1 = this.dX().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dia.bQ) && $$0.equals(this.dx());
         return !$$2;
      }
   }

   protected boolean t() {
      if (!this.gi() && this.bM()) {
         jg $$0 = this.dx();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            jg $$2 = $$0.b(azj.b(this.af, -8, 8), azj.b(this.af, -8, 8), azj.b(this.af, -8, 8));
            if ($$2.v() > this.dX().I_() && this.dX().u($$2) && this.dX().C_().a($$2) && this.dX().a(this, new ezc($$2).h(1.0E-6))) {
               jl $$3 = this.h($$2);
               if ($$3 != null) {
                  this.ao();
                  this.a($$3);
                  this.a(awk.wV, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dX().a(eaa.R, $$0, eaa.a.a(this));
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
   public boolean a(bsp $$0, float $$1) {
      if (this.gA()) {
         btz $$2 = $$0.c();
         if ($$2 instanceof cop) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eG() < (double)this.eV() * 0.5 && this.af.a(4) == 0) {
            this.t();
         } else if ($$0.a(axb.j)) {
            btz $$3 = $$0.c();
            if ($$3 != null && $$3.aq() == bug.aL) {
               this.gB();
            }
         }

         return true;
      }
   }

   private boolean gA() {
      return this.gC() == 0;
   }

   private void gB() {
      ezh $$0 = this.dv();
      ezc $$1 = this.cS();
      if (!this.gA() && this.t()) {
         int $$2 = this.dX().a(bug.aK, $$1.g(8.0), btz::bM).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dX().A.i() < $$3)) {
            cls $$4 = bug.aK.a(this.dX(), buf.e);
            if ($$4 != null) {
               $$4.b(this.gv());
               $$4.e($$0);
               this.dX().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bO() {
      return this.bM();
   }

   public jl y() {
      return this.am.a(b);
   }

   private void a(jl $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void a(akk<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.ay());
      }

      super.a($$0);
   }

   private int gC() {
      return this.am.a(c);
   }

   void b(int $$0) {
      if (!this.dX().C) {
         this.g(bwd.a).c(e);
         if ($$0 == 0) {
            this.g(bwd.a).d(bY);
            this.a(awk.wP, 1.0F, 1.0F);
            this.a(eaa.j);
         } else {
            this.a(awk.wT, 1.0F, 1.0F);
            this.a(eaa.k);
         }
      }

      this.am.a(c, (byte)$$0);
   }

   public float J(float $$0) {
      return azj.h($$0, this.ci, this.cj);
   }

   @Override
   public void a(ace $$0) {
      super.a($$0);
      this.aU = 0.0F;
      this.aV = 0.0F;
   }

   @Override
   public int ad() {
      return 180;
   }

   @Override
   public int ae() {
      return 180;
   }

   @Override
   public void h(btz $$0) {
   }

   @Nullable
   public ezh K(float $$0) {
      if (this.ck != null && this.cl > 0) {
         double $$1 = (double)((float)this.cl - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.el();
         jg $$2 = this.dx();
         double $$3 = (double)($$2.u() - this.ck.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ck.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ck.w()) * $$1;
         return new ezh(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void b(Optional<cuu> $$0) {
      this.am.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cuu> gv() {
      return Optional.ofNullable(this.gw());
   }

   @Nullable
   public cuu gw() {
      byte $$0 = this.am.a(d);
      return $$0 != 16 && $$0 <= 15 ? cuu.a($$0) : null;
   }

   class a extends cbt {
      private int b;

      public a() {
         this.a(EnumSet.of(cbt.a.a, cbt.a.b));
      }

      @Override
      public boolean b() {
         buv $$0 = cls.this.m();
         return $$0 != null && $$0.bM() ? cls.this.dX().am() != brv.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         cls.this.b(100);
      }

      @Override
      public void e() {
         cls.this.b(0);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cls.this.dX().am() != brv.a) {
            this.b--;
            buv $$0 = cls.this.m();
            if ($$0 != null) {
               cls.this.K().a($$0, 180.0F, 180.0F);
               double $$1 = cls.this.g((btz)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cls.this.af.a(10) * 20 / 2;
                     cls.this.dX().b(new cpe(cls.this.dX(), cls.this, $$0, cls.this.y().o()));
                     cls.this.a(awk.wU, 2.0F, (cls.this.af.i() - cls.this.af.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cls.this.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends car {
      public b(bux $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cdm<buv> {
      public c(cls $$0) {
         super($$0, buv.class, 10, true, false, $$0x -> $$0x instanceof cle);
      }

      @Override
      public boolean b() {
         return this.e.cs() == null ? false : super.b();
      }

      @Override
      protected ezc a(double $$0) {
         jl $$1 = ((cls)this.e).y();
         if ($$1.o() == jl.a.a) {
            return this.e.cS().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jl.a.c ? this.e.cS().c($$0, $$0, 4.0) : this.e.cS().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cav {
      public d(final bux $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jl $$0 = cls.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cls.cg));
         kk $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dC();
         double $$5 = this.f - this.a.dG();
         double $$6 = this.g - this.a.dI();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(azj.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cdm<coh> {
      public e(final cls $$0) {
         super($$0, coh.class, true);
      }

      @Override
      public boolean b() {
         return cls.this.dX().am() == brv.a ? false : super.b();
      }

      @Override
      protected ezc a(double $$0) {
         jl $$1 = ((cls)this.e).y();
         if ($$1.o() == jl.a.a) {
            return this.e.cS().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jl.a.c ? this.e.cS().c($$0, $$0, 4.0) : this.e.cS().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cbt {
      private int b;

      @Override
      public boolean b() {
         return cls.this.m() == null && cls.this.af.a(b(40)) == 0 && cls.this.a(cls.this.dx(), cls.this.y());
      }

      @Override
      public boolean c() {
         return cls.this.m() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + cls.this.af.a(3)));
         cls.this.b(30);
      }

      @Override
      public void e() {
         if (cls.this.m() == null) {
            cls.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
