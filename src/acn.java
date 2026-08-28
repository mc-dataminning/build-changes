import java.util.UUID;

public class acn implements zo<acd> {
   public static final zf<ws, acn> a = zo.a(acn::a, acn::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final acn.c f;
   static final acn.c g = new acn.c() {
      @Override
      public acn.d a() {
         return acn.d.b;
      }

      @Override
      public void a(UUID $$0, acn.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(ws $$0) {
      }
   };

   private acn(UUID $$0, acn.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private acn(ws $$0) {
      this.e = $$0.n();
      acn.d $$1 = $$0.b(acn.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static acn a(bro $$0) {
      return new acn($$0.h(), new acn.a($$0));
   }

   public static acn a(UUID $$0) {
      return new acn($$0, g);
   }

   public static acn b(bro $$0) {
      return new acn($$0.h(), new acn.f($$0.j()));
   }

   public static acn c(bro $$0) {
      return new acn($$0.h(), new acn.e($$0.i()));
   }

   public static acn d(bro $$0) {
      return new acn($$0.h(), new acn.h($$0.k(), $$0.l()));
   }

   public static acn e(bro $$0) {
      return new acn($$0.h(), new acn.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(ws $$0) {
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
   public zq<acn> a() {
      return ags.l;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public void a(acn.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements acn.c {
      private final xh a;
      private final float b;
      private final bro.a c;
      private final bro.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bro $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(ws $$0) {
         this.a = xj.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bro.a.class);
         this.d = $$0.b(bro.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public acn.d a() {
         return acn.d.a;
      }

      @Override
      public void a(UUID $$0, acn.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(ws $$0) {
         xj.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.l(acn.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, xh $$1, float $$2, bro.a $$3, bro.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, xh $$1) {
      }

      default void a(UUID $$0, bro.a $$1, bro.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      acn.d a();

      void a(UUID var1, acn.b var2);

      void a(ws var1);
   }

   static enum d {
      a(acn.a::new),
      b($$0 -> acn.g),
      c(acn.f::new),
      d(acn.e::new),
      e(acn.h::new),
      f(acn.g::new);

      final zg<ws, acn.c> g;

      private d(final zg<ws, acn.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(xh a) implements acn.c {
      private e(ws $$0) {
         this(xj.d.decode($$0));
      }

      @Override
      public acn.d a() {
         return acn.d.d;
      }

      @Override
      public void a(UUID $$0, acn.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(ws $$0) {
         xj.d.encode($$0, this.a);
      }

      public xh b() {
         return this.a;
      }
   }

   static record f(float a) implements acn.c {
      private f(ws $$0) {
         this($$0.readFloat());
      }

      @Override
      public acn.d a() {
         return acn.d.c;
      }

      @Override
      public void a(UUID $$0, acn.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(ws $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements acn.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(ws $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public acn.d a() {
         return acn.d.f;
      }

      @Override
      public void a(UUID $$0, acn.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(ws $$0) {
         $$0.l(acn.a(this.a, this.b, this.c));
      }
   }

   static class h implements acn.c {
      private final bro.a a;
      private final bro.b b;

      h(bro.a $$0, bro.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(ws $$0) {
         this.a = $$0.b(bro.a.class);
         this.b = $$0.b(bro.b.class);
      }

      @Override
      public acn.d a() {
         return acn.d.e;
      }

      @Override
      public void a(UUID $$0, acn.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(ws $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
