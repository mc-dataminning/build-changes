public interface cbo {
   cbo a = a("zombie_villager_cured");
   cbo b = a("golem_killed");
   cbo c = a("villager_hurt");
   cbo d = a("villager_killed");
   cbo e = a("trade");

   static cbo a(final String $$0) {
      return new cbo() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
