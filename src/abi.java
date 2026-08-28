import java.util.List;

public record abi(alq<dkj> c, esf d, List<abi.a> e) implements aat {
   public static final ze<vy, abi> a = aat.a(abi::a, abi::new);
   public static final aat.b<abi> b = aat.a("debug/structures");

   private abi(vy $$0) {
      this($$0.a(mi.bp), b($$0), $$0.a(abi.a::new));
   }

   private void a(vy $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aat.b<abi> a() {
      return b;
   }

   static esf b(vy $$0) {
      return new esf($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(vy $$0, esf $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public alq<dkj> b() {
      return this.c;
   }

   public esf c() {
      return this.d;
   }

   public List<abi.a> d() {
      return this.e;
   }

   public static record a(esf a, boolean b) {
      public a(vy $$0) {
         this(abi.b($$0), $$0.readBoolean());
      }

      public void a(vy $$0) {
         abi.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
