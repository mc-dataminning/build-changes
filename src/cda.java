public interface cda {
   cda a = a("zombie_villager_cured");
   cda b = a("golem_killed");
   cda c = a("villager_hurt");
   cda d = a("villager_killed");
   cda e = a("trade");

   static cda a(final String $$0) {
      return new cda() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
