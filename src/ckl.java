import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ckl extends cff implements bur<Optional<ctk>>, cjx {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bux bY = new bux(e, "Covered armor bonus", 20.0, bux.a.a);
   protected static final akk<je> b = ako.a(ckl.class, akm.q);
   protected static final akk<Byte> c = ako.a(ckl.class, akm.a);
   protected static final akk<Byte> d = ako.a(ckl.class, akm.a);
   private static final int bZ = 6;
   private static final byte ca = 16;
   private static final byte cb = 16;
   private static final int cc = 8;
   private static final int cd = 8;
   private static final int ce = 5;
   private static final float cf = 0.05F;
   static final Vector3f cg = ac.a(() -> {
      kd $$0 = je.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float ch = 3.0F;
   private float ci;
   private float cj;
   @Nullable
   private iz ck;
   private int cl;
   private static final float cm = 1.0F;

   public ckl(btc<? extends ckl> $$0, dca $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bO = new ckl.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cax(this, cmz.class, 8.0F, 0.02F, true));
      this.bS.a(4, new ckl.a());
      this.bS.a(7, new ckl.f());
      this.bS.a(8, new cbk(this));
      this.bT.a(1, new cch(this, this.getClass()).a());
      this.bT.a(2, new ckl.e(this));
      this.bT.a(3, new ckl.c(this));
   }

   @Override
   protected bsw.b bb() {
      return bsw.b.a;
   }

   @Override
   public awb de() {
      return awb.f;
   }

   @Override
   protected avz v() {
      return awa.wI;
   }

   @Override
   public void Q() {
      if (!this.gv()) {
         super.Q();
      }
   }

   @Override
   protected avz o_() {
      return awa.wO;
   }

   @Override
   protected avz d(brp $$0) {
      return this.gv() ? awa.wQ : awa.wP;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, je.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static buy.a s() {
      return btt.A().a(buz.q, 30.0);
   }

   @Override
   protected bzn E() {
      return new ckl.b(this);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a(je.a($$0.f("AttachFace")));
      this.ao.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.ao.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.y().d());
      $$0.a("Peek", this.ao.a(c));
      $$0.a("Color", this.ao.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dP().B && !this.bR() && !this.a(this.dp(), this.y())) {
         this.gs();
      }

      if (this.gt()) {
         this.gu();
      }

      if (this.dP().B) {
         if (this.cl > 0) {
            this.cl--;
         } else {
            this.ck = null;
         }
      }
   }

   private void gs() {
      je $$0 = this.i(this.dp());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.u();
      }
   }

   @Override
   protected evo as() {
      float $$0 = I(this.cj);
      je $$1 = this.y().g();
      float $$2 = this.dj() / 2.0F;
      return a(this.ee(), $$1, $$0).d(this.du() - (double)$$2, this.dw(), this.dA() - (double)$$2);
   }

   private static float I(float $$0) {
      return 0.5F - ayz.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gt() {
      this.ci = this.cj;
      float $$0 = (float)this.gx() * 0.01F;
      if (this.cj == $$0) {
         return false;
      } else {
         if (this.cj > $$0) {
            this.cj = ayz.a(this.cj - 0.05F, $$0, 1.0F);
         } else {
            this.cj = ayz.a(this.cj + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gu() {
      this.at();
      float $$0 = I(this.cj);
      float $$1 = I(this.ci);
      je $$2 = this.y().g();
      float $$3 = ($$0 - $$1) * this.ee();
      if (!($$3 <= 0.0F)) {
         for (bsw $$5 : this.dP().a(this, a(this.ee(), $$2, $$1, $$0).d(this.du() - 0.5, this.dw(), this.dA() - 0.5), btb.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof ckl) && !$$5.ag) {
               $$5.a(btw.e, new evt((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static evo a(float $$0, je $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static evo a(float $$0, je $$1, float $$2, float $$3) {
      evo $$4 = new evo(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bsw $$0, boolean $$1) {
      if (this.dP().x_()) {
         this.ck = null;
         this.cl = 0;
      }

      this.a(je.a);
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
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      this.r(0.0F);
      this.ba = this.dF();
      this.bu();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(btw $$0, evt $$1) {
      if ($$0 == btw.d) {
         this.u();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public evt ds() {
      return evt.b;
   }

   @Override
   public void h(evt $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      iz $$3 = this.dp();
      if (this.bR()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)ayz.a($$0) + 0.5, (double)ayz.a($$1 + 0.5), (double)ayz.a($$2) + 0.5);
      }

      if (this.ai != 0) {
         iz $$4 = this.dp();
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
   protected je i(iz $$0) {
      for (je $$1 : je.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(iz $$0, je $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         je $$2 = $$1.g();
         if (!this.dP().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            evo $$3 = a(this.ee(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dP().a(this, $$3);
         }
      }
   }

   private boolean j(iz $$0) {
      dse $$1 = this.dP().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dfd.bQ) && $$0.equals(this.dp());
         return !$$2;
      }
   }

   protected boolean u() {
      if (!this.gg() && this.bD()) {
         iz $$0 = this.dp();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            iz $$2 = $$0.b(ayz.b(this.ah, -8, 8), ayz.b(this.ah, -8, 8), ayz.b(this.ah, -8, 8));
            if ($$2.v() > this.dP().I_() && this.dP().u($$2) && this.dP().C_().a($$2) && this.dP().a(this, new evo($$2).h(1.0E-6))) {
               je $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ai();
                  this.a($$3);
                  this.a(awa.wT, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dP().a(dwx.R, $$0, dwx.a.a(this));
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
   public boolean a(brp $$0, float $$1) {
      if (this.gv()) {
         bsw $$2 = $$0.c();
         if ($$2 instanceof cnf) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eA() < (double)this.eR() * 0.5 && this.ah.a(4) == 0) {
            this.u();
         } else if ($$0.a(awr.k)) {
            bsw $$3 = $$0.c();
            if ($$3 != null && $$3.ak() == btc.aL) {
               this.gw();
            }
         }

         return true;
      }
   }

   private boolean gv() {
      return this.gx() == 0;
   }

   private void gw() {
      evt $$0 = this.dn();
      evo $$1 = this.cK();
      if (!this.gv() && this.u()) {
         int $$2 = this.dP().a(btc.aK, $$1.g(8.0), bsw::bD).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dP().z.i() < $$3)) {
            ckl $$4 = btc.aK.a(this.dP());
            if ($$4 != null) {
               $$4.a(this.gq());
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

   public je y() {
      return this.ao.a(b);
   }

   private void a(je $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(akk<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.as());
      }

      super.a($$0);
   }

   private int gx() {
      return this.ao.a(c);
   }

   void b(int $$0) {
      if (!this.dP().B) {
         this.f(buz.a).b(bY.b());
         if ($$0 == 0) {
            this.f(buz.a).d(bY);
            this.a(awa.wN, 1.0F, 1.0F);
            this.a(dwx.j);
         } else {
            this.a(awa.wR, 1.0F, 1.0F);
            this.a(dwx.k);
         }
      }

      this.ao.a(c, (byte)$$0);
   }

   public float G(float $$0) {
      return ayz.i($$0, this.ci, this.cj);
   }

   @Override
   public void a(acj $$0) {
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
   public void h(bsw $$0) {
   }

   public Optional<evt> H(float $$0) {
      if (this.ck != null && this.cl > 0) {
         double $$1 = (double)((float)this.cl - $$0) / 6.0;
         $$1 *= $$1;
         iz $$2 = this.dp();
         double $$3 = (double)($$2.u() - this.ck.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ck.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ck.w()) * $$1;
         return Optional.of(new evt(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<ctk> $$0) {
      this.ao.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<ctk> gq() {
      return Optional.ofNullable(this.gr());
   }

   @Nullable
   public ctk gr() {
      byte $$0 = this.ao.a(d);
      return $$0 != 16 && $$0 <= 15 ? ctk.a($$0) : null;
   }

   class a extends cap {
      private int b;

      public a() {
         this.a(EnumSet.of(cap.a.a, cap.a.b));
      }

      @Override
      public boolean a() {
         btr $$0 = ckl.this.p();
         return $$0 != null && $$0.bD() ? ckl.this.dP().al() != bqt.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         ckl.this.b(100);
      }

      @Override
      public void d() {
         ckl.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (ckl.this.dP().al() != bqt.a) {
            this.b--;
            btr $$0 = ckl.this.p();
            if ($$0 != null) {
               ckl.this.G().a($$0, 180.0F, 180.0F);
               double $$1 = ckl.this.g((bsw)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + ckl.this.ah.a(10) * 20 / 2;
                     ckl.this.dP().b(new cnu(ckl.this.dP(), ckl.this, $$0, ckl.this.y().o()));
                     ckl.this.a(awa.wS, 2.0F, (ckl.this.ah.i() - ckl.this.ah.i()) * 0.2F + 1.0F);
                  }
               } else {
                  ckl.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bzn {
      public b(btt $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cci<btr> {
      public c(ckl $$0) {
         super($$0, btr.class, 10, true, false, $$0x -> $$0x instanceof cjx);
      }

      @Override
      public boolean a() {
         return this.e.cj() == null ? false : super.a();
      }

      @Override
      protected evo a(double $$0) {
         je $$1 = ((ckl)this.e).y();
         if ($$1.o() == je.a.a) {
            return this.e.cK().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == je.a.c ? this.e.cK().c($$0, $$0, 4.0) : this.e.cK().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bzr {
      public d(final btt $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         je $$0 = ckl.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(ckl.cg));
         kd $$2 = $$0.q();
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
            : Optional.of((float)(ayz.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cci<cmz> {
      public e(final ckl $$0) {
         super($$0, cmz.class, true);
      }

      @Override
      public boolean a() {
         return ckl.this.dP().al() == bqt.a ? false : super.a();
      }

      @Override
      protected evo a(double $$0) {
         je $$1 = ((ckl)this.e).y();
         if ($$1.o() == je.a.a) {
            return this.e.cK().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == je.a.c ? this.e.cK().c($$0, $$0, 4.0) : this.e.cK().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cap {
      private int b;

      @Override
      public boolean a() {
         return ckl.this.p() == null && ckl.this.ah.a(b(40)) == 0 && ckl.this.a(ckl.this.dp(), ckl.this.y());
      }

      @Override
      public boolean b() {
         return ckl.this.p() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + ckl.this.ah.a(3)));
         ckl.this.b(30);
      }

      @Override
      public void d() {
         if (ckl.this.p() == null) {
            ckl.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
