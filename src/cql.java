public class cql {
   public static final cql a = a("core");
   public static final cql b = a("idle");
   public static final cql c = a("work");
   public static final cql d = a("play");
   public static final cql e = a("rest");
   public static final cql f = a("meet");
   public static final cql g = a("panic");
   public static final cql h = a("raid");
   public static final cql i = a("pre_raid");
   public static final cql j = a("hide");
   public static final cql k = a("fight");
   public static final cql l = a("celebrate");
   public static final cql m = a("admire_item");
   public static final cql n = a("avoid");
   public static final cql o = a("ride");
   public static final cql p = a("play_dead");
   public static final cql q = a("long_jump");
   public static final cql r = a("ram");
   public static final cql s = a("tongue");
   public static final cql t = a("swim");
   public static final cql u = a("lay_spawn");
   public static final cql v = a("sniff");
   public static final cql w = a("investigate");
   public static final cql x = a("roar");
   public static final cql y = a("emerge");
   public static final cql z = a("dig");
   private final String A;
   private final int B;

   private cql(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cql a(String $$0) {
      return kd.a(lz.C, $$0, new cql($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cql $$1 = (cql)$$0;
         return this.A.equals($$1.A);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.B;
   }

   @Override
   public String toString() {
      return this.a();
   }
}
