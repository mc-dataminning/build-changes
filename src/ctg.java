public class ctg {
   public static final ctg a = a("core");
   public static final ctg b = a("idle");
   public static final ctg c = a("work");
   public static final ctg d = a("play");
   public static final ctg e = a("rest");
   public static final ctg f = a("meet");
   public static final ctg g = a("panic");
   public static final ctg h = a("raid");
   public static final ctg i = a("pre_raid");
   public static final ctg j = a("hide");
   public static final ctg k = a("fight");
   public static final ctg l = a("celebrate");
   public static final ctg m = a("admire_item");
   public static final ctg n = a("avoid");
   public static final ctg o = a("ride");
   public static final ctg p = a("play_dead");
   public static final ctg q = a("long_jump");
   public static final ctg r = a("ram");
   public static final ctg s = a("tongue");
   public static final ctg t = a("swim");
   public static final ctg u = a("lay_spawn");
   public static final ctg v = a("sniff");
   public static final ctg w = a("investigate");
   public static final ctg x = a("roar");
   public static final ctg y = a("emerge");
   public static final ctg z = a("dig");
   private final String A;
   private final int B;

   private ctg(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static ctg a(String $$0) {
      return js.a(mg.C, $$0, new ctg($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ctg $$1 = (ctg)$$0;
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
