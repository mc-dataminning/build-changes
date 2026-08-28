public interface cfk {
   cfk a = a("zombie_villager_cured");
   cfk b = a("golem_killed");
   cfk c = a("villager_hurt");
   cfk d = a("villager_killed");
   cfk e = a("trade");

   static cfk a(final String $$0) {
      return new cfk() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
