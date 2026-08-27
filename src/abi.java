import java.util.UUID;

public class abi implements yn<aay> {
   public static final ye<vr, abi> a = yn.a(abi::a, abi::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final abi.c f;
   static final abi.c g = new abi.c() {
      @Override
      public abi.d a() {
         return abi.d.b;
      }

      @Override
      public void a(UUID $$0, abi.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(vr $$0) {
      }
   };

   private abi(UUID $$0, abi.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private abi(vr $$0) {
      this.e = $$0.n();
      abi.d $$1 = $$0.b(abi.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static abi a(bnq $$0) {
      return new abi($$0.h(), new abi.a($$0));
   }

   public static abi a(UUID $$0) {
      return new abi($$0, g);
   }

   public static abi b(bnq $$0) {
      return new abi($$0.h(), new abi.f($$0.j()));
   }

   public static abi c(bnq $$0) {
      return new abi($$0.h(), new abi.e($$0.i()));
   }

   public static abi d(bnq $$0) {
      return new abi($$0.h(), new abi.h($$0.k(), $$0.l()));
   }

   public static abi e(bnq $$0) {
      return new abi($$0.h(), new abi.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(vr $$0) {
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
   public yp<abi> a() {
      return afj.l;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public void a(abi.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements abi.c {
      private final wg a;
      private final float b;
      private final bnq.a c;
      private final bnq.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bnq $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(vr $$0) {
         this.a = wi.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bnq.a.class);
         this.d = $$0.b(bnq.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public abi.d a() {
         return abi.d.a;
      }

      @Override
      public void a(UUID $$0, abi.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(vr $$0) {
         wi.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(abi.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, wg $$1, float $$2, bnq.a $$3, bnq.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, wg $$1) {
      }

      default void a(UUID $$0, bnq.a $$1, bnq.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      abi.d a();

      void a(UUID var1, abi.b var2);

      void a(vr var1);
   }

   static enum d {
      a(abi.a::new),
      b($$0 -> abi.g),
      c(abi.f::new),
      d(abi.e::new),
      e(abi.h::new),
      f(abi.g::new);

      final yf<vr, abi.c> g;

      private d(yf<vr, abi.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(wg a) implements abi.c {
      private e(vr $$0) {
         this(wi.d.decode($$0));
      }

      @Override
      public abi.d a() {
         return abi.d.d;
      }

      @Override
      public void a(UUID $$0, abi.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(vr $$0) {
         wi.d.encode($$0, this.a);
      }

      public wg b() {
         return this.a;
      }
   }

   static record f(float a) implements abi.c {
      private f(vr $$0) {
         this($$0.readFloat());
      }

      @Override
      public abi.d a() {
         return abi.d.c;
      }

      @Override
      public void a(UUID $$0, abi.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(vr $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements abi.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(vr $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public abi.d a() {
         return abi.d.f;
      }

      @Override
      public void a(UUID $$0, abi.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(vr $$0) {
         $$0.k(abi.a(this.a, this.b, this.c));
      }
   }

   static class h implements abi.c {
      private final bnq.a a;
      private final bnq.b b;

      h(bnq.a $$0, bnq.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(vr $$0) {
         this.a = $$0.b(bnq.a.class);
         this.b = $$0.b(bnq.b.class);
      }

      @Override
      public abi.d a() {
         return abi.d.e;
      }

      @Override
      public void a(UUID $$0, abi.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(vr $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
