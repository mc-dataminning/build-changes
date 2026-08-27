public class cdl {
   public static final cdl a = a("core");
   public static final cdl b = a("idle");
   public static final cdl c = a("work");
   public static final cdl d = a("play");
   public static final cdl e = a("rest");
   public static final cdl f = a("meet");
   public static final cdl g = a("panic");
   public static final cdl h = a("raid");
   public static final cdl i = a("pre_raid");
   public static final cdl j = a("hide");
   public static final cdl k = a("fight");
   public static final cdl l = a("celebrate");
   public static final cdl m = a("admire_item");
   public static final cdl n = a("avoid");
   public static final cdl o = a("ride");
   public static final cdl p = a("play_dead");
   public static final cdl q = a("long_jump");
   public static final cdl r = a("ram");
   public static final cdl s = a("tongue");
   public static final cdl t = a("swim");
   public static final cdl u = a("lay_spawn");
   public static final cdl v = a("sniff");
   public static final cdl w = a("investigate");
   public static final cdl x = a("roar");
   public static final cdl y = a("emerge");
   public static final cdl z = a("dig");
   private final String A;
   private final int B;

   private cdl(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cdl a(String $$0) {
      return hq.a(jb.F, $$0, new cdl($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cdl $$1 = (cdl)$$0;
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
