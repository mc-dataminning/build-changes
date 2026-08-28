public interface cfw {
   cfw a = a("zombie_villager_cured");
   cfw b = a("golem_killed");
   cfw c = a("villager_hurt");
   cfw d = a("villager_killed");
   cfw e = a("trade");

   static cfw a(final String $$0) {
      return new cfw() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
