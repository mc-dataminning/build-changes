public class cmw {
   public static final cmw a = a("core");
   public static final cmw b = a("idle");
   public static final cmw c = a("work");
   public static final cmw d = a("play");
   public static final cmw e = a("rest");
   public static final cmw f = a("meet");
   public static final cmw g = a("panic");
   public static final cmw h = a("raid");
   public static final cmw i = a("pre_raid");
   public static final cmw j = a("hide");
   public static final cmw k = a("fight");
   public static final cmw l = a("celebrate");
   public static final cmw m = a("admire_item");
   public static final cmw n = a("avoid");
   public static final cmw o = a("ride");
   public static final cmw p = a("play_dead");
   public static final cmw q = a("long_jump");
   public static final cmw r = a("ram");
   public static final cmw s = a("tongue");
   public static final cmw t = a("swim");
   public static final cmw u = a("lay_spawn");
   public static final cmw v = a("sniff");
   public static final cmw w = a("investigate");
   public static final cmw x = a("roar");
   public static final cmw y = a("emerge");
   public static final cmw z = a("dig");
   private final String A;
   private final int B;

   private cmw(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cmw a(String $$0) {
      return jj.a(ld.E, $$0, new cmw($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cmw $$1 = (cmw)$$0;
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
