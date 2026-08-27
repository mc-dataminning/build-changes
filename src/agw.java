public abstract class agw implements zb<afz> {
   protected final double a;
   protected final double b;
   protected final double c;
   protected final float d;
   protected final float e;
   protected final boolean f;
   protected final boolean g;
   protected final boolean h;

   protected agw(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6, boolean $$7) {
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
   public abstract zd<? extends agw> a();

   public void a(afz $$0) {
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

   public static class a extends agw {
      public static final ys<vu, agw.a> i = zb.a(agw.a::b, agw.a::a);

      public a(double $$0, double $$1, double $$2, boolean $$3) {
         super($$0, $$1, $$2, 0.0F, 0.0F, $$3, true, false);
      }

      private static agw.a a(vu $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         boolean $$4 = $$0.readUnsignedByte() != 0;
         return new agw.a($$1, $$2, $$3, $$4);
      }

      private void b(vu $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.k(this.f ? 1 : 0);
      }

      @Override
      public zd<agw.a> a() {
         return afx.bz;
      }
   }

   public static class b extends agw {
      public static final ys<vu, agw.b> i = zb.a(agw.b::b, agw.b::a);

      public b(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5, true, true);
      }

      private static agw.b a(vu $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         float $$4 = $$0.readFloat();
         float $$5 = $$0.readFloat();
         boolean $$6 = $$0.readUnsignedByte() != 0;
         return new agw.b($$1, $$2, $$3, $$4, $$5, $$6);
      }

      private void b(vu $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.k(this.f ? 1 : 0);
      }

      @Override
      public zd<agw.b> a() {
         return afx.bA;
      }
   }

   public static class c extends agw {
      public static final ys<vu, agw.c> i = zb.a(agw.c::b, agw.c::a);

      public c(float $$0, float $$1, boolean $$2) {
         super(0.0, 0.0, 0.0, $$0, $$1, $$2, false, true);
      }

      private static agw.c a(vu $$0) {
         float $$1 = $$0.readFloat();
         float $$2 = $$0.readFloat();
         boolean $$3 = $$0.readUnsignedByte() != 0;
         return new agw.c($$1, $$2, $$3);
      }

      private void b(vu $$0) {
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.k(this.f ? 1 : 0);
      }

      @Override
      public zd<agw.c> a() {
         return afx.bB;
      }
   }

   public static class d extends agw {
      public static final ys<vu, agw.d> i = zb.a(agw.d::b, agw.d::a);

      public d(boolean $$0) {
         super(0.0, 0.0, 0.0, 0.0F, 0.0F, $$0, false, false);
      }

      private static agw.d a(vu $$0) {
         boolean $$1 = $$0.readUnsignedByte() != 0;
         return new agw.d($$1);
      }

      private void b(vu $$0) {
         $$0.k(this.f ? 1 : 0);
      }

      @Override
      public zd<agw.d> a() {
         return afx.bC;
      }
   }
}
