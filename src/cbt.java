public interface cbt {
   cbt a = a("zombie_villager_cured");
   cbt b = a("golem_killed");
   cbt c = a("villager_hurt");
   cbt d = a("villager_killed");
   cbt e = a("trade");

   static cbt a(final String $$0) {
      return new cbt() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
