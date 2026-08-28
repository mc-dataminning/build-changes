import java.util.Set;

public record euw(ash d, fbx e, fbx f, float g, float h, boolean i, boolean j, Set<bwt> k, euw.a l) {
   public static final euw.a a = $$0 -> {
   };
   public static final euw.a b = euw::a;
   public static final euw.a c = euw::b;

   public euw(ash $$0, fbx $$1, fbx $$2, float $$3, float $$4, euw.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public euw(ash $$0, fbx $$1, fbx $$2, float $$3, float $$4, Set<bwt> $$5, euw.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public euw(ash $$0, bvj $$1, euw.a $$2) {
      this($$0, a($$0, $$1), fbx.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bvj $$0) {
      if ($$0 instanceof asi $$1) {
         $$1.f.b(new aef(1032, jh.c, 0, false));
      }
   }

   private static void b(bvj $$0) {
      $$0.f(jh.a((ka)$$0.dt()));
   }

   public static euw a(ash $$0, bvj $$1, euw.a $$2) {
      return new euw($$0, a($$0, $$1), fbx.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static fbx a(ash $$0, bvj $$1) {
      return $$1.a($$0, $$0.Y()).c();
   }

   public euw a(float $$0, float $$1) {
      return new euw(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public euw a(fbx $$0) {
      return new euw(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public euw a() {
      return new euw(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public ash b() {
      return this.d;
   }

   public fbx c() {
      return this.e;
   }

   public fbx d() {
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

   public Set<bwt> i() {
      return this.k;
   }

   public euw.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bvj var1);

      default euw.a then(euw.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
