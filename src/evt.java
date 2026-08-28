import java.util.Set;

public record evt(arn d, fcu e, fcu f, float g, float h, boolean i, boolean j, Set<bxf> k, evt.a l) {
   public static final evt.a a = $$0 -> {
   };
   public static final evt.a b = evt::a;
   public static final evt.a c = evt::b;

   public evt(arn $$0, fcu $$1, fcu $$2, float $$3, float $$4, evt.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public evt(arn $$0, fcu $$1, fcu $$2, float $$3, float $$4, Set<bxf> $$5, evt.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public evt(arn $$0, bvs $$1, evt.a $$2) {
      this($$0, a($$0, $$1), fcu.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bvs $$0) {
      if ($$0 instanceof aro $$1) {
         $$1.f.b(new ade(1032, jj.c, 0, false));
      }
   }

   private static void b(bvs $$0) {
      $$0.g(jj.a((kc)$$0.dt()));
   }

   public static evt a(arn $$0, bvs $$1, evt.a $$2) {
      return new evt($$0, a($$0, $$1), fcu.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static fcu a(arn $$0, bvs $$1) {
      return $$1.a($$0, $$0.aa()).c();
   }

   public evt a(float $$0, float $$1) {
      return new evt(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public evt a(fcu $$0) {
      return new evt(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public evt a() {
      return new evt(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public arn b() {
      return this.d;
   }

   public fcu c() {
      return this.e;
   }

   public fcu d() {
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

   public Set<bxf> i() {
      return this.k;
   }

   public evt.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bvs var1);

      default evt.a then(evt.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
