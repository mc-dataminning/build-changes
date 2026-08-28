import javax.annotation.Nullable;

public class dvx extends dus implements bsp, bta {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bsr e = new bsr() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dvx.this.g.f();
      }

      @Override
      public cxh a(int $$0) {
         return $$0 == 0 ? dvx.this.g : cxh.k;
      }

      @Override
      public cxh a(int $$0, int $$1) {
         if ($$0 == 0) {
            cxh $$2 = dvx.this.g.a($$1);
            if (dvx.this.g.f()) {
               dvx.this.k();
            }

            return $$2;
         } else {
            return cxh.k;
         }
      }

      @Override
      public cxh b(int $$0) {
         if ($$0 == 0) {
            cxh $$1 = dvx.this.g;
            dvx.this.g = cxh.k;
            dvx.this.k();
            return $$1;
         } else {
            return cxh.k;
         }
      }

      @Override
      public void a(int $$0, cxh $$1) {
      }

      @Override
      public int an_() {
         return 1;
      }

      @Override
      public void e() {
         dvx.this.e();
      }

      @Override
      public boolean a(cpr $$0) {
         return bsr.a(dvx.this, $$0) && dvx.this.c();
      }

      @Override
      public boolean b(int $$0, cxh $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cti f = new cti() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dvx.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dvx.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cxh g = cxh.k;
   int h;
   private int i;

   public dvx(ji $$0, dxq $$1) {
      super(duu.E, $$0, $$1);
   }

   public cxh b() {
      return this.g;
   }

   public boolean c() {
      return this.g.b(kv.U) || this.g.b(kv.V);
   }

   public void b(cxh $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      dot.a(null, this.i(), this.aA_(), this.m(), false);
   }

   public void a(cxh $$0, @Nullable cpr $$1) {
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
         dot.a(this.i(), this.aA_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayz.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cxh b(cxh $$0, @Nullable cpr $$1) {
      if (this.n instanceof ard $$2) {
         dao.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ex a(@Nullable cpr $$0, ard $$1) {
      String $$2;
      wp $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = wp.b("Lectern");
      } else {
         $$2 = $$0.al().getString();
         $$3 = $$0.m_();
      }

      fbx $$6 = fbx.b(this.o);
      return new ex(ew.a, $$6, fbw.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cxh.a($$1, (un)$$0.p("Book")).orElse(cxh.k), null);
      } else {
         this.g = cxh.k;
      }

      this.i = c(this.g);
      this.h = ayz.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.b().f()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cxh.k);
   }

   @Override
   public void a(ji $$0, dxq $$1, boolean $$2) {
      if ($$1.c(dot.d) && this.n != null) {
         jn $$3 = $$1.c(dot.b);
         cxh $$4 = this.b().v();
         float $$5 = 0.25F * (float)$$3.j();
         float $$6 = 0.25F * (float)$$3.l();
         clw $$7 = new clw(this.n, (double)$$0.u() + 0.5 + (double)$$5, (double)($$0.v() + 1), (double)$$0.w() + 0.5 + (double)$$6, $$4);
         $$7.j();
         this.n.b($$7);
      }
   }

   @Override
   public csw createMenu(int $$0, cpq $$1, cpr $$2) {
      return new cuc($$0, this.e, this.f);
   }

   @Override
   public wp m_() {
      return wp.c("container.lectern");
   }

   private static int c(cxh $$0) {
      dao $$1 = $$0.a(kv.V);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         dan $$2 = $$0.a(kv.U);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
