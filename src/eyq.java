import java.util.Set;

public record eyq(aru d, ffs e, ffs f, float g, float h, boolean i, boolean j, Set<byk> k, eyq.a l) {
   public static final eyq.a a = $$0 -> {
   };
   public static final eyq.a b = eyq::a;
   public static final eyq.a c = eyq::b;

   public eyq(aru $$0, ffs $$1, ffs $$2, float $$3, float $$4, eyq.a $$5) {
      this($$0, $$1, $$2, $$3, $$4, Set.of(), $$5);
   }

   public eyq(aru $$0, ffs $$1, ffs $$2, float $$3, float $$4, Set<byk> $$5, eyq.a $$6) {
      this($$0, $$1, $$2, $$3, $$4, false, false, $$5, $$6);
   }

   public eyq(aru $$0, bwv $$1, eyq.a $$2) {
      this($$0, a($$0, $$1), ffs.c, 0.0F, 0.0F, false, false, Set.of(), $$2);
   }

   private static void a(bwv $$0) {
      if ($$0 instanceof arv $$1) {
         $$1.f.b(new adl(1032, iw.c, 0, false));
      }
   }

   private static void b(bwv $$0) {
      $$0.f(iw.a((jq)$$0.dt()));
   }

   public static eyq a(aru $$0, bwv $$1, eyq.a $$2) {
      return new eyq($$0, a($$0, $$1), ffs.c, 0.0F, 0.0F, true, false, Set.of(), $$2);
   }

   private static ffs a(aru $$0, bwv $$1) {
      return $$1.a($$0, $$0.aa()).c();
   }

   public eyq a(float $$0, float $$1) {
      return new eyq(this.b(), this.c(), this.d(), $$0, $$1, this.g(), this.h(), this.i(), this.j());
   }

   public eyq a(ffs $$0) {
      return new eyq(this.b(), $$0, this.d(), this.e(), this.f(), this.g(), this.h(), this.i(), this.j());
   }

   public eyq a() {
      return new eyq(this.b(), this.c(), this.d(), this.e(), this.f(), this.g(), true, this.i(), this.j());
   }

   public aru b() {
      return this.d;
   }

   public ffs c() {
      return this.e;
   }

   public ffs d() {
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

   public Set<byk> i() {
      return this.k;
   }

   public eyq.a j() {
      return this.l;
   }

   @FunctionalInterface
   public interface a {
      void onTransition(bwv var1);

      default eyq.a then(eyq.a $$0) {
         return $$1 -> {
            this.onTransition($$1);
            $$0.onTransition($$1);
         };
      }
   }
}
