import java.util.Set;

public record exv(arq d, fex e, fex f, float g, float h, boolean i, boolean j, Set<bxx> k, exv.a l) {
   public static final exv.a a = $$0 -> {
   };
   public static final exv.a b = exv::a;
   public static final exv.a c = exv::b;

   public exv(arq $$0, fex $$1, fex $$2, float $$3, float $$4, exv.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public exv(arq $$0, fex $$1, fex $$2, float $$3, float $$4, Set<bxx> $$5, exv.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public exv(arq $$0, bwi $$1, exv.a $$2) {
      this($$0, a($$0, $$1), fex.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bwi $$0) {
      if ($$0 instanceof arr $$1) {
         $$1.f.b(new adh(1032, iv.c, 0, false));
      }
   }

   private static void b(bwi $$0) {
      $$0.f(iv.a((jp)$$0.ds()));
   }

   public static exv a(arq $$0, bwi $$1, exv.a $$2) {
      return new exv($$0, a($$0, $$1), fex.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static fex a(arq $$0, bwi $$1) {
      return $$1.a($$0, $$0.aa()).c();
   }

   public exv a(float $$0, float $$1) {
      return new exv(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public exv a(fex $$0) {
      return new exv(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public exv a() {
      return new exv(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public arq b() {
      return this.d;
   }

   public fex c() {
      return this.e;
   }

   public fex d() {
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

   public Set<bxx> i() {
      return this.k;
   }

   public exv.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bwi var1);

      default exv.a then(exv.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
