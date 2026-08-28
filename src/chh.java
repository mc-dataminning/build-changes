public interface chh {
   chh a = a("zombie_villager_cured");
   chh b = a("golem_killed");
   chh c = a("villager_hurt");
   chh d = a("villager_killed");
   chh e = a("trade");

   static chh a(final String $$0) {
      return new chh() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
