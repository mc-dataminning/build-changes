public interface cec {
   cec a = a("zombie_villager_cured");
   cec b = a("golem_killed");
   cec c = a("villager_hurt");
   cec d = a("villager_killed");
   cec e = a("trade");

   static cec a(final String $$0) {
      return new cec() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
