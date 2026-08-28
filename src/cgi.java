public interface cgi {
   cgi a = a("zombie_villager_cured");
   cgi b = a("golem_killed");
   cgi c = a("villager_hurt");
   cgi d = a("villager_killed");
   cgi e = a("trade");

   static cgi a(final String $$0) {
      return new cgi() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
