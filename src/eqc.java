public record eqc(aqu d, exc e, exc f, float g, float h, boolean i, eqc.a j) {
   public static final eqc.a a = $$0 -> {
   };
   public static final eqc.a b = eqc::a;
   public static final eqc.a c = eqc::b;

   public eqc(aqu $$0, exc $$1, exc $$2, float $$3, float $$4, eqc.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, false, $$5);
   }

   public eqc(aqu $$0, bsr $$1, eqc.a $$2) {
      this($$0, a($$0, $$1), exc.b, 0.0F, 0.0F, false, $$2);
   }

   private static void a(bsr $$0) {
      if ($$0 instanceof aqv $$1) {
         $$1.c.b(new adh(1032, jd.c, 0, false));
      }
   }

   private static void b(bsr $$0) {
      $$0.f(jd.a((jw)$$0.dm()));
   }

   public static eqc a(aqu $$0, bsr $$1, eqc.a $$2) {
      return new eqc($$0, a($$0, $$1), exc.b, 0.0F, 0.0F, true, $$2);
   }

   private static exc a(aqu $$0, bsr $$1) {
      return $$1.a($$0, $$0.V()).c();
   }

   public aqu a() {
      return this.d;
   }

   public exc b() {
      return this.e;
   }

   public exc c() {
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

   public eqc.a g() {
      return this.j;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bsr var1);

      default eqc.a then(eqc.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
