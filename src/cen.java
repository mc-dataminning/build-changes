public interface cen {
   cen a = a("zombie_villager_cured");
   cen b = a("golem_killed");
   cen c = a("villager_hurt");
   cen d = a("villager_killed");
   cen e = a("trade");

   static cen a(final String $$0) {
      return new cen() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
