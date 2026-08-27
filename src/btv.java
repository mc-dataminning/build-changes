public interface btv {
   btv a = a("zombie_villager_cured");
   btv b = a("golem_killed");
   btv c = a("villager_hurt");
   btv d = a("villager_killed");
   btv e = a("trade");

   static btv a(final String $$0) {
      return new btv() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
