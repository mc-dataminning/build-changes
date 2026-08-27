public class cex {
   public static final cex a = a("core");
   public static final cex b = a("idle");
   public static final cex c = a("work");
   public static final cex d = a("play");
   public static final cex e = a("rest");
   public static final cex f = a("meet");
   public static final cex g = a("panic");
   public static final cex h = a("raid");
   public static final cex i = a("pre_raid");
   public static final cex j = a("hide");
   public static final cex k = a("fight");
   public static final cex l = a("celebrate");
   public static final cex m = a("admire_item");
   public static final cex n = a("avoid");
   public static final cex o = a("ride");
   public static final cex p = a("play_dead");
   public static final cex q = a("long_jump");
   public static final cex r = a("ram");
   public static final cex s = a("tongue");
   public static final cex t = a("swim");
   public static final cex u = a("lay_spawn");
   public static final cex v = a("sniff");
   public static final cex w = a("investigate");
   public static final cex x = a("roar");
   public static final cex y = a("emerge");
   public static final cex z = a("dig");
   private final String A;
   private final int B;

   private cex(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cex a(String $$0) {
      return io.a(jy.F, $$0, new cex($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cex $$1 = (cex)$$0;
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
