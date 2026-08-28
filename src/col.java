public class col {
   public static final col a = a("core");
   public static final col b = a("idle");
   public static final col c = a("work");
   public static final col d = a("play");
   public static final col e = a("rest");
   public static final col f = a("meet");
   public static final col g = a("panic");
   public static final col h = a("raid");
   public static final col i = a("pre_raid");
   public static final col j = a("hide");
   public static final col k = a("fight");
   public static final col l = a("celebrate");
   public static final col m = a("admire_item");
   public static final col n = a("avoid");
   public static final col o = a("ride");
   public static final col p = a("play_dead");
   public static final col q = a("long_jump");
   public static final col r = a("ram");
   public static final col s = a("tongue");
   public static final col t = a("swim");
   public static final col u = a("lay_spawn");
   public static final col v = a("sniff");
   public static final col w = a("investigate");
   public static final col x = a("roar");
   public static final col y = a("emerge");
   public static final col z = a("dig");
   private final String A;
   private final int B;

   private col(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static col a(String $$0) {
      return jv.a(lp.E, $$0, new col($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         col $$1 = (col)$$0;
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
