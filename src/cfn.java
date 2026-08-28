public interface cfn {
   cfn a = a("zombie_villager_cured");
   cfn b = a("golem_killed");
   cfn c = a("villager_hurt");
   cfn d = a("villager_killed");
   cfn e = a("trade");

   static cfn a(final String $$0) {
      return new cfn() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
