public interface cgg {
   cgg a = a("zombie_villager_cured");
   cgg b = a("golem_killed");
   cgg c = a("villager_hurt");
   cgg d = a("villager_killed");
   cgg e = a("trade");

   static cgg a(final String $$0) {
      return new cgg() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
