public abstract class ahb implements ze<agd> {
   protected final double a;
   protected final double b;
   protected final double c;
   protected final float d;
   protected final float e;
   protected final boolean f;
   protected final boolean g;
   protected final boolean h;

   protected ahb(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6, boolean $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   @Override
   public abstract zg<? extends ahb> a();

   public void a(agd $$0) {
      $$0.a(this);
   }

   public double a(double $$0) {
      return this.g ? this.a : $$0;
   }

   public double b(double $$0) {
      return this.g ? this.b : $$0;
   }

   public double c(double $$0) {
      return this.g ? this.c : $$0;
   }

   public float a(float $$0) {
      return this.h ? this.d : $$0;
   }

   public float b(float $$0) {
      return this.h ? this.e : $$0;
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

   public static class a extends ahb {
      public static final yv<vx, ahb.a> i = ze.a(ahb.a::b, ahb.a::a);

      public a(double $$0, double $$1, double $$2, boolean $$3) {
         super($$0, $$1, $$2, 0.0F, 0.0F, $$3, true, false);
      }

      private static ahb.a a(vx $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         boolean $$4 = $$0.readUnsignedByte() != 0;
         return new ahb.a($$1, $$2, $$3, $$4);
      }

      private void b(vx $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.k(this.f ? 1 : 0);
      }

      @Override
      public zg<ahb.a> a() {
         return agb.bA;
      }
   }

   public static class b extends ahb {
      public static final yv<vx, ahb.b> i = ze.a(ahb.b::b, ahb.b::a);

      public b(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5, true, true);
      }

      private static ahb.b a(vx $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         float $$4 = $$0.readFloat();
         float $$5 = $$0.readFloat();
         boolean $$6 = $$0.readUnsignedByte() != 0;
         return new ahb.b($$1, $$2, $$3, $$4, $$5, $$6);
      }

      private void b(vx $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.k(this.f ? 1 : 0);
      }

      @Override
      public zg<ahb.b> a() {
         return agb.bB;
      }
   }

   public static class c extends ahb {
      public static final yv<vx, ahb.c> i = ze.a(ahb.c::b, ahb.c::a);

      public c(float $$0, float $$1, boolean $$2) {
         super(0.0, 0.0, 0.0, $$0, $$1, $$2, false, true);
      }

      private static ahb.c a(vx $$0) {
         float $$1 = $$0.readFloat();
         float $$2 = $$0.readFloat();
         boolean $$3 = $$0.readUnsignedByte() != 0;
         return new ahb.c($$1, $$2, $$3);
      }

      private void b(vx $$0) {
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.k(this.f ? 1 : 0);
      }

      @Override
      public zg<ahb.c> a() {
         return agb.bC;
      }
   }

   public static class d extends ahb {
      public static final yv<vx, ahb.d> i = ze.a(ahb.d::b, ahb.d::a);

      public d(boolean $$0) {
         super(0.0, 0.0, 0.0, 0.0F, 0.0F, $$0, false, false);
      }

      private static ahb.d a(vx $$0) {
         boolean $$1 = $$0.readUnsignedByte() != 0;
         return new ahb.d($$1);
      }

      private void b(vx $$0) {
         $$0.k(this.f ? 1 : 0);
      }

      @Override
      public zg<ahb.d> a() {
         return agb.bD;
      }
   }
}
