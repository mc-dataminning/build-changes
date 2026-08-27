public interface bwt {
   bwt a = a("zombie_villager_cured");
   bwt b = a("golem_killed");
   bwt c = a("villager_hurt");
   bwt d = a("villager_killed");
   bwt e = a("trade");

   static bwt a(final String $$0) {
      return new bwt() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
