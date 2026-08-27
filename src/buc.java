public interface buc {
   buc a = a("zombie_villager_cured");
   buc b = a("golem_killed");
   buc c = a("villager_hurt");
   buc d = a("villager_killed");
   buc e = a("trade");

   static buc a(final String $$0) {
      return new buc() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
