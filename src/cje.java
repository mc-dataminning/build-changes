public interface cje {
   cje a = a("zombie_villager_cured");
   cje b = a("golem_killed");
   cje c = a("villager_hurt");
   cje d = a("villager_killed");
   cje e = a("trade");

   static cje a(final String $$0) {
      return new cje() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
