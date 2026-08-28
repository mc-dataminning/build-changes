import java.util.UUID;

public class acq implements zr<acg> {
   public static final zi<wv, acq> a = zr.a(acq::a, acq::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final acq.c f;
   static final acq.c g = new acq.c() {
      @Override
      public acq.d a() {
         return acq.d.b;
      }

      @Override
      public void a(UUID $$0, acq.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wv $$0) {
      }
   };

   private acq(UUID $$0, acq.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private acq(wv $$0) {
      this.e = $$0.n();
      acq.d $$1 = $$0.b(acq.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static acq a(bsq $$0) {
      return new acq($$0.h(), new acq.a($$0));
   }

   public static acq a(UUID $$0) {
      return new acq($$0, g);
   }

   public static acq b(bsq $$0) {
      return new acq($$0.h(), new acq.f($$0.j()));
   }

   public static acq c(bsq $$0) {
      return new acq($$0.h(), new acq.e($$0.i()));
   }

   public static acq d(bsq $$0) {
      return new acq($$0.h(), new acq.h($$0.k(), $$0.l()));
   }

   public static acq e(bsq $$0) {
      return new acq($$0.h(), new acq.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(wv $$0) {
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
   public zt<acq> a() {
      return agz.l;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public void a(acq.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements acq.c {
      private final xk a;
      private final float b;
      private final bsq.a c;
      private final bsq.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bsq $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(wv $$0) {
         this.a = xm.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bsq.a.class);
         this.d = $$0.b(bsq.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public acq.d a() {
         return acq.d.a;
      }

      @Override
      public void a(UUID $$0, acq.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wv $$0) {
         xm.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.l(acq.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, xk $$1, float $$2, bsq.a $$3, bsq.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, xk $$1) {
      }

      default void a(UUID $$0, bsq.a $$1, bsq.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      acq.d a();

      void a(UUID var1, acq.b var2);

      void a(wv var1);
   }

   static enum d {
      a(acq.a::new),
      b($$0 -> acq.g),
      c(acq.f::new),
      d(acq.e::new),
      e(acq.h::new),
      f(acq.g::new);

      final zj<wv, acq.c> g;

      private d(final zj<wv, acq.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(xk a) implements acq.c {
      private e(wv $$0) {
         this(xm.d.decode($$0));
      }

      @Override
      public acq.d a() {
         return acq.d.d;
      }

      @Override
      public void a(UUID $$0, acq.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wv $$0) {
         xm.d.encode($$0, this.a);
      }

      public xk b() {
         return this.a;
      }
   }

   static record f(float a) implements acq.c {
      private f(wv $$0) {
         this($$0.readFloat());
      }

      @Override
      public acq.d a() {
         return acq.d.c;
      }

      @Override
      public void a(UUID $$0, acq.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wv $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements acq.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wv $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public acq.d a() {
         return acq.d.f;
      }

      @Override
      public void a(UUID $$0, acq.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wv $$0) {
         $$0.l(acq.a(this.a, this.b, this.c));
      }
   }

   static class h implements acq.c {
      private final bsq.a a;
      private final bsq.b b;

      h(bsq.a $$0, bsq.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wv $$0) {
         this.a = $$0.b(bsq.a.class);
         this.b = $$0.b(bsq.b.class);
      }

      @Override
      public acq.d a() {
         return acq.d.e;
      }

      @Override
      public void a(UUID $$0, acq.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wv $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
