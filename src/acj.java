import java.util.UUID;

public class acj implements zk<abz> {
   public static final zb<wo, acj> a = zk.a(acj::a, acj::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final acj.c f;
   static final acj.c g = new acj.c() {
      @Override
      public acj.d a() {
         return acj.d.b;
      }

      @Override
      public void a(UUID $$0, acj.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wo $$0) {
      }
   };

   private acj(UUID $$0, acj.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private acj(wo $$0) {
      this.e = $$0.n();
      acj.d $$1 = $$0.b(acj.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static acj a(bra $$0) {
      return new acj($$0.h(), new acj.a($$0));
   }

   public static acj a(UUID $$0) {
      return new acj($$0, g);
   }

   public static acj b(bra $$0) {
      return new acj($$0.h(), new acj.f($$0.j()));
   }

   public static acj c(bra $$0) {
      return new acj($$0.h(), new acj.e($$0.i()));
   }

   public static acj d(bra $$0) {
      return new acj($$0.h(), new acj.h($$0.k(), $$0.l()));
   }

   public static acj e(bra $$0) {
      return new acj($$0.h(), new acj.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(wo $$0) {
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
   public zm<acj> a() {
      return ago.l;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public void a(acj.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements acj.c {
      private final xd a;
      private final float b;
      private final bra.a c;
      private final bra.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bra $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(wo $$0) {
         this.a = xf.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bra.a.class);
         this.d = $$0.b(bra.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public acj.d a() {
         return acj.d.a;
      }

      @Override
      public void a(UUID $$0, acj.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wo $$0) {
         xf.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.l(acj.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, xd $$1, float $$2, bra.a $$3, bra.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, xd $$1) {
      }

      default void a(UUID $$0, bra.a $$1, bra.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      acj.d a();

      void a(UUID var1, acj.b var2);

      void a(wo var1);
   }

   static enum d {
      a(acj.a::new),
      b($$0 -> acj.g),
      c(acj.f::new),
      d(acj.e::new),
      e(acj.h::new),
      f(acj.g::new);

      final zc<wo, acj.c> g;

      private d(final zc<wo, acj.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(xd a) implements acj.c {
      private e(wo $$0) {
         this(xf.d.decode($$0));
      }

      @Override
      public acj.d a() {
         return acj.d.d;
      }

      @Override
      public void a(UUID $$0, acj.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wo $$0) {
         xf.d.encode($$0, this.a);
      }

      public xd b() {
         return this.a;
      }
   }

   static record f(float a) implements acj.c {
      private f(wo $$0) {
         this($$0.readFloat());
      }

      @Override
      public acj.d a() {
         return acj.d.c;
      }

      @Override
      public void a(UUID $$0, acj.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wo $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements acj.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wo $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public acj.d a() {
         return acj.d.f;
      }

      @Override
      public void a(UUID $$0, acj.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wo $$0) {
         $$0.l(acj.a(this.a, this.b, this.c));
      }
   }

   static class h implements acj.c {
      private final bra.a a;
      private final bra.b b;

      h(bra.a $$0, bra.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wo $$0) {
         this.a = $$0.b(bra.a.class);
         this.b = $$0.b(bra.b.class);
      }

      @Override
      public acj.d a() {
         return acj.d.e;
      }

      @Override
      public void a(UUID $$0, acj.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wo $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
