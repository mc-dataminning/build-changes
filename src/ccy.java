public class ccy {
   public static final ccy a = a("core");
   public static final ccy b = a("idle");
   public static final ccy c = a("work");
   public static final ccy d = a("play");
   public static final ccy e = a("rest");
   public static final ccy f = a("meet");
   public static final ccy g = a("panic");
   public static final ccy h = a("raid");
   public static final ccy i = a("pre_raid");
   public static final ccy j = a("hide");
   public static final ccy k = a("fight");
   public static final ccy l = a("celebrate");
   public static final ccy m = a("admire_item");
   public static final ccy n = a("avoid");
   public static final ccy o = a("ride");
   public static final ccy p = a("play_dead");
   public static final ccy q = a("long_jump");
   public static final ccy r = a("ram");
   public static final ccy s = a("tongue");
   public static final ccy t = a("swim");
   public static final ccy u = a("lay_spawn");
   public static final ccy v = a("sniff");
   public static final ccy w = a("investigate");
   public static final ccy x = a("roar");
   public static final ccy y = a("emerge");
   public static final ccy z = a("dig");
   private final String A;
   private final int B;

   private ccy(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static ccy a(String $$0) {
      return hr.a(jb.F, $$0, new ccy($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ccy $$1 = (ccy)$$0;
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
