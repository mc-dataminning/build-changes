public class cff {
   public static final cff a = a("core");
   public static final cff b = a("idle");
   public static final cff c = a("work");
   public static final cff d = a("play");
   public static final cff e = a("rest");
   public static final cff f = a("meet");
   public static final cff g = a("panic");
   public static final cff h = a("raid");
   public static final cff i = a("pre_raid");
   public static final cff j = a("hide");
   public static final cff k = a("fight");
   public static final cff l = a("celebrate");
   public static final cff m = a("admire_item");
   public static final cff n = a("avoid");
   public static final cff o = a("ride");
   public static final cff p = a("play_dead");
   public static final cff q = a("long_jump");
   public static final cff r = a("ram");
   public static final cff s = a("tongue");
   public static final cff t = a("swim");
   public static final cff u = a("lay_spawn");
   public static final cff v = a("sniff");
   public static final cff w = a("investigate");
   public static final cff x = a("roar");
   public static final cff y = a("emerge");
   public static final cff z = a("dig");
   private final String A;
   private final int B;

   private cff(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cff a(String $$0) {
      return io.a(jy.F, $$0, new cff($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cff $$1 = (cff)$$0;
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
