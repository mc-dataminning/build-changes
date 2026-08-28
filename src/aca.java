import java.util.UUID;

public class aca implements zc<abr> {
   public static final yt<wg, aca> a = zc.a(aca::a, aca::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final aca.c f;
   static final aca.c g = new aca.c() {
      @Override
      public aca.d a() {
         return aca.d.b;
      }

      @Override
      public void a(UUID $$0, aca.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wg $$0) {
      }
   };

   private aca(UUID $$0, aca.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private aca(wg $$0) {
      this.e = $$0.n();
      aca.d $$1 = $$0.b(aca.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static aca a(btg $$0) {
      return new aca($$0.h(), new aca.a($$0));
   }

   public static aca a(UUID $$0) {
      return new aca($$0, g);
   }

   public static aca b(btg $$0) {
      return new aca($$0.h(), new aca.f($$0.j()));
   }

   public static aca c(btg $$0) {
      return new aca($$0.h(), new aca.e($$0.i()));
   }

   public static aca d(btg $$0) {
      return new aca($$0.h(), new aca.h($$0.k(), $$0.l()));
   }

   public static aca e(btg $$0) {
      return new aca($$0.h(), new aca.g($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(wg $$0) {
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
   public ze<aca> a() {
      return agk.k;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public void a(aca.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements aca.c {
      private final wv a;
      private final float b;
      private final btg.a c;
      private final btg.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(btg $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
      }

      private a(wg $$0) {
         this.a = wx.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(btg.a.class);
         this.d = $$0.b(btg.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public aca.d a() {
         return aca.d.a;
      }

      @Override
      public void a(UUID $$0, aca.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wg $$0) {
         wx.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.l(aca.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, wv $$1, float $$2, btg.a $$3, btg.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, wv $$1) {
      }

      default void a(UUID $$0, btg.a $$1, btg.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      aca.d a();

      void a(UUID var1, aca.b var2);

      void a(wg var1);
   }

   static enum d {
      a(aca.a::new),
      b($$0 -> aca.g),
      c(aca.f::new),
      d(aca.e::new),
      e(aca.h::new),
      f(aca.g::new);

      final yu<wg, aca.c> g;

      private d(final yu<wg, aca.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(wv a) implements aca.c {
      private e(wg $$0) {
         this(wx.d.decode($$0));
      }

      @Override
      public aca.d a() {
         return aca.d.d;
      }

      @Override
      public void a(UUID $$0, aca.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wg $$0) {
         wx.d.encode($$0, this.a);
      }

      public wv b() {
         return this.a;
      }
   }

   static record f(float a) implements aca.c {
      private f(wg $$0) {
         this($$0.readFloat());
      }

      @Override
      public aca.d a() {
         return aca.d.c;
      }

      @Override
      public void a(UUID $$0, aca.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wg $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements aca.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wg $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public aca.d a() {
         return aca.d.f;
      }

      @Override
      public void a(UUID $$0, aca.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wg $$0) {
         $$0.l(aca.a(this.a, this.b, this.c));
      }
   }

   static class h implements aca.c {
      private final btg.a a;
      private final btg.b b;

      h(btg.a $$0, btg.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wg $$0) {
         this.a = $$0.b(btg.a.class);
         this.b = $$0.b(btg.b.class);
      }

      @Override
      public aca.d a() {
         return aca.d.e;
      }

      @Override
      public void a(UUID $$0, aca.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wg $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
