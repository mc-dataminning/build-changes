public interface chq {
   chq a = a("zombie_villager_cured");
   chq b = a("golem_killed");
   chq c = a("villager_hurt");
   chq d = a("villager_killed");
   chq e = a("trade");

   static chq a(final String $$0) {
      return new chq() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
