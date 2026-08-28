import java.util.Set;

public record esi(arn d, ezn e, ezn f, float g, float h, boolean i, Set<bvo> j, esi.a k) {
   public static final esi.a a = $$0 -> {
   };
   public static final esi.a b = esi::a;
   public static final esi.a c = esi::b;

   public esi(arn $$0, ezn $$1, ezn $$2, float $$3, float $$4, esi.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public esi(arn $$0, ezn $$1, ezn $$2, float $$3, float $$4, Set<bvo> $$5, esi.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, $$5, $$6);
   }

   public esi(arn $$0, bue $$1, esi.a $$2) {
      this($$0, a($$0, $$1), ezn.c, 0.0F, 0.0F, false, Set.of(), $$2);
   }

   private static void a(bue $$0) {
      if ($$0 instanceof aro $$1) {
         $$1.g.b(new adr(1032, jh.c, 0, false));
      }
   }

   private static void b(bue $$0) {
      $$0.f(jh.a((ka)$$0.dv()));
   }

   public static esi a(arn $$0, bue $$1, esi.a $$2) {
      return new esi($$0, a($$0, $$1), ezn.c, 0.0F, 0.0F, true, Set.of(), $$2);
   }

   private static ezn a(arn $$0, bue $$1) {
      return $$1.a($$0, $$0.W()).c();
   }

   public esi a(float $$0, float $$1) {
      return new esi(this.a(), this.b(), this.c(), $$0, $$1, this.f(), this.g(), this.h());
   }

   public arn a() {
      return this.d;
   }

   public ezn b() {
      return this.e;
   }

   public ezn c() {
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

   public Set<bvo> g() {
      return this.j;
   }

   public esi.a h() {
      return this.k;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bue var1);

      default esi.a then(esi.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
