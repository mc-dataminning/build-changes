import java.util.List;

public record abi(ali<dfm> c, ema d, List<abi.a> e) implements aat {
   public static final zh<wg, abi> a = aat.a(abi::a, abi::new);
   public static final aat.b<abi> b = aat.a("debug/structures");

   private abi(wg $$0) {
      this($$0.a(ma.bb), b($$0), $$0.a(abi.a::new));
   }

   private void a(wg $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aat.b<abi> a() {
      return b;
   }

   static ema b(wg $$0) {
      return new ema($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(wg $$0, ema $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public ali<dfm> b() {
      return this.c;
   }

   public ema c() {
      return this.d;
   }

   public List<abi.a> d() {
      return this.e;
   }

   public static record a(ema a, boolean b) {
      public a(wg $$0) {
         this(abi.b($$0), $$0.readBoolean());
      }

      public void a(wg $$0) {
         abi.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
