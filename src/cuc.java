public class cuc {
   public static final cuc a = a("core");
   public static final cuc b = a("idle");
   public static final cuc c = a("work");
   public static final cuc d = a("play");
   public static final cuc e = a("rest");
   public static final cuc f = a("meet");
   public static final cuc g = a("panic");
   public static final cuc h = a("raid");
   public static final cuc i = a("pre_raid");
   public static final cuc j = a("hide");
   public static final cuc k = a("fight");
   public static final cuc l = a("celebrate");
   public static final cuc m = a("admire_item");
   public static final cuc n = a("avoid");
   public static final cuc o = a("ride");
   public static final cuc p = a("play_dead");
   public static final cuc q = a("long_jump");
   public static final cuc r = a("ram");
   public static final cuc s = a("tongue");
   public static final cuc t = a("swim");
   public static final cuc u = a("lay_spawn");
   public static final cuc v = a("sniff");
   public static final cuc w = a("investigate");
   public static final cuc x = a("roar");
   public static final cuc y = a("emerge");
   public static final cuc z = a("dig");
   private final String A;
   private final int B;

   private cuc(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cuc a(String $$0) {
      return jt.a(mh.C, $$0, new cuc($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cuc $$1 = (cuc)$$0;
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
