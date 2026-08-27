import java.util.UUID;

public class abk implements yp<aba> {
   public static final yg<vt, abk> a = yp.a(abk::a, abk::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final abk.c f;
   static final abk.c g = new abk.c() {
      @Override
      public abk.d a() {
         return abk.d.b;
      }

      @Override
      public void a(UUID $$0, abk.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(vt $$0) {
      }
   };

   private abk(UUID $$0, abk.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private abk(vt $$0) {
      this.e = $$0.n();
      abk.d $$1 = $$0.b(abk.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static abk a(bnv $$0) {
      return new abk($$0.h(), new abk.a($$0));
   }

   public static abk a(UUID $$0) {
      return new abk($$0, g);
   }

   public static abk b(bnv $$0) {
      return new abk($$0.h(), new abk.f($$0.j()));
   }

   public static abk c(bnv $$0) {
      return new abk($$0.h(), new abk.e($$0.i()));
   }

   public static abk d(bnv $$0) {
      return new abk($$0.h(), new abk.h($$0.k(), $$0.l()));
   }

   public static abk e(bnv $$0) {
      return new abk($$0.h(), new abk.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(vt $$0) {
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
   public yr<abk> a() {
      return afl.l;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public void a(abk.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements abk.c {
      private final wi a;
      private final float b;
      private final bnv.a c;
      private final bnv.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bnv $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(vt $$0) {
         this.a = wk.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bnv.a.class);
         this.d = $$0.b(bnv.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public abk.d a() {
         return abk.d.a;
      }

      @Override
      public void a(UUID $$0, abk.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(vt $$0) {
         wk.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(abk.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, wi $$1, float $$2, bnv.a $$3, bnv.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, wi $$1) {
      }

      default void a(UUID $$0, bnv.a $$1, bnv.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      abk.d a();

      void a(UUID var1, abk.b var2);

      void a(vt var1);
   }

   static enum d {
      a(abk.a::new),
      b($$0 -> abk.g),
      c(abk.f::new),
      d(abk.e::new),
      e(abk.h::new),
      f(abk.g::new);

      final yh<vt, abk.c> g;

      private d(yh<vt, abk.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(wi a) implements abk.c {
      private e(vt $$0) {
         this(wk.d.decode($$0));
      }

      @Override
      public abk.d a() {
         return abk.d.d;
      }

      @Override
      public void a(UUID $$0, abk.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(vt $$0) {
         wk.d.encode($$0, this.a);
      }

      public wi b() {
         return this.a;
      }
   }

   static record f(float a) implements abk.c {
      private f(vt $$0) {
         this($$0.readFloat());
      }

      @Override
      public abk.d a() {
         return abk.d.c;
      }

      @Override
      public void a(UUID $$0, abk.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(vt $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements abk.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(vt $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public abk.d a() {
         return abk.d.f;
      }

      @Override
      public void a(UUID $$0, abk.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(vt $$0) {
         $$0.k(abk.a(this.a, this.b, this.c));
      }
   }

   static class h implements abk.c {
      private final bnv.a a;
      private final bnv.b b;

      h(bnv.a $$0, bnv.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(vt $$0) {
         this.a = $$0.b(bnv.a.class);
         this.b = $$0.b(bnv.b.class);
      }

      @Override
      public abk.d a() {
         return abk.d.e;
      }

      @Override
      public void a(UUID $$0, abk.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(vt $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
