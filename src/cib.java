public interface cib {
   cib a = a("zombie_villager_cured");
   cib b = a("golem_killed");
   cib c = a("villager_hurt");
   cib d = a("villager_killed");
   cib e = a("trade");

   static cib a(final String $$0) {
      return new cib() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
