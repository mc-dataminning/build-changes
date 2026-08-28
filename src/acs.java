import java.util.UUID;

public class acs implements zw<aci> {
   public static final zn<xa, acs> a = zw.a(acs::a, acs::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final acs.c f;
   static final acs.c g = new acs.c() {
      @Override
      public acs.d a() {
         return acs.d.b;
      }

      @Override
      public void a(UUID $$0, acs.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(xa $$0) {
      }
   };

   private acs(UUID $$0, acs.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private acs(xa $$0) {
      this.e = $$0.n();
      acs.d $$1 = $$0.b(acs.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static acs a(bqk $$0) {
      return new acs($$0.h(), new acs.a($$0));
   }

   public static acs a(UUID $$0) {
      return new acs($$0, g);
   }

   public static acs b(bqk $$0) {
      return new acs($$0.h(), new acs.f($$0.j()));
   }

   public static acs c(bqk $$0) {
      return new acs($$0.h(), new acs.e($$0.i()));
   }

   public static acs d(bqk $$0) {
      return new acs($$0.h(), new acs.h($$0.k(), $$0.l()));
   }

   public static acs e(bqk $$0) {
      return new acs($$0.h(), new acs.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(xa $$0) {
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
   public zy<acs> a() {
      return agu.l;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public void a(acs.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements acs.c {
      private final xp a;
      private final float b;
      private final bqk.a c;
      private final bqk.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bqk $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(xa $$0) {
         this.a = xr.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bqk.a.class);
         this.d = $$0.b(bqk.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public acs.d a() {
         return acs.d.a;
      }

      @Override
      public void a(UUID $$0, acs.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(xa $$0) {
         xr.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(acs.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, xp $$1, float $$2, bqk.a $$3, bqk.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, xp $$1) {
      }

      default void a(UUID $$0, bqk.a $$1, bqk.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      acs.d a();

      void a(UUID var1, acs.b var2);

      void a(xa var1);
   }

   static enum d {
      a(acs.a::new),
      b($$0 -> acs.g),
      c(acs.f::new),
      d(acs.e::new),
      e(acs.h::new),
      f(acs.g::new);

      final zo<xa, acs.c> g;

      private d(final zo<xa, acs.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(xp a) implements acs.c {
      private e(xa $$0) {
         this(xr.d.decode($$0));
      }

      @Override
      public acs.d a() {
         return acs.d.d;
      }

      @Override
      public void a(UUID $$0, acs.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(xa $$0) {
         xr.d.encode($$0, this.a);
      }

      public xp b() {
         return this.a;
      }
   }

   static record f(float a) implements acs.c {
      private f(xa $$0) {
         this($$0.readFloat());
      }

      @Override
      public acs.d a() {
         return acs.d.c;
      }

      @Override
      public void a(UUID $$0, acs.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(xa $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements acs.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(xa $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public acs.d a() {
         return acs.d.f;
      }

      @Override
      public void a(UUID $$0, acs.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(xa $$0) {
         $$0.k(acs.a(this.a, this.b, this.c));
      }
   }

   static class h implements acs.c {
      private final bqk.a a;
      private final bqk.b b;

      h(bqk.a $$0, bqk.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(xa $$0) {
         this.a = $$0.b(bqk.a.class);
         this.b = $$0.b(bqk.b.class);
      }

      @Override
      public acs.d a() {
         return acs.d.e;
      }

      @Override
      public void a(UUID $$0, acs.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(xa $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
