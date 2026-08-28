import java.util.Set;

public record eua(ard d, fbb e, fbb f, float g, float h, boolean i, boolean j, Set<bvw> k, eua.a l) {
   public static final eua.a a = $$0 -> {
   };
   public static final eua.a b = eua::a;
   public static final eua.a c = eua::b;

   public eua(ard $$0, fbb $$1, fbb $$2, float $$3, float $$4, eua.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public eua(ard $$0, fbb $$1, fbb $$2, float $$3, float $$4, Set<bvw> $$5, eua.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public eua(ard $$0, bum $$1, eua.a $$2) {
      this($$0, a($$0, $$1), fbb.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bum $$0) {
      if ($$0 instanceof are $$1) {
         $$1.f.b(new acz(1032, ji.c, 0, false));
      }
   }

   private static void b(bum $$0) {
      $$0.f(ji.a((kb)$$0.dt()));
   }

   public static eua a(ard $$0, bum $$1, eua.a $$2) {
      return new eua($$0, a($$0, $$1), fbb.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static fbb a(ard $$0, bum $$1) {
      return $$1.a($$0, $$0.Z()).c();
   }

   public eua a(float $$0, float $$1) {
      return new eua(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public eua a(fbb $$0) {
      return new eua(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public eua a() {
      return new eua(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public ard b() {
      return this.d;
   }

   public fbb c() {
      return this.e;
   }

   public fbb d() {
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

   public Set<bvw> i() {
      return this.k;
   }

   public eua.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bum var1);

      default eua.a then(eua.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
