public interface bqw {
   bqw a = a("zombie_villager_cured");
   bqw b = a("golem_killed");
   bqw c = a("villager_hurt");
   bqw d = a("villager_killed");
   bqw e = a("trade");

   static bqw a(final String $$0) {
      return new bqw() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
