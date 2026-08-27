public interface bxn {
   bxn a = a("zombie_villager_cured");
   bxn b = a("golem_killed");
   bxn c = a("villager_hurt");
   bxn d = a("villager_killed");
   bxn e = a("trade");

   static bxn a(final String $$0) {
      return new bxn() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
