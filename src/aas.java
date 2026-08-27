import java.util.UUID;

public class aas implements xz<aai> {
   public static final xq<vd, aas> a = xz.a(aas::a, aas::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final aas.c f;
   static final aas.c g = new aas.c() {
      @Override
      public aas.d a() {
         return aas.d.b;
      }

      @Override
      public void a(UUID $$0, aas.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(vd $$0) {
      }
   };

   private aas(UUID $$0, aas.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private aas(vd $$0) {
      this.e = $$0.n();
      aas.d $$1 = $$0.b(aas.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static aas a(bmb $$0) {
      return new aas($$0.i(), new aas.a($$0));
   }

   public static aas a(UUID $$0) {
      return new aas($$0, g);
   }

   public static aas b(bmb $$0) {
      return new aas($$0.i(), new aas.f($$0.k()));
   }

   public static aas c(bmb $$0) {
      return new aas($$0.i(), new aas.e($$0.j()));
   }

   public static aas d(bmb $$0) {
      return new aas($$0.i(), new aas.h($$0.l(), $$0.m()));
   }

   public static aas e(bmb $$0) {
      return new aas($$0.i(), new aas.g($$0.n(), $$0.o(), $$0.p()));
   }

   private void a(vd $$0) {
      $$0.a(this.e);
      $$0.a(this.f.a());
      this.f.a($$0);
   }

   static int a(boolean $$0, boolean $$1, boolean $$2) {
      int $$3 = 0;
      if ($$0) {
         $$3 |= 1;
      }

      if ($$1) {
         $$3 |= 2;
      }

      if ($$2) {
         $$3 |= 4;
      }

      return $$3;
   }

   @Override
   public yb<aas> a() {
      return aet.l;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public void a(aas.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements aas.c {
      private final vs a;
      private final float b;
      private final bmb.a c;
      private final bmb.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bmb $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(vd $$0) {
         this.a = vu.b.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bmb.a.class);
         this.d = $$0.b(bmb.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public aas.d a() {
         return aas.d.a;
      }

      @Override
      public void a(UUID $$0, aas.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(vd $$0) {
         vu.b.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(aas.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, vs $$1, float $$2, bmb.a $$3, bmb.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, vs $$1) {
      }

      default void a(UUID $$0, bmb.a $$1, bmb.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      aas.d a();

      void a(UUID var1, aas.b var2);

      void a(vd var1);
   }

   static enum d {
      a(aas.a::new),
      b($$0 -> aas.g),
      c(aas.f::new),
      d(aas.e::new),
      e(aas.h::new),
      f(aas.g::new);

      final xr<vd, aas.c> g;

      private d(xr<vd, aas.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(vs a) implements aas.c {
      private e(vd $$0) {
         this(vu.b.decode($$0));
      }

      @Override
      public aas.d a() {
         return aas.d.d;
      }

      @Override
      public void a(UUID $$0, aas.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(vd $$0) {
         vu.b.encode($$0, this.a);
      }

      public vs b() {
         return this.a;
      }
   }

   static record f(float a) implements aas.c {
      private f(vd $$0) {
         this($$0.readFloat());
      }

      @Override
      public aas.d a() {
         return aas.d.c;
      }

      @Override
      public void a(UUID $$0, aas.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(vd $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements aas.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(vd $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public aas.d a() {
         return aas.d.f;
      }

      @Override
      public void a(UUID $$0, aas.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(vd $$0) {
         $$0.k(aas.a(this.a, this.b, this.c));
      }
   }

   static class h implements aas.c {
      private final bmb.a a;
      private final bmb.b b;

      h(bmb.a $$0, bmb.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(vd $$0) {
         this.a = $$0.b(bmb.a.class);
         this.b = $$0.b(bmb.b.class);
      }

      @Override
      public aas.d a() {
         return aas.d.e;
      }

      @Override
      public void a(UUID $$0, aas.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(vd $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
