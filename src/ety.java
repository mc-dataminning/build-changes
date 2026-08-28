import java.util.Set;

public record ety(ard d, faz e, faz f, float g, float h, boolean i, boolean j, Set<bvu> k, ety.a l) {
   public static final ety.a a = $$0 -> {
   };
   public static final ety.a b = ety::a;
   public static final ety.a c = ety::b;

   public ety(ard $$0, faz $$1, faz $$2, float $$3, float $$4, ety.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public ety(ard $$0, faz $$1, faz $$2, float $$3, float $$4, Set<bvu> $$5, ety.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public ety(ard $$0, buk $$1, ety.a $$2) {
      this($$0, a($$0, $$1), faz.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(buk $$0) {
      if ($$0 instanceof are $$1) {
         $$1.f.b(new acz(1032, ji.c, 0, false));
      }
   }

   private static void b(buk $$0) {
      $$0.f(ji.a((kb)$$0.dt()));
   }

   public static ety a(ard $$0, buk $$1, ety.a $$2) {
      return new ety($$0, a($$0, $$1), faz.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static faz a(ard $$0, buk $$1) {
      return $$1.a($$0, $$0.Z()).c();
   }

   public ety a(float $$0, float $$1) {
      return new ety(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public ety a(faz $$0) {
      return new ety(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public ety a() {
      return new ety(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public ard b() {
      return this.d;
   }

   public faz c() {
      return this.e;
   }

   public faz d() {
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

   public Set<bvu> i() {
      return this.k;
   }

   public ety.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(buk var1);

      default ety.a then(ety.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
