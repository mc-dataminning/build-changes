public interface cgz {
   cgz a = a("zombie_villager_cured");
   cgz b = a("golem_killed");
   cgz c = a("villager_hurt");
   cgz d = a("villager_killed");
   cgz e = a("trade");

   static cgz a(final String $$0) {
      return new cgz() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
