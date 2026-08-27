import java.util.UUID;

public class aaw implements yb<aam> {
   public static final xs<vf, aaw> a = yb.a(aaw::a, aaw::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final aaw.c f;
   static final aaw.c g = new aaw.c() {
      @Override
      public aaw.d a() {
         return aaw.d.b;
      }

      @Override
      public void a(UUID $$0, aaw.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(vf $$0) {
      }
   };

   private aaw(UUID $$0, aaw.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private aaw(vf $$0) {
      this.e = $$0.n();
      aaw.d $$1 = $$0.b(aaw.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static aaw a(bms $$0) {
      return new aaw($$0.i(), new aaw.a($$0));
   }

   public static aaw a(UUID $$0) {
      return new aaw($$0, g);
   }

   public static aaw b(bms $$0) {
      return new aaw($$0.i(), new aaw.f($$0.k()));
   }

   public static aaw c(bms $$0) {
      return new aaw($$0.i(), new aaw.e($$0.j()));
   }

   public static aaw d(bms $$0) {
      return new aaw($$0.i(), new aaw.h($$0.l(), $$0.m()));
   }

   public static aaw e(bms $$0) {
      return new aaw($$0.i(), new aaw.g($$0.n(), $$0.o(), $$0.p()));
   }

   private void a(vf $$0) {
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
   public yd<aaw> a() {
      return aex.l;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public void a(aaw.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements aaw.c {
      private final vu a;
      private final float b;
      private final bms.a c;
      private final bms.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bms $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(vf $$0) {
         this.a = vw.b.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bms.a.class);
         this.d = $$0.b(bms.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public aaw.d a() {
         return aaw.d.a;
      }

      @Override
      public void a(UUID $$0, aaw.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(vf $$0) {
         vw.b.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(aaw.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, vu $$1, float $$2, bms.a $$3, bms.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, vu $$1) {
      }

      default void a(UUID $$0, bms.a $$1, bms.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      aaw.d a();

      void a(UUID var1, aaw.b var2);

      void a(vf var1);
   }

   static enum d {
      a(aaw.a::new),
      b($$0 -> aaw.g),
      c(aaw.f::new),
      d(aaw.e::new),
      e(aaw.h::new),
      f(aaw.g::new);

      final xt<vf, aaw.c> g;

      private d(xt<vf, aaw.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(vu a) implements aaw.c {
      private e(vf $$0) {
         this(vw.b.decode($$0));
      }

      @Override
      public aaw.d a() {
         return aaw.d.d;
      }

      @Override
      public void a(UUID $$0, aaw.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(vf $$0) {
         vw.b.encode($$0, this.a);
      }

      public vu b() {
         return this.a;
      }
   }

   static record f(float a) implements aaw.c {
      private f(vf $$0) {
         this($$0.readFloat());
      }

      @Override
      public aaw.d a() {
         return aaw.d.c;
      }

      @Override
      public void a(UUID $$0, aaw.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(vf $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements aaw.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(vf $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public aaw.d a() {
         return aaw.d.f;
      }

      @Override
      public void a(UUID $$0, aaw.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(vf $$0) {
         $$0.k(aaw.a(this.a, this.b, this.c));
      }
   }

   static class h implements aaw.c {
      private final bms.a a;
      private final bms.b b;

      h(bms.a $$0, bms.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(vf $$0) {
         this.a = $$0.b(bms.a.class);
         this.b = $$0.b(bms.b.class);
      }

      @Override
      public aaw.d a() {
         return aaw.d.e;
      }

      @Override
      public void a(UUID $$0, aaw.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(vf $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
