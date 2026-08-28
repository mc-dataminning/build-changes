public interface chc {
   chc a = a("zombie_villager_cured");
   chc b = a("golem_killed");
   chc c = a("villager_hurt");
   chc d = a("villager_killed");
   chc e = a("trade");

   static chc a(final String $$0) {
      return new chc() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
