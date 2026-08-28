import javax.annotation.Nullable;

public class dvv extends duq implements bsr, btc {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bst e = new bst() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return dvv.this.g.f();
      }

      @Override
      public cxg a(int $$0) {
         return $$0 == 0 ? dvv.this.g : cxg.j;
      }

      @Override
      public cxg a(int $$0, int $$1) {
         if ($$0 == 0) {
            cxg $$2 = dvv.this.g.a($$1);
            if (dvv.this.g.f()) {
               dvv.this.k();
            }

            return $$2;
         } else {
            return cxg.j;
         }
      }

      @Override
      public cxg b(int $$0) {
         if ($$0 == 0) {
            cxg $$1 = dvv.this.g;
            dvv.this.g = cxg.j;
            dvv.this.k();
            return $$1;
         } else {
            return cxg.j;
         }
      }

      @Override
      public void a(int $$0, cxg $$1) {
      }

      @Override
      public int ao_() {
         return 1;
      }

      @Override
      public void e() {
         dvv.this.e();
      }

      @Override
      public boolean a(cpo $$0) {
         return bst.a(dvv.this, $$0) && dvv.this.c();
      }

      @Override
      public boolean b(int $$0, cxg $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final ctf f = new ctf() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dvv.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dvv.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   cxg g = cxg.j;
   int h;
   private int i;

   public dvv(jh $$0, dxo $$1) {
      super(dus.E, $$0, $$1);
   }

   public cxg b() {
      return this.g;
   }

   public boolean c() {
      return this.g.b(ku.S) || this.g.b(ku.T);
   }

   public void b(cxg $$0) {
      this.a($$0, null);
   }

   void k() {
      this.h = 0;
      this.i = 0;
      doq.a(null, this.i(), this.aB_(), this.m(), false);
   }

   public void a(cxg $$0, @Nullable cpo $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = c(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = azu.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         doq.a(this.i(), this.aB_(), this.m());
      }
   }

   public int f() {
      return this.h;
   }

   public int j() {
      float $$0 = this.i > 1 ? (float)this.f() / ((float)this.i - 1.0F) : 1.0F;
      return azu.d($$0 * 14.0F) + (this.c() ? 1 : 0);
   }

   private cxg b(cxg $$0, @Nullable cpo $$1) {
      if (this.o instanceof arx $$2) {
         czc.a($$0, this.a($$1, $$2), $$1);
      }

      return $$0;
   }

   private ew a(@Nullable cpo $$0, arx $$1) {
      String $$2;
      xk $$3;
      if ($$0 == null) {
         $$2 = "Lectern";
         $$3 = xk.b("Lectern");
      } else {
         $$2 = $$0.al().getString();
         $$3 = $$0.p_();
      }

      fbr $$6 = fbr.b(this.p);
      return new ew(ev.a, $$6, fbq.a, $$1, 2, $$2, $$3, $$1.p(), $$0);
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cxg.a($$1, (vj)$$0.p("Book")).orElse(cxg.j), null);
      } else {
         this.g = cxg.j;
      }

      this.i = c(this.g);
      this.h = azu.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.b().f()) {
         $$0.a("Book", this.b().a($$1));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.b(cxg.j);
   }

   @Override
   public cst createMenu(int $$0, cpn $$1, cpo $$2) {
      return new ctz($$0, this.e, this.f);
   }

   @Override
   public xk p_() {
      return xk.c("container.lectern");
   }

   private static int c(cxg $$0) {
      dao $$1 = $$0.a(ku.T);
      if ($$1 != null) {
         return $$1.a().size();
      } else {
         dan $$2 = $$0.a(ku.S);
         return $$2 != null ? $$2.a().size() : 0;
      }
   }
}
