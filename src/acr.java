import java.util.UUID;

public class acr implements zs<ach> {
   public static final zj<ww, acr> a = zs.a(acr::a, acr::new);
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
      public void a(ww $$0) {
      }
   };

   private acr(UUID $$0, acr.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private acr(ww $$0) {
      this.e = $$0.n();
      acr.d $$1 = $$0.b(acr.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static acr a(brx $$0) {
      return new acr($$0.h(), new acr.a($$0));
   }

   public static acr a(UUID $$0) {
      return new acr($$0, g);
   }

   public static acr b(brx $$0) {
      return new acr($$0.h(), new acr.f($$0.j()));
   }

   public static acr c(brx $$0) {
      return new acr($$0.h(), new acr.e($$0.i()));
   }

   public static acr d(brx $$0) {
      return new acr($$0.h(), new acr.h($$0.k(), $$0.l()));
   }

   public static acr e(brx $$0) {
      return new acr($$0.h(), new acr.g($$0.m(), $$0.n(), $$0.o()));
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
   public zu<acr> a() {
      return agw.l;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public void a(acr.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements acr.c {
      private final xl a;
      private final float b;
      private final brx.a c;
      private final brx.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(brx $$0) {
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
         this.c = $$0.b(brx.a.class);
         this.d = $$0.b(brx.b.class);
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
      public void a(ww $$0) {
         xn.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.l(acr.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, xl $$1, float $$2, brx.a $$3, brx.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, xl $$1) {
      }

      default void a(UUID $$0, brx.a $$1, brx.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      acr.d a();

      void a(UUID var1, acr.b var2);

      void a(ww var1);
   }

   static enum d {
      a(acr.a::new),
      b($$0 -> acr.g),
      c(acr.f::new),
      d(acr.e::new),
      e(acr.h::new),
      f(acr.g::new);

      final zk<ww, acr.c> g;

      private d(final zk<ww, acr.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(xl a) implements acr.c {
      private e(ww $$0) {
         this(xn.d.decode($$0));
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
      public void a(ww $$0) {
         xn.d.encode($$0, this.a);
      }

      public xl b() {
         return this.a;
      }
   }

   static record f(float a) implements acr.c {
      private f(ww $$0) {
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
      public void a(ww $$0) {
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

      private g(ww $$0) {
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
      public void a(ww $$0) {
         $$0.l(acr.a(this.a, this.b, this.c));
      }
   }

   static class h implements acr.c {
      private final brx.a a;
      private final brx.b b;

      h(brx.a $$0, brx.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(ww $$0) {
         this.a = $$0.b(brx.a.class);
         this.b = $$0.b(brx.b.class);
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
      public void a(ww $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
