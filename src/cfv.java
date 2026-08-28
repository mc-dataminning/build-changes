import java.util.UUID;
import javax.annotation.Nullable;

public class cfv extends cfd implements btt {
   private static final akj<Boolean> bY = akn.a(cfv.class, akl.k);
   private static final float bZ = 6.0F;
   private float cb;
   private float cc;
   private int cd;
   private static final bqd ce = azx.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cfv(bsy<? extends cfv> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bsm a(are $$0, bsm $$1) {
      return bsy.aD.a((dbw)$$0);
   }

   @Override
   public boolean o(cun $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new caf(this));
      this.bS.a(1, new cfv.c());
      this.bS.a(1, new cfv.d());
      this.bS.a(4, new cak(this, 1.25));
      this.bS.a(5, new cbi(this, 1.0));
      this.bS.a(6, new cat(this, cmv.class, 6.0F));
      this.bS.a(7, new cbg(this));
      this.bT.a(1, new cfv.b());
      this.bT.a(2, new cfv.a());
      this.bT.a(3, new cce<>(this, cmv.class, 10, true, false, this::a_));
      this.bT.a(4, new cce<>(this, cfn.class, 10, true, true, null));
      this.bT.a(5, new cck<>(this, false));
   }

   public static buu.a s() {
      return btp.A().a(buv.q, 30.0).a(buv.k, 20.0).a(buv.r, 0.25).a(buv.c, 6.0);
   }

   public static boolean c(bsy<cfv> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      ji<dcv> $$5 = $$1.t($$3);
      return !$$5.a(awn.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(awo.cc);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a(this.dP(), $$0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.ah));
   }

   @Override
   public void a(int $$0) {
      this.cf = $$0;
   }

   @Override
   public int a() {
      return this.cf;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   protected avy v() {
      return this.p_() ? avz.uu : avz.ut;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.uw;
   }

   @Override
   protected avy o_() {
      return avz.uv;
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.ux, 0.15F, 1.0F);
   }

   protected void u() {
      if (this.cd <= 0) {
         this.b(avz.uy);
         this.cd = 40;
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B) {
         if (this.cc != this.cb) {
            this.j_();
         }

         this.cb = this.cc;
         if (this.y()) {
            this.cc = ayx.a(this.cc + 1.0F, 0.0F, 6.0F);
         } else {
            this.cc = ayx.a(this.cc - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (!this.dP().B) {
         this.a((are)this.dP(), true);
      }
   }

   @Override
   public bsv e(btz $$0) {
      if (this.cc > 0.0F) {
         float $$1 = this.cc / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean C(bss $$0) {
      boolean $$1 = $$0.a(this.dQ().b((btn)this), (float)((int)this.g(buv.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   public boolean y() {
      return this.ao.a(bY);
   }

   public void w(boolean $$0) {
      this.ao.a(bY, $$0);
   }

   public float G(float $$0) {
      return ayx.i($$0, this.cb, this.cc) / 6.0F;
   }

   @Override
   protected float fl() {
      return 0.98F;
   }

   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      if ($$3 == null) {
         $$3 = new bsm.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cce<cmv> {
      public a() {
         super(cfv.this, cmv.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cfv.this.p_()) {
            return false;
         } else {
            if (super.a()) {
               for (cfv $$1 : cfv.this.dP().a(cfv.class, cfv.this.cK().c(8.0, 4.0, 8.0))) {
                  if ($$1.p_()) {
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

   class b extends ccd {
      public b() {
         super(cfv.this);
      }

      @Override
      public void c() {
         super.c();
         if (cfv.this.p_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(btp $$0, btn $$1) {
         if ($$0 instanceof cfv && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cav {
      public c() {
         super(cfv.this, 1.25, true);
      }

      @Override
      protected void a(btn $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cfv.this.w(false);
         } else if (this.a.g((bss)$$0) < (double)(($$0.dj() + 3.0F) * ($$0.dj() + 3.0F))) {
            if (this.i()) {
               cfv.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cfv.this.w(true);
               cfv.this.u();
            }
         } else {
            this.h();
            cfv.this.w(false);
         }
      }

      @Override
      public void d() {
         cfv.this.w(false);
         super.d();
      }
   }

   class d extends cbe {
      public d() {
         super(cfv.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.em() != null && this.b.p_() || this.b.bQ();
      }
   }
}
