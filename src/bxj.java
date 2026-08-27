public interface bxj {
   bxj a = a("zombie_villager_cured");
   bxj b = a("golem_killed");
   bxj c = a("villager_hurt");
   bxj d = a("villager_killed");
   bxj e = a("trade");

   static bxj a(final String $$0) {
      return new bxj() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
