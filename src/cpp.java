public class cpp {
   public static final cpp a = a("core");
   public static final cpp b = a("idle");
   public static final cpp c = a("work");
   public static final cpp d = a("play");
   public static final cpp e = a("rest");
   public static final cpp f = a("meet");
   public static final cpp g = a("panic");
   public static final cpp h = a("raid");
   public static final cpp i = a("pre_raid");
   public static final cpp j = a("hide");
   public static final cpp k = a("fight");
   public static final cpp l = a("celebrate");
   public static final cpp m = a("admire_item");
   public static final cpp n = a("avoid");
   public static final cpp o = a("ride");
   public static final cpp p = a("play_dead");
   public static final cpp q = a("long_jump");
   public static final cpp r = a("ram");
   public static final cpp s = a("tongue");
   public static final cpp t = a("swim");
   public static final cpp u = a("lay_spawn");
   public static final cpp v = a("sniff");
   public static final cpp w = a("investigate");
   public static final cpp x = a("roar");
   public static final cpp y = a("emerge");
   public static final cpp z = a("dig");
   private final String A;
   private final int B;

   private cpp(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cpp a(String $$0) {
      return kb.a(lv.C, $$0, new cpp($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cpp $$1 = (cpp)$$0;
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
