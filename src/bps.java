import javax.annotation.Nullable;

public abstract class bps<S> implements bpz<S> {
   private bps.b[] a = new bps.b[256];
   private final bpw<S> b;
   private final bqb c = new bqb();
   private bps.d[] d = new bps.d[16];
   private int e;
   private final bps<S>.c f = new bps.c();

   protected bps(bpw<S> $$0) {
      this.b = $$0;
   }

   @Override
   public bqb a() {
      return this.c;
   }

   @Override
   public bpw<S> b() {
      return this.b;
   }

   @Nullable
   @Override
   public <T> T a(bpy<S, T> $$0) {
      int $$1 = this.g();
      bps.b $$2 = this.b($$1);
      int $$3 = $$2.a($$0.a());
      if ($$3 != -1) {
         bps.a<T> $$4 = $$2.a($$3);
         if ($$4 != null) {
            if ($$4 == bps.a.a) {
               return null;
            }

            this.a($$4.c);
            return $$4.b;
         }
      } else {
         $$3 = $$2.b($$0.a());
      }

      T $$5 = $$0.b().a(this);
      bps.a<T> $$6;
      if ($$5 == null) {
         $$6 = bps.a.a();
      } else {
         int $$7 = this.g();
         $$6 = new bps.a<>($$5, $$7);
      }

      $$2.a($$3, $$6);
      return $$5;
   }

   private bps.b b(int $$0) {
      int $$1 = this.a.length;
      if ($$0 >= $$1) {
         int $$2 = ag.a($$1, $$0 + 1);
         bps.b[] $$3 = new bps.b[$$2];
         System.arraycopy(this.a, 0, $$3, 0, $$1);
         this.a = $$3;
      }

      bps.b $$4 = this.a[$$0];
      if ($$4 == null) {
         $$4 = new bps.b();
         this.a[$$0] = $$4;
      }

      return $$4;
   }

   @Override
   public bpt c() {
      int $$0 = this.d.length;
      if (this.e >= $$0) {
         int $$1 = ag.a($$0, this.e + 1);
         bps.d[] $$2 = new bps.d[$$1];
         System.arraycopy(this.d, 0, $$2, 0, $$0);
         this.d = $$2;
      }

      int $$3 = this.e++;
      bps.d $$4 = this.d[$$3];
      if ($$4 == null) {
         $$4 = new bps.d();
         this.d[$$3] = $$4;
      } else {
         $$4.c();
      }

      return $$4;
   }

   @Override
   public void d() {
      this.e--;
   }

   @Override
   public bpz<S> e() {
      return this.f;
   }

   static record a<T>(@Nullable T b, int c) {
      public static final bps.a<?> a = new bps.a(null, -1);

      public static <T> bps.a<T> a() {
         return (bps.a<T>)a;
      }
   }

   static class b {
      public static final int a = 2;
      private static final int b = -1;
      private Object[] c = new Object[16];
      private int d;

      public int a(bpr<?> $$0) {
         for (int $$1 = 0; $$1 < this.d; $$1 += 2) {
            if (this.c[$$1] == $$0) {
               return $$1;
            }
         }

         return -1;
      }

      public int b(bpr<?> $$0) {
         int $$1 = this.d;
         this.d += 2;
         int $$2 = $$1 + 1;
         int $$3 = this.c.length;
         if ($$2 >= $$3) {
            int $$4 = ag.a($$3, $$2 + 1);
            Object[] $$5 = new Object[$$4];
            System.arraycopy(this.c, 0, $$5, 0, $$3);
            this.c = $$5;
         }

         this.c[$$1] = $$0;
         return $$1;
      }

      @Nullable
      public <T> bps.a<T> a(int $$0) {
         return (bps.a<T>)this.c[$$0 + 1];
      }

      public void a(int $$0, bps.a<?> $$1) {
         this.c[$$0 + 1] = $$1;
      }
   }

   class c implements bpz<S> {
      private final bpw<S> b = new bpw.b<>();

      @Override
      public bpw<S> b() {
         return this.b;
      }

      @Override
      public bqb a() {
         return bps.this.a();
      }

      @Nullable
      @Override
      public <T> T a(bpy<S, T> $$0) {
         return bps.this.a($$0);
      }

      @Override
      public S f() {
         return bps.this.f();
      }

      @Override
      public int g() {
         return bps.this.g();
      }

      @Override
      public void a(int $$0) {
         bps.this.a($$0);
      }

      @Override
      public bpt c() {
         return bps.this.c();
      }

      @Override
      public void d() {
         bps.this.d();
      }

      @Override
      public bpz<S> e() {
         return this;
      }
   }

   static class d implements bpt {
      private boolean b;

      @Override
      public void a() {
         this.b = true;
      }

      @Override
      public boolean b() {
         return this.b;
      }

      public void c() {
         this.b = false;
      }
   }
}
