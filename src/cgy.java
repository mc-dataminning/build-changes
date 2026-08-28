public interface cgy {
   cgy a = a("zombie_villager_cured");
   cgy b = a("golem_killed");
   cgy c = a("villager_hurt");
   cgy d = a("villager_killed");
   cgy e = a("trade");

   static cgy a(final String $$0) {
      return new cgy() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
