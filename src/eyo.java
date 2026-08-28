import java.util.Set;

public record eyo(ars d, ffq e, ffq f, float g, float h, boolean i, boolean j, Set<byi> k, eyo.a l) {
   public static final eyo.a a = $$0 -> {
   };
   public static final eyo.a b = eyo::a;
   public static final eyo.a c = eyo::b;

   public eyo(ars $$0, ffq $$1, ffq $$2, float $$3, float $$4, eyo.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public eyo(ars $$0, ffq $$1, ffq $$2, float $$3, float $$4, Set<byi> $$5, eyo.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public eyo(ars $$0, bwt $$1, eyo.a $$2) {
      this($$0, a($$0, $$1), ffq.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bwt $$0) {
      if ($$0 instanceof art $$1) {
         $$1.f.b(new adj(1032, iv.c, 0, false));
      }
   }

   private static void b(bwt $$0) {
      $$0.f(iv.a((jp)$$0.dt()));
   }

   public static eyo a(ars $$0, bwt $$1, eyo.a $$2) {
      return new eyo($$0, a($$0, $$1), ffq.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static ffq a(ars $$0, bwt $$1) {
      return $$1.a($$0, $$0.aa()).c();
   }

   public eyo a(float $$0, float $$1) {
      return new eyo(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public eyo a(ffq $$0) {
      return new eyo(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public eyo a() {
      return new eyo(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public ars b() {
      return this.d;
   }

   public ffq c() {
      return this.e;
   }

   public ffq d() {
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

   public Set<byi> i() {
      return this.k;
   }

   public eyo.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bwt var1);

      default eyo.a then(eyo.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
