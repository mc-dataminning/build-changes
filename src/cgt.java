public class cgt {
   public static final cgt a = a("core");
   public static final cgt b = a("idle");
   public static final cgt c = a("work");
   public static final cgt d = a("play");
   public static final cgt e = a("rest");
   public static final cgt f = a("meet");
   public static final cgt g = a("panic");
   public static final cgt h = a("raid");
   public static final cgt i = a("pre_raid");
   public static final cgt j = a("hide");
   public static final cgt k = a("fight");
   public static final cgt l = a("celebrate");
   public static final cgt m = a("admire_item");
   public static final cgt n = a("avoid");
   public static final cgt o = a("ride");
   public static final cgt p = a("play_dead");
   public static final cgt q = a("long_jump");
   public static final cgt r = a("ram");
   public static final cgt s = a("tongue");
   public static final cgt t = a("swim");
   public static final cgt u = a("lay_spawn");
   public static final cgt v = a("sniff");
   public static final cgt w = a("investigate");
   public static final cgt x = a("roar");
   public static final cgt y = a("emerge");
   public static final cgt z = a("dig");
   private final String A;
   private final int B;

   private cgt(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cgt a(String $$0) {
      return it.a(kd.E, $$0, new cgt($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cgt $$1 = (cgt)$$0;
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
