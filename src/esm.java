import java.util.Set;

public record esm(arq d, ezr e, ezr f, float g, float h, boolean i, Set<bvs> j, esm.a k) {
   public static final esm.a a = $$0 -> {
   };
   public static final esm.a b = esm::a;
   public static final esm.a c = esm::b;

   public esm(arq $$0, ezr $$1, ezr $$2, float $$3, float $$4, esm.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public esm(arq $$0, ezr $$1, ezr $$2, float $$3, float $$4, Set<bvs> $$5, esm.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, $$5, $$6);
   }

   public esm(arq $$0, bui $$1, esm.a $$2) {
      this($$0, a($$0, $$1), ezr.c, 0.0F, 0.0F, false, Set.of(), $$2);
   }

   private static void a(bui $$0) {
      if ($$0 instanceof arr $$1) {
         $$1.g.b(new adu(1032, jh.c, 0, false));
      }
   }

   private static void b(bui $$0) {
      $$0.f(jh.a((ka)$$0.dw()));
   }

   public static esm a(arq $$0, bui $$1, esm.a $$2) {
      return new esm($$0, a($$0, $$1), ezr.c, 0.0F, 0.0F, true, Set.of(), $$2);
   }

   private static ezr a(arq $$0, bui $$1) {
      return $$1.a($$0, $$0.W()).c();
   }

   public esm a(float $$0, float $$1) {
      return new esm(this.a(), this.b(), this.c(), $$0, $$1, this.f(), this.g(), this.h());
   }

   public arq a() {
      return this.d;
   }

   public ezr b() {
      return this.e;
   }

   public ezr c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public float e() {
      return this.h;
   }

   public boolean f() {
      return this.i;
   }

   public Set<bvs> g() {
      return this.j;
   }

   public esm.a h() {
      return this.k;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bui var1);

      default esm.a then(esm.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
