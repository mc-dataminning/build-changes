import java.util.UUID;

public class acr implements zv<ach> {
   public static final zm<wz, acr> a = zv.a(acr::a, acr::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final acr.c f;
   static final acr.c g = new acr.c() {
      @Override
      public acr.d a() {
         return acr.d.b;
      }

      @Override
      public void a(UUID $$0, acr.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wz $$0) {
      }
   };

   private acr(UUID $$0, acr.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private acr(wz $$0) {
      this.e = $$0.n();
      acr.d $$1 = $$0.b(acr.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static acr a(bqi $$0) {
      return new acr($$0.h(), new acr.a($$0));
   }

   public static acr a(UUID $$0) {
      return new acr($$0, g);
   }

   public static acr b(bqi $$0) {
      return new acr($$0.h(), new acr.f($$0.j()));
   }

   public static acr c(bqi $$0) {
      return new acr($$0.h(), new acr.e($$0.i()));
   }

   public static acr d(bqi $$0) {
      return new acr($$0.h(), new acr.h($$0.k(), $$0.l()));
   }

   public static acr e(bqi $$0) {
      return new acr($$0.h(), new acr.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(wz $$0) {
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
   public zx<acr> a() {
      return agt.l;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public void a(acr.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements acr.c {
      private final xo a;
      private final float b;
      private final bqi.a c;
      private final bqi.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bqi $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(wz $$0) {
         this.a = xq.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bqi.a.class);
         this.d = $$0.b(bqi.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public acr.d a() {
         return acr.d.a;
      }

      @Override
      public void a(UUID $$0, acr.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wz $$0) {
         xq.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(acr.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, xo $$1, float $$2, bqi.a $$3, bqi.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, xo $$1) {
      }

      default void a(UUID $$0, bqi.a $$1, bqi.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      acr.d a();

      void a(UUID var1, acr.b var2);

      void a(wz var1);
   }

   static enum d {
      a(acr.a::new),
      b($$0 -> acr.g),
      c(acr.f::new),
      d(acr.e::new),
      e(acr.h::new),
      f(acr.g::new);

      final zn<wz, acr.c> g;

      private d(final zn<wz, acr.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(xo a) implements acr.c {
      private e(wz $$0) {
         this(xq.d.decode($$0));
      }

      @Override
      public acr.d a() {
         return acr.d.d;
      }

      @Override
      public void a(UUID $$0, acr.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wz $$0) {
         xq.d.encode($$0, this.a);
      }

      public xo b() {
         return this.a;
      }
   }

   static record f(float a) implements acr.c {
      private f(wz $$0) {
         this($$0.readFloat());
      }

      @Override
      public acr.d a() {
         return acr.d.c;
      }

      @Override
      public void a(UUID $$0, acr.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wz $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements acr.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wz $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public acr.d a() {
         return acr.d.f;
      }

      @Override
      public void a(UUID $$0, acr.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wz $$0) {
         $$0.k(acr.a(this.a, this.b, this.c));
      }
   }

   static class h implements acr.c {
      private final bqi.a a;
      private final bqi.b b;

      h(bqi.a $$0, bqi.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wz $$0) {
         this.a = $$0.b(bqi.a.class);
         this.b = $$0.b(bqi.b.class);
      }

      @Override
      public acr.d a() {
         return acr.d.e;
      }

      @Override
      public void a(UUID $$0, acr.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wz $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
