public abstract class aho implements zf<agp> {
   private static final int j = 1;
   private static final int k = 2;
   protected final double a;
   protected final double b;
   protected final double c;
   protected final float d;
   protected final float e;
   protected final boolean f;
   protected final boolean g;
   protected final boolean h;
   protected final boolean i;

   static int a(boolean $$0, boolean $$1) {
      int $$2 = 0;
      if ($$0) {
         $$2 |= 1;
      }

      if ($$1) {
         $$2 |= 2;
      }

      return $$2;
   }

   static boolean a(int $$0) {
      return ($$0 & 1) != 0;
   }

   static boolean b(int $$0) {
      return ($$0 & 2) != 0;
   }

   protected aho(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6, boolean $$7, boolean $$8) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
      this.i = $$8;
   }

   @Override
   public abstract zh<? extends aho> a();

   public void a(agp $$0) {
      $$0.a(this);
   }

   public double a(double $$0) {
      return this.h ? this.a : $$0;
   }

   public double b(double $$0) {
      return this.h ? this.b : $$0;
   }

   public double c(double $$0) {
      return this.h ? this.c : $$0;
   }

   public float a(float $$0) {
      return this.i ? this.d : $$0;
   }

   public float b(float $$0) {
      return this.i ? this.e : $$0;
   }

   public boolean b() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public boolean f() {
      return this.h;
   }

   public boolean g() {
      return this.i;
   }

   public static class a extends aho {
      public static final yw<vu, aho.a> j = zf.a(aho.a::b, aho.a::a);

      public a(double $$0, double $$1, double $$2, boolean $$3, boolean $$4) {
         super($$0, $$1, $$2, 0.0F, 0.0F, $$3, $$4, true, false);
      }

      private static aho.a a(vu $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         short $$4 = $$0.readUnsignedByte();
         boolean $$5 = aho.a($$4);
         boolean $$6 = aho.b($$4);
         return new aho.a($$1, $$2, $$3, $$5, $$6);
      }

      private void b(vu $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.l(aho.a(this.f, this.g));
      }

      @Override
      public zh<aho.a> a() {
         return agn.bI;
      }
   }

   public static class b extends aho {
      public static final yw<vu, aho.b> j = zf.a(aho.b::b, aho.b::a);

      public b(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, true, true);
      }

      private static aho.b a(vu $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         float $$4 = $$0.readFloat();
         float $$5 = $$0.readFloat();
         short $$6 = $$0.readUnsignedByte();
         boolean $$7 = aho.a($$6);
         boolean $$8 = aho.b($$6);
         return new aho.b($$1, $$2, $$3, $$4, $$5, $$7, $$8);
      }

      private void b(vu $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.l(aho.a(this.f, this.g));
      }

      @Override
      public zh<aho.b> a() {
         return agn.bJ;
      }
   }

   public static class c extends aho {
      public static final yw<vu, aho.c> j = zf.a(aho.c::b, aho.c::a);

      public c(float $$0, float $$1, boolean $$2, boolean $$3) {
         super(0.0, 0.0, 0.0, $$0, $$1, $$2, $$3, false, true);
      }

      private static aho.c a(vu $$0) {
         float $$1 = $$0.readFloat();
         float $$2 = $$0.readFloat();
         short $$3 = $$0.readUnsignedByte();
         boolean $$4 = aho.a($$3);
         boolean $$5 = aho.b($$3);
         return new aho.c($$1, $$2, $$4, $$5);
      }

      private void b(vu $$0) {
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.l(aho.a(this.f, this.g));
      }

      @Override
      public zh<aho.c> a() {
         return agn.bK;
      }
   }

   public static class d extends aho {
      public static final yw<vu, aho.d> j = zf.a(aho.d::b, aho.d::a);

      public d(boolean $$0, boolean $$1) {
         super(0.0, 0.0, 0.0, 0.0F, 0.0F, $$0, $$1, false, false);
      }

      private static aho.d a(vu $$0) {
         short $$1 = $$0.readUnsignedByte();
         boolean $$2 = aho.a($$1);
         boolean $$3 = aho.b($$1);
         return new aho.d($$2, $$3);
      }

      private void b(vu $$0) {
         $$0.l(aho.a(this.f, this.g));
      }

      @Override
      public zh<aho.d> a() {
         return agn.bL;
      }
   }
}
