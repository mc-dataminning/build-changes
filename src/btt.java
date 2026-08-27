public interface btt {
   btt a = a("zombie_villager_cured");
   btt b = a("golem_killed");
   btt c = a("villager_hurt");
   btt d = a("villager_killed");
   btt e = a("trade");

   static btt a(final String $$0) {
      return new btt() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
