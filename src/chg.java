public interface chg {
   chg a = a("zombie_villager_cured");
   chg b = a("golem_killed");
   chg c = a("villager_hurt");
   chg d = a("villager_killed");
   chg e = a("trade");

   static chg a(final String $$0) {
      return new chg() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
