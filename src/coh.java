public class coh {
   public static final coh a = a("core");
   public static final coh b = a("idle");
   public static final coh c = a("work");
   public static final coh d = a("play");
   public static final coh e = a("rest");
   public static final coh f = a("meet");
   public static final coh g = a("panic");
   public static final coh h = a("raid");
   public static final coh i = a("pre_raid");
   public static final coh j = a("hide");
   public static final coh k = a("fight");
   public static final coh l = a("celebrate");
   public static final coh m = a("admire_item");
   public static final coh n = a("avoid");
   public static final coh o = a("ride");
   public static final coh p = a("play_dead");
   public static final coh q = a("long_jump");
   public static final coh r = a("ram");
   public static final coh s = a("tongue");
   public static final coh t = a("swim");
   public static final coh u = a("lay_spawn");
   public static final coh v = a("sniff");
   public static final coh w = a("investigate");
   public static final coh x = a("roar");
   public static final coh y = a("emerge");
   public static final coh z = a("dig");
   private final String A;
   private final int B;

   private coh(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static coh a(String $$0) {
      return jv.a(lp.E, $$0, new coh($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         coh $$1 = (coh)$$0;
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
