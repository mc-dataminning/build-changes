public class cjn {
   public static final cjn a = a("core");
   public static final cjn b = a("idle");
   public static final cjn c = a("work");
   public static final cjn d = a("play");
   public static final cjn e = a("rest");
   public static final cjn f = a("meet");
   public static final cjn g = a("panic");
   public static final cjn h = a("raid");
   public static final cjn i = a("pre_raid");
   public static final cjn j = a("hide");
   public static final cjn k = a("fight");
   public static final cjn l = a("celebrate");
   public static final cjn m = a("admire_item");
   public static final cjn n = a("avoid");
   public static final cjn o = a("ride");
   public static final cjn p = a("play_dead");
   public static final cjn q = a("long_jump");
   public static final cjn r = a("ram");
   public static final cjn s = a("tongue");
   public static final cjn t = a("swim");
   public static final cjn u = a("lay_spawn");
   public static final cjn v = a("sniff");
   public static final cjn w = a("investigate");
   public static final cjn x = a("roar");
   public static final cjn y = a("emerge");
   public static final cjn z = a("dig");
   private final String A;
   private final int B;

   private cjn(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cjn a(String $$0) {
      return ix.a(kh.E, $$0, new cjn($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cjn $$1 = (cjn)$$0;
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
