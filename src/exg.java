import java.util.Set;

public record exg(arq d, fei e, fei f, float g, float h, boolean i, boolean j, Set<bxq> k, exg.a l) {
   public static final exg.a a = $$0 -> {
   };
   public static final exg.a b = exg::a;
   public static final exg.a c = exg::b;

   public exg(arq $$0, fei $$1, fei $$2, float $$3, float $$4, exg.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public exg(arq $$0, fei $$1, fei $$2, float $$3, float $$4, Set<bxq> $$5, exg.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public exg(arq $$0, bwd $$1, exg.a $$2) {
      this($$0, a($$0, $$1), fei.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bwd $$0) {
      if ($$0 instanceof arr $$1) {
         $$1.f.b(new adh(1032, iu.c, 0, false));
      }
   }

   private static void b(bwd $$0) {
      $$0.f(iu.a((jo)$$0.dt()));
   }

   public static exg a(arq $$0, bwd $$1, exg.a $$2) {
      return new exg($$0, a($$0, $$1), fei.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static fei a(arq $$0, bwd $$1) {
      return $$1.a($$0, $$0.aa()).c();
   }

   public exg a(float $$0, float $$1) {
      return new exg(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public exg a(fei $$0) {
      return new exg(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public exg a() {
      return new exg(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public arq b() {
      return this.d;
   }

   public fei c() {
      return this.e;
   }

   public fei d() {
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

   public Set<bxq> i() {
      return this.k;
   }

   public exg.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bwd var1);

      default exg.a then(exg.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
