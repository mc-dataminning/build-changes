import java.util.Set;

public record euq(arx d, fbr e, fbr f, float g, float h, boolean i, boolean j, Set<bwl> k, euq.a l) {
   public static final euq.a a = $$0 -> {
   };
   public static final euq.a b = euq::a;
   public static final euq.a c = euq::b;

   public euq(arx $$0, fbr $$1, fbr $$2, float $$3, float $$4, euq.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public euq(arx $$0, fbr $$1, fbr $$2, float $$3, float $$4, Set<bwl> $$5, euq.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public euq(arx $$0, bvb $$1, euq.a $$2) {
      this($$0, a($$0, $$1), fbr.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bvb $$0) {
      if ($$0 instanceof ary $$1) {
         $$1.f.b(new adu(1032, jh.c, 0, false));
      }
   }

   private static void b(bvb $$0) {
      $$0.f(jh.a((ka)$$0.du()));
   }

   public static euq a(arx $$0, bvb $$1, euq.a $$2) {
      return new euq($$0, a($$0, $$1), fbr.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static fbr a(arx $$0, bvb $$1) {
      return $$1.a($$0, $$0.Z()).c();
   }

   public euq a(float $$0, float $$1) {
      return new euq(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public euq a(fbr $$0) {
      return new euq(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public euq a() {
      return new euq(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public arx b() {
      return this.d;
   }

   public fbr c() {
      return this.e;
   }

   public fbr d() {
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

   public Set<bwl> i() {
      return this.k;
   }

   public euq.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bvb var1);

      default euq.a then(euq.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
