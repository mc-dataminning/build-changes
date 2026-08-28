import java.util.UUID;

public class acf implements zh<abw> {
   public static final yy<wl, acf> a = zh.a(acf::a, acf::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final acf.c f;
   static final acf.c g = new acf.c() {
      @Override
      public acf.d a() {
         return acf.d.b;
      }

      @Override
      public void a(UUID $$0, acf.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wl $$0) {
      }
   };

   private acf(UUID $$0, acf.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private acf(wl $$0) {
      this.e = $$0.n();
      acf.d $$1 = $$0.b(acf.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static acf a(buh $$0) {
      return new acf($$0.i(), new acf.a($$0));
   }

   public static acf a(UUID $$0) {
      return new acf($$0, g);
   }

   public static acf b(buh $$0) {
      return new acf($$0.i(), new acf.f($$0.k()));
   }

   public static acf c(buh $$0) {
      return new acf($$0.i(), new acf.e($$0.j()));
   }

   public static acf d(buh $$0) {
      return new acf($$0.i(), new acf.h($$0.l(), $$0.m()));
   }

   public static acf e(buh $$0) {
      return new acf($$0.i(), new acf.g($$0.n(), $$0.o(), $$0.p()));
   }

   private void a(wl $$0) {
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
   public zj<acf> a() {
      return agp.k;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public void a(acf.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements acf.c {
      private final xa a;
      private final float b;
      private final buh.a c;
      private final buh.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(buh $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(wl $$0) {
         this.a = xc.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(buh.a.class);
         this.d = $$0.b(buh.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public acf.d a() {
         return acf.d.a;
      }

      @Override
      public void a(UUID $$0, acf.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wl $$0) {
         xc.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.l(acf.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, xa $$1, float $$2, buh.a $$3, buh.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, xa $$1) {
      }

      default void a(UUID $$0, buh.a $$1, buh.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      acf.d a();

      void a(UUID var1, acf.b var2);

      void a(wl var1);
   }

   static enum d {
      a(acf.a::new),
      b($$0 -> acf.g),
      c(acf.f::new),
      d(acf.e::new),
      e(acf.h::new),
      f(acf.g::new);

      final yz<wl, acf.c> g;

      private d(final yz<wl, acf.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(xa a) implements acf.c {
      private e(wl $$0) {
         this(xc.d.decode($$0));
      }

      @Override
      public acf.d a() {
         return acf.d.d;
      }

      @Override
      public void a(UUID $$0, acf.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wl $$0) {
         xc.d.encode($$0, this.a);
      }

      public xa b() {
         return this.a;
      }
   }

   static record f(float a) implements acf.c {
      private f(wl $$0) {
         this($$0.readFloat());
      }

      @Override
      public acf.d a() {
         return acf.d.c;
      }

      @Override
      public void a(UUID $$0, acf.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wl $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements acf.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wl $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public acf.d a() {
         return acf.d.f;
      }

      @Override
      public void a(UUID $$0, acf.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wl $$0) {
         $$0.l(acf.a(this.a, this.b, this.c));
      }
   }

   static class h implements acf.c {
      private final buh.a a;
      private final buh.b b;

      h(buh.a $$0, buh.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wl $$0) {
         this.a = $$0.b(buh.a.class);
         this.b = $$0.b(buh.b.class);
      }

      @Override
      public acf.d a() {
         return acf.d.e;
      }

      @Override
      public void a(UUID $$0, acf.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wl $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
