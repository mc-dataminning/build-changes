import java.util.UUID;

public class abx implements zb<abn> {
   public static final ys<wf, abx> a = zb.a(abx::a, abx::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final abx.c f;
   static final abx.c g = new abx.c() {
      @Override
      public abx.d a() {
         return abx.d.b;
      }

      @Override
      public void a(UUID $$0, abx.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wf $$0) {
      }
   };

   private abx(UUID $$0, abx.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private abx(wf $$0) {
      this.e = $$0.n();
      abx.d $$1 = $$0.b(abx.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static abx a(bpx $$0) {
      return new abx($$0.h(), new abx.a($$0));
   }

   public static abx a(UUID $$0) {
      return new abx($$0, g);
   }

   public static abx b(bpx $$0) {
      return new abx($$0.h(), new abx.f($$0.j()));
   }

   public static abx c(bpx $$0) {
      return new abx($$0.h(), new abx.e($$0.i()));
   }

   public static abx d(bpx $$0) {
      return new abx($$0.h(), new abx.h($$0.k(), $$0.l()));
   }

   public static abx e(bpx $$0) {
      return new abx($$0.h(), new abx.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(wf $$0) {
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
   public zd<abx> a() {
      return afz.l;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public void a(abx.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements abx.c {
      private final wu a;
      private final float b;
      private final bpx.a c;
      private final bpx.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bpx $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(wf $$0) {
         this.a = ww.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bpx.a.class);
         this.d = $$0.b(bpx.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public abx.d a() {
         return abx.d.a;
      }

      @Override
      public void a(UUID $$0, abx.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wf $$0) {
         ww.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(abx.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, wu $$1, float $$2, bpx.a $$3, bpx.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, wu $$1) {
      }

      default void a(UUID $$0, bpx.a $$1, bpx.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      abx.d a();

      void a(UUID var1, abx.b var2);

      void a(wf var1);
   }

   static enum d {
      a(abx.a::new),
      b($$0 -> abx.g),
      c(abx.f::new),
      d(abx.e::new),
      e(abx.h::new),
      f(abx.g::new);

      final yt<wf, abx.c> g;

      private d(final yt<wf, abx.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(wu a) implements abx.c {
      private e(wf $$0) {
         this(ww.d.decode($$0));
      }

      @Override
      public abx.d a() {
         return abx.d.d;
      }

      @Override
      public void a(UUID $$0, abx.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wf $$0) {
         ww.d.encode($$0, this.a);
      }

      public wu b() {
         return this.a;
      }
   }

   static record f(float a) implements abx.c {
      private f(wf $$0) {
         this($$0.readFloat());
      }

      @Override
      public abx.d a() {
         return abx.d.c;
      }

      @Override
      public void a(UUID $$0, abx.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wf $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements abx.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wf $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public abx.d a() {
         return abx.d.f;
      }

      @Override
      public void a(UUID $$0, abx.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wf $$0) {
         $$0.k(abx.a(this.a, this.b, this.c));
      }
   }

   static class h implements abx.c {
      private final bpx.a a;
      private final bpx.b b;

      h(bpx.a $$0, bpx.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wf $$0) {
         this.a = $$0.b(bpx.a.class);
         this.b = $$0.b(bpx.b.class);
      }

      @Override
      public abx.d a() {
         return abx.d.e;
      }

      @Override
      public void a(UUID $$0, abx.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wf $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
