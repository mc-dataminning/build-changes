public interface cid {
   cid a = a("zombie_villager_cured");
   cid b = a("golem_killed");
   cid c = a("villager_hurt");
   cid d = a("villager_killed");
   cid e = a("trade");

   static cid a(final String $$0) {
      return new cid() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
