import java.util.Set;

public record etx(arc d, fay e, fay f, float g, float h, boolean i, boolean j, Set<bvt> k, etx.a l) {
   public static final etx.a a = $$0 -> {
   };
   public static final etx.a b = etx::a;
   public static final etx.a c = etx::b;

   public etx(arc $$0, fay $$1, fay $$2, float $$3, float $$4, etx.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public etx(arc $$0, fay $$1, fay $$2, float $$3, float $$4, Set<bvt> $$5, etx.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public etx(arc $$0, buj $$1, etx.a $$2) {
      this($$0, a($$0, $$1), fay.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(buj $$0) {
      if ($$0 instanceof ard $$1) {
         $$1.f.b(new acy(1032, ji.c, 0, false));
      }
   }

   private static void b(buj $$0) {
      $$0.f(ji.a((kb)$$0.du()));
   }

   public static etx a(arc $$0, buj $$1, etx.a $$2) {
      return new etx($$0, a($$0, $$1), fay.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static fay a(arc $$0, buj $$1) {
      return $$1.a($$0, $$0.Z()).c();
   }

   public etx a(float $$0, float $$1) {
      return new etx(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public etx a(fay $$0) {
      return new etx(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public etx a() {
      return new etx(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public arc b() {
      return this.d;
   }

   public fay c() {
      return this.e;
   }

   public fay d() {
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

   public Set<bvt> i() {
      return this.k;
   }

   public etx.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(buj var1);

      default etx.a then(etx.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
