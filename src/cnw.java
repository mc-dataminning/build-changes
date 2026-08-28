public class cnw {
   public static final cnw a = a("core");
   public static final cnw b = a("idle");
   public static final cnw c = a("work");
   public static final cnw d = a("play");
   public static final cnw e = a("rest");
   public static final cnw f = a("meet");
   public static final cnw g = a("panic");
   public static final cnw h = a("raid");
   public static final cnw i = a("pre_raid");
   public static final cnw j = a("hide");
   public static final cnw k = a("fight");
   public static final cnw l = a("celebrate");
   public static final cnw m = a("admire_item");
   public static final cnw n = a("avoid");
   public static final cnw o = a("ride");
   public static final cnw p = a("play_dead");
   public static final cnw q = a("long_jump");
   public static final cnw r = a("ram");
   public static final cnw s = a("tongue");
   public static final cnw t = a("swim");
   public static final cnw u = a("lay_spawn");
   public static final cnw v = a("sniff");
   public static final cnw w = a("investigate");
   public static final cnw x = a("roar");
   public static final cnw y = a("emerge");
   public static final cnw z = a("dig");
   private final String A;
   private final int B;

   private cnw(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cnw a(String $$0) {
      return jw.a(lq.C, $$0, new cnw($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cnw $$1 = (cnw)$$0;
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
