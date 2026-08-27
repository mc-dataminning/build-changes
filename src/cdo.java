public interface cdo {
   cdo a = a("zombie_villager_cured");
   cdo b = a("golem_killed");
   cdo c = a("villager_hurt");
   cdo d = a("villager_killed");
   cdo e = a("trade");

   static cdo a(final String $$0) {
      return new cdo() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
