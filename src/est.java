import java.util.Set;

public record est(arp d, ezy e, ezy f, float g, float h, boolean i, Set<bvv> j, est.a k) {
   public static final est.a a = $$0 -> {
   };
   public static final est.a b = est::a;
   public static final est.a c = est::b;

   public est(arp $$0, ezy $$1, ezy $$2, float $$3, float $$4, est.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public est(arp $$0, ezy $$1, ezy $$2, float $$3, float $$4, Set<bvv> $$5, est.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, $$5, $$6);
   }

   public est(arp $$0, bul $$1, est.a $$2) {
      this($$0, a($$0, $$1), ezy.c, 0.0F, 0.0F, false, Set.of(), $$2);
   }

   private static void a(bul $$0) {
      if ($$0 instanceof arq $$1) {
         $$1.f.b(new ads(1032, jh.c, 0, false));
      }
   }

   private static void b(bul $$0) {
      $$0.f(jh.a((ka)$$0.dt()));
   }

   public static est a(arp $$0, bul $$1, est.a $$2) {
      return new est($$0, a($$0, $$1), ezy.c, 0.0F, 0.0F, true, Set.of(), $$2);
   }

   private static ezy a(arp $$0, bul $$1) {
      return $$1.a($$0, $$0.X()).c();
   }

   public est a(float $$0, float $$1) {
      return new est(this.a(), this.b(), this.c(), $$0, $$1, this.f(), this.g(), this.h());
   }

   public arp a() {
      return this.d;
   }

   public ezy b() {
      return this.e;
   }

   public ezy c() {
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

   public Set<bvv> g() {
      return this.j;
   }

   public est.a h() {
      return this.k;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bul var1);

      default est.a then(est.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
