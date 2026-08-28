public interface cgb {
   cgb a = a("zombie_villager_cured");
   cgb b = a("golem_killed");
   cgb c = a("villager_hurt");
   cgb d = a("villager_killed");
   cgb e = a("trade");

   static cgb a(final String $$0) {
      return new cgb() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
