public abstract class ahp implements zk<agq> {
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

   protected ahp(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6, boolean $$7, boolean $$8) {
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
   public abstract zm<? extends ahp> a();

   public void a(agq $$0) {
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

   public static class a extends ahp {
      public static final zb<wa, ahp.a> j = zk.a(ahp.a::b, ahp.a::a);

      public a(double $$0, double $$1, double $$2, boolean $$3, boolean $$4) {
         super($$0, $$1, $$2, 0.0F, 0.0F, $$3, $$4, true, false);
      }

      private static ahp.a a(wa $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         short $$4 = $$0.readUnsignedByte();
         boolean $$5 = ahp.a($$4);
         boolean $$6 = ahp.b($$4);
         return new ahp.a($$1, $$2, $$3, $$5, $$6);
      }

      private void b(wa $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.l(ahp.a(this.f, this.g));
      }

      @Override
      public zm<ahp.a> a() {
         return ago.bE;
      }
   }

   public static class b extends ahp {
      public static final zb<wa, ahp.b> j = zk.a(ahp.b::b, ahp.b::a);

      public b(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, true, true);
      }

      private static ahp.b a(wa $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         float $$4 = $$0.readFloat();
         float $$5 = $$0.readFloat();
         short $$6 = $$0.readUnsignedByte();
         boolean $$7 = ahp.a($$6);
         boolean $$8 = ahp.b($$6);
         return new ahp.b($$1, $$2, $$3, $$4, $$5, $$7, $$8);
      }

      private void b(wa $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.l(ahp.a(this.f, this.g));
      }

      @Override
      public zm<ahp.b> a() {
         return ago.bF;
      }
   }

   public static class c extends ahp {
      public static final zb<wa, ahp.c> j = zk.a(ahp.c::b, ahp.c::a);

      public c(float $$0, float $$1, boolean $$2, boolean $$3) {
         super(0.0, 0.0, 0.0, $$0, $$1, $$2, $$3, false, true);
      }

      private static ahp.c a(wa $$0) {
         float $$1 = $$0.readFloat();
         float $$2 = $$0.readFloat();
         short $$3 = $$0.readUnsignedByte();
         boolean $$4 = ahp.a($$3);
         boolean $$5 = ahp.b($$3);
         return new ahp.c($$1, $$2, $$4, $$5);
      }

      private void b(wa $$0) {
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.l(ahp.a(this.f, this.g));
      }

      @Override
      public zm<ahp.c> a() {
         return ago.bG;
      }
   }

   public static class d extends ahp {
      public static final zb<wa, ahp.d> j = zk.a(ahp.d::b, ahp.d::a);

      public d(boolean $$0, boolean $$1) {
         super(0.0, 0.0, 0.0, 0.0F, 0.0F, $$0, $$1, false, false);
      }

      private static ahp.d a(wa $$0) {
         short $$1 = $$0.readUnsignedByte();
         boolean $$2 = ahp.a($$1);
         boolean $$3 = ahp.b($$1);
         return new ahp.d($$2, $$3);
      }

      private void b(wa $$0) {
         $$0.l(ahp.a(this.f, this.g));
      }

      @Override
      public zm<ahp.d> a() {
         return ago.bH;
      }
   }
}
