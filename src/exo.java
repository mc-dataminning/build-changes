import java.util.Set;

public record exo(arq d, feq e, feq f, float g, float h, boolean i, boolean j, Set<bxs> k, exo.a l) {
   public static final exo.a a = $$0 -> {
   };
   public static final exo.a b = exo::a;
   public static final exo.a c = exo::b;

   public exo(arq $$0, feq $$1, feq $$2, float $$3, float $$4, exo.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public exo(arq $$0, feq $$1, feq $$2, float $$3, float $$4, Set<bxs> $$5, exo.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public exo(arq $$0, bwf $$1, exo.a $$2) {
      this($$0, a($$0, $$1), feq.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bwf $$0) {
      if ($$0 instanceof arr $$1) {
         $$1.f.b(new adh(1032, iu.c, 0, false));
      }
   }

   private static void b(bwf $$0) {
      $$0.f(iu.a((jo)$$0.dt()));
   }

   public static exo a(arq $$0, bwf $$1, exo.a $$2) {
      return new exo($$0, a($$0, $$1), feq.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static feq a(arq $$0, bwf $$1) {
      return $$1.a($$0, $$0.aa()).c();
   }

   public exo a(float $$0, float $$1) {
      return new exo(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public exo a(feq $$0) {
      return new exo(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public exo a() {
      return new exo(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public arq b() {
      return this.d;
   }

   public feq c() {
      return this.e;
   }

   public feq d() {
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

   public Set<bxs> i() {
      return this.k;
   }

   public exo.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bwf var1);

      default exo.a then(exo.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
