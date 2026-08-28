public abstract class ahu implements zp<agv> {
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

   protected ahu(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6, boolean $$7, boolean $$8) {
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
   public abstract zr<? extends ahu> a();

   public void a(agv $$0) {
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

   public static class a extends ahu {
      public static final zg<wf, ahu.a> j = zp.a(ahu.a::b, ahu.a::a);

      public a(double $$0, double $$1, double $$2, boolean $$3, boolean $$4) {
         super($$0, $$1, $$2, 0.0F, 0.0F, $$3, $$4, true, false);
      }

      private static ahu.a a(wf $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         short $$4 = $$0.readUnsignedByte();
         boolean $$5 = ahu.a($$4);
         boolean $$6 = ahu.b($$4);
         return new ahu.a($$1, $$2, $$3, $$5, $$6);
      }

      private void b(wf $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.l(ahu.a(this.f, this.g));
      }

      @Override
      public zr<ahu.a> a() {
         return agt.bE;
      }
   }

   public static class b extends ahu {
      public static final zg<wf, ahu.b> j = zp.a(ahu.b::b, ahu.b::a);

      public b(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, true, true);
      }

      private static ahu.b a(wf $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         float $$4 = $$0.readFloat();
         float $$5 = $$0.readFloat();
         short $$6 = $$0.readUnsignedByte();
         boolean $$7 = ahu.a($$6);
         boolean $$8 = ahu.b($$6);
         return new ahu.b($$1, $$2, $$3, $$4, $$5, $$7, $$8);
      }

      private void b(wf $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.l(ahu.a(this.f, this.g));
      }

      @Override
      public zr<ahu.b> a() {
         return agt.bF;
      }
   }

   public static class c extends ahu {
      public static final zg<wf, ahu.c> j = zp.a(ahu.c::b, ahu.c::a);

      public c(float $$0, float $$1, boolean $$2, boolean $$3) {
         super(0.0, 0.0, 0.0, $$0, $$1, $$2, $$3, false, true);
      }

      private static ahu.c a(wf $$0) {
         float $$1 = $$0.readFloat();
         float $$2 = $$0.readFloat();
         short $$3 = $$0.readUnsignedByte();
         boolean $$4 = ahu.a($$3);
         boolean $$5 = ahu.b($$3);
         return new ahu.c($$1, $$2, $$4, $$5);
      }

      private void b(wf $$0) {
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.l(ahu.a(this.f, this.g));
      }

      @Override
      public zr<ahu.c> a() {
         return agt.bG;
      }
   }

   public static class d extends ahu {
      public static final zg<wf, ahu.d> j = zp.a(ahu.d::b, ahu.d::a);

      public d(boolean $$0, boolean $$1) {
         super(0.0, 0.0, 0.0, 0.0F, 0.0F, $$0, $$1, false, false);
      }

      private static ahu.d a(wf $$0) {
         short $$1 = $$0.readUnsignedByte();
         boolean $$2 = ahu.a($$1);
         boolean $$3 = ahu.b($$1);
         return new ahu.d($$2, $$3);
      }

      private void b(wf $$0) {
         $$0.l(ahu.a(this.f, this.g));
      }

      @Override
      public zr<ahu.d> a() {
         return agt.bH;
      }
   }
}
