import javax.annotation.Nullable;

public abstract class bpu<S> implements bqb<S> {
   private bpu.b[] a = new bpu.b[256];
   private final bpy<S> b;
   private final bqd c = new bqd();
   private bpu.d[] d = new bpu.d[16];
   private int e;
   private final bpu<S>.c f = new bpu.c();

   protected bpu(bpy<S> $$0) {
      this.b = $$0;
   }

   @Override
   public bqd a() {
      return this.c;
   }

   @Override
   public bpy<S> b() {
      return this.b;
   }

   @Nullable
   @Override
   public <T> T a(bqa<S, T> $$0) {
      int $$1 = this.g();
      bpu.b $$2 = this.b($$1);
      int $$3 = $$2.a($$0.a());
      if ($$3 != -1) {
         bpu.a<T> $$4 = $$2.a($$3);
         if ($$4 != null) {
            if ($$4 == bpu.a.a) {
               return null;
            }

            this.a($$4.c);
            return $$4.b;
         }
      } else {
         $$3 = $$2.b($$0.a());
      }

      T $$5 = $$0.b().a(this);
      bpu.a<T> $$6;
      if ($$5 == null) {
         $$6 = bpu.a.a();
      } else {
         int $$7 = this.g();
         $$6 = new bpu.a<>($$5, $$7);
      }

      $$2.a($$3, $$6);
      return $$5;
   }

   private bpu.b b(int $$0) {
      int $$1 = this.a.length;
      if ($$0 >= $$1) {
         int $$2 = ag.a($$1, $$0 + 1);
         bpu.b[] $$3 = new bpu.b[$$2];
         System.arraycopy(this.a, 0, $$3, 0, $$1);
         this.a = $$3;
      }

      bpu.b $$4 = this.a[$$0];
      if ($$4 == null) {
         $$4 = new bpu.b();
         this.a[$$0] = $$4;
      }

      return $$4;
   }

   @Override
   public bpv c() {
      int $$0 = this.d.length;
      if (this.e >= $$0) {
         int $$1 = ag.a($$0, this.e + 1);
         bpu.d[] $$2 = new bpu.d[$$1];
         System.arraycopy(this.d, 0, $$2, 0, $$0);
         this.d = $$2;
      }

      int $$3 = this.e++;
      bpu.d $$4 = this.d[$$3];
      if ($$4 == null) {
         $$4 = new bpu.d();
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
   public bqb<S> e() {
      return this.f;
   }

   static record a<T>(@Nullable T b, int c) {
      public static final bpu.a<?> a = new bpu.a(null, -1);

      public static <T> bpu.a<T> a() {
         return (bpu.a<T>)a;
      }
   }

   static class b {
      public static final int a = 2;
      private static final int b = -1;
      private Object[] c = new Object[16];
      private int d;

      public int a(bpt<?> $$0) {
         for (int $$1 = 0; $$1 < this.d; $$1 += 2) {
            if (this.c[$$1] == $$0) {
               return $$1;
            }
         }

         return -1;
      }

      public int b(bpt<?> $$0) {
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
      public <T> bpu.a<T> a(int $$0) {
         return (bpu.a<T>)this.c[$$0 + 1];
      }

      public void a(int $$0, bpu.a<?> $$1) {
         this.c[$$0 + 1] = $$1;
      }
   }

   class c implements bqb<S> {
      private final bpy<S> b = new bpy.b<>();

      @Override
      public bpy<S> b() {
         return this.b;
      }

      @Override
      public bqd a() {
         return bpu.this.a();
      }

      @Nullable
      @Override
      public <T> T a(bqa<S, T> $$0) {
         return bpu.this.a($$0);
      }

      @Override
      public S f() {
         return bpu.this.f();
      }

      @Override
      public int g() {
         return bpu.this.g();
      }

      @Override
      public void a(int $$0) {
         bpu.this.a($$0);
      }

      @Override
      public bpv c() {
         return bpu.this.c();
      }

      @Override
      public void d() {
         bpu.this.d();
      }

      @Override
      public bqb<S> e() {
         return this;
      }
   }

   static class d implements bpv {
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
