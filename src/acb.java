import java.util.UUID;

public class acb implements zd<abs> {
   public static final yu<wh, acb> a = zd.a(acb::a, acb::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final acb.c f;
   static final acb.c g = new acb.c() {
      @Override
      public acb.d a() {
         return acb.d.b;
      }

      @Override
      public void a(UUID $$0, acb.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wh $$0) {
      }
   };

   private acb(UUID $$0, acb.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private acb(wh $$0) {
      this.e = $$0.n();
      acb.d $$1 = $$0.b(acb.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static acb a(bto $$0) {
      return new acb($$0.h(), new acb.a($$0));
   }

   public static acb a(UUID $$0) {
      return new acb($$0, g);
   }

   public static acb b(bto $$0) {
      return new acb($$0.h(), new acb.f($$0.j()));
   }

   public static acb c(bto $$0) {
      return new acb($$0.h(), new acb.e($$0.i()));
   }

   public static acb d(bto $$0) {
      return new acb($$0.h(), new acb.h($$0.k(), $$0.l()));
   }

   public static acb e(bto $$0) {
      return new acb($$0.h(), new acb.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(wh $$0) {
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
   public zf<acb> a() {
      return agl.k;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public void a(acb.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements acb.c {
      private final ww a;
      private final float b;
      private final bto.a c;
      private final bto.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bto $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(wh $$0) {
         this.a = wy.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bto.a.class);
         this.d = $$0.b(bto.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public acb.d a() {
         return acb.d.a;
      }

      @Override
      public void a(UUID $$0, acb.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wh $$0) {
         wy.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.l(acb.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, ww $$1, float $$2, bto.a $$3, bto.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, ww $$1) {
      }

      default void a(UUID $$0, bto.a $$1, bto.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      acb.d a();

      void a(UUID var1, acb.b var2);

      void a(wh var1);
   }

   static enum d {
      a(acb.a::new),
      b($$0 -> acb.g),
      c(acb.f::new),
      d(acb.e::new),
      e(acb.h::new),
      f(acb.g::new);

      final yv<wh, acb.c> g;

      private d(final yv<wh, acb.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(ww a) implements acb.c {
      private e(wh $$0) {
         this(wy.d.decode($$0));
      }

      @Override
      public acb.d a() {
         return acb.d.d;
      }

      @Override
      public void a(UUID $$0, acb.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wh $$0) {
         wy.d.encode($$0, this.a);
      }

      public ww b() {
         return this.a;
      }
   }

   static record f(float a) implements acb.c {
      private f(wh $$0) {
         this($$0.readFloat());
      }

      @Override
      public acb.d a() {
         return acb.d.c;
      }

      @Override
      public void a(UUID $$0, acb.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wh $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements acb.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wh $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public acb.d a() {
         return acb.d.f;
      }

      @Override
      public void a(UUID $$0, acb.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wh $$0) {
         $$0.l(acb.a(this.a, this.b, this.c));
      }
   }

   static class h implements acb.c {
      private final bto.a a;
      private final bto.b b;

      h(bto.a $$0, bto.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wh $$0) {
         this.a = $$0.b(bto.a.class);
         this.b = $$0.b(bto.b.class);
      }

      @Override
      public acb.d a() {
         return acb.d.e;
      }

      @Override
      public void a(UUID $$0, acb.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wh $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
