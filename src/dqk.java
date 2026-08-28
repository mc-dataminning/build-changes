import javax.annotation.Nullable;

public class dqk extends dpi implements bqm, bqz {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bqo e = new bqo() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dqk.this.g.e();
      }

      @Override
      public cuq a(int $$0) {
         return $$0 == 0 ? dqk.this.g : cuq.l;
      }

      @Override
      public cuq a(int $$0, int $$1) {
         if ($$0 == 0) {
            cuq $$2 = dqk.this.g.a($$1);
            if (dqk.this.g.e()) {
               dqk.this.k();
            }

            return $$2;
         } else {
            return cuq.l;
         }
      }

      @Override
      public cuq b(int $$0) {
         if ($$0 == 0) {
            cuq $$1 = dqk.this.g;
            dqk.this.g = cuq.l;
            dqk.this.k();
            return $$1;
         } else {
            return cuq.l;
         }
      }

      @Override
      public void a(int $$0, cuq $$1) {
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public void e() {
         dqk.this.e();
      }

      @Override
      public boolean a(cmy $$0) {
         return bqo.a(dqk.this, $$0) && dqk.this.c();
      }

      @Override
      public boolean b(int $$0, cuq $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cqf f = new cqf() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dqk.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dqk.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cuq g = cuq.l;
   int h;
   private int i;

   public dqk(iz $$0, dsd $$1) {
      super(dpk.D, $$0, $$1);
   }

   public cuq b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cut.tZ) || this.g.a(cut.ua);
   }

   public void b(cuq $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      djl.a(null, this.i(), this.ay_(), this.n(), false);
   }

   public void a(cuq $$0, @Nullable cmy $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = ayz.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         djl.a(this.i(), this.ay_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayz.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cuq b(cuq $$0, @Nullable cmy $$1) {
      if (this.n instanceof arf && $$0.a(cut.ua)) {
         cwo.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ep a(@Nullable cmy $$0) {
      String $$1;
      xp $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = xp.b("Lectern");
      } else {
         $$1 = $$0.af().getString();
         $$2 = $$0.O_();
      }

      evs $$5 = evs.b(this.o);
      return new ep(eo.a, $$5, evr.a, (arf)this.n, 2, $$1, $$2, this.n.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cuq.a($$1, (vp)$$0.p("Book")).orElse(cuq.l), null);
      } else {
         this.g = cuq.l;
      }

      this.i = c(this.g);
      this.h = ayz.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b().e()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cuq.l);
   }

   @Override
   public cpv createMenu(int $$0, cmx $$1, cmy $$2) {
      return new cqz($$0, this.e, this.f);
   }

   @Override
   public xp O_() {
      return xp.c("container.lectern");
   }

   private static int c(cuq $$0) {
      cxz $$1 = $$0.a(km.J);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cxy $$2 = $$0.a(km.I);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
