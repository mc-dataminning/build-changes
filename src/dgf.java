import javax.annotation.Nullable;

public class dgf extends dfd implements bio, bja {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final biq e = new biq() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean ai_() {
         return dgf.this.g.b();
      }

      @Override
      public clj a(int $$0) {
         return $$0 == 0 ? dgf.this.g : clj.b;
      }

      @Override
      public clj a(int $$0, int $$1) {
         if ($$0 == 0) {
            clj $$2 = dgf.this.g.a($$1);
            if (dgf.this.g.b()) {
               dgf.this.j();
            }

            return $$2;
         } else {
            return clj.b;
         }
      }

      @Override
      public clj b(int $$0) {
         if ($$0 == 0) {
            clj $$1 = dgf.this.g;
            dgf.this.g = clj.b;
            dgf.this.j();
            return $$1;
         } else {
            return clj.b;
         }
      }

      @Override
      public void a(int $$0, clj $$1) {
      }

      @Override
      public int aj_() {
         return 1;
      }

      @Override
      public void e() {
         dgf.this.e();
      }

      @Override
      public boolean a(cdu $$0) {
         return biq.a(dgf.this, $$0) && dgf.this.f();
      }

      @Override
      public boolean b(int $$0, clj $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final cgw f = new cgw() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? dgf.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            dgf.this.a($$1);
         }
      }

      @Override
      public int a() {
         return 1;
      }
   };
   clj g = clj.b;
   int h;
   private int i;

   public dgf(ht $$0, dhi $$1) {
      super(dff.D, $$0, $$1);
   }

   public clj c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(clm.tS) || this.g.a(clm.tT);
   }

   public void a(clj $$0) {
      this.a($$0, null);
   }

   void j() {
      this.h = 0;
      this.i = 0;
      czk.a(null, this.k(), this.p(), this.q(), false);
   }

   public void a(clj $$0, @Nullable cdu $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = cnf.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = atm.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         czk.a(this.k(), this.p(), this.q());
      }
   }

   public int g() {
      return this.h;
   }

   public int i() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return atm.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private clj b(clj $$0, @Nullable cdu $$1) {
      if (this.o instanceof ame && $$0.a(clm.tT)) {
         cnf.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private du a(@Nullable cdu $$0) {
      String $$1;
      ur $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = ur.b("Lectern");
      } else {
         $$1 = $$0.ad().getString();
         $$2 = $$0.P_();
      }

      eju $$5 = eju.b(this.p);
      return new du(dt.a, $$5, ejt.a, (ame)this.o, 2, $$1, $$2, this.o.n(), $$0);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(clj.a($$0.p("Book")), null);
      } else {
         this.g = clj.b;
      }

      this.i = cnf.k(this.g);
      this.h = atm.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", this.c().b(new rz()));
         $$0.a("Page", this.h);
      }
   }

   @Override
   public void a() {
      this.a(clj.b);
   }

   @Override
   public cgm createMenu(int $$0, cdt $$1, cdu $$2) {
      return new chq($$0, this.e, this.f);
   }

   @Override
   public ur P_() {
      return ur.c("container.lectern");
   }
}
