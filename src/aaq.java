import java.util.UUID;
import java.util.function.Function;

public class aaq implements xx<aag> {
   public static final xo<uq, aaq> a = xx.a(aaq::a, aaq::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final aaq.c f;
   static final aaq.c g = new aaq.c() {
      @Override
      public aaq.d a() {
         return aaq.d.b;
      }

      @Override
      public void a(UUID $$0, aaq.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(uq $$0) {
      }
   };

   private aaq(UUID $$0, aaq.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private aaq(uq $$0) {
      this.e = $$0.p();
      aaq.d $$1 = $$0.b(aaq.d.class);
      this.f = $$1.g.apply($$0);
   }

   public static aaq a(blk $$0) {
      return new aaq($$0.i(), new aaq.a($$0));
   }

   public static aaq a(UUID $$0) {
      return new aaq($$0, g);
   }

   public static aaq b(blk $$0) {
      return new aaq($$0.i(), new aaq.f($$0.k()));
   }

   public static aaq c(blk $$0) {
      return new aaq($$0.i(), new aaq.e($$0.j()));
   }

   public static aaq d(blk $$0) {
      return new aaq($$0.i(), new aaq.h($$0.l(), $$0.m()));
   }

   public static aaq e(blk $$0) {
      return new aaq($$0.i(), new aaq.g($$0.n(), $$0.o(), $$0.p()));
   }

   private void a(uq $$0) {
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
   public xz<aaq> a() {
      return aeq.l;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public void a(aaq.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements aaq.c {
      private final vq a;
      private final float b;
      private final blk.a c;
      private final blk.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(blk $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(uq $$0) {
         this.a = $$0.m();
         this.b = $$0.readFloat();
         this.c = $$0.b(blk.a.class);
         this.d = $$0.b(blk.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public aaq.d a() {
         return aaq.d.a;
      }

      @Override
      public void a(UUID $$0, aaq.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(uq $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(aaq.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, vq $$1, float $$2, blk.a $$3, blk.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, vq $$1) {
      }

      default void a(UUID $$0, blk.a $$1, blk.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      aaq.d a();

      void a(UUID var1, aaq.b var2);

      void a(uq var1);
   }

   static enum d {
      a(aaq.a::new),
      b($$0 -> aaq.g),
      c(aaq.f::new),
      d(aaq.e::new),
      e(aaq.h::new),
      f(aaq.g::new);

      final Function<uq, aaq.c> g;

      private d(Function<uq, aaq.c> $$0) {
         this.g = $$0;
      }
   }

   static class e implements aaq.c {
      private final vq a;

      e(vq $$0) {
         this.a = $$0;
      }

      private e(uq $$0) {
         this.a = $$0.m();
      }

      @Override
      public aaq.d a() {
         return aaq.d.d;
      }

      @Override
      public void a(UUID $$0, aaq.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(uq $$0) {
         $$0.a(this.a);
      }
   }

   static class f implements aaq.c {
      private final float a;

      f(float $$0) {
         this.a = $$0;
      }

      private f(uq $$0) {
         this.a = $$0.readFloat();
      }

      @Override
      public aaq.d a() {
         return aaq.d.c;
      }

      @Override
      public void a(UUID $$0, aaq.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(uq $$0) {
         $$0.a(this.a);
      }
   }

   static class g implements aaq.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(uq $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public aaq.d a() {
         return aaq.d.f;
      }

      @Override
      public void a(UUID $$0, aaq.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(uq $$0) {
         $$0.k(aaq.a(this.a, this.b, this.c));
      }
   }

   static class h implements aaq.c {
      private final blk.a a;
      private final blk.b b;

      h(blk.a $$0, blk.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(uq $$0) {
         this.a = $$0.b(blk.a.class);
         this.b = $$0.b(blk.b.class);
      }

      @Override
      public aaq.d a() {
         return aaq.d.e;
      }

      @Override
      public void a(UUID $$0, aaq.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(uq $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
