public interface cgf {
   cgf a = a("zombie_villager_cured");
   cgf b = a("golem_killed");
   cgf c = a("villager_hurt");
   cgf d = a("villager_killed");
   cgf e = a("trade");

   static cgf a(final String $$0) {
      return new cgf() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
