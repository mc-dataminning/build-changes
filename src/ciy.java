public class ciy {
   public static final ciy a = a("core");
   public static final ciy b = a("idle");
   public static final ciy c = a("work");
   public static final ciy d = a("play");
   public static final ciy e = a("rest");
   public static final ciy f = a("meet");
   public static final ciy g = a("panic");
   public static final ciy h = a("raid");
   public static final ciy i = a("pre_raid");
   public static final ciy j = a("hide");
   public static final ciy k = a("fight");
   public static final ciy l = a("celebrate");
   public static final ciy m = a("admire_item");
   public static final ciy n = a("avoid");
   public static final ciy o = a("ride");
   public static final ciy p = a("play_dead");
   public static final ciy q = a("long_jump");
   public static final ciy r = a("ram");
   public static final ciy s = a("tongue");
   public static final ciy t = a("swim");
   public static final ciy u = a("lay_spawn");
   public static final ciy v = a("sniff");
   public static final ciy w = a("investigate");
   public static final ciy x = a("roar");
   public static final ciy y = a("emerge");
   public static final ciy z = a("dig");
   private final String A;
   private final int B;

   private ciy(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static ciy a(String $$0) {
      return iv.a(kf.E, $$0, new ciy($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ciy $$1 = (ciy)$$0;
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
