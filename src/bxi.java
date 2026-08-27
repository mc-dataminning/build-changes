public interface bxi {
   bxi a = a("zombie_villager_cured");
   bxi b = a("golem_killed");
   bxi c = a("villager_hurt");
   bxi d = a("villager_killed");
   bxi e = a("trade");

   static bxi a(final String $$0) {
      return new bxi() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
