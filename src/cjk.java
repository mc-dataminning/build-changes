import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cjk extends cee implements btq<Optional<csj>>, ciw {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final btw bY = new btw(e, "Covered armor bonus", 20.0, btw.a.a);
   protected static final ajs<it> b = ajw.a(cjk.class, aju.q);
   protected static final ajs<Byte> c = ajw.a(cjk.class, aju.a);
   protected static final ajs<Byte> d = ajw.a(cjk.class, aju.a);
   private static final int bZ = 6;
   private static final byte ca = 16;
   private static final byte cb = 16;
   private static final int cc = 8;
   private static final int cd = 8;
   private static final int ce = 5;
   private static final float cf = 0.05F;
   static final Vector3f cg = ac.a(() -> {
      js $$0 = it.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float ch = 3.0F;
   private float ci;
   private float cj;
   @Nullable
   private io ck;
   private int cl;
   private static final float cm = 1.0F;

   public cjk(bsc<? extends cjk> $$0, daz $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bO = new cjk.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzw(this, cly.class, 8.0F, 0.02F, true));
      this.bS.a(4, new cjk.a());
      this.bS.a(7, new cjk.f());
      this.bS.a(8, new caj(this));
      this.bT.a(1, new cbg(this, this.getClass()).a());
      this.bT.a(2, new cjk.e(this));
      this.bT.a(3, new cjk.c(this));
   }

   @Override
   protected brw.b bb() {
      return brw.b.a;
   }

   @Override
   public avj de() {
      return avj.f;
   }

   @Override
   protected avh v() {
      return avi.wI;
   }

   @Override
   public void P() {
      if (!this.gu()) {
         super.P();
      }
   }

   @Override
   protected avh o_() {
      return avi.wO;
   }

   @Override
   protected avh d(bqp $$0) {
      return this.gu() ? avi.wQ : avi.wP;
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(b, it.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static btx.a s() {
      return bss.A().a(bty.q, 30.0);
   }

   @Override
   protected bym E() {
      return new cjk.b(this);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a(it.a($$0.f("AttachFace")));
      this.ao.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.ao.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.y().d());
      $$0.a("Peek", this.ao.a(c));
      $$0.a("Color", this.ao.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dP().B && !this.bR() && !this.a(this.dp(), this.y())) {
         this.gr();
      }

      if (this.gs()) {
         this.gt();
      }

      if (this.dP().B) {
         if (this.cl > 0) {
            this.cl--;
         } else {
            this.ck = null;
         }
      }
   }

   private void gr() {
      it $$0 = this.i(this.dp());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.u();
      }
   }

   @Override
   protected euh as() {
      float $$0 = I(this.cj);
      it $$1 = this.y().g();
      float $$2 = this.dj() / 2.0F;
      return a(this.ee(), $$1, $$0).d(this.du() - (double)$$2, this.dw(), this.dA() - (double)$$2);
   }

   private static float I(float $$0) {
      return 0.5F - ayf.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gs() {
      this.ci = this.cj;
      float $$0 = (float)this.gw() * 0.01F;
      if (this.cj == $$0) {
         return false;
      } else {
         if (this.cj > $$0) {
            this.cj = ayf.a(this.cj - 0.05F, $$0, 1.0F);
         } else {
            this.cj = ayf.a(this.cj + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gt() {
      this.at();
      float $$0 = I(this.cj);
      float $$1 = I(this.ci);
      it $$2 = this.y().g();
      float $$3 = ($$0 - $$1) * this.ee();
      if (!($$3 <= 0.0F)) {
         for (brw $$5 : this.dP().a(this, a(this.ee(), $$2, $$1, $$0).d(this.du() - 0.5, this.dw(), this.dA() - 0.5), bsb.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof cjk) && !$$5.ag) {
               $$5.a(bsv.e, new eum((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static euh a(float $$0, it $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static euh a(float $$0, it $$1, float $$2, float $$3) {
      euh $$4 = new euh(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(brw $$0, boolean $$1) {
      if (this.dP().x_()) {
         this.ck = null;
         this.cl = 0;
      }

      this.a(it.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ac() {
      super.ac();
      if (this.dP().B) {
         this.ck = this.dp();
      }

      this.aZ = 0.0F;
      this.aY = 0.0F;
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      this.r(0.0F);
      this.ba = this.dF();
      this.bu();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bsv $$0, eum $$1) {
      if ($$0 == bsv.d) {
         this.u();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public eum ds() {
      return eum.b;
   }

   @Override
   public void g(eum $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      io $$3 = this.dp();
      if (this.bR()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)ayf.a($$0) + 0.5, (double)ayf.a($$1 + 0.5), (double)ayf.a($$2) + 0.5);
      }

      if (this.ai != 0) {
         io $$4 = this.dp();
         if (!$$4.equals($$3)) {
            this.ao.a(c, (byte)0);
            this.av = true;
            if (this.dP().B && !this.bR() && !$$4.equals(this.ck)) {
               this.ck = $$3;
               this.cl = 6;
               this.ad = this.du();
               this.ae = this.dw();
               this.af = this.dA();
            }
         }
      }
   }

   @Nullable
   protected it i(io $$0) {
      for (it $$1 : it.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(io $$0, it $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         it $$2 = $$1.g();
         if (!this.dP().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            euh $$3 = a(this.ee(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dP().a(this, $$3);
         }
      }
   }

   private boolean j(io $$0) {
      drd $$1 = this.dP().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dec.bQ) && $$0.equals(this.dp());
         return !$$2;
      }
   }

   protected boolean u() {
      if (!this.gf() && this.bD()) {
         io $$0 = this.dp();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            io $$2 = $$0.b(ayf.b(this.ah, -8, 8), ayf.b(this.ah, -8, 8), ayf.b(this.ah, -8, 8));
            if ($$2.v() > this.dP().I_() && this.dP().u($$2) && this.dP().C_().a($$2) && this.dP().a(this, new euh($$2).h(1.0E-6))) {
               it $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ai();
                  this.a($$3);
                  this.a(avi.wT, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dP().a(dvw.R, $$0, dvw.a.a(this));
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
   public boolean a(bqp $$0, float $$1) {
      if (this.gu()) {
         brw $$2 = $$0.c();
         if ($$2 instanceof cme) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eA() < (double)this.eR() * 0.5 && this.ah.a(4) == 0) {
            this.u();
         } else if ($$0.a(avz.k)) {
            brw $$3 = $$0.c();
            if ($$3 != null && $$3.ak() == bsc.aL) {
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
      eum $$0 = this.dn();
      euh $$1 = this.cK();
      if (!this.gu() && this.u()) {
         int $$2 = this.dP().a(bsc.aK, $$1.g(8.0), brw::bD).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dP().z.i() < $$3)) {
            cjk $$4 = bsc.aK.a(this.dP());
            if ($$4 != null) {
               $$4.a(this.gp());
               $$4.e($$0);
               this.dP().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bF() {
      return this.bD();
   }

   public it y() {
      return this.ao.a(b);
   }

   private void a(it $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(ajs<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.as());
      }

      super.a($$0);
   }

   private int gw() {
      return this.ao.a(c);
   }

   void b(int $$0) {
      if (!this.dP().B) {
         this.f(bty.a).b(bY.b());
         if ($$0 == 0) {
            this.f(bty.a).d(bY);
            this.a(avi.wN, 1.0F, 1.0F);
            this.a(dvw.j);
         } else {
            this.a(avi.wR, 1.0F, 1.0F);
            this.a(dvw.k);
         }
      }

      this.ao.a(c, (byte)$$0);
   }

   public float G(float $$0) {
      return ayf.i($$0, this.ci, this.cj);
   }

   @Override
   public void a(abr $$0) {
      super.a($$0);
      this.aY = 0.0F;
      this.aZ = 0.0F;
   }

   @Override
   public int Z() {
      return 180;
   }

   @Override
   public int aa() {
      return 180;
   }

   @Override
   public void h(brw $$0) {
   }

   public Optional<eum> H(float $$0) {
      if (this.ck != null && this.cl > 0) {
         double $$1 = (double)((float)this.cl - $$0) / 6.0;
         $$1 *= $$1;
         io $$2 = this.dp();
         double $$3 = (double)($$2.u() - this.ck.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ck.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ck.w()) * $$1;
         return Optional.of(new eum(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<csj> $$0) {
      this.ao.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<csj> gp() {
      return Optional.ofNullable(this.gq());
   }

   @Nullable
   public csj gq() {
      byte $$0 = this.ao.a(d);
      return $$0 != 16 && $$0 <= 15 ? csj.a($$0) : null;
   }

   class a extends bzo {
      private int b;

      public a() {
         this.a(EnumSet.of(bzo.a.a, bzo.a.b));
      }

      @Override
      public boolean a() {
         bsq $$0 = cjk.this.p();
         return $$0 != null && $$0.bD() ? cjk.this.dP().ak() != bpt.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         cjk.this.b(100);
      }

      @Override
      public void d() {
         cjk.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (cjk.this.dP().ak() != bpt.a) {
            this.b--;
            bsq $$0 = cjk.this.p();
            if ($$0 != null) {
               cjk.this.G().a($$0, 180.0F, 180.0F);
               double $$1 = cjk.this.g($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cjk.this.ah.a(10) * 20 / 2;
                     cjk.this.dP().b(new cmt(cjk.this.dP(), cjk.this, $$0, cjk.this.y().o()));
                     cjk.this.a(avi.wS, 2.0F, (cjk.this.ah.i() - cjk.this.ah.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cjk.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bym {
      public b(bss $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cbh<bsq> {
      public c(cjk $$0) {
         super($$0, bsq.class, 10, true, false, $$0x -> $$0x instanceof ciw);
      }

      @Override
      public boolean a() {
         return this.e.cj() == null ? false : super.a();
      }

      @Override
      protected euh a(double $$0) {
         it $$1 = ((cjk)this.e).y();
         if ($$1.o() == it.a.a) {
            return this.e.cK().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == it.a.c ? this.e.cK().c($$0, $$0, 4.0) : this.e.cK().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends byq {
      public d(bss $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         it $$0 = cjk.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cjk.cg));
         js $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.du();
         double $$5 = this.f - this.a.dy();
         double $$6 = this.g - this.a.dA();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(ayf.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cbh<cly> {
      public e(cjk $$0) {
         super($$0, cly.class, true);
      }

      @Override
      public boolean a() {
         return cjk.this.dP().ak() == bpt.a ? false : super.a();
      }

      @Override
      protected euh a(double $$0) {
         it $$1 = ((cjk)this.e).y();
         if ($$1.o() == it.a.a) {
            return this.e.cK().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == it.a.c ? this.e.cK().c($$0, $$0, 4.0) : this.e.cK().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bzo {
      private int b;

      @Override
      public boolean a() {
         return cjk.this.p() == null && cjk.this.ah.a(b(40)) == 0 && cjk.this.a(cjk.this.dp(), cjk.this.y());
      }

      @Override
      public boolean b() {
         return cjk.this.p() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + cjk.this.ah.a(3)));
         cjk.this.b(30);
      }

      @Override
      public void d() {
         if (cjk.this.p() == null) {
            cjk.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
