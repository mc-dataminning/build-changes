import java.util.UUID;

public class acd implements zf<abt> {
   public static final yw<wj, acd> a = zf.a(acd::a, acd::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final acd.c f;
   static final acd.c g = new acd.c() {
      @Override
      public acd.d a() {
         return acd.d.b;
      }

      @Override
      public void a(UUID $$0, acd.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wj $$0) {
      }
   };

   private acd(UUID $$0, acd.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private acd(wj $$0) {
      this.e = $$0.n();
      acd.d $$1 = $$0.b(acd.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static acd a(bqg $$0) {
      return new acd($$0.h(), new acd.a($$0));
   }

   public static acd a(UUID $$0) {
      return new acd($$0, g);
   }

   public static acd b(bqg $$0) {
      return new acd($$0.h(), new acd.f($$0.j()));
   }

   public static acd c(bqg $$0) {
      return new acd($$0.h(), new acd.e($$0.i()));
   }

   public static acd d(bqg $$0) {
      return new acd($$0.h(), new acd.h($$0.k(), $$0.l()));
   }

   public static acd e(bqg $$0) {
      return new acd($$0.h(), new acd.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(wj $$0) {
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
   public zh<acd> a() {
      return agf.l;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public void a(acd.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements acd.c {
      private final wy a;
      private final float b;
      private final bqg.a c;
      private final bqg.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bqg $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(wj $$0) {
         this.a = xa.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bqg.a.class);
         this.d = $$0.b(bqg.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public acd.d a() {
         return acd.d.a;
      }

      @Override
      public void a(UUID $$0, acd.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wj $$0) {
         xa.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(acd.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, wy $$1, float $$2, bqg.a $$3, bqg.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, wy $$1) {
      }

      default void a(UUID $$0, bqg.a $$1, bqg.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      acd.d a();

      void a(UUID var1, acd.b var2);

      void a(wj var1);
   }

   static enum d {
      a(acd.a::new),
      b($$0 -> acd.g),
      c(acd.f::new),
      d(acd.e::new),
      e(acd.h::new),
      f(acd.g::new);

      final yx<wj, acd.c> g;

      private d(final yx<wj, acd.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(wy a) implements acd.c {
      private e(wj $$0) {
         this(xa.d.decode($$0));
      }

      @Override
      public acd.d a() {
         return acd.d.d;
      }

      @Override
      public void a(UUID $$0, acd.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wj $$0) {
         xa.d.encode($$0, this.a);
      }

      public wy b() {
         return this.a;
      }
   }

   static record f(float a) implements acd.c {
      private f(wj $$0) {
         this($$0.readFloat());
      }

      @Override
      public acd.d a() {
         return acd.d.c;
      }

      @Override
      public void a(UUID $$0, acd.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wj $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements acd.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wj $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public acd.d a() {
         return acd.d.f;
      }

      @Override
      public void a(UUID $$0, acd.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wj $$0) {
         $$0.k(acd.a(this.a, this.b, this.c));
      }
   }

   static class h implements acd.c {
      private final bqg.a a;
      private final bqg.b b;

      h(bqg.a $$0, bqg.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wj $$0) {
         this.a = $$0.b(bqg.a.class);
         this.b = $$0.b(bqg.b.class);
      }

      @Override
      public acd.d a() {
         return acd.d.e;
      }

      @Override
      public void a(UUID $$0, acd.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wj $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
