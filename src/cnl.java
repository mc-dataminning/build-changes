public class cnl {
   public static final cnl a = a("core");
   public static final cnl b = a("idle");
   public static final cnl c = a("work");
   public static final cnl d = a("play");
   public static final cnl e = a("rest");
   public static final cnl f = a("meet");
   public static final cnl g = a("panic");
   public static final cnl h = a("raid");
   public static final cnl i = a("pre_raid");
   public static final cnl j = a("hide");
   public static final cnl k = a("fight");
   public static final cnl l = a("celebrate");
   public static final cnl m = a("admire_item");
   public static final cnl n = a("avoid");
   public static final cnl o = a("ride");
   public static final cnl p = a("play_dead");
   public static final cnl q = a("long_jump");
   public static final cnl r = a("ram");
   public static final cnl s = a("tongue");
   public static final cnl t = a("swim");
   public static final cnl u = a("lay_spawn");
   public static final cnl v = a("sniff");
   public static final cnl w = a("investigate");
   public static final cnl x = a("roar");
   public static final cnl y = a("emerge");
   public static final cnl z = a("dig");
   private final String A;
   private final int B;

   private cnl(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cnl a(String $$0) {
      return jk.a(le.E, $$0, new cnl($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cnl $$1 = (cnl)$$0;
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
