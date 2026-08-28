public abstract class ftw implements fuc {
   private int c;
   private int d;
   protected int a;
   protected int b;

   public ftw(int $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
   }

   @Override
   public void j(int $$0) {
      this.b($$1 -> {
         int $$2 = $$1.F() + ($$0 - this.F());
         $$1.j($$2);
      });
      this.c = $$0;
   }

   @Override
   public void k(int $$0) {
      this.b($$1 -> {
         int $$2 = $$1.G() + ($$0 - this.G());
         $$1.k($$2);
      });
      this.d = $$0;
   }

   @Override
   public int F() {
      return this.c;
   }

   @Override
   public int G() {
      return this.d;
   }

   @Override
   public int A() {
      return this.a;
   }

   @Override
   public int y() {
      return this.b;
   }

   protected abstract static class a {
      public final fud a;
      public final fue.a b;

      protected a(fud $$0, fue $$1) {
         this.a = $$0;
         this.b = $$1.h();
      }

      public int a() {
         return this.a.y() + this.b.b + this.b.d;
      }

      public int b() {
         return this.a.A() + this.b.a + this.b.c;
      }

      public void a(int $$0, int $$1) {
         float $$2 = (float)this.b.a;
         float $$3 = (float)($$1 - this.a.A() - this.b.c);
         int $$4 = (int)azk.h(this.b.e, $$2, $$3);
         this.a.j($$4 + $$0);
      }

      public void b(int $$0, int $$1) {
         float $$2 = (float)this.b.b;
         float $$3 = (float)($$1 - this.a.y() - this.b.d);
         int $$4 = Math.round(azk.h(this.b.f, $$2, $$3));
         this.a.k($$4 + $$0);
      }
   }
}
