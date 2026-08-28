public interface cit {
   cit a = a("zombie_villager_cured");
   cit b = a("golem_killed");
   cit c = a("villager_hurt");
   cit d = a("villager_killed");
   cit e = a("trade");

   static cit a(final String $$0) {
      return new cit() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
