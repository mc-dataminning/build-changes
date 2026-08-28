import javax.annotation.Nullable;

public class dqj extends dph implements bql, bqy {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bqn e = new bqn() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dqj.this.g.e();
      }

      @Override
      public cup a(int $$0) {
         return $$0 == 0 ? dqj.this.g : cup.l;
      }

      @Override
      public cup a(int $$0, int $$1) {
         if ($$0 == 0) {
            cup $$2 = dqj.this.g.a($$1);
            if (dqj.this.g.e()) {
               dqj.this.k();
            }

            return $$2;
         } else {
            return cup.l;
         }
      }

      @Override
      public cup b(int $$0) {
         if ($$0 == 0) {
            cup $$1 = dqj.this.g;
            dqj.this.g = cup.l;
            dqj.this.k();
            return $$1;
         } else {
            return cup.l;
         }
      }

      @Override
      public void a(int $$0, cup $$1) {
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public void e() {
         dqj.this.e();
      }

      @Override
      public boolean a(cmx $$0) {
         return bqn.a(dqj.this, $$0) && dqj.this.c();
      }

      @Override
      public boolean b(int $$0, cup $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cqe f = new cqe() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dqj.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dqj.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cup g = cup.l;
   int h;
   private int i;

   public dqj(iz $$0, dsc $$1) {
      super(dpj.D, $$0, $$1);
   }

   public cup b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cus.tZ) || this.g.a(cus.ua);
   }

   public void b(cup $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      djk.a(null, this.i(), this.ay_(), this.n(), false);
   }

   public void a(cup $$0, @Nullable cmx $$1) {
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
         djk.a(this.i(), this.ay_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return ayz.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cup b(cup $$0, @Nullable cmx $$1) {
      if (this.n instanceof arf && $$0.a(cus.ua)) {
         cwn.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private ep a(@Nullable cmx $$0) {
      String $$1;
      xp $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = xp.b("Lectern");
      } else {
         $$1 = $$0.af().getString();
         $$2 = $$0.O_();
      }

      evr $$5 = evr.b(this.o);
      return new ep(eo.a, $$5, evq.a, (arf)this.n, 2, $$1, $$2, this.n.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cup.a($$1, (vp)$$0.p("Book")).orElse(cup.l), null);
      } else {
         this.g = cup.l;
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
      this.b(cup.l);
   }

   @Override
   public cpu createMenu(int $$0, cmw $$1, cmx $$2) {
      return new cqy($$0, this.e, this.f);
   }

   @Override
   public xp O_() {
      return xp.c("container.lectern");
   }

   private static int c(cup $$0) {
      cxy $$1 = $$0.a(km.J);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cxx $$2 = $$0.a(km.I);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
