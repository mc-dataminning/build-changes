public abstract class evk implements evq {
   private int c;
   private int d;
   protected int a;
   protected int b;

   public evk(int $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = $$3;
   }

   @Override
   public void f(int $$0) {
      this.b($$1 -> {
         int $$2 = $$1.r() + ($$0 - this.r());
         $$1.f($$2);
      });
      this.c = $$0;
   }

   @Override
   public void g(int $$0) {
      this.b($$1 -> {
         int $$2 = $$1.t() + ($$0 - this.t());
         $$1.g($$2);
      });
      this.d = $$0;
   }

   @Override
   public int r() {
      return this.c;
   }

   @Override
   public int t() {
      return this.d;
   }

   @Override
   public int l() {
      return this.a;
   }

   @Override
   public int i() {
      return this.b;
   }

   protected abstract static class a {
      public final evr a;
      public final evs.a b;

      protected a(evr $$0, evs $$1) {
         this.a = $$0;
         this.b = $$1.h();
      }

      public int a() {
         return this.a.i() + this.b.b + this.b.d;
      }

      public int b() {
         return this.a.l() + this.b.a + this.b.c;
      }

      public void a(int $$0, int $$1) {
         float $$2 = (float)this.b.a;
         float $$3 = (float)($$1 - this.a.l() - this.b.c);
         int $$4 = (int)arp.i(this.b.e, $$2, $$3);
         this.a.f($$4 + $$0);
      }

      public void b(int $$0, int $$1) {
         float $$2 = (float)this.b.b;
         float $$3 = (float)($$1 - this.a.i() - this.b.d);
         int $$4 = Math.round(arp.i(this.b.f, $$2, $$3));
         this.a.g($$4 + $$0);
      }
   }
}
