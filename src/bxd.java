public interface bxd {
   bxd a = a("zombie_villager_cured");
   bxd b = a("golem_killed");
   bxd c = a("villager_hurt");
   bxd d = a("villager_killed");
   bxd e = a("trade");

   static bxd a(final String $$0) {
      return new bxd() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
