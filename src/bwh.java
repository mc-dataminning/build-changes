public interface bwh {
   bwh a = a("zombie_villager_cured");
   bwh b = a("golem_killed");
   bwh c = a("villager_hurt");
   bwh d = a("villager_killed");
   bwh e = a("trade");

   static bwh a(final String $$0) {
      return new bwh() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
