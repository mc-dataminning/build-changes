public record cep(akt d) {
   public static final aks<cep> a = a("temperate");
   public static final aks<cep> b = a("warm");
   public static final aks<cep> c = a("cold");

   private static aks<cep> a(String $$0) {
      return aks.a(li.B, new akt($$0));
   }

   public static cep a(jn<cep> $$0) {
      a($$0, a, "textures/entity/frog/temperate_frog.png");
      a($$0, b, "textures/entity/frog/warm_frog.png");
      return a($$0, c, "textures/entity/frog/cold_frog.png");
   }

   private static cep a(jn<cep> $$0, aks<cep> $$1, String $$2) {
      return jn.a($$0, $$1, new cep(new akt($$2)));
   }

   public akt a() {
      return this.d;
   }
}
