import java.util.UUID;

public class abu implements yz<abk> {
   public static final yq<wd, abu> a = yz.a(abu::a, abu::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final abu.c f;
   static final abu.c g = new abu.c() {
      @Override
      public abu.d a() {
         return abu.d.b;
      }

      @Override
      public void a(UUID $$0, abu.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wd $$0) {
      }
   };

   private abu(UUID $$0, abu.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private abu(wd $$0) {
      this.e = $$0.n();
      abu.d $$1 = $$0.b(abu.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static abu a(bog $$0) {
      return new abu($$0.h(), new abu.a($$0));
   }

   public static abu a(UUID $$0) {
      return new abu($$0, g);
   }

   public static abu b(bog $$0) {
      return new abu($$0.h(), new abu.f($$0.j()));
   }

   public static abu c(bog $$0) {
      return new abu($$0.h(), new abu.e($$0.i()));
   }

   public static abu d(bog $$0) {
      return new abu($$0.h(), new abu.h($$0.k(), $$0.l()));
   }

   public static abu e(bog $$0) {
      return new abu($$0.h(), new abu.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(wd $$0) {
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
   public zb<abu> a() {
      return afv.l;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public void a(abu.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements abu.c {
      private final ws a;
      private final float b;
      private final bog.a c;
      private final bog.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bog $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(wd $$0) {
         this.a = wu.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bog.a.class);
         this.d = $$0.b(bog.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public abu.d a() {
         return abu.d.a;
      }

      @Override
      public void a(UUID $$0, abu.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wd $$0) {
         wu.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(abu.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, ws $$1, float $$2, bog.a $$3, bog.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, ws $$1) {
      }

      default void a(UUID $$0, bog.a $$1, bog.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      abu.d a();

      void a(UUID var1, abu.b var2);

      void a(wd var1);
   }

   static enum d {
      a(abu.a::new),
      b($$0 -> abu.g),
      c(abu.f::new),
      d(abu.e::new),
      e(abu.h::new),
      f(abu.g::new);

      final yr<wd, abu.c> g;

      private d(yr<wd, abu.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(ws a) implements abu.c {
      private e(wd $$0) {
         this(wu.d.decode($$0));
      }

      @Override
      public abu.d a() {
         return abu.d.d;
      }

      @Override
      public void a(UUID $$0, abu.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wd $$0) {
         wu.d.encode($$0, this.a);
      }

      public ws b() {
         return this.a;
      }
   }

   static record f(float a) implements abu.c {
      private f(wd $$0) {
         this($$0.readFloat());
      }

      @Override
      public abu.d a() {
         return abu.d.c;
      }

      @Override
      public void a(UUID $$0, abu.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wd $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements abu.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wd $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public abu.d a() {
         return abu.d.f;
      }

      @Override
      public void a(UUID $$0, abu.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wd $$0) {
         $$0.k(abu.a(this.a, this.b, this.c));
      }
   }

   static class h implements abu.c {
      private final bog.a a;
      private final bog.b b;

      h(bog.a $$0, bog.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wd $$0) {
         this.a = $$0.b(bog.a.class);
         this.b = $$0.b(bog.b.class);
      }

      @Override
      public abu.d a() {
         return abu.d.e;
      }

      @Override
      public void a(UUID $$0, abu.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wd $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
