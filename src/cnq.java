public class cnq {
   public static final cnq a = a("core");
   public static final cnq b = a("idle");
   public static final cnq c = a("work");
   public static final cnq d = a("play");
   public static final cnq e = a("rest");
   public static final cnq f = a("meet");
   public static final cnq g = a("panic");
   public static final cnq h = a("raid");
   public static final cnq i = a("pre_raid");
   public static final cnq j = a("hide");
   public static final cnq k = a("fight");
   public static final cnq l = a("celebrate");
   public static final cnq m = a("admire_item");
   public static final cnq n = a("avoid");
   public static final cnq o = a("ride");
   public static final cnq p = a("play_dead");
   public static final cnq q = a("long_jump");
   public static final cnq r = a("ram");
   public static final cnq s = a("tongue");
   public static final cnq t = a("swim");
   public static final cnq u = a("lay_spawn");
   public static final cnq v = a("sniff");
   public static final cnq w = a("investigate");
   public static final cnq x = a("roar");
   public static final cnq y = a("emerge");
   public static final cnq z = a("dig");
   private final String A;
   private final int B;

   private cnq(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cnq a(String $$0) {
      return jn.a(lh.E, $$0, new cnq($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cnq $$1 = (cnq)$$0;
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
