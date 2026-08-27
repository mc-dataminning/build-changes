import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cji extends cec implements bto<Optional<csh>>, ciu {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final btu bY = new btu(e, "Covered armor bonus", 20.0, btu.a.a);
   protected static final ajr<it> b = ajv.a(cji.class, ajt.q);
   protected static final ajr<Byte> c = ajv.a(cji.class, ajt.a);
   protected static final ajr<Byte> d = ajv.a(cji.class, ajt.a);
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

   public cji(bsa<? extends cji> $$0, dax $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bO = new cji.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzu(this, clw.class, 8.0F, 0.02F, true));
      this.bS.a(4, new cji.a());
      this.bS.a(7, new cji.f());
      this.bS.a(8, new cah(this));
      this.bT.a(1, new cbe(this, this.getClass()).a());
      this.bT.a(2, new cji.e(this));
      this.bT.a(3, new cji.c(this));
   }

   @Override
   protected bru.b bb() {
      return bru.b.a;
   }

   @Override
   public avi de() {
      return avi.f;
   }

   @Override
   protected avg v() {
      return avh.wI;
   }

   @Override
   public void P() {
      if (!this.gu()) {
         super.P();
      }
   }

   @Override
   protected avg o_() {
      return avh.wO;
   }

   @Override
   protected avg d(bqn $$0) {
      return this.gu() ? avh.wQ : avh.wP;
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(b, it.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static btv.a s() {
      return bsq.A().a(btw.q, 30.0);
   }

   @Override
   protected byk E() {
      return new cji.b(this);
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
   protected euf as() {
      float $$0 = I(this.cj);
      it $$1 = this.y().g();
      float $$2 = this.dj() / 2.0F;
      return a(this.ee(), $$1, $$0).d(this.du() - (double)$$2, this.dw(), this.dA() - (double)$$2);
   }

   private static float I(float $$0) {
      return 0.5F - ayd.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gs() {
      this.ci = this.cj;
      float $$0 = (float)this.gw() * 0.01F;
      if (this.cj == $$0) {
         return false;
      } else {
         if (this.cj > $$0) {
            this.cj = ayd.a(this.cj - 0.05F, $$0, 1.0F);
         } else {
            this.cj = ayd.a(this.cj + 0.05F, 0.0F, $$0);
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
         for (bru $$5 : this.dP().a(this, a(this.ee(), $$2, $$1, $$0).d(this.du() - 0.5, this.dw(), this.dA() - 0.5), brz.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof cji) && !$$5.ag) {
               $$5.a(bst.e, new euk((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static euf a(float $$0, it $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static euf a(float $$0, it $$1, float $$2, float $$3) {
      euf $$4 = new euf(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bru $$0, boolean $$1) {
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

      this.ba = 0.0F;
      this.aZ = 0.0F;
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      this.r(0.0F);
      this.bb = this.dF();
      this.bu();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bst $$0, euk $$1) {
      if ($$0 == bst.d) {
         this.u();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public euk ds() {
      return euk.b;
   }

   @Override
   public void g(euk $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      io $$3 = this.dp();
      if (this.bR()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)ayd.a($$0) + 0.5, (double)ayd.a($$1 + 0.5), (double)ayd.a($$2) + 0.5);
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
            euf $$3 = a(this.ee(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dP().a(this, $$3);
         }
      }
   }

   private boolean j(io $$0) {
      drb $$1 = this.dP().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dea.bQ) && $$0.equals(this.dp());
         return !$$2;
      }
   }

   protected boolean u() {
      if (!this.gf() && this.bD()) {
         io $$0 = this.dp();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            io $$2 = $$0.b(ayd.b(this.ah, -8, 8), ayd.b(this.ah, -8, 8), ayd.b(this.ah, -8, 8));
            if ($$2.v() > this.dP().I_() && this.dP().u($$2) && this.dP().C_().a($$2) && this.dP().a(this, new euf($$2).h(1.0E-6))) {
               it $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ai();
                  this.a($$3);
                  this.a(avh.wT, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dP().a(dvu.R, $$0, dvu.a.a(this));
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
      this.bs = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (this.gu()) {
         bru $$2 = $$0.c();
         if ($$2 instanceof cmc) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eA() < (double)this.eR() * 0.5 && this.ah.a(4) == 0) {
            this.u();
         } else if ($$0.a(avy.k)) {
            bru $$3 = $$0.c();
            if ($$3 != null && $$3.ak() == bsa.aL) {
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
      euk $$0 = this.dn();
      euf $$1 = this.cK();
      if (!this.gu() && this.u()) {
         int $$2 = this.dP().a(bsa.aK, $$1.g(8.0), bru::bD).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dP().z.i() < $$3)) {
            cji $$4 = bsa.aK.a(this.dP());
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
   public void a(ajr<?> $$0) {
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
         this.f(btw.a).b(bY.b());
         if ($$0 == 0) {
            this.f(btw.a).d(bY);
            this.a(avh.wN, 1.0F, 1.0F);
            this.a(dvu.j);
         } else {
            this.a(avh.wR, 1.0F, 1.0F);
            this.a(dvu.k);
         }
      }

      this.ao.a(c, (byte)$$0);
   }

   public float G(float $$0) {
      return ayd.i($$0, this.ci, this.cj);
   }

   @Override
   public void a(abr $$0) {
      super.a($$0);
      this.aZ = 0.0F;
      this.ba = 0.0F;
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
   public void h(bru $$0) {
   }

   public Optional<euk> H(float $$0) {
      if (this.ck != null && this.cl > 0) {
         double $$1 = (double)((float)this.cl - $$0) / 6.0;
         $$1 *= $$1;
         io $$2 = this.dp();
         double $$3 = (double)($$2.u() - this.ck.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ck.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ck.w()) * $$1;
         return Optional.of(new euk(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<csh> $$0) {
      this.ao.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<csh> gp() {
      return Optional.ofNullable(this.gq());
   }

   @Nullable
   public csh gq() {
      byte $$0 = this.ao.a(d);
      return $$0 != 16 && $$0 <= 15 ? csh.a($$0) : null;
   }

   class a extends bzm {
      private int b;

      public a() {
         this.a(EnumSet.of(bzm.a.a, bzm.a.b));
      }

      @Override
      public boolean a() {
         bso $$0 = cji.this.p();
         return $$0 != null && $$0.bD() ? cji.this.dP().ak() != bpr.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         cji.this.b(100);
      }

      @Override
      public void d() {
         cji.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (cji.this.dP().ak() != bpr.a) {
            this.b--;
            bso $$0 = cji.this.p();
            if ($$0 != null) {
               cji.this.G().a($$0, 180.0F, 180.0F);
               double $$1 = cji.this.g($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cji.this.ah.a(10) * 20 / 2;
                     cji.this.dP().b(new cmr(cji.this.dP(), cji.this, $$0, cji.this.y().o()));
                     cji.this.a(avh.wS, 2.0F, (cji.this.ah.i() - cji.this.ah.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cji.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends byk {
      public b(bsq $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cbf<bso> {
      public c(cji $$0) {
         super($$0, bso.class, 10, true, false, $$0x -> $$0x instanceof ciu);
      }

      @Override
      public boolean a() {
         return this.e.cj() == null ? false : super.a();
      }

      @Override
      protected euf a(double $$0) {
         it $$1 = ((cji)this.e).y();
         if ($$1.o() == it.a.a) {
            return this.e.cK().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == it.a.c ? this.e.cK().c($$0, $$0, 4.0) : this.e.cK().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends byo {
      public d(bsq $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         it $$0 = cji.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cji.cg));
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
            : Optional.of((float)(ayd.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cbf<clw> {
      public e(cji $$0) {
         super($$0, clw.class, true);
      }

      @Override
      public boolean a() {
         return cji.this.dP().ak() == bpr.a ? false : super.a();
      }

      @Override
      protected euf a(double $$0) {
         it $$1 = ((cji)this.e).y();
         if ($$1.o() == it.a.a) {
            return this.e.cK().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == it.a.c ? this.e.cK().c($$0, $$0, 4.0) : this.e.cK().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bzm {
      private int b;

      @Override
      public boolean a() {
         return cji.this.p() == null && cji.this.ah.a(b(40)) == 0 && cji.this.a(cji.this.dp(), cji.this.y());
      }

      @Override
      public boolean b() {
         return cji.this.p() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + cji.this.ah.a(3)));
         cji.this.b(30);
      }

      @Override
      public void d() {
         if (cji.this.p() == null) {
            cji.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
