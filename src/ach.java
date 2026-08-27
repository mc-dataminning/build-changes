import java.util.UUID;

public class ach implements zl<abw> {
   public static final zc<wp, ach> a = zl.a(ach::a, ach::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final ach.c f;
   static final ach.c g = new ach.c() {
      @Override
      public ach.d a() {
         return ach.d.b;
      }

      @Override
      public void a(UUID $$0, ach.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wp $$0) {
      }
   };

   private ach(UUID $$0, ach.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private ach(wp $$0) {
      this.e = $$0.n();
      ach.d $$1 = $$0.b(ach.d.class);
      this.f = $$1.h.decode($$0);
   }

   public static ach a(bpq $$0) {
      return new ach($$0.h(), new ach.a($$0));
   }

   public static ach a(UUID $$0) {
      return new ach($$0, g);
   }

   public static ach b(bpq $$0) {
      return new ach($$0.h(), new ach.g($$0.j()));
   }

   public static ach c(bpq $$0) {
      return new ach($$0.h(), new ach.f($$0.i()));
   }

   public static ach d(bpq $$0) {
      return new ach($$0.h(), new ach.e($$0.p(), $$0.q()));
   }

   public static ach e(bpq $$0) {
      return new ach($$0.h(), new ach.i($$0.k(), $$0.l()));
   }

   public static ach f(bpq $$0) {
      return new ach($$0.h(), new ach.h($$0.m(), $$0.n(), $$0.o()));
   }

   private void a(wp $$0) {
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
   public zn<ach> a() {
      return agj.m;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public void a(ach.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements ach.c {
      private final xe a;
      private final float b;
      private final bpq.a c;
      private final bpq.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;
      private final ewu h;
      private final int i;

      a(bpq $$0) {
         this.a = $$0.i();
         this.b = $$0.j();
         this.c = $$0.k();
         this.d = $$0.l();
         this.e = $$0.m();
         this.f = $$0.n();
         this.g = $$0.o();
         this.h = $$0.p();
         this.i = $$0.q();
      }

      private a(wp $$0) {
         this.a = xg.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bpq.a.class);
         this.d = $$0.b(bpq.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
         this.h = $$0.k();
         this.i = $$0.l();
      }

      @Override
      public ach.d a() {
         return ach.d.a;
      }

      @Override
      public void a(UUID $$0, ach.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }

      @Override
      public void a(wp $$0) {
         xg.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.k(ach.a(this.e, this.f, this.g));
         $$0.a(this.h);
         $$0.c(this.i);
      }
   }

   public interface b {
      default void a(UUID $$0, xe $$1, float $$2, bpq.a $$3, bpq.b $$4, boolean $$5, boolean $$6, boolean $$7, ewu $$8, int $$9) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, xe $$1) {
      }

      default void a(UUID $$0, ewu $$1, int $$2) {
      }

      default void a(UUID $$0, bpq.a $$1, bpq.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      ach.d a();

      void a(UUID var1, ach.b var2);

      void a(wp var1);
   }

   static enum d {
      a(ach.a::new),
      b($$0 -> ach.g),
      c(ach.g::new),
      d(ach.f::new),
      e(ach.i::new),
      f(ach.h::new),
      g(ach.e::new);

      final zd<wp, ach.c> h;

      private d(zd<wp, ach.c> $$0) {
         this.h = $$0;
      }
   }

   static record e(ewu a, int b) implements ach.c {
      private e(wp $$0) {
         this($$0.k(), $$0.l());
      }

      @Override
      public ach.d a() {
         return ach.d.g;
      }

      @Override
      public void a(UUID $$0, ach.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wp $$0) {
         $$0.a(this.a);
         $$0.c(this.b);
      }

      public ewu b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }
   }

   static record f(xe a) implements ach.c {
      private f(wp $$0) {
         this(xg.d.decode($$0));
      }

      @Override
      public ach.d a() {
         return ach.d.d;
      }

      @Override
      public void a(UUID $$0, ach.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wp $$0) {
         xg.d.encode($$0, this.a);
      }

      public xe b() {
         return this.a;
      }
   }

   static record g(float a) implements ach.c {
      private g(wp $$0) {
         this($$0.readFloat());
      }

      @Override
      public ach.d a() {
         return ach.d.c;
      }

      @Override
      public void a(UUID $$0, ach.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wp $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class h implements ach.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      h(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private h(wp $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public ach.d a() {
         return ach.d.f;
      }

      @Override
      public void a(UUID $$0, ach.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wp $$0) {
         $$0.k(ach.a(this.a, this.b, this.c));
      }
   }

   static class i implements ach.c {
      private final bpq.a a;
      private final bpq.b b;

      i(bpq.a $$0, bpq.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private i(wp $$0) {
         this.a = $$0.b(bpq.a.class);
         this.b = $$0.b(bpq.b.class);
      }

      @Override
      public ach.d a() {
         return ach.d.e;
      }

      @Override
      public void a(UUID $$0, ach.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wp $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
