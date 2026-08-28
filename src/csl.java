public class csl {
   public static final csl a = a("core");
   public static final csl b = a("idle");
   public static final csl c = a("work");
   public static final csl d = a("play");
   public static final csl e = a("rest");
   public static final csl f = a("meet");
   public static final csl g = a("panic");
   public static final csl h = a("raid");
   public static final csl i = a("pre_raid");
   public static final csl j = a("hide");
   public static final csl k = a("fight");
   public static final csl l = a("celebrate");
   public static final csl m = a("admire_item");
   public static final csl n = a("avoid");
   public static final csl o = a("ride");
   public static final csl p = a("play_dead");
   public static final csl q = a("long_jump");
   public static final csl r = a("ram");
   public static final csl s = a("tongue");
   public static final csl t = a("swim");
   public static final csl u = a("lay_spawn");
   public static final csl v = a("sniff");
   public static final csl w = a("investigate");
   public static final csl x = a("roar");
   public static final csl y = a("emerge");
   public static final csl z = a("dig");
   private final String A;
   private final int B;

   private csl(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static csl a(String $$0) {
      return jr.a(mf.C, $$0, new csl($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         csl $$1 = (csl)$$0;
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
