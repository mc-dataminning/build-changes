public class ccw {
   public static final ccw a = a("core");
   public static final ccw b = a("idle");
   public static final ccw c = a("work");
   public static final ccw d = a("play");
   public static final ccw e = a("rest");
   public static final ccw f = a("meet");
   public static final ccw g = a("panic");
   public static final ccw h = a("raid");
   public static final ccw i = a("pre_raid");
   public static final ccw j = a("hide");
   public static final ccw k = a("fight");
   public static final ccw l = a("celebrate");
   public static final ccw m = a("admire_item");
   public static final ccw n = a("avoid");
   public static final ccw o = a("ride");
   public static final ccw p = a("play_dead");
   public static final ccw q = a("long_jump");
   public static final ccw r = a("ram");
   public static final ccw s = a("tongue");
   public static final ccw t = a("swim");
   public static final ccw u = a("lay_spawn");
   public static final ccw v = a("sniff");
   public static final ccw w = a("investigate");
   public static final ccw x = a("roar");
   public static final ccw y = a("emerge");
   public static final ccw z = a("dig");
   private final String A;
   private final int B;

   private ccw(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static ccw a(String $$0) {
      return hs.a(jc.F, $$0, new ccw($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ccw $$1 = (ccw)$$0;
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
