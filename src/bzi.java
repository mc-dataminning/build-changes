public interface bzi {
   bzi a = a("zombie_villager_cured");
   bzi b = a("golem_killed");
   bzi c = a("villager_hurt");
   bzi d = a("villager_killed");
   bzi e = a("trade");

   static bzi a(final String $$0) {
      return new bzi() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
