public class ckh {
   public static final ckh a = a("core");
   public static final ckh b = a("idle");
   public static final ckh c = a("work");
   public static final ckh d = a("play");
   public static final ckh e = a("rest");
   public static final ckh f = a("meet");
   public static final ckh g = a("panic");
   public static final ckh h = a("raid");
   public static final ckh i = a("pre_raid");
   public static final ckh j = a("hide");
   public static final ckh k = a("fight");
   public static final ckh l = a("celebrate");
   public static final ckh m = a("admire_item");
   public static final ckh n = a("avoid");
   public static final ckh o = a("ride");
   public static final ckh p = a("play_dead");
   public static final ckh q = a("long_jump");
   public static final ckh r = a("ram");
   public static final ckh s = a("tongue");
   public static final ckh t = a("swim");
   public static final ckh u = a("lay_spawn");
   public static final ckh v = a("sniff");
   public static final ckh w = a("investigate");
   public static final ckh x = a("roar");
   public static final ckh y = a("emerge");
   public static final ckh z = a("dig");
   private final String A;
   private final int B;

   private ckh(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static ckh a(String $$0) {
      return iy.a(ki.E, $$0, new ckh($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ckh $$1 = (ckh)$$0;
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
