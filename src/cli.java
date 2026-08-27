public class cli {
   public static final cli a = a("core");
   public static final cli b = a("idle");
   public static final cli c = a("work");
   public static final cli d = a("play");
   public static final cli e = a("rest");
   public static final cli f = a("meet");
   public static final cli g = a("panic");
   public static final cli h = a("raid");
   public static final cli i = a("pre_raid");
   public static final cli j = a("hide");
   public static final cli k = a("fight");
   public static final cli l = a("celebrate");
   public static final cli m = a("admire_item");
   public static final cli n = a("avoid");
   public static final cli o = a("ride");
   public static final cli p = a("play_dead");
   public static final cli q = a("long_jump");
   public static final cli r = a("ram");
   public static final cli s = a("tongue");
   public static final cli t = a("swim");
   public static final cli u = a("lay_spawn");
   public static final cli v = a("sniff");
   public static final cli w = a("investigate");
   public static final cli x = a("roar");
   public static final cli y = a("emerge");
   public static final cli z = a("dig");
   private final String A;
   private final int B;

   private cli(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cli a(String $$0) {
      return iy.a(kr.E, $$0, new cli($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cli $$1 = (cli)$$0;
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
