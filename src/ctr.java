public class ctr {
   public static final ctr a = a("core");
   public static final ctr b = a("idle");
   public static final ctr c = a("work");
   public static final ctr d = a("play");
   public static final ctr e = a("rest");
   public static final ctr f = a("meet");
   public static final ctr g = a("panic");
   public static final ctr h = a("raid");
   public static final ctr i = a("pre_raid");
   public static final ctr j = a("hide");
   public static final ctr k = a("fight");
   public static final ctr l = a("celebrate");
   public static final ctr m = a("admire_item");
   public static final ctr n = a("avoid");
   public static final ctr o = a("ride");
   public static final ctr p = a("play_dead");
   public static final ctr q = a("long_jump");
   public static final ctr r = a("ram");
   public static final ctr s = a("tongue");
   public static final ctr t = a("swim");
   public static final ctr u = a("lay_spawn");
   public static final ctr v = a("sniff");
   public static final ctr w = a("investigate");
   public static final ctr x = a("roar");
   public static final ctr y = a("emerge");
   public static final ctr z = a("dig");
   private final String A;
   private final int B;

   private ctr(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static ctr a(String $$0) {
      return js.a(mg.C, $$0, new ctr($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ctr $$1 = (ctr)$$0;
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
