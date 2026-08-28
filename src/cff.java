public interface cff {
   cff a = a("zombie_villager_cured");
   cff b = a("golem_killed");
   cff c = a("villager_hurt");
   cff d = a("villager_killed");
   cff e = a("trade");

   static cff a(final String $$0) {
      return new cff() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
