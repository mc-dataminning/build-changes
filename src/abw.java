import java.util.UUID;

public class abw implements zb<abm> {
   public static final ys<wf, abw> a = zb.a(abw::a, abw::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final abw.c f;
   static final abw.c g = new abw.c() {
      @Override
      public abw.d a() {
         return abw.d.b;
      }

      @Override
      public void a(UUID $$0, abw.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wf $$0) {
      }
   };

   private abw(UUID $$0, abw.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private abw(wf $$0) {
      this.e = $$0.n();
      abw.d $$1 = $$0.b(abw.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static abw a(bpc $$0) {
      return new abw($$0.h(), new abw.a($$0));
   }

   public static abw a(UUID $$0) {
      return new abw($$0, g);
   }

   public static abw b(bpc $$0) {
      return new abw($$0.h(), new abw.f($$0.j()));
   }

   public static abw c(bpc $$0) {
      return new abw($$0.h(), new abw.e($$0.i()));
   }

   public static abw d(bpc $$0) {
      return new abw($$0.h(), new abw.h($$0.k(), $$0.l()));
   }

   public static abw e(bpc $$0) {
      return new abw($$0.h(), new abw.g($$0.m(), $$0.n(), $$0.o()));
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
   public zd<abw> a() {
      return afx.l;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public void a(abw.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements abw.c {
      private final wu a;
      private final float b;
      private final bpc.a c;
      private final bpc.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bpc $$0) {
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
         this.c = $$0.b(bpc.a.class);
         this.d = $$0.b(bpc.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public abw.d a() {
         return abw.d.a;
      }

      @Override
      public void a(UUID $$0, abw.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wf $$0) {
         ww.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(abw.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, wu $$1, float $$2, bpc.a $$3, bpc.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, wu $$1) {
      }

      default void a(UUID $$0, bpc.a $$1, bpc.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      abw.d a();

      void a(UUID var1, abw.b var2);

      void a(wf var1);
   }

   static enum d {
      a(abw.a::new),
      b($$0 -> abw.g),
      c(abw.f::new),
      d(abw.e::new),
      e(abw.h::new),
      f(abw.g::new);

      final yt<wf, abw.c> g;

      private d(yt<wf, abw.c> $$0) {
         this.g = $$0;
      }
   }

   static record e(wu a) implements abw.c {
      private e(wf $$0) {
         this(ww.d.decode($$0));
      }

      @Override
      public abw.d a() {
         return abw.d.d;
      }

      @Override
      public void a(UUID $$0, abw.b $$1) {
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

   static record f(float a) implements abw.c {
      private f(wf $$0) {
         this($$0.readFloat());
      }

      @Override
      public abw.d a() {
         return abw.d.c;
      }

      @Override
      public void a(UUID $$0, abw.b $$1) {
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

   static class g implements abw.c {
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
      public abw.d a() {
         return abw.d.f;
      }

      @Override
      public void a(UUID $$0, abw.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wf $$0) {
         $$0.k(abw.a(this.a, this.b, this.c));
      }
   }

   static class h implements abw.c {
      private final bpc.a a;
      private final bpc.b b;

      h(bpc.a $$0, bpc.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wf $$0) {
         this.a = $$0.b(bpc.a.class);
         this.b = $$0.b(bpc.b.class);
      }

      @Override
      public abw.d a() {
         return abw.d.e;
      }

      @Override
      public void a(UUID $$0, abw.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wf $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
