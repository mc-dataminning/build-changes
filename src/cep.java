public interface cep {
   cep a = a("zombie_villager_cured");
   cep b = a("golem_killed");
   cep c = a("villager_hurt");
   cep d = a("villager_killed");
   cep e = a("trade");

   static cep a(final String $$0) {
      return new cep() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
