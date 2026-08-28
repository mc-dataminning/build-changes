public abstract class ahs implements zj<agt> {
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

   protected ahs(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6, boolean $$7, boolean $$8) {
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
   public abstract zl<? extends ahs> a();

   public void a(agt $$0) {
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

   public static class a extends ahs {
      public static final za<vy, ahs.a> j = zj.a(ahs.a::b, ahs.a::a);

      public a(ffs $$0, boolean $$1, boolean $$2) {
         super($$0.d, $$0.e, $$0.f, 0.0F, 0.0F, $$1, $$2, true, false);
      }

      public a(double $$0, double $$1, double $$2, boolean $$3, boolean $$4) {
         super($$0, $$1, $$2, 0.0F, 0.0F, $$3, $$4, true, false);
      }

      private static ahs.a a(vy $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         short $$4 = $$0.readUnsignedByte();
         boolean $$5 = ahs.a($$4);
         boolean $$6 = ahs.b($$4);
         return new ahs.a($$1, $$2, $$3, $$5, $$6);
      }

      private void b(vy $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.l(ahs.a(this.f, this.g));
      }

      @Override
      public zl<ahs.a> a() {
         return agr.bI;
      }
   }

   public static class b extends ahs {
      public static final za<vy, ahs.b> j = zj.a(ahs.b::b, ahs.b::a);

      public b(ffs $$0, float $$1, float $$2, boolean $$3, boolean $$4) {
         super($$0.d, $$0.e, $$0.f, $$1, $$2, $$3, $$4, true, true);
      }

      public b(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, true, true);
      }

      private static ahs.b a(vy $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         float $$4 = $$0.readFloat();
         float $$5 = $$0.readFloat();
         short $$6 = $$0.readUnsignedByte();
         boolean $$7 = ahs.a($$6);
         boolean $$8 = ahs.b($$6);
         return new ahs.b($$1, $$2, $$3, $$4, $$5, $$7, $$8);
      }

      private void b(vy $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.l(ahs.a(this.f, this.g));
      }

      @Override
      public zl<ahs.b> a() {
         return agr.bJ;
      }
   }

   public static class c extends ahs {
      public static final za<vy, ahs.c> j = zj.a(ahs.c::b, ahs.c::a);

      public c(float $$0, float $$1, boolean $$2, boolean $$3) {
         super(0.0, 0.0, 0.0, $$0, $$1, $$2, $$3, false, true);
      }

      private static ahs.c a(vy $$0) {
         float $$1 = $$0.readFloat();
         float $$2 = $$0.readFloat();
         short $$3 = $$0.readUnsignedByte();
         boolean $$4 = ahs.a($$3);
         boolean $$5 = ahs.b($$3);
         return new ahs.c($$1, $$2, $$4, $$5);
      }

      private void b(vy $$0) {
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.l(ahs.a(this.f, this.g));
      }

      @Override
      public zl<ahs.c> a() {
         return agr.bK;
      }
   }

   public static class d extends ahs {
      public static final za<vy, ahs.d> j = zj.a(ahs.d::b, ahs.d::a);

      public d(boolean $$0, boolean $$1) {
         super(0.0, 0.0, 0.0, 0.0F, 0.0F, $$0, $$1, false, false);
      }

      private static ahs.d a(vy $$0) {
         short $$1 = $$0.readUnsignedByte();
         boolean $$2 = ahs.a($$1);
         boolean $$3 = ahs.b($$1);
         return new ahs.d($$2, $$3);
      }

      private void b(vy $$0) {
         $$0.l(ahs.a(this.f, this.g));
      }

      @Override
      public zl<ahs.d> a() {
         return agr.bL;
      }
   }
}
