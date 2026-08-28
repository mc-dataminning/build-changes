import java.util.UUID;

public record aas(aas.a c) implements aat {
   public static final zj<wl, aas> a = aat.a(aas::a, aas::new);
   public static final aat.b<aas> b = aat.a("debug/breeze");

   private aas(wl $$0) {
      this(new aas.a($$0));
   }

   private void a(wl $$0) {
      this.c.a($$0);
   }

   @Override
   public aat.b<aas> a() {
      return b;
   }

   public aas.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, iz d) {
      public a(wl $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(wl::readInt), $$0.c(iz.b));
      }

      public void a(wl $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, wl::p);
         $$0.a(this.d, iz.b);
      }

      public String a() {
         return ago.a(this.a);
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

      public iz e() {
         return this.d;
      }
   }
}
