import java.util.Set;

public record ewv(aro d, fdw e, fdw f, float g, float h, boolean i, boolean j, Set<bxn> k, ewv.a l) {
   public static final ewv.a a = $$0 -> {
   };
   public static final ewv.a b = ewv::a;
   public static final ewv.a c = ewv::b;

   public ewv(aro $$0, fdw $$1, fdw $$2, float $$3, float $$4, ewv.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public ewv(aro $$0, fdw $$1, fdw $$2, float $$3, float $$4, Set<bxn> $$5, ewv.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public ewv(aro $$0, bwa $$1, ewv.a $$2) {
      this($$0, a($$0, $$1), fdw.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bwa $$0) {
      if ($$0 instanceof arp $$1) {
         $$1.f.b(new adf(1032, iu.c, 0, false));
      }
   }

   private static void b(bwa $$0) {
      $$0.f(iu.a((jo)$$0.dt()));
   }

   public static ewv a(aro $$0, bwa $$1, ewv.a $$2) {
      return new ewv($$0, a($$0, $$1), fdw.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static fdw a(aro $$0, bwa $$1) {
      return $$1.a($$0, $$0.aa()).c();
   }

   public ewv a(float $$0, float $$1) {
      return new ewv(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public ewv a(fdw $$0) {
      return new ewv(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public ewv a() {
      return new ewv(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public aro b() {
      return this.d;
   }

   public fdw c() {
      return this.e;
   }

   public fdw d() {
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

   public Set<bxn> i() {
      return this.k;
   }

   public ewv.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bwa var1);

      default ewv.a then(ewv.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
