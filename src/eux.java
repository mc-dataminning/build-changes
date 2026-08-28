import java.util.Set;

public record eux(ash d, fby e, fby f, float g, float h, boolean i, boolean j, Set<bwu> k, eux.a l) {
   public static final eux.a a = $$0 -> {
   };
   public static final eux.a b = eux::a;
   public static final eux.a c = eux::b;

   public eux(ash $$0, fby $$1, fby $$2, float $$3, float $$4, eux.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public eux(ash $$0, fby $$1, fby $$2, float $$3, float $$4, Set<bwu> $$5, eux.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public eux(ash $$0, bvk $$1, eux.a $$2) {
      this($$0, a($$0, $$1), fby.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bvk $$0) {
      if ($$0 instanceof asi $$1) {
         $$1.f.b(new aef(1032, jh.c, 0, false));
      }
   }

   private static void b(bvk $$0) {
      $$0.f(jh.a((ka)$$0.du()));
   }

   public static eux a(ash $$0, bvk $$1, eux.a $$2) {
      return new eux($$0, a($$0, $$1), fby.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static fby a(ash $$0, bvk $$1) {
      return $$1.a($$0, $$0.Y()).c();
   }

   public eux a(float $$0, float $$1) {
      return new eux(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public eux a(fby $$0) {
      return new eux(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public eux a() {
      return new eux(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public ash b() {
      return this.d;
   }

   public fby c() {
      return this.e;
   }

   public fby d() {
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

   public Set<bwu> i() {
      return this.k;
   }

   public eux.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bvk var1);

      default eux.a then(eux.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
