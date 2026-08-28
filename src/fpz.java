import javax.annotation.Nullable;

public class fpz implements fzl {
   private static final alp a = alp.b("hud/hotbar");
   private static final alp b = alp.b("hud/hotbar_selection");
   private static final long c = 5000L;
   private static final long d = 2000L;
   private final flz e;
   private long f;
   @Nullable
   private fzi g;

   public fpz(flz $$0) {
      this.e = $$0;
   }

   public void a(int $$0) {
      this.f = ae.c();
      if (this.g != null) {
         this.g.b($$0);
      } else {
         this.g = new fzi(this);
      }
   }

   private float c() {
      long $$0 = this.f - ae.c() + 5000L;
      return azu.a((float)$$0 / 2000.0F, 0.0F, 1.0F);
   }

   public void a(fnl $$0) {
      if (this.g != null) {
         float $$1 = this.c();
         if ($$1 <= 0.0F) {
            this.g.d();
         } else {
            int $$2 = $$0.a() / 2;
            $$0.c().a();
            $$0.c().a(0.0F, 0.0F, -90.0F);
            int $$3 = azu.d((float)$$0.b() - 22.0F * $$1);
            fzm $$4 = this.g.f();
            this.a($$0, $$1, $$2, $$3, $$4);
            $$0.c().b();
         }
      }
   }

   protected void a(fnl $$0, float $$1, int $$2, int $$3, fzm $$4) {
      int $$5 = ayf.a($$1);
      $$0.a(glq::H, a, $$2 - 91, $$3, 182, 22, $$5);
      if ($$4.a() >= 0) {
         $$0.a(glq::H, b, $$2 - 91 - 1 + $$4.a() * 20, $$3 - 1, 24, 23, $$5);
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a($$0, $$6, $$0.a() / 2 - 90 + $$6 * 20 + 2, (float)($$3 + 3), $$1, $$4.a($$6));
      }
   }

   private void a(fnl $$0, int $$1, int $$2, float $$3, float $$4, fzk $$5) {
      if ($$5 != fzi.a) {
         $$0.c().a();
         $$0.c().a((float)$$2, $$3, 0.0F);
         float $$6 = $$5.aV_() ? 1.0F : 0.25F;
         $$5.a($$0, $$6, $$4);
         $$0.c().b();
         int $$7 = (int)($$4 * 255.0F);
         if ($$7 > 3 && $$5.aV_()) {
            xk $$8 = this.e.n.S[$$1].k();
            $$0.b(this.e.h, $$8, $$2 + 19 - 2 - this.e.h.a($$8), (int)$$3 + 6 + 3, 16777215 + ($$7 << 24));
         }
      }
   }

   public void b(fnl $$0) {
      int $$1 = (int)(this.c() * 255.0F);
      if ($$1 > 3 && this.g != null) {
         fzk $$2 = this.g.b();
         xk $$3 = $$2 == fzi.a ? this.g.c().b() : $$2.aU_();
         if ($$3 != null) {
            int $$4 = this.e.h.a($$3);
            int $$5 = ($$0.a() - $$4) / 2;
            int $$6 = $$0.b() - 35;
            $$0.a(this.e.h, $$3, $$5, $$6, $$4, ayf.c($$1, -1));
         }
      }
   }

   @Override
   public void a(fzi $$0) {
      this.g = null;
      this.f = 0L;
   }

   public boolean a() {
      return this.g != null;
   }

   public void b(int $$0) {
      int $$1 = this.g.e() + $$0;

      while ($$1 >= 0 && $$1 <= 8 && (this.g.a($$1) == fzi.a || !this.g.a($$1).aV_())) {
         $$1 += $$0;
      }

      if ($$1 >= 0 && $$1 <= 8) {
         this.g.b($$1);
         this.f = ae.c();
      }
   }

   public void b() {
      this.f = ae.c();
      if (this.a()) {
         int $$0 = this.g.e();
         if ($$0 != -1) {
            this.g.b($$0);
         }
      } else {
         this.g = new fzi(this);
      }
   }
}
