import javax.annotation.Nullable;

public abstract class bqd<S> implements bqk<S> {
   private bqd.b[] a = new bqd.b[256];
   private final bqh<S> b;
   private final bqm c = new bqm();
   private bqd.d[] d = new bqd.d[16];
   private int e;
   private final bqd<S>.c f = new bqd.c();

   protected bqd(bqh<S> $$0) {
      this.b = $$0;
   }

   @Override
   public bqm a() {
      return this.c;
   }

   @Override
   public bqh<S> b() {
      return this.b;
   }

   @Nullable
   @Override
   public <T> T a(bqj<S, T> $$0) {
      int $$1 = this.g();
      bqd.b $$2 = this.b($$1);
      int $$3 = $$2.a($$0.a());
      if ($$3 != -1) {
         bqd.a<T> $$4 = $$2.a($$3);
         if ($$4 != null) {
            if ($$4 == bqd.a.a) {
               return null;
            }

            this.a($$4.c);
            return $$4.b;
         }
      } else {
         $$3 = $$2.b($$0.a());
      }

      T $$5 = $$0.b().a(this);
      bqd.a<T> $$6;
      if ($$5 == null) {
         $$6 = bqd.a.a();
      } else {
         int $$7 = this.g();
         $$6 = new bqd.a<>($$5, $$7);
      }

      $$2.a($$3, $$6);
      return $$5;
   }

   private bqd.b b(int $$0) {
      int $$1 = this.a.length;
      if ($$0 >= $$1) {
         int $$2 = ag.a($$1, $$0 + 1);
         bqd.b[] $$3 = new bqd.b[$$2];
         System.arraycopy(this.a, 0, $$3, 0, $$1);
         this.a = $$3;
      }

      bqd.b $$4 = this.a[$$0];
      if ($$4 == null) {
         $$4 = new bqd.b();
         this.a[$$0] = $$4;
      }

      return $$4;
   }

   @Override
   public bqe c() {
      int $$0 = this.d.length;
      if (this.e >= $$0) {
         int $$1 = ag.a($$0, this.e + 1);
         bqd.d[] $$2 = new bqd.d[$$1];
         System.arraycopy(this.d, 0, $$2, 0, $$0);
         this.d = $$2;
      }

      int $$3 = this.e++;
      bqd.d $$4 = this.d[$$3];
      if ($$4 == null) {
         $$4 = new bqd.d();
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
   public bqk<S> e() {
      return this.f;
   }

   static record a<T>(@Nullable T b, int c) {
      public static final bqd.a<?> a = new bqd.a(null, -1);

      public static <T> bqd.a<T> a() {
         return (bqd.a<T>)a;
      }
   }

   static class b {
      public static final int a = 2;
      private static final int b = -1;
      private Object[] c = new Object[16];
      private int d;

      public int a(bqc<?> $$0) {
         for (int $$1 = 0; $$1 < this.d; $$1 += 2) {
            if (this.c[$$1] == $$0) {
               return $$1;
            }
         }

         return -1;
      }

      public int b(bqc<?> $$0) {
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
      public <T> bqd.a<T> a(int $$0) {
         return (bqd.a<T>)this.c[$$0 + 1];
      }

      public void a(int $$0, bqd.a<?> $$1) {
         this.c[$$0 + 1] = $$1;
      }
   }

   class c implements bqk<S> {
      private final bqh<S> b = new bqh.b<>();

      @Override
      public bqh<S> b() {
         return this.b;
      }

      @Override
      public bqm a() {
         return bqd.this.a();
      }

      @Nullable
      @Override
      public <T> T a(bqj<S, T> $$0) {
         return bqd.this.a($$0);
      }

      @Override
      public S f() {
         return bqd.this.f();
      }

      @Override
      public int g() {
         return bqd.this.g();
      }

      @Override
      public void a(int $$0) {
         bqd.this.a($$0);
      }

      @Override
      public bqe c() {
         return bqd.this.c();
      }

      @Override
      public void d() {
         bqd.this.d();
      }

      @Override
      public bqk<S> e() {
         return this;
      }
   }

   static class d implements bqe {
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
