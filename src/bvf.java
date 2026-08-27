public interface bvf {
   bvf a = a("zombie_villager_cured");
   bvf b = a("golem_killed");
   bvf c = a("villager_hurt");
   bvf d = a("villager_killed");
   bvf e = a("trade");

   static bvf a(final String $$0) {
      return new bvf() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
