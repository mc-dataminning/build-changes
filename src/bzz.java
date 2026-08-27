public class bzz {
   public static final bzz a = a("core");
   public static final bzz b = a("idle");
   public static final bzz c = a("work");
   public static final bzz d = a("play");
   public static final bzz e = a("rest");
   public static final bzz f = a("meet");
   public static final bzz g = a("panic");
   public static final bzz h = a("raid");
   public static final bzz i = a("pre_raid");
   public static final bzz j = a("hide");
   public static final bzz k = a("fight");
   public static final bzz l = a("celebrate");
   public static final bzz m = a("admire_item");
   public static final bzz n = a("avoid");
   public static final bzz o = a("ride");
   public static final bzz p = a("play_dead");
   public static final bzz q = a("long_jump");
   public static final bzz r = a("ram");
   public static final bzz s = a("tongue");
   public static final bzz t = a("swim");
   public static final bzz u = a("lay_spawn");
   public static final bzz v = a("sniff");
   public static final bzz w = a("investigate");
   public static final bzz x = a("roar");
   public static final bzz y = a("emerge");
   public static final bzz z = a("dig");
   private final String A;
   private final int B;

   private bzz(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static bzz a(String $$0) {
      return hr.a(jb.F, $$0, new bzz($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         bzz $$1 = (bzz)$$0;
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
