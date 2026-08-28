import java.util.Set;

public record eya(arq d, ffc e, ffc f, float g, float h, boolean i, boolean j, Set<bxx> k, eya.a l) {
   public static final eya.a a = $$0 -> {
   };
   public static final eya.a b = eya::a;
   public static final eya.a c = eya::b;

   public eya(arq $$0, ffc $$1, ffc $$2, float $$3, float $$4, eya.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public eya(arq $$0, ffc $$1, ffc $$2, float $$3, float $$4, Set<bxx> $$5, eya.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public eya(arq $$0, bwi $$1, eya.a $$2) {
      this($$0, a($$0, $$1), ffc.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bwi $$0) {
      if ($$0 instanceof arr $$1) {
         $$1.f.b(new adh(1032, iv.c, 0, false));
      }
   }

   private static void b(bwi $$0) {
      $$0.f(iv.a((jp)$$0.ds()));
   }

   public static eya a(arq $$0, bwi $$1, eya.a $$2) {
      return new eya($$0, a($$0, $$1), ffc.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static ffc a(arq $$0, bwi $$1) {
      return $$1.a($$0, $$0.aa()).c();
   }

   public eya a(float $$0, float $$1) {
      return new eya(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public eya a(ffc $$0) {
      return new eya(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public eya a() {
      return new eya(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public arq b() {
      return this.d;
   }

   public ffc c() {
      return this.e;
   }

   public ffc d() {
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

   public eya.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bwi var1);

      default eya.a then(eya.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
