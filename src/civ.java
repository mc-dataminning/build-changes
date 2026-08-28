public interface civ {
   civ a = a("zombie_villager_cured");
   civ b = a("golem_killed");
   civ c = a("villager_hurt");
   civ d = a("villager_killed");
   civ e = a("trade");

   static civ a(final String $$0) {
      return new civ() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
