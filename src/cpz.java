public class cpz {
   public static final cpz a = a("core");
   public static final cpz b = a("idle");
   public static final cpz c = a("work");
   public static final cpz d = a("play");
   public static final cpz e = a("rest");
   public static final cpz f = a("meet");
   public static final cpz g = a("panic");
   public static final cpz h = a("raid");
   public static final cpz i = a("pre_raid");
   public static final cpz j = a("hide");
   public static final cpz k = a("fight");
   public static final cpz l = a("celebrate");
   public static final cpz m = a("admire_item");
   public static final cpz n = a("avoid");
   public static final cpz o = a("ride");
   public static final cpz p = a("play_dead");
   public static final cpz q = a("long_jump");
   public static final cpz r = a("ram");
   public static final cpz s = a("tongue");
   public static final cpz t = a("swim");
   public static final cpz u = a("lay_spawn");
   public static final cpz v = a("sniff");
   public static final cpz w = a("investigate");
   public static final cpz x = a("roar");
   public static final cpz y = a("emerge");
   public static final cpz z = a("dig");
   private final String A;
   private final int B;

   private cpz(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cpz a(String $$0) {
      return kc.a(lx.C, $$0, new cpz($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cpz $$1 = (cpz)$$0;
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
