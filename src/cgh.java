public interface cgh {
   cgh a = a("zombie_villager_cured");
   cgh b = a("golem_killed");
   cgh c = a("villager_hurt");
   cgh d = a("villager_killed");
   cgh e = a("trade");

   static cgh a(final String $$0) {
      return new cgh() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
