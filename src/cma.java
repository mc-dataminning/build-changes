public class cma {
   public static final cma a = a("core");
   public static final cma b = a("idle");
   public static final cma c = a("work");
   public static final cma d = a("play");
   public static final cma e = a("rest");
   public static final cma f = a("meet");
   public static final cma g = a("panic");
   public static final cma h = a("raid");
   public static final cma i = a("pre_raid");
   public static final cma j = a("hide");
   public static final cma k = a("fight");
   public static final cma l = a("celebrate");
   public static final cma m = a("admire_item");
   public static final cma n = a("avoid");
   public static final cma o = a("ride");
   public static final cma p = a("play_dead");
   public static final cma q = a("long_jump");
   public static final cma r = a("ram");
   public static final cma s = a("tongue");
   public static final cma t = a("swim");
   public static final cma u = a("lay_spawn");
   public static final cma v = a("sniff");
   public static final cma w = a("investigate");
   public static final cma x = a("roar");
   public static final cma y = a("emerge");
   public static final cma z = a("dig");
   private final String A;
   private final int B;

   private cma(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cma a(String $$0) {
      return ji.a(lc.E, $$0, new cma($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cma $$1 = (cma)$$0;
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
