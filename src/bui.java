public interface bui {
   bui a = a("zombie_villager_cured");
   bui b = a("golem_killed");
   bui c = a("villager_hurt");
   bui d = a("villager_killed");
   bui e = a("trade");

   static bui a(final String $$0) {
      return new bui() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
