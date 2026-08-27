public interface bze {
   bze a = a("zombie_villager_cured");
   bze b = a("golem_killed");
   bze c = a("villager_hurt");
   bze d = a("villager_killed");
   bze e = a("trade");

   static bze a(final String $$0) {
      return new bze() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
