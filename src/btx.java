public interface btx {
   btx a = a("zombie_villager_cured");
   btx b = a("golem_killed");
   btx c = a("villager_hurt");
   btx d = a("villager_killed");
   btx e = a("trade");

   static btx a(final String $$0) {
      return new btx() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
