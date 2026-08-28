public abstract class ahq implements zl<agr> {
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

   protected ahq(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6, boolean $$7, boolean $$8) {
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
   public abstract zn<? extends ahq> a();

   public void a(agr $$0) {
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

   public static class a extends ahq {
      public static final zc<wb, ahq.a> j = zl.a(ahq.a::b, ahq.a::a);

      public a(double $$0, double $$1, double $$2, boolean $$3, boolean $$4) {
         super($$0, $$1, $$2, 0.0F, 0.0F, $$3, $$4, true, false);
      }

      private static ahq.a a(wb $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         short $$4 = $$0.readUnsignedByte();
         boolean $$5 = ahq.a($$4);
         boolean $$6 = ahq.b($$4);
         return new ahq.a($$1, $$2, $$3, $$5, $$6);
      }

      private void b(wb $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.l(ahq.a(this.f, this.g));
      }

      @Override
      public zn<ahq.a> a() {
         return agp.bE;
      }
   }

   public static class b extends ahq {
      public static final zc<wb, ahq.b> j = zl.a(ahq.b::b, ahq.b::a);

      public b(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, true, true);
      }

      private static ahq.b a(wb $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         float $$4 = $$0.readFloat();
         float $$5 = $$0.readFloat();
         short $$6 = $$0.readUnsignedByte();
         boolean $$7 = ahq.a($$6);
         boolean $$8 = ahq.b($$6);
         return new ahq.b($$1, $$2, $$3, $$4, $$5, $$7, $$8);
      }

      private void b(wb $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.l(ahq.a(this.f, this.g));
      }

      @Override
      public zn<ahq.b> a() {
         return agp.bF;
      }
   }

   public static class c extends ahq {
      public static final zc<wb, ahq.c> j = zl.a(ahq.c::b, ahq.c::a);

      public c(float $$0, float $$1, boolean $$2, boolean $$3) {
         super(0.0, 0.0, 0.0, $$0, $$1, $$2, $$3, false, true);
      }

      private static ahq.c a(wb $$0) {
         float $$1 = $$0.readFloat();
         float $$2 = $$0.readFloat();
         short $$3 = $$0.readUnsignedByte();
         boolean $$4 = ahq.a($$3);
         boolean $$5 = ahq.b($$3);
         return new ahq.c($$1, $$2, $$4, $$5);
      }

      private void b(wb $$0) {
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.l(ahq.a(this.f, this.g));
      }

      @Override
      public zn<ahq.c> a() {
         return agp.bG;
      }
   }

   public static class d extends ahq {
      public static final zc<wb, ahq.d> j = zl.a(ahq.d::b, ahq.d::a);

      public d(boolean $$0, boolean $$1) {
         super(0.0, 0.0, 0.0, 0.0F, 0.0F, $$0, $$1, false, false);
      }

      private static ahq.d a(wb $$0) {
         short $$1 = $$0.readUnsignedByte();
         boolean $$2 = ahq.a($$1);
         boolean $$3 = ahq.b($$1);
         return new ahq.d($$2, $$3);
      }

      private void b(wb $$0) {
         $$0.l(ahq.a(this.f, this.g));
      }

      @Override
      public zn<ahq.d> a() {
         return agp.bH;
      }
   }
}
