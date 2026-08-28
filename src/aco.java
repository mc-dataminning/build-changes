import java.util.UUID;

public class aco implements zs<ace> {
   public static final zj<ww, aco> a = zs.a(aco::a, aco::new);
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
      public void a(ww $$0) {
      }
   };

   private aco(UUID $$0, aco.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private aco(ww $$0) {
      this.e = $$0.n();
      aco.d $$1 = $$0.b(aco.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static aco a(bqf $$0) {
      return new aco($$0.h(), new aco.a($$0));
   }

   public static aco a(UUID $$0) {
      return new aco($$0, g);
   }

   public static aco b(bqf $$0) {
      return new aco($$0.h(), new aco.f($$0.j()));
   }

   public static aco c(bqf $$0) {
      return new aco($$0.h(), new aco.e($$0.i()));
   }

   public static aco d(bqf $$0) {
      return new aco($$0.h(), new aco.h($$0.k(), $$0.l()));
   }

   public static aco e(bqf $$0) {
      return new aco($$0.h(), new aco.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(ww $$0) {
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
   public zu<aco> a() {
      return agq.l;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public void a(aco.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements aco.c {
      private final xl a;
      private final float b;
      private final bqf.a c;
      private final bqf.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bqf $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(ww $$0) {
         this.a = xn.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bqf.a.class);
         this.d = $$0.b(bqf.b.class);
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
      public void a(ww $$0) {
         xn.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(aco.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, xl $$1, float $$2, bqf.a $$3, bqf.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, xl $$1) {
      }

      default void a(UUID $$0, bqf.a $$1, bqf.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      aco.d a();

      void a(UUID var1, aco.b var2);

      void a(ww var1);
   }

   static enum d {
      a(aco.a::new),
      b($$0 -> aco.g),
      c(aco.f::new),
      d(aco.e::new),
      e(aco.h::new),
      f(aco.g::new);

      final zk<ww, aco.c> g;

      private d(final zk<ww, aco.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(xl a) implements aco.c {
      private e(ww $$0) {
         this(xn.d.decode($$0));
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
      public void a(ww $$0) {
         xn.d.encode($$0, this.a);
      }

      public xl b() {
         return this.a;
      }
   }

   static record f(float a) implements aco.c {
      private f(ww $$0) {
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
      public void a(ww $$0) {
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

      private g(ww $$0) {
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
      public void a(ww $$0) {
         $$0.k(aco.a(this.a, this.b, this.c));
      }
   }

   static class h implements aco.c {
      private final bqf.a a;
      private final bqf.b b;

      h(bqf.a $$0, bqf.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(ww $$0) {
         this.a = $$0.b(bqf.a.class);
         this.b = $$0.b(bqf.b.class);
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
      public void a(ww $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
