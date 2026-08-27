public interface cdr {
   cdr a = a("zombie_villager_cured");
   cdr b = a("golem_killed");
   cdr c = a("villager_hurt");
   cdr d = a("villager_killed");
   cdr e = a("trade");

   static cdr a(final String $$0) {
      return new cdr() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
