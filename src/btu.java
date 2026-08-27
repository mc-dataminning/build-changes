public interface btu {
   btu a = a("zombie_villager_cured");
   btu b = a("golem_killed");
   btu c = a("villager_hurt");
   btu d = a("villager_killed");
   btu e = a("trade");

   static btu a(final String $$0) {
      return new btu() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
