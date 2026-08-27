public interface cao {
   cao a = a("zombie_villager_cured");
   cao b = a("golem_killed");
   cao c = a("villager_hurt");
   cao d = a("villager_killed");
   cao e = a("trade");

   static cao a(final String $$0) {
      return new cao() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
