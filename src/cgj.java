public interface cgj {
   cgj a = a("zombie_villager_cured");
   cgj b = a("golem_killed");
   cgj c = a("villager_hurt");
   cgj d = a("villager_killed");
   cgj e = a("trade");

   static cgj a(final String $$0) {
      return new cgj() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
