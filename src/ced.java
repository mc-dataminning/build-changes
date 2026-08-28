public interface ced {
   ced a = a("zombie_villager_cured");
   ced b = a("golem_killed");
   ced c = a("villager_hurt");
   ced d = a("villager_killed");
   ced e = a("trade");

   static ced a(final String $$0) {
      return new ced() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
