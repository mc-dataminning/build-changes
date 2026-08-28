import java.util.List;

public record abb(alj<djz> c, erv d, List<abb.a> e) implements aam {
   public static final za<vy, abb> a = aam.a(abb::a, abb::new);
   public static final aam.b<abb> b = aam.a("debug/structures");

   private abb(vy $$0) {
      this($$0.a(mi.bp), b($$0), $$0.a(abb.a::new));
   }

   private void a(vy $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aam.b<abb> a() {
      return b;
   }

   static erv b(vy $$0) {
      return new erv($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(vy $$0, erv $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public alj<djz> b() {
      return this.c;
   }

   public erv c() {
      return this.d;
   }

   public List<abb.a> d() {
      return this.e;
   }

   public static record a(erv a, boolean b) {
      public a(vy $$0) {
         this(abb.b($$0), $$0.readBoolean());
      }

      public void a(vy $$0) {
         abb.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
