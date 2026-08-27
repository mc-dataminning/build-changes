public interface bzx {
   bzx a = a("zombie_villager_cured");
   bzx b = a("golem_killed");
   bzx c = a("villager_hurt");
   bzx d = a("villager_killed");
   bzx e = a("trade");

   static bzx a(final String $$0) {
      return new bzx() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
