public class cnz {
   public static final cnz a = a("core");
   public static final cnz b = a("idle");
   public static final cnz c = a("work");
   public static final cnz d = a("play");
   public static final cnz e = a("rest");
   public static final cnz f = a("meet");
   public static final cnz g = a("panic");
   public static final cnz h = a("raid");
   public static final cnz i = a("pre_raid");
   public static final cnz j = a("hide");
   public static final cnz k = a("fight");
   public static final cnz l = a("celebrate");
   public static final cnz m = a("admire_item");
   public static final cnz n = a("avoid");
   public static final cnz o = a("ride");
   public static final cnz p = a("play_dead");
   public static final cnz q = a("long_jump");
   public static final cnz r = a("ram");
   public static final cnz s = a("tongue");
   public static final cnz t = a("swim");
   public static final cnz u = a("lay_spawn");
   public static final cnz v = a("sniff");
   public static final cnz w = a("investigate");
   public static final cnz x = a("roar");
   public static final cnz y = a("emerge");
   public static final cnz z = a("dig");
   private final String A;
   private final int B;

   private cnz(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cnz a(String $$0) {
      return jw.a(lq.C, $$0, new cnz($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cnz $$1 = (cnz)$$0;
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
