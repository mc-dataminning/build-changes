import java.util.UUID;

public class acp implements zq<acf> {
   public static final zh<wu, acp> a = zq.a(acp::a, acp::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final acp.c f;
   static final acp.c g = new acp.c() {
      @Override
      public acp.d a() {
         return acp.d.b;
      }

      @Override
      public void a(UUID $$0, acp.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wu $$0) {
      }
   };

   private acp(UUID $$0, acp.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private acp(wu $$0) {
      this.e = $$0.n();
      acp.d $$1 = $$0.b(acp.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static acp a(bsa $$0) {
      return new acp($$0.h(), new acp.a($$0));
   }

   public static acp a(UUID $$0) {
      return new acp($$0, g);
   }

   public static acp b(bsa $$0) {
      return new acp($$0.h(), new acp.f($$0.j()));
   }

   public static acp c(bsa $$0) {
      return new acp($$0.h(), new acp.e($$0.i()));
   }

   public static acp d(bsa $$0) {
      return new acp($$0.h(), new acp.h($$0.k(), $$0.l()));
   }

   public static acp e(bsa $$0) {
      return new acp($$0.h(), new acp.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(wu $$0) {
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
   public zs<acp> a() {
      return agu.l;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public void a(acp.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements acp.c {
      private final xj a;
      private final float b;
      private final bsa.a c;
      private final bsa.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bsa $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(wu $$0) {
         this.a = xl.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bsa.a.class);
         this.d = $$0.b(bsa.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public acp.d a() {
         return acp.d.a;
      }

      @Override
      public void a(UUID $$0, acp.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wu $$0) {
         xl.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.l(acp.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, xj $$1, float $$2, bsa.a $$3, bsa.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, xj $$1) {
      }

      default void a(UUID $$0, bsa.a $$1, bsa.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      acp.d a();

      void a(UUID var1, acp.b var2);

      void a(wu var1);
   }

   static enum d {
      a(acp.a::new),
      b($$0 -> acp.g),
      c(acp.f::new),
      d(acp.e::new),
      e(acp.h::new),
      f(acp.g::new);

      final zi<wu, acp.c> g;

      private d(final zi<wu, acp.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(xj a) implements acp.c {
      private e(wu $$0) {
         this(xl.d.decode($$0));
      }

      @Override
      public acp.d a() {
         return acp.d.d;
      }

      @Override
      public void a(UUID $$0, acp.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wu $$0) {
         xl.d.encode($$0, this.a);
      }

      public xj b() {
         return this.a;
      }
   }

   static record f(float a) implements acp.c {
      private f(wu $$0) {
         this($$0.readFloat());
      }

      @Override
      public acp.d a() {
         return acp.d.c;
      }

      @Override
      public void a(UUID $$0, acp.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wu $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements acp.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wu $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public acp.d a() {
         return acp.d.f;
      }

      @Override
      public void a(UUID $$0, acp.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wu $$0) {
         $$0.l(acp.a(this.a, this.b, this.c));
      }
   }

   static class h implements acp.c {
      private final bsa.a a;
      private final bsa.b b;

      h(bsa.a $$0, bsa.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wu $$0) {
         this.a = $$0.b(bsa.a.class);
         this.b = $$0.b(bsa.b.class);
      }

      @Override
      public acp.d a() {
         return acp.d.e;
      }

      @Override
      public void a(UUID $$0, acp.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wu $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
