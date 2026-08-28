import java.util.UUID;

public class abv implements yw<abl> {
   public static final yn<wa, abv> a = yw.a(abv::a, abv::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final abv.c f;
   static final abv.c g = new abv.c() {
      @Override
      public abv.d a() {
         return abv.d.b;
      }

      @Override
      public void a(UUID $$0, abv.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wa $$0) {
      }
   };

   private abv(UUID $$0, abv.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private abv(wa $$0) {
      this.e = $$0.n();
      abv.d $$1 = $$0.b(abv.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static abv a(bsb $$0) {
      return new abv($$0.h(), new abv.a($$0));
   }

   public static abv a(UUID $$0) {
      return new abv($$0, g);
   }

   public static abv b(bsb $$0) {
      return new abv($$0.h(), new abv.f($$0.j()));
   }

   public static abv c(bsb $$0) {
      return new abv($$0.h(), new abv.e($$0.i()));
   }

   public static abv d(bsb $$0) {
      return new abv($$0.h(), new abv.h($$0.k(), $$0.l()));
   }

   public static abv e(bsb $$0) {
      return new abv($$0.h(), new abv.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(wa $$0) {
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
   public yy<abv> a() {
      return age.l;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public void a(abv.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements abv.c {
      private final wp a;
      private final float b;
      private final bsb.a c;
      private final bsb.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bsb $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(wa $$0) {
         this.a = wr.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bsb.a.class);
         this.d = $$0.b(bsb.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public abv.d a() {
         return abv.d.a;
      }

      @Override
      public void a(UUID $$0, abv.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wa $$0) {
         wr.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.l(abv.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, wp $$1, float $$2, bsb.a $$3, bsb.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, wp $$1) {
      }

      default void a(UUID $$0, bsb.a $$1, bsb.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      abv.d a();

      void a(UUID var1, abv.b var2);

      void a(wa var1);
   }

   static enum d {
      a(abv.a::new),
      b($$0 -> abv.g),
      c(abv.f::new),
      d(abv.e::new),
      e(abv.h::new),
      f(abv.g::new);

      final yo<wa, abv.c> g;

      private d(final yo<wa, abv.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(wp a) implements abv.c {
      private e(wa $$0) {
         this(wr.d.decode($$0));
      }

      @Override
      public abv.d a() {
         return abv.d.d;
      }

      @Override
      public void a(UUID $$0, abv.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wa $$0) {
         wr.d.encode($$0, this.a);
      }

      public wp b() {
         return this.a;
      }
   }

   static record f(float a) implements abv.c {
      private f(wa $$0) {
         this($$0.readFloat());
      }

      @Override
      public abv.d a() {
         return abv.d.c;
      }

      @Override
      public void a(UUID $$0, abv.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wa $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements abv.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wa $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public abv.d a() {
         return abv.d.f;
      }

      @Override
      public void a(UUID $$0, abv.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wa $$0) {
         $$0.l(abv.a(this.a, this.b, this.c));
      }
   }

   static class h implements abv.c {
      private final bsb.a a;
      private final bsb.b b;

      h(bsb.a $$0, bsb.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wa $$0) {
         this.a = $$0.b(bsb.a.class);
         this.b = $$0.b(bsb.b.class);
      }

      @Override
      public abv.d a() {
         return abv.d.e;
      }

      @Override
      public void a(UUID $$0, abv.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wa $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
