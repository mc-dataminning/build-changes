import java.util.UUID;

public class ach implements zj<aby> {
   public static final za<wn, ach> a = zj.a(ach::a, ach::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final ach.c f;
   static final ach.c g = new ach.c() {
      @Override
      public ach.d a() {
         return ach.d.b;
      }

      @Override
      public void a(UUID $$0, ach.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wn $$0) {
      }
   };

   private ach(UUID $$0, ach.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private ach(wn $$0) {
      this.e = $$0.n();
      ach.d $$1 = $$0.b(ach.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static ach a(buj $$0) {
      return new ach($$0.i(), new ach.a($$0));
   }

   public static ach a(UUID $$0) {
      return new ach($$0, g);
   }

   public static ach b(buj $$0) {
      return new ach($$0.i(), new ach.f($$0.k()));
   }

   public static ach c(buj $$0) {
      return new ach($$0.i(), new ach.e($$0.j()));
   }

   public static ach d(buj $$0) {
      return new ach($$0.i(), new ach.h($$0.l(), $$0.m()));
   }

   public static ach e(buj $$0) {
      return new ach($$0.i(), new ach.g($$0.n(), $$0.o(), $$0.p()));
   }

   private void a(wn $$0) {
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
   public zl<ach> a() {
      return agr.k;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public void a(ach.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements ach.c {
      private final xc a;
      private final float b;
      private final buj.a c;
      private final buj.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(buj $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(wn $$0) {
         this.a = xe.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(buj.a.class);
         this.d = $$0.b(buj.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public ach.d a() {
         return ach.d.a;
      }

      @Override
      public void a(UUID $$0, ach.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wn $$0) {
         xe.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.l(ach.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, xc $$1, float $$2, buj.a $$3, buj.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, xc $$1) {
      }

      default void a(UUID $$0, buj.a $$1, buj.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      ach.d a();

      void a(UUID var1, ach.b var2);

      void a(wn var1);
   }

   static enum d {
      a(ach.a::new),
      b($$0 -> ach.g),
      c(ach.f::new),
      d(ach.e::new),
      e(ach.h::new),
      f(ach.g::new);

      final zb<wn, ach.c> g;

      private d(final zb<wn, ach.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(xc a) implements ach.c {
      private e(wn $$0) {
         this(xe.d.decode($$0));
      }

      @Override
      public ach.d a() {
         return ach.d.d;
      }

      @Override
      public void a(UUID $$0, ach.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wn $$0) {
         xe.d.encode($$0, this.a);
      }

      public xc b() {
         return this.a;
      }
   }

   static record f(float a) implements ach.c {
      private f(wn $$0) {
         this($$0.readFloat());
      }

      @Override
      public ach.d a() {
         return ach.d.c;
      }

      @Override
      public void a(UUID $$0, ach.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wn $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements ach.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wn $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public ach.d a() {
         return ach.d.f;
      }

      @Override
      public void a(UUID $$0, ach.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wn $$0) {
         $$0.l(ach.a(this.a, this.b, this.c));
      }
   }

   static class h implements ach.c {
      private final buj.a a;
      private final buj.b b;

      h(buj.a $$0, buj.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wn $$0) {
         this.a = $$0.b(buj.a.class);
         this.b = $$0.b(buj.b.class);
      }

      @Override
      public ach.d a() {
         return ach.d.e;
      }

      @Override
      public void a(UUID $$0, ach.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wn $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
