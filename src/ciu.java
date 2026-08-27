public class ciu {
   public static final ciu a = a("core");
   public static final ciu b = a("idle");
   public static final ciu c = a("work");
   public static final ciu d = a("play");
   public static final ciu e = a("rest");
   public static final ciu f = a("meet");
   public static final ciu g = a("panic");
   public static final ciu h = a("raid");
   public static final ciu i = a("pre_raid");
   public static final ciu j = a("hide");
   public static final ciu k = a("fight");
   public static final ciu l = a("celebrate");
   public static final ciu m = a("admire_item");
   public static final ciu n = a("avoid");
   public static final ciu o = a("ride");
   public static final ciu p = a("play_dead");
   public static final ciu q = a("long_jump");
   public static final ciu r = a("ram");
   public static final ciu s = a("tongue");
   public static final ciu t = a("swim");
   public static final ciu u = a("lay_spawn");
   public static final ciu v = a("sniff");
   public static final ciu w = a("investigate");
   public static final ciu x = a("roar");
   public static final ciu y = a("emerge");
   public static final ciu z = a("dig");
   private final String A;
   private final int B;

   private ciu(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static ciu a(String $$0) {
      return iv.a(kf.E, $$0, new ciu($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ciu $$1 = (ciu)$$0;
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
