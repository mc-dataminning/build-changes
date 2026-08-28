public class crz {
   public static final crz a = a("core");
   public static final crz b = a("idle");
   public static final crz c = a("work");
   public static final crz d = a("play");
   public static final crz e = a("rest");
   public static final crz f = a("meet");
   public static final crz g = a("panic");
   public static final crz h = a("raid");
   public static final crz i = a("pre_raid");
   public static final crz j = a("hide");
   public static final crz k = a("fight");
   public static final crz l = a("celebrate");
   public static final crz m = a("admire_item");
   public static final crz n = a("avoid");
   public static final crz o = a("ride");
   public static final crz p = a("play_dead");
   public static final crz q = a("long_jump");
   public static final crz r = a("ram");
   public static final crz s = a("tongue");
   public static final crz t = a("swim");
   public static final crz u = a("lay_spawn");
   public static final crz v = a("sniff");
   public static final crz w = a("investigate");
   public static final crz x = a("roar");
   public static final crz y = a("emerge");
   public static final crz z = a("dig");
   private final String A;
   private final int B;

   private crz(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static crz a(String $$0) {
      return kf.a(md.C, $$0, new crz($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         crz $$1 = (crz)$$0;
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
