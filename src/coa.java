public class coa {
   public static final coa a = a("core");
   public static final coa b = a("idle");
   public static final coa c = a("work");
   public static final coa d = a("play");
   public static final coa e = a("rest");
   public static final coa f = a("meet");
   public static final coa g = a("panic");
   public static final coa h = a("raid");
   public static final coa i = a("pre_raid");
   public static final coa j = a("hide");
   public static final coa k = a("fight");
   public static final coa l = a("celebrate");
   public static final coa m = a("admire_item");
   public static final coa n = a("avoid");
   public static final coa o = a("ride");
   public static final coa p = a("play_dead");
   public static final coa q = a("long_jump");
   public static final coa r = a("ram");
   public static final coa s = a("tongue");
   public static final coa t = a("swim");
   public static final coa u = a("lay_spawn");
   public static final coa v = a("sniff");
   public static final coa w = a("investigate");
   public static final coa x = a("roar");
   public static final coa y = a("emerge");
   public static final coa z = a("dig");
   private final String A;
   private final int B;

   private coa(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static coa a(String $$0) {
      return jw.a(lq.C, $$0, new coa($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         coa $$1 = (coa)$$0;
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
