public class ccx {
   public static final ccx a = a("core");
   public static final ccx b = a("idle");
   public static final ccx c = a("work");
   public static final ccx d = a("play");
   public static final ccx e = a("rest");
   public static final ccx f = a("meet");
   public static final ccx g = a("panic");
   public static final ccx h = a("raid");
   public static final ccx i = a("pre_raid");
   public static final ccx j = a("hide");
   public static final ccx k = a("fight");
   public static final ccx l = a("celebrate");
   public static final ccx m = a("admire_item");
   public static final ccx n = a("avoid");
   public static final ccx o = a("ride");
   public static final ccx p = a("play_dead");
   public static final ccx q = a("long_jump");
   public static final ccx r = a("ram");
   public static final ccx s = a("tongue");
   public static final ccx t = a("swim");
   public static final ccx u = a("lay_spawn");
   public static final ccx v = a("sniff");
   public static final ccx w = a("investigate");
   public static final ccx x = a("roar");
   public static final ccx y = a("emerge");
   public static final ccx z = a("dig");
   private final String A;
   private final int B;

   private ccx(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static ccx a(String $$0) {
      return hr.a(jb.F, $$0, new ccx($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ccx $$1 = (ccx)$$0;
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
