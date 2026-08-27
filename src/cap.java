public interface cap {
   cap a = a("zombie_villager_cured");
   cap b = a("golem_killed");
   cap c = a("villager_hurt");
   cap d = a("villager_killed");
   cap e = a("trade");

   static cap a(final String $$0) {
      return new cap() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
