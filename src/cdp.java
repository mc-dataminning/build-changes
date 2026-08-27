public interface cdp {
   cdp a = a("zombie_villager_cured");
   cdp b = a("golem_killed");
   cdp c = a("villager_hurt");
   cdp d = a("villager_killed");
   cdp e = a("trade");

   static cdp a(final String $$0) {
      return new cdp() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
