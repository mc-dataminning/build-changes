public interface cdz {
   cdz a = a("zombie_villager_cured");
   cdz b = a("golem_killed");
   cdz c = a("villager_hurt");
   cdz d = a("villager_killed");
   cdz e = a("trade");

   static cdz a(final String $$0) {
      return new cdz() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
