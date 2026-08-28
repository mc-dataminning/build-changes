import java.util.UUID;

public class aco implements zp<ace> {
   public static final zg<wt, aco> a = zp.a(aco::a, aco::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final aco.c f;
   static final aco.c g = new aco.c() {
      @Override
      public aco.d a() {
         return aco.d.b;
      }

      @Override
      public void a(UUID $$0, aco.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wt $$0) {
      }
   };

   private aco(UUID $$0, aco.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private aco(wt $$0) {
      this.e = $$0.n();
      aco.d $$1 = $$0.b(aco.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static aco a(brt $$0) {
      return new aco($$0.h(), new aco.a($$0));
   }

   public static aco a(UUID $$0) {
      return new aco($$0, g);
   }

   public static aco b(brt $$0) {
      return new aco($$0.h(), new aco.f($$0.j()));
   }

   public static aco c(brt $$0) {
      return new aco($$0.h(), new aco.e($$0.i()));
   }

   public static aco d(brt $$0) {
      return new aco($$0.h(), new aco.h($$0.k(), $$0.l()));
   }

   public static aco e(brt $$0) {
      return new aco($$0.h(), new aco.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(wt $$0) {
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
   public zr<aco> a() {
      return agt.l;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public void a(aco.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements aco.c {
      private final xi a;
      private final float b;
      private final brt.a c;
      private final brt.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(brt $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(wt $$0) {
         this.a = xk.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(brt.a.class);
         this.d = $$0.b(brt.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public aco.d a() {
         return aco.d.a;
      }

      @Override
      public void a(UUID $$0, aco.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wt $$0) {
         xk.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.l(aco.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, xi $$1, float $$2, brt.a $$3, brt.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, xi $$1) {
      }

      default void a(UUID $$0, brt.a $$1, brt.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      aco.d a();

      void a(UUID var1, aco.b var2);

      void a(wt var1);
   }

   static enum d {
      a(aco.a::new),
      b($$0 -> aco.g),
      c(aco.f::new),
      d(aco.e::new),
      e(aco.h::new),
      f(aco.g::new);

      final zh<wt, aco.c> g;

      private d(final zh<wt, aco.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(xi a) implements aco.c {
      private e(wt $$0) {
         this(xk.d.decode($$0));
      }

      @Override
      public aco.d a() {
         return aco.d.d;
      }

      @Override
      public void a(UUID $$0, aco.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wt $$0) {
         xk.d.encode($$0, this.a);
      }

      public xi b() {
         return this.a;
      }
   }

   static record f(float a) implements aco.c {
      private f(wt $$0) {
         this($$0.readFloat());
      }

      @Override
      public aco.d a() {
         return aco.d.c;
      }

      @Override
      public void a(UUID $$0, aco.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wt $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements aco.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wt $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public aco.d a() {
         return aco.d.f;
      }

      @Override
      public void a(UUID $$0, aco.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wt $$0) {
         $$0.l(aco.a(this.a, this.b, this.c));
      }
   }

   static class h implements aco.c {
      private final brt.a a;
      private final brt.b b;

      h(brt.a $$0, brt.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wt $$0) {
         this.a = $$0.b(brt.a.class);
         this.b = $$0.b(brt.b.class);
      }

      @Override
      public aco.d a() {
         return aco.d.e;
      }

      @Override
      public void a(UUID $$0, aco.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wt $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
