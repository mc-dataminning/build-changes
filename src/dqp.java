import javax.annotation.Nullable;

public class dqp extends dpn implements bpu, bqh {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bpw e = new bpw() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dqp.this.g.e();
      }

      @Override
      public cua a(int $$0) {
         return $$0 == 0 ? dqp.this.g : cua.l;
      }

      @Override
      public cua a(int $$0, int $$1) {
         if ($$0 == 0) {
            cua $$2 = dqp.this.g.a($$1);
            if (dqp.this.g.e()) {
               dqp.this.k();
            }

            return $$2;
         } else {
            return cua.l;
         }
      }

      @Override
      public cua b(int $$0) {
         if ($$0 == 0) {
            cua $$1 = dqp.this.g;
            dqp.this.g = cua.l;
            dqp.this.k();
            return $$1;
         } else {
            return cua.l;
         }
      }

      @Override
      public void a(int $$0, cua $$1) {
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public void e() {
         dqp.this.e();
      }

      @Override
      public boolean a(cmh $$0) {
         return bpw.a(dqp.this, $$0) && dqp.this.c();
      }

      @Override
      public boolean b(int $$0, cua $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cpp f = new cpp() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dqp.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dqp.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cua g = cua.l;
   int h;
   private int i;

   public dqp(ja $$0, dsh $$1) {
      super(dpp.D, $$0, $$1);
   }

   public cua b() {
      return this.g;
   }

   public boolean c() {
      return this.g.a(cud.tZ) || this.g.a(cud.ua);
   }

   public void b(cua $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      djq.a(null, this.i(), this.az_(), this.n(), false);
   }

   public void a(cua $$0, @Nullable cmh $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = aye.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         djq.a(this.i(), this.az_(), this.n());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return aye.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cua b(cua $$0, @Nullable cmh $$1) {
      if (this.n instanceof aqk && $$0.a(cud.ua)) {
         cvy.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private eq a(@Nullable cmh $$0) {
      String $$1;
      wu $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = wu.b("Lectern");
      } else {
         $$1 = $$0.af().getString();
         $$2 = $$0.O_();
      }

      evz $$5 = evz.b(this.o);
      return new eq(ep.a, $$5, evy.a, (aqk)this.n, 2, $$1, $$2, this.n.o(), $$0);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cua.a($$1, (uu)$$0.p("Book")).orElse(cua.l), null);
      } else {
         this.g = cua.l;
      }

      this.i = c(this.g);
      this.h = aye.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.b().e()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cua.l);
   }

   @Override
   public cpe createMenu(int $$0, cmg $$1, cmh $$2) {
      return new cqj($$0, this.e, this.f);
   }

   @Override
   public wu O_() {
      return wu.c("container.lectern");
   }

   private static int c(cua $$0) {
      cxi $$1 = $$0.a(kn.J);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         cxh $$2 = $$0.a(kn.I);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
