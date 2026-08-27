public class cfk {
   public static final cfk a = a("core");
   public static final cfk b = a("idle");
   public static final cfk c = a("work");
   public static final cfk d = a("play");
   public static final cfk e = a("rest");
   public static final cfk f = a("meet");
   public static final cfk g = a("panic");
   public static final cfk h = a("raid");
   public static final cfk i = a("pre_raid");
   public static final cfk j = a("hide");
   public static final cfk k = a("fight");
   public static final cfk l = a("celebrate");
   public static final cfk m = a("admire_item");
   public static final cfk n = a("avoid");
   public static final cfk o = a("ride");
   public static final cfk p = a("play_dead");
   public static final cfk q = a("long_jump");
   public static final cfk r = a("ram");
   public static final cfk s = a("tongue");
   public static final cfk t = a("swim");
   public static final cfk u = a("lay_spawn");
   public static final cfk v = a("sniff");
   public static final cfk w = a("investigate");
   public static final cfk x = a("roar");
   public static final cfk y = a("emerge");
   public static final cfk z = a("dig");
   private final String A;
   private final int B;

   private cfk(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cfk a(String $$0) {
      return is.a(kc.F, $$0, new cfk($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cfk $$1 = (cfk)$$0;
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
