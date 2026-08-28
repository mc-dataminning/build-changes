public interface ces {
   ces a = a("zombie_villager_cured");
   ces b = a("golem_killed");
   ces c = a("villager_hurt");
   ces d = a("villager_killed");
   ces e = a("trade");

   static ces a(final String $$0) {
      return new ces() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
