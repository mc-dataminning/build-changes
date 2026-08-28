import java.util.Set;

public record esc(arm d, ezh e, ezh f, float g, float h, boolean i, Set<bvj> j, esc.a k) {
   public static final esc.a a = $$0 -> {
   };
   public static final esc.a b = esc::a;
   public static final esc.a c = esc::b;

   public esc(arm $$0, ezh $$1, ezh $$2, float $$3, float $$4, esc.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public esc(arm $$0, ezh $$1, ezh $$2, float $$3, float $$4, Set<bvj> $$5, esc.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, $$5, $$6);
   }

   public esc(arm $$0, btz $$1, esc.a $$2) {
      this($$0, a($$0, $$1), ezh.c, 0.0F, 0.0F, false, Set.of(), $$2);
   }

   private static void a(btz $$0) {
      if ($$0 instanceof arn $$1) {
         $$1.d.b(new adq(1032, jg.c, 0, false));
      }
   }

   private static void b(btz $$0) {
      $$0.f(jg.a((jz)$$0.dv()));
   }

   public static esc a(arm $$0, btz $$1, esc.a $$2) {
      return new esc($$0, a($$0, $$1), ezh.c, 0.0F, 0.0F, true, Set.of(), $$2);
   }

   private static ezh a(arm $$0, btz $$1) {
      return $$1.a($$0, $$0.W()).c();
   }

   public esc a(float $$0, float $$1) {
      return new esc(this.a(), this.b(), this.c(), $$0, $$1, this.f(), this.g(), this.h());
   }

   public arm a() {
      return this.d;
   }

   public ezh b() {
      return this.e;
   }

   public ezh c() {
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

   public Set<bvj> g() {
      return this.j;
   }

   public esc.a h() {
      return this.k;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(btz var1);

      default esc.a then(esc.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
