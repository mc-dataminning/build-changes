public class cgn {
   public static final cgn a = a("core");
   public static final cgn b = a("idle");
   public static final cgn c = a("work");
   public static final cgn d = a("play");
   public static final cgn e = a("rest");
   public static final cgn f = a("meet");
   public static final cgn g = a("panic");
   public static final cgn h = a("raid");
   public static final cgn i = a("pre_raid");
   public static final cgn j = a("hide");
   public static final cgn k = a("fight");
   public static final cgn l = a("celebrate");
   public static final cgn m = a("admire_item");
   public static final cgn n = a("avoid");
   public static final cgn o = a("ride");
   public static final cgn p = a("play_dead");
   public static final cgn q = a("long_jump");
   public static final cgn r = a("ram");
   public static final cgn s = a("tongue");
   public static final cgn t = a("swim");
   public static final cgn u = a("lay_spawn");
   public static final cgn v = a("sniff");
   public static final cgn w = a("investigate");
   public static final cgn x = a("roar");
   public static final cgn y = a("emerge");
   public static final cgn z = a("dig");
   private final String A;
   private final int B;

   private cgn(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cgn a(String $$0) {
      return it.a(kd.E, $$0, new cgn($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cgn $$1 = (cgn)$$0;
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
