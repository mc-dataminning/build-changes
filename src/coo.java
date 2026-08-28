public class coo {
   public static final coo a = a("core");
   public static final coo b = a("idle");
   public static final coo c = a("work");
   public static final coo d = a("play");
   public static final coo e = a("rest");
   public static final coo f = a("meet");
   public static final coo g = a("panic");
   public static final coo h = a("raid");
   public static final coo i = a("pre_raid");
   public static final coo j = a("hide");
   public static final coo k = a("fight");
   public static final coo l = a("celebrate");
   public static final coo m = a("admire_item");
   public static final coo n = a("avoid");
   public static final coo o = a("ride");
   public static final coo p = a("play_dead");
   public static final coo q = a("long_jump");
   public static final coo r = a("ram");
   public static final coo s = a("tongue");
   public static final coo t = a("swim");
   public static final coo u = a("lay_spawn");
   public static final coo v = a("sniff");
   public static final coo w = a("investigate");
   public static final coo x = a("roar");
   public static final coo y = a("emerge");
   public static final coo z = a("dig");
   private final String A;
   private final int B;

   private coo(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static coo a(String $$0) {
      return jv.a(lp.E, $$0, new coo($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         coo $$1 = (coo)$$0;
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
