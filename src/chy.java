public interface chy {
   chy a = a("zombie_villager_cured");
   chy b = a("golem_killed");
   chy c = a("villager_hurt");
   chy d = a("villager_killed");
   chy e = a("trade");

   static chy a(final String $$0) {
      return new chy() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
