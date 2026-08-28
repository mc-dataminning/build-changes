public class cok {
   public static final cok a = a("core");
   public static final cok b = a("idle");
   public static final cok c = a("work");
   public static final cok d = a("play");
   public static final cok e = a("rest");
   public static final cok f = a("meet");
   public static final cok g = a("panic");
   public static final cok h = a("raid");
   public static final cok i = a("pre_raid");
   public static final cok j = a("hide");
   public static final cok k = a("fight");
   public static final cok l = a("celebrate");
   public static final cok m = a("admire_item");
   public static final cok n = a("avoid");
   public static final cok o = a("ride");
   public static final cok p = a("play_dead");
   public static final cok q = a("long_jump");
   public static final cok r = a("ram");
   public static final cok s = a("tongue");
   public static final cok t = a("swim");
   public static final cok u = a("lay_spawn");
   public static final cok v = a("sniff");
   public static final cok w = a("investigate");
   public static final cok x = a("roar");
   public static final cok y = a("emerge");
   public static final cok z = a("dig");
   private final String A;
   private final int B;

   private cok(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cok a(String $$0) {
      return jz.a(lt.C, $$0, new cok($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cok $$1 = (cok)$$0;
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
