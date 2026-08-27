public interface bvu {
   bvu a = a("zombie_villager_cured");
   bvu b = a("golem_killed");
   bvu c = a("villager_hurt");
   bvu d = a("villager_killed");
   bvu e = a("trade");

   static bvu a(final String $$0) {
      return new bvu() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
