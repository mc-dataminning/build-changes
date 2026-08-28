public interface cer {
   cer a = a("zombie_villager_cured");
   cer b = a("golem_killed");
   cer c = a("villager_hurt");
   cer d = a("villager_killed");
   cer e = a("trade");

   static cer a(final String $$0) {
      return new cer() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
