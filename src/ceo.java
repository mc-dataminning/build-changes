public interface ceo {
   ceo a = a("zombie_villager_cured");
   ceo b = a("golem_killed");
   ceo c = a("villager_hurt");
   ceo d = a("villager_killed");
   ceo e = a("trade");

   static ceo a(final String $$0) {
      return new ceo() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
