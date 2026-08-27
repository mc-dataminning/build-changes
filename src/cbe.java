import java.util.UUID;
import javax.annotation.Nullable;

public class cbe extends cam implements bpd {
   private static final aii<Boolean> bV = ail.a(cbe.class, aik.k);
   private static final float bW = 6.0F;
   private float bY;
   private float bZ;
   private int ca;
   private static final blw cb = axl.a(20, 39);
   private int cc;
   @Nullable
   private UUID cd;

   public cbe(bol<? extends cbe> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public boa a(apa $$0, boa $$1) {
      return bol.aB.a((cwe)$$0);
   }

   @Override
   public boolean o(cpq $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bvo(this));
      this.bP.a(1, new cbe.c());
      this.bP.a(1, new cbe.d());
      this.bP.a(4, new bvt(this, 1.25));
      this.bP.a(5, new bwr(this, 1.0));
      this.bP.a(6, new bwc(this, cia.class, 6.0F));
      this.bP.a(7, new bwp(this));
      this.bQ.a(1, new cbe.b());
      this.bQ.a(2, new cbe.a());
      this.bQ.a(3, new bxn<>(this, cia.class, 10, true, false, this::a_));
      this.bQ.a(4, new bxn<>(this, caw.class, 10, true, true, null));
      this.bQ.a(5, new bxt<>(this, false));
   }

   public static bqd.a u() {
      return boz.C().a(bqe.n, 30.0).a(bqe.i, 20.0).a(bqe.o, 0.25).a(bqe.c, 6.0);
   }

   public static boolean c(bol<cbe> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      il<cxd> $$5 = $$1.t($$3);
      return !$$5.a(aud.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(aue.bV);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.a(this.dJ(), $$0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void c() {
      this.a(cb.a(this.af));
   }

   @Override
   public void a(int $$0) {
      this.cc = $$0;
   }

   @Override
   public int a() {
      return this.cc;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cd;
   }

   @Override
   protected ato y() {
      return this.o_() ? atp.tQ : atp.tP;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.tS;
   }

   @Override
   protected ato n_() {
      return atp.tR;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.tT, 0.15F, 1.0F);
   }

   protected void w() {
      if (this.ca <= 0) {
         this.b(atp.tU);
         this.ca = 40;
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bV, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dJ().B) {
         if (this.bZ != this.bY) {
            this.k_();
         }

         this.bY = this.bZ;
         if (this.A()) {
            this.bZ = awm.a(this.bZ + 1.0F, 0.0F, 6.0F);
         } else {
            this.bZ = awm.a(this.bZ - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.ca > 0) {
         this.ca--;
      }

      if (!this.dJ().B) {
         this.a((apa)this.dJ(), true);
      }
   }

   @Override
   public boi e(bpi $$0) {
      if (this.bZ > 0.0F) {
         float $$1 = this.bZ / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean B(bof $$0) {
      boolean $$1 = $$0.a(this.dK().b((box)this), (float)((int)this.g(bqe.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   public boolean A() {
      return this.am.b(bV);
   }

   public void w(boolean $$0) {
      this.am.b(bV, $$0);
   }

   public float E(float $$0) {
      return awm.i($$0, this.bY, this.bZ) / 6.0F;
   }

   @Override
   protected float ff() {
      return 0.98F;
   }

   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      if ($$3 == null) {
         $$3 = new boa.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends bxn<cia> {
      public a() {
         super(cbe.this, cia.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cbe.this.o_()) {
            return false;
         } else {
            if (super.a()) {
               for (cbe $$1 : cbe.this.dJ().a(cbe.class, cbe.this.cE().c(8.0, 4.0, 8.0))) {
                  if ($$1.o_()) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      protected double l() {
         return super.l() * 0.5;
      }
   }

   class b extends bxm {
      public b() {
         super(cbe.this);
      }

      @Override
      public void c() {
         super.c();
         if (cbe.this.o_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(boz $$0, box $$1) {
         if ($$0 instanceof cbe && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bwe {
      public c() {
         super(cbe.this, 1.25, true);
      }

      @Override
      protected void a(box $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.B($$0);
            cbe.this.w(false);
         } else if (this.a.f((bof)$$0) < (double)(($$0.dd() + 3.0F) * ($$0.dd() + 3.0F))) {
            if (this.i()) {
               cbe.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cbe.this.w(true);
               cbe.this.w();
            }
         } else {
            this.h();
            cbe.this.w(false);
         }
      }

      @Override
      public void d() {
         cbe.this.w(false);
         super.d();
      }
   }

   class d extends bwn {
      public d() {
         super(cbe.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.eg() != null && this.b.o_() || this.b.bK();
      }
   }
}
