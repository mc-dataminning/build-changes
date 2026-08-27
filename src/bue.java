public interface bue {
   bue a = a("zombie_villager_cured");
   bue b = a("golem_killed");
   bue c = a("villager_hurt");
   bue d = a("villager_killed");
   bue e = a("trade");

   static bue a(final String $$0) {
      return new bue() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
