public interface cel {
   cel a = a("zombie_villager_cured");
   cel b = a("golem_killed");
   cel c = a("villager_hurt");
   cel d = a("villager_killed");
   cel e = a("trade");

   static cel a(final String $$0) {
      return new cel() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
