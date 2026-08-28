public class cqi {
   public static final cqi a = a("core");
   public static final cqi b = a("idle");
   public static final cqi c = a("work");
   public static final cqi d = a("play");
   public static final cqi e = a("rest");
   public static final cqi f = a("meet");
   public static final cqi g = a("panic");
   public static final cqi h = a("raid");
   public static final cqi i = a("pre_raid");
   public static final cqi j = a("hide");
   public static final cqi k = a("fight");
   public static final cqi l = a("celebrate");
   public static final cqi m = a("admire_item");
   public static final cqi n = a("avoid");
   public static final cqi o = a("ride");
   public static final cqi p = a("play_dead");
   public static final cqi q = a("long_jump");
   public static final cqi r = a("ram");
   public static final cqi s = a("tongue");
   public static final cqi t = a("swim");
   public static final cqi u = a("lay_spawn");
   public static final cqi v = a("sniff");
   public static final cqi w = a("investigate");
   public static final cqi x = a("roar");
   public static final cqi y = a("emerge");
   public static final cqi z = a("dig");
   private final String A;
   private final int B;

   private cqi(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cqi a(String $$0) {
      return kd.a(lz.C, $$0, new cqi($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cqi $$1 = (cqi)$$0;
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
