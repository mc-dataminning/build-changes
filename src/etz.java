import java.util.Set;

public record etz(ard d, fba e, fba f, float g, float h, boolean i, boolean j, Set<bvv> k, etz.a l) {
   public static final etz.a a = $$0 -> {
   };
   public static final etz.a b = etz::a;
   public static final etz.a c = etz::b;

   public etz(ard $$0, fba $$1, fba $$2, float $$3, float $$4, etz.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public etz(ard $$0, fba $$1, fba $$2, float $$3, float $$4, Set<bvv> $$5, etz.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public etz(ard $$0, bul $$1, etz.a $$2) {
      this($$0, a($$0, $$1), fba.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bul $$0) {
      if ($$0 instanceof are $$1) {
         $$1.f.b(new acz(1032, ji.c, 0, false));
      }
   }

   private static void b(bul $$0) {
      $$0.f(ji.a((kb)$$0.dt()));
   }

   public static etz a(ard $$0, bul $$1, etz.a $$2) {
      return new etz($$0, a($$0, $$1), fba.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static fba a(ard $$0, bul $$1) {
      return $$1.a($$0, $$0.Z()).c();
   }

   public etz a(float $$0, float $$1) {
      return new etz(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public etz a(fba $$0) {
      return new etz(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public etz a() {
      return new etz(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public ard b() {
      return this.d;
   }

   public fba c() {
      return this.e;
   }

   public fba d() {
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

   public Set<bvv> i() {
      return this.k;
   }

   public etz.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bul var1);

      default etz.a then(etz.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
