public class cpg {
   public static final cpg a = a("core");
   public static final cpg b = a("idle");
   public static final cpg c = a("work");
   public static final cpg d = a("play");
   public static final cpg e = a("rest");
   public static final cpg f = a("meet");
   public static final cpg g = a("panic");
   public static final cpg h = a("raid");
   public static final cpg i = a("pre_raid");
   public static final cpg j = a("hide");
   public static final cpg k = a("fight");
   public static final cpg l = a("celebrate");
   public static final cpg m = a("admire_item");
   public static final cpg n = a("avoid");
   public static final cpg o = a("ride");
   public static final cpg p = a("play_dead");
   public static final cpg q = a("long_jump");
   public static final cpg r = a("ram");
   public static final cpg s = a("tongue");
   public static final cpg t = a("swim");
   public static final cpg u = a("lay_spawn");
   public static final cpg v = a("sniff");
   public static final cpg w = a("investigate");
   public static final cpg x = a("roar");
   public static final cpg y = a("emerge");
   public static final cpg z = a("dig");
   private final String A;
   private final int B;

   private cpg(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cpg a(String $$0) {
      return ka.a(lu.C, $$0, new cpg($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cpg $$1 = (cpg)$$0;
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
