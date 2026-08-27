public class cgu {
   public static final cgu a = a("core");
   public static final cgu b = a("idle");
   public static final cgu c = a("work");
   public static final cgu d = a("play");
   public static final cgu e = a("rest");
   public static final cgu f = a("meet");
   public static final cgu g = a("panic");
   public static final cgu h = a("raid");
   public static final cgu i = a("pre_raid");
   public static final cgu j = a("hide");
   public static final cgu k = a("fight");
   public static final cgu l = a("celebrate");
   public static final cgu m = a("admire_item");
   public static final cgu n = a("avoid");
   public static final cgu o = a("ride");
   public static final cgu p = a("play_dead");
   public static final cgu q = a("long_jump");
   public static final cgu r = a("ram");
   public static final cgu s = a("tongue");
   public static final cgu t = a("swim");
   public static final cgu u = a("lay_spawn");
   public static final cgu v = a("sniff");
   public static final cgu w = a("investigate");
   public static final cgu x = a("roar");
   public static final cgu y = a("emerge");
   public static final cgu z = a("dig");
   private final String A;
   private final int B;

   private cgu(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cgu a(String $$0) {
      return it.a(kd.E, $$0, new cgu($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cgu $$1 = (cgu)$$0;
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
