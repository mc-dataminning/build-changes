public interface cii {
   cii a = a("zombie_villager_cured");
   cii b = a("golem_killed");
   cii c = a("villager_hurt");
   cii d = a("villager_killed");
   cii e = a("trade");

   static cii a(final String $$0) {
      return new cii() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
