public class csw {
   public static final csw a = a("core");
   public static final csw b = a("idle");
   public static final csw c = a("work");
   public static final csw d = a("play");
   public static final csw e = a("rest");
   public static final csw f = a("meet");
   public static final csw g = a("panic");
   public static final csw h = a("raid");
   public static final csw i = a("pre_raid");
   public static final csw j = a("hide");
   public static final csw k = a("fight");
   public static final csw l = a("celebrate");
   public static final csw m = a("admire_item");
   public static final csw n = a("avoid");
   public static final csw o = a("ride");
   public static final csw p = a("play_dead");
   public static final csw q = a("long_jump");
   public static final csw r = a("ram");
   public static final csw s = a("tongue");
   public static final csw t = a("swim");
   public static final csw u = a("lay_spawn");
   public static final csw v = a("sniff");
   public static final csw w = a("investigate");
   public static final csw x = a("roar");
   public static final csw y = a("emerge");
   public static final csw z = a("dig");
   private final String A;
   private final int B;

   private csw(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static csw a(String $$0) {
      return jr.a(mf.C, $$0, new csw($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         csw $$1 = (csw)$$0;
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
