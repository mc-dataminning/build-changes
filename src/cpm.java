public class cpm {
   public static final cpm a = a("core");
   public static final cpm b = a("idle");
   public static final cpm c = a("work");
   public static final cpm d = a("play");
   public static final cpm e = a("rest");
   public static final cpm f = a("meet");
   public static final cpm g = a("panic");
   public static final cpm h = a("raid");
   public static final cpm i = a("pre_raid");
   public static final cpm j = a("hide");
   public static final cpm k = a("fight");
   public static final cpm l = a("celebrate");
   public static final cpm m = a("admire_item");
   public static final cpm n = a("avoid");
   public static final cpm o = a("ride");
   public static final cpm p = a("play_dead");
   public static final cpm q = a("long_jump");
   public static final cpm r = a("ram");
   public static final cpm s = a("tongue");
   public static final cpm t = a("swim");
   public static final cpm u = a("lay_spawn");
   public static final cpm v = a("sniff");
   public static final cpm w = a("investigate");
   public static final cpm x = a("roar");
   public static final cpm y = a("emerge");
   public static final cpm z = a("dig");
   private final String A;
   private final int B;

   private cpm(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cpm a(String $$0) {
      return ka.a(lu.C, $$0, new cpm($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cpm $$1 = (cpm)$$0;
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
