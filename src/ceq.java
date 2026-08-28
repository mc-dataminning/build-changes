public interface ceq {
   ceq a = a("zombie_villager_cured");
   ceq b = a("golem_killed");
   ceq c = a("villager_hurt");
   ceq d = a("villager_killed");
   ceq e = a("trade");

   static ceq a(final String $$0) {
      return new ceq() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
