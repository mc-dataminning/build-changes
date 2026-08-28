import java.util.UUID;

public record aas(aas.a c) implements aat {
   public static final zh<wg, aas> a = aat.a(aas::a, aas::new);
   public static final aat.b<aas> b = aat.a("debug/breeze");

   private aas(wg $$0) {
      this(new aas.a($$0));
   }

   private void a(wg $$0) {
      this.c.a($$0);
   }

   @Override
   public aat.b<aas> a() {
      return b;
   }

   public aas.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, jh d) {
      public a(wg $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(wg::readInt), $$0.c(jh.b));
      }

      public void a(wg $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c, wg::q);
         $$0.a(this.d, jh.b);
      }

      public String a() {
         return ags.a(this.a);
      }

      @Override
      public String toString() {
         return this.a();
      }

      public UUID b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public Integer d() {
         return this.c;
      }

      public jh e() {
         return this.d;
      }
   }
}
