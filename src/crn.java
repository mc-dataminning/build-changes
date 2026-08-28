public class crn {
   public static final crn a = a("core");
   public static final crn b = a("idle");
   public static final crn c = a("work");
   public static final crn d = a("play");
   public static final crn e = a("rest");
   public static final crn f = a("meet");
   public static final crn g = a("panic");
   public static final crn h = a("raid");
   public static final crn i = a("pre_raid");
   public static final crn j = a("hide");
   public static final crn k = a("fight");
   public static final crn l = a("celebrate");
   public static final crn m = a("admire_item");
   public static final crn n = a("avoid");
   public static final crn o = a("ride");
   public static final crn p = a("play_dead");
   public static final crn q = a("long_jump");
   public static final crn r = a("ram");
   public static final crn s = a("tongue");
   public static final crn t = a("swim");
   public static final crn u = a("lay_spawn");
   public static final crn v = a("sniff");
   public static final crn w = a("investigate");
   public static final crn x = a("roar");
   public static final crn y = a("emerge");
   public static final crn z = a("dig");
   private final String A;
   private final int B;

   private crn(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static crn a(String $$0) {
      return kd.a(ma.C, $$0, new crn($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         crn $$1 = (crn)$$0;
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
