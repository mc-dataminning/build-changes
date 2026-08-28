import java.util.Set;

public record eup(ash d, fbs e, fbs f, float g, float h, boolean i, boolean j, Set<bwp> k, eup.a l) {
   public static final eup.a a = $$0 -> {
   };
   public static final eup.a b = eup::a;
   public static final eup.a c = eup::b;

   public eup(ash $$0, fbs $$1, fbs $$2, float $$3, float $$4, eup.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public eup(ash $$0, fbs $$1, fbs $$2, float $$3, float $$4, Set<bwp> $$5, eup.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public eup(ash $$0, bvf $$1, eup.a $$2) {
      this($$0, a($$0, $$1), fbs.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bvf $$0) {
      if ($$0 instanceof asi $$1) {
         $$1.f.b(new aef(1032, jh.c, 0, false));
      }
   }

   private static void b(bvf $$0) {
      $$0.f(jh.a((ka)$$0.dt()));
   }

   public static eup a(ash $$0, bvf $$1, eup.a $$2) {
      return new eup($$0, a($$0, $$1), fbs.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static fbs a(ash $$0, bvf $$1) {
      return $$1.a($$0, $$0.Y()).c();
   }

   public eup a(float $$0, float $$1) {
      return new eup(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public eup a(fbs $$0) {
      return new eup(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public eup a() {
      return new eup(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public ash b() {
      return this.d;
   }

   public fbs c() {
      return this.e;
   }

   public fbs d() {
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

   public Set<bwp> i() {
      return this.k;
   }

   public eup.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bvf var1);

      default eup.a then(eup.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
