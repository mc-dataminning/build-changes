public interface bwc {
   bwc a = a("zombie_villager_cured");
   bwc b = a("golem_killed");
   bwc c = a("villager_hurt");
   bwc d = a("villager_killed");
   bwc e = a("trade");

   static bwc a(final String $$0) {
      return new bwc() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
