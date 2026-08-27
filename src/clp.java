public class clp {
   public static final clp a = a("core");
   public static final clp b = a("idle");
   public static final clp c = a("work");
   public static final clp d = a("play");
   public static final clp e = a("rest");
   public static final clp f = a("meet");
   public static final clp g = a("panic");
   public static final clp h = a("raid");
   public static final clp i = a("pre_raid");
   public static final clp j = a("hide");
   public static final clp k = a("fight");
   public static final clp l = a("celebrate");
   public static final clp m = a("admire_item");
   public static final clp n = a("avoid");
   public static final clp o = a("ride");
   public static final clp p = a("play_dead");
   public static final clp q = a("long_jump");
   public static final clp r = a("ram");
   public static final clp s = a("tongue");
   public static final clp t = a("swim");
   public static final clp u = a("lay_spawn");
   public static final clp v = a("sniff");
   public static final clp w = a("investigate");
   public static final clp x = a("roar");
   public static final clp y = a("emerge");
   public static final clp z = a("dig");
   private final String A;
   private final int B;

   private clp(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static clp a(String $$0) {
      return ja.a(kt.E, $$0, new clp($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         clp $$1 = (clp)$$0;
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
