public class cqp {
   public static final cqp a = a("core");
   public static final cqp b = a("idle");
   public static final cqp c = a("work");
   public static final cqp d = a("play");
   public static final cqp e = a("rest");
   public static final cqp f = a("meet");
   public static final cqp g = a("panic");
   public static final cqp h = a("raid");
   public static final cqp i = a("pre_raid");
   public static final cqp j = a("hide");
   public static final cqp k = a("fight");
   public static final cqp l = a("celebrate");
   public static final cqp m = a("admire_item");
   public static final cqp n = a("avoid");
   public static final cqp o = a("ride");
   public static final cqp p = a("play_dead");
   public static final cqp q = a("long_jump");
   public static final cqp r = a("ram");
   public static final cqp s = a("tongue");
   public static final cqp t = a("swim");
   public static final cqp u = a("lay_spawn");
   public static final cqp v = a("sniff");
   public static final cqp w = a("investigate");
   public static final cqp x = a("roar");
   public static final cqp y = a("emerge");
   public static final cqp z = a("dig");
   private final String A;
   private final int B;

   private cqp(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cqp a(String $$0) {
      return ke.a(mb.C, $$0, new cqp($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cqp $$1 = (cqp)$$0;
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
