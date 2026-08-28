import java.util.Set;

public record eza(asb d, fgc e, fgc f, float g, float h, boolean i, boolean j, Set<byt> k, eza.a l) {
   public static final eza.a a = $$0 -> {
   };
   public static final eza.a b = eza::a;
   public static final eza.a c = eza::b;

   public eza(asb $$0, fgc $$1, fgc $$2, float $$3, float $$4, eza.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public eza(asb $$0, fgc $$1, fgc $$2, float $$3, float $$4, Set<byt> $$5, eza.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public eza(asb $$0, bxe $$1, eza.a $$2) {
      this($$0, a($$0, $$1), fgc.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bxe $$0) {
      if ($$0 instanceof asc $$1) {
         $$1.f.b(new ads(1032, iw.c, 0, false));
      }
   }

   private static void b(bxe $$0) {
      $$0.f(iw.a((jq)$$0.dt()));
   }

   public static eza a(asb $$0, bxe $$1, eza.a $$2) {
      return new eza($$0, a($$0, $$1), fgc.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static fgc a(asb $$0, bxe $$1) {
      return $$1.a($$0, $$0.aa()).c();
   }

   public eza a(float $$0, float $$1) {
      return new eza(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public eza a(fgc $$0) {
      return new eza(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public eza a() {
      return new eza(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public asb b() {
      return this.d;
   }

   public fgc c() {
      return this.e;
   }

   public fgc d() {
      return this.f;
   }

   public float e() {
      return this.g;
   }

   public float f() {
      return this.h;
   }

   public boolean g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public Set<byt> i() {
      return this.k;
   }

   public eza.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bxe var1);

      default eza.a then(eza.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
