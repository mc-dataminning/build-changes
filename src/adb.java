import java.util.UUID;

public class adb implements aac<acr> {
   public static final zt<xg, adb> a = aac.a(adb::a, adb::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final adb.c f;
   static final adb.c g = new adb.c() {
      @Override
      public adb.d a() {
         return adb.d.b;
      }

      @Override
      public void a(UUID $$0, adb.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(xg $$0) {
      }
   };

   private adb(UUID $$0, adb.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private adb(xg $$0) {
      this.e = $$0.n();
      adb.d $$1 = $$0.b(adb.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static adb a(bsy $$0) {
      return new adb($$0.h(), new adb.a($$0));
   }

   public static adb a(UUID $$0) {
      return new adb($$0, g);
   }

   public static adb b(bsy $$0) {
      return new adb($$0.h(), new adb.f($$0.j()));
   }

   public static adb c(bsy $$0) {
      return new adb($$0.h(), new adb.e($$0.i()));
   }

   public static adb d(bsy $$0) {
      return new adb($$0.h(), new adb.h($$0.k(), $$0.l()));
   }

   public static adb e(bsy $$0) {
      return new adb($$0.h(), new adb.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(xg $$0) {
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
   public aae<adb> a() {
      return ahk.l;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public void a(adb.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements adb.c {
      private final xv a;
      private final float b;
      private final bsy.a c;
      private final bsy.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bsy $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(xg $$0) {
         this.a = xx.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bsy.a.class);
         this.d = $$0.b(bsy.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public adb.d a() {
         return adb.d.a;
      }

      @Override
      public void a(UUID $$0, adb.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(xg $$0) {
         xx.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.l(adb.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, xv $$1, float $$2, bsy.a $$3, bsy.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, xv $$1) {
      }

      default void a(UUID $$0, bsy.a $$1, bsy.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      adb.d a();

      void a(UUID var1, adb.b var2);

      void a(xg var1);
   }

   static enum d {
      a(adb.a::new),
      b($$0 -> adb.g),
      c(adb.f::new),
      d(adb.e::new),
      e(adb.h::new),
      f(adb.g::new);

      final zu<xg, adb.c> g;

      private d(final zu<xg, adb.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(xv a) implements adb.c {
      private e(xg $$0) {
         this(xx.d.decode($$0));
      }

      @Override
      public adb.d a() {
         return adb.d.d;
      }

      @Override
      public void a(UUID $$0, adb.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(xg $$0) {
         xx.d.encode($$0, this.a);
      }

      public xv b() {
         return this.a;
      }
   }

   static record f(float a) implements adb.c {
      private f(xg $$0) {
         this($$0.readFloat());
      }

      @Override
      public adb.d a() {
         return adb.d.c;
      }

      @Override
      public void a(UUID $$0, adb.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(xg $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements adb.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(xg $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public adb.d a() {
         return adb.d.f;
      }

      @Override
      public void a(UUID $$0, adb.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(xg $$0) {
         $$0.l(adb.a(this.a, this.b, this.c));
      }
   }

   static class h implements adb.c {
      private final bsy.a a;
      private final bsy.b b;

      h(bsy.a $$0, bsy.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(xg $$0) {
         this.a = $$0.b(bsy.a.class);
         this.b = $$0.b(bsy.b.class);
      }

      @Override
      public adb.d a() {
         return adb.d.e;
      }

      @Override
      public void a(UUID $$0, adb.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(xg $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
