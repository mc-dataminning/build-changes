import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cjw extends cep implements bub<Optional<csv>>, cji {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final buh ca = new buh(e, "Covered armor bonus", 20.0, buh.a.a);
   protected static final ajp<jf> b = ajt.a(cjw.class, ajr.q);
   protected static final ajp<Byte> c = ajt.a(cjw.class, ajr.a);
   protected static final ajp<Byte> d = ajt.a(cjw.class, ajr.a);
   private static final int cb = 6;
   private static final byte cc = 16;
   private static final byte cd = 16;
   private static final int ce = 8;
   private static final int cf = 8;
   private static final int cg = 5;
   private static final float ch = 0.05F;
   static final Vector3f ci = ac.a(() -> {
      ke $$0 = jf.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float cj = 3.0F;
   private float ck;
   private float cl;
   @Nullable
   private ja cm;
   private int cn;
   private static final float co = 1.0F;

   public cjw(bsm<? extends cjw> $$0, dcf $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.bQ = new cjw.d(this);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cah(this, cmk.class, 8.0F, 0.02F, true));
      this.bU.a(4, new cjw.a());
      this.bU.a(7, new cjw.f());
      this.bU.a(8, new cau(this));
      this.bV.a(1, new cbr(this, this.getClass()).a());
      this.bV.a(2, new cjw.e(this));
      this.bV.a(3, new cjw.c(this));
   }

   @Override
   protected bsg.b bc() {
      return bsg.b.a;
   }

   @Override
   public avi df() {
      return avi.f;
   }

   @Override
   protected avg v() {
      return avh.wL;
   }

   @Override
   public void Q() {
      if (!this.gt()) {
         super.Q();
      }
   }

   @Override
   protected avg o_() {
      return avh.wR;
   }

   @Override
   protected avg d(bqz $$0) {
      return this.gt() ? avh.wT : avh.wS;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, jf.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static bui.a s() {
      return btd.A().a(buj.s, 30.0);
   }

   @Override
   protected byx E() {
      return new cjw.b(this);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(jf.a($$0.f("AttachFace")));
      this.ao.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.ao.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.y().d());
      $$0.a("Peek", this.ao.a(c));
      $$0.a("Color", this.ao.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dQ().B && !this.bS() && !this.a(this.dq(), this.y())) {
         this.gq();
      }

      if (this.gr()) {
         this.gs();
      }

      if (this.dQ().B) {
         if (this.cn > 0) {
            this.cn--;
         } else {
            this.cm = null;
         }
      }
   }

   private void gq() {
      jf $$0 = this.h(this.dq());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.u();
      }
   }

   @Override
   protected ewa at() {
      float $$0 = J(this.cl);
      jf $$1 = this.y().g();
      float $$2 = this.dk() / 2.0F;
      return a(this.ec(), $$1, $$0).d(this.dv() - (double)$$2, this.dx(), this.dB() - (double)$$2);
   }

   private static float J(float $$0) {
      return 0.5F - ayg.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gr() {
      this.ck = this.cl;
      float $$0 = (float)this.gv() * 0.01F;
      if (this.cl == $$0) {
         return false;
      } else {
         if (this.cl > $$0) {
            this.cl = ayg.a(this.cl - 0.05F, $$0, 1.0F);
         } else {
            this.cl = ayg.a(this.cl + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gs() {
      this.au();
      float $$0 = J(this.cl);
      float $$1 = J(this.ck);
      jf $$2 = this.y().g();
      float $$3 = ($$0 - $$1) * this.ec();
      if (!($$3 <= 0.0F)) {
         for (bsg $$5 : this.dQ().a(this, a(this.ec(), $$2, $$1, $$0).d(this.dv() - 0.5, this.dx(), this.dB() - 0.5), bsl.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof cjw) && !$$5.ag) {
               $$5.a(btg.e, new ewf((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ewa a(float $$0, jf $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static ewa a(float $$0, jf $$1, float $$2, float $$3) {
      ewa $$4 = new ewa(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bsg $$0, boolean $$1) {
      if (this.dQ().x_()) {
         this.cm = null;
         this.cn = 0;
      }

      this.a(jf.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ac() {
      super.ac();
      if (this.dQ().B) {
         this.cm = this.dq();
      }

      this.aZ = 0.0F;
      this.aY = 0.0F;
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      this.s(0.0F);
      this.ba = this.dG();
      this.bv();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(btg $$0, ewf $$1) {
      if ($$0 == btg.d) {
         this.u();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ewf dt() {
      return ewf.b;
   }

   @Override
   public void i(ewf $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      ja $$3 = this.dq();
      if (this.bS()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)ayg.a($$0) + 0.5, (double)ayg.a($$1 + 0.5), (double)ayg.a($$2) + 0.5);
      }

      if (this.ai != 0) {
         ja $$4 = this.dq();
         if (!$$4.equals($$3)) {
            this.ao.a(c, (byte)0);
            this.av = true;
            if (this.dQ().B && !this.bS() && !$$4.equals(this.cm)) {
               this.cm = $$3;
               this.cn = 6;
               this.ad = this.dv();
               this.ae = this.dx();
               this.af = this.dB();
            }
         }
      }
   }

   @Nullable
   protected jf h(ja $$0) {
      for (jf $$1 : jf.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(ja $$0, jf $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         jf $$2 = $$1.g();
         if (!this.dQ().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ewa $$3 = a(this.ec(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dQ().a(this, $$3);
         }
      }
   }

   private boolean i(ja $$0) {
      dsk $$1 = this.dQ().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dfj.bQ) && $$0.equals(this.dq());
         return !$$2;
      }
   }

   protected boolean u() {
      if (!this.gd() && this.bE()) {
         ja $$0 = this.dq();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            ja $$2 = $$0.b(ayg.b(this.ah, -8, 8), ayg.b(this.ah, -8, 8), ayg.b(this.ah, -8, 8));
            if ($$2.v() > this.dQ().I_() && this.dQ().u($$2) && this.dQ().C_().a($$2) && this.dQ().a(this, new ewa($$2).h(1.0E-6))) {
               jf $$3 = this.h($$2);
               if ($$3 != null) {
                  this.aj();
                  this.a($$3);
                  this.a(avh.wW, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dQ().a(dxg.R, $$0, dxg.a.a(this));
                  this.ao.a(c, (byte)0);
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
      this.br = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.gt()) {
         bsg $$2 = $$0.c();
         if ($$2 instanceof cmq) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ex() < (double)this.eO() * 0.5 && this.ah.a(4) == 0) {
            this.u();
         } else if ($$0.a(avy.k)) {
            bsg $$3 = $$0.c();
            if ($$3 != null && $$3.al() == bsm.aL) {
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
      ewf $$0 = this.do();
      ewa $$1 = this.cL();
      if (!this.gt() && this.u()) {
         int $$2 = this.dQ().a(bsm.aK, $$1.g(8.0), bsg::bE).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dQ().z.i() < $$3)) {
            cjw $$4 = bsm.aK.a(this.dQ());
            if ($$4 != null) {
               $$4.a(this.go());
               $$4.e($$0);
               this.dQ().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bG() {
      return this.bE();
   }

   public jf y() {
      return this.ao.a(b);
   }

   private void a(jf $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.at());
      }

      super.a($$0);
   }

   private int gv() {
      return this.ao.a(c);
   }

   void b(int $$0) {
      if (!this.dQ().B) {
         this.f(buj.a).b(ca.b());
         if ($$0 == 0) {
            this.f(buj.a).d(ca);
            this.a(avh.wQ, 1.0F, 1.0F);
            this.a(dxg.j);
         } else {
            this.a(avh.wU, 1.0F, 1.0F);
            this.a(dxg.k);
         }
      }

      this.ao.a(c, (byte)$$0);
   }

   public float H(float $$0) {
      return ayg.i($$0, this.ck, this.cl);
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      this.aY = 0.0F;
      this.aZ = 0.0F;
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
   public void h(bsg $$0) {
   }

   public Optional<ewf> I(float $$0) {
      if (this.cm != null && this.cn > 0) {
         double $$1 = (double)((float)this.cn - $$0) / 6.0;
         $$1 *= $$1;
         ja $$2 = this.dq();
         double $$3 = (double)($$2.u() - this.cm.u()) * $$1;
         double $$4 = (double)($$2.v() - this.cm.v()) * $$1;
         double $$5 = (double)($$2.w() - this.cm.w()) * $$1;
         return Optional.of(new ewf(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<csv> $$0) {
      this.ao.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<csv> go() {
      return Optional.ofNullable(this.gp());
   }

   @Nullable
   public csv gp() {
      byte $$0 = this.ao.a(d);
      return $$0 != 16 && $$0 <= 15 ? csv.a($$0) : null;
   }

   class a extends bzz {
      private int b;

      public a() {
         this.a(EnumSet.of(bzz.a.a, bzz.a.b));
      }

      @Override
      public boolean a() {
         btb $$0 = cjw.this.p();
         return $$0 != null && $$0.bE() ? cjw.this.dQ().al() != bqd.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         cjw.this.b(100);
      }

      @Override
      public void d() {
         cjw.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (cjw.this.dQ().al() != bqd.a) {
            this.b--;
            btb $$0 = cjw.this.p();
            if ($$0 != null) {
               cjw.this.G().a($$0, 180.0F, 180.0F);
               double $$1 = cjw.this.g((bsg)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cjw.this.ah.a(10) * 20 / 2;
                     cjw.this.dQ().b(new cnf(cjw.this.dQ(), cjw.this, $$0, cjw.this.y().o()));
                     cjw.this.a(avh.wV, 2.0F, (cjw.this.ah.i() - cjw.this.ah.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cjw.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends byx {
      public b(btd $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cbs<btb> {
      public c(cjw $$0) {
         super($$0, btb.class, 10, true, false, $$0x -> $$0x instanceof cji);
      }

      @Override
      public boolean a() {
         return this.e.ck() == null ? false : super.a();
      }

      @Override
      protected ewa a(double $$0) {
         jf $$1 = ((cjw)this.e).y();
         if ($$1.o() == jf.a.a) {
            return this.e.cL().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jf.a.c ? this.e.cL().c($$0, $$0, 4.0) : this.e.cL().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bzb {
      public d(final btd $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jf $$0 = cjw.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cjw.ci));
         ke $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dv();
         double $$5 = this.f - this.a.dz();
         double $$6 = this.g - this.a.dB();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(ayg.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cbs<cmk> {
      public e(final cjw $$0) {
         super($$0, cmk.class, true);
      }

      @Override
      public boolean a() {
         return cjw.this.dQ().al() == bqd.a ? false : super.a();
      }

      @Override
      protected ewa a(double $$0) {
         jf $$1 = ((cjw)this.e).y();
         if ($$1.o() == jf.a.a) {
            return this.e.cL().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jf.a.c ? this.e.cL().c($$0, $$0, 4.0) : this.e.cL().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bzz {
      private int b;

      @Override
      public boolean a() {
         return cjw.this.p() == null && cjw.this.ah.a(b(40)) == 0 && cjw.this.a(cjw.this.dq(), cjw.this.y());
      }

      @Override
      public boolean b() {
         return cjw.this.p() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + cjw.this.ah.a(3)));
         cjw.this.b(30);
      }

      @Override
      public void d() {
         if (cjw.this.p() == null) {
            cjw.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
