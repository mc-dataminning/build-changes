public class cgd {
   public static final cgd a = a("core");
   public static final cgd b = a("idle");
   public static final cgd c = a("work");
   public static final cgd d = a("play");
   public static final cgd e = a("rest");
   public static final cgd f = a("meet");
   public static final cgd g = a("panic");
   public static final cgd h = a("raid");
   public static final cgd i = a("pre_raid");
   public static final cgd j = a("hide");
   public static final cgd k = a("fight");
   public static final cgd l = a("celebrate");
   public static final cgd m = a("admire_item");
   public static final cgd n = a("avoid");
   public static final cgd o = a("ride");
   public static final cgd p = a("play_dead");
   public static final cgd q = a("long_jump");
   public static final cgd r = a("ram");
   public static final cgd s = a("tongue");
   public static final cgd t = a("swim");
   public static final cgd u = a("lay_spawn");
   public static final cgd v = a("sniff");
   public static final cgd w = a("investigate");
   public static final cgd x = a("roar");
   public static final cgd y = a("emerge");
   public static final cgd z = a("dig");
   private final String A;
   private final int B;

   private cgd(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cgd a(String $$0) {
      return ir.a(kb.E, $$0, new cgd($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cgd $$1 = (cgd)$$0;
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
