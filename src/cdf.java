public class cdf {
   public static final cdf a = a("core");
   public static final cdf b = a("idle");
   public static final cdf c = a("work");
   public static final cdf d = a("play");
   public static final cdf e = a("rest");
   public static final cdf f = a("meet");
   public static final cdf g = a("panic");
   public static final cdf h = a("raid");
   public static final cdf i = a("pre_raid");
   public static final cdf j = a("hide");
   public static final cdf k = a("fight");
   public static final cdf l = a("celebrate");
   public static final cdf m = a("admire_item");
   public static final cdf n = a("avoid");
   public static final cdf o = a("ride");
   public static final cdf p = a("play_dead");
   public static final cdf q = a("long_jump");
   public static final cdf r = a("ram");
   public static final cdf s = a("tongue");
   public static final cdf t = a("swim");
   public static final cdf u = a("lay_spawn");
   public static final cdf v = a("sniff");
   public static final cdf w = a("investigate");
   public static final cdf x = a("roar");
   public static final cdf y = a("emerge");
   public static final cdf z = a("dig");
   private final String A;
   private final int B;

   private cdf(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cdf a(String $$0) {
      return ht.a(jd.F, $$0, new cdf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cdf $$1 = (cdf)$$0;
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
