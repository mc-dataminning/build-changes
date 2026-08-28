import java.util.UUID;

public class ace implements zg<abu> {
   public static final yx<wk, ace> a = zg.a(ace::a, ace::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final ace.c f;
   static final ace.c g = new ace.c() {
      @Override
      public ace.d a() {
         return ace.d.b;
      }

      @Override
      public void a(UUID $$0, ace.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wk $$0) {
      }
   };

   private ace(UUID $$0, ace.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private ace(wk $$0) {
      this.e = $$0.n();
      ace.d $$1 = $$0.b(ace.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static ace a(bqh $$0) {
      return new ace($$0.h(), new ace.a($$0));
   }

   public static ace a(UUID $$0) {
      return new ace($$0, g);
   }

   public static ace b(bqh $$0) {
      return new ace($$0.h(), new ace.f($$0.j()));
   }

   public static ace c(bqh $$0) {
      return new ace($$0.h(), new ace.e($$0.i()));
   }

   public static ace d(bqh $$0) {
      return new ace($$0.h(), new ace.h($$0.k(), $$0.l()));
   }

   public static ace e(bqh $$0) {
      return new ace($$0.h(), new ace.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(wk $$0) {
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
   public zi<ace> a() {
      return agg.l;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public void a(ace.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements ace.c {
      private final wz a;
      private final float b;
      private final bqh.a c;
      private final bqh.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bqh $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(wk $$0) {
         this.a = xb.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bqh.a.class);
         this.d = $$0.b(bqh.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public ace.d a() {
         return ace.d.a;
      }

      @Override
      public void a(UUID $$0, ace.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wk $$0) {
         xb.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(ace.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, wz $$1, float $$2, bqh.a $$3, bqh.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, wz $$1) {
      }

      default void a(UUID $$0, bqh.a $$1, bqh.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      ace.d a();

      void a(UUID var1, ace.b var2);

      void a(wk var1);
   }

   static enum d {
      a(ace.a::new),
      b($$0 -> ace.g),
      c(ace.f::new),
      d(ace.e::new),
      e(ace.h::new),
      f(ace.g::new);

      final yy<wk, ace.c> g;

      private d(final yy<wk, ace.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(wz a) implements ace.c {
      private e(wk $$0) {
         this(xb.d.decode($$0));
      }

      @Override
      public ace.d a() {
         return ace.d.d;
      }

      @Override
      public void a(UUID $$0, ace.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wk $$0) {
         xb.d.encode($$0, this.a);
      }

      public wz b() {
         return this.a;
      }
   }

   static record f(float a) implements ace.c {
      private f(wk $$0) {
         this($$0.readFloat());
      }

      @Override
      public ace.d a() {
         return ace.d.c;
      }

      @Override
      public void a(UUID $$0, ace.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wk $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements ace.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wk $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public ace.d a() {
         return ace.d.f;
      }

      @Override
      public void a(UUID $$0, ace.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wk $$0) {
         $$0.k(ace.a(this.a, this.b, this.c));
      }
   }

   static class h implements ace.c {
      private final bqh.a a;
      private final bqh.b b;

      h(bqh.a $$0, bqh.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wk $$0) {
         this.a = $$0.b(bqh.a.class);
         this.b = $$0.b(bqh.b.class);
      }

      @Override
      public ace.d a() {
         return ace.d.e;
      }

      @Override
      public void a(UUID $$0, ace.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wk $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
