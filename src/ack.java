import java.util.UUID;

public class ack implements zl<aca> {
   public static final zc<wp, ack> a = zl.a(ack::a, ack::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final ack.c f;
   static final ack.c g = new ack.c() {
      @Override
      public ack.d a() {
         return ack.d.b;
      }

      @Override
      public void a(UUID $$0, ack.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wp $$0) {
      }
   };

   private ack(UUID $$0, ack.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private ack(wp $$0) {
      this.e = $$0.n();
      ack.d $$1 = $$0.b(ack.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static ack a(bri $$0) {
      return new ack($$0.h(), new ack.a($$0));
   }

   public static ack a(UUID $$0) {
      return new ack($$0, g);
   }

   public static ack b(bri $$0) {
      return new ack($$0.h(), new ack.f($$0.j()));
   }

   public static ack c(bri $$0) {
      return new ack($$0.h(), new ack.e($$0.i()));
   }

   public static ack d(bri $$0) {
      return new ack($$0.h(), new ack.h($$0.k(), $$0.l()));
   }

   public static ack e(bri $$0) {
      return new ack($$0.h(), new ack.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(wp $$0) {
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
   public zn<ack> a() {
      return agp.l;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public void a(ack.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements ack.c {
      private final xe a;
      private final float b;
      private final bri.a c;
      private final bri.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bri $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(wp $$0) {
         this.a = xg.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bri.a.class);
         this.d = $$0.b(bri.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public ack.d a() {
         return ack.d.a;
      }

      @Override
      public void a(UUID $$0, ack.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wp $$0) {
         xg.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.l(ack.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, xe $$1, float $$2, bri.a $$3, bri.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, xe $$1) {
      }

      default void a(UUID $$0, bri.a $$1, bri.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      ack.d a();

      void a(UUID var1, ack.b var2);

      void a(wp var1);
   }

   static enum d {
      a(ack.a::new),
      b($$0 -> ack.g),
      c(ack.f::new),
      d(ack.e::new),
      e(ack.h::new),
      f(ack.g::new);

      final zd<wp, ack.c> g;

      private d(final zd<wp, ack.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(xe a) implements ack.c {
      private e(wp $$0) {
         this(xg.d.decode($$0));
      }

      @Override
      public ack.d a() {
         return ack.d.d;
      }

      @Override
      public void a(UUID $$0, ack.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wp $$0) {
         xg.d.encode($$0, this.a);
      }

      public xe b() {
         return this.a;
      }
   }

   static record f(float a) implements ack.c {
      private f(wp $$0) {
         this($$0.readFloat());
      }

      @Override
      public ack.d a() {
         return ack.d.c;
      }

      @Override
      public void a(UUID $$0, ack.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wp $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements ack.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wp $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public ack.d a() {
         return ack.d.f;
      }

      @Override
      public void a(UUID $$0, ack.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wp $$0) {
         $$0.l(ack.a(this.a, this.b, this.c));
      }
   }

   static class h implements ack.c {
      private final bri.a a;
      private final bri.b b;

      h(bri.a $$0, bri.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wp $$0) {
         this.a = $$0.b(bri.a.class);
         this.b = $$0.b(bri.b.class);
      }

      @Override
      public ack.d a() {
         return ack.d.e;
      }

      @Override
      public void a(UUID $$0, ack.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wp $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
