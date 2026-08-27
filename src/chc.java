public class chc {
   public static final chc a = a("core");
   public static final chc b = a("idle");
   public static final chc c = a("work");
   public static final chc d = a("play");
   public static final chc e = a("rest");
   public static final chc f = a("meet");
   public static final chc g = a("panic");
   public static final chc h = a("raid");
   public static final chc i = a("pre_raid");
   public static final chc j = a("hide");
   public static final chc k = a("fight");
   public static final chc l = a("celebrate");
   public static final chc m = a("admire_item");
   public static final chc n = a("avoid");
   public static final chc o = a("ride");
   public static final chc p = a("play_dead");
   public static final chc q = a("long_jump");
   public static final chc r = a("ram");
   public static final chc s = a("tongue");
   public static final chc t = a("swim");
   public static final chc u = a("lay_spawn");
   public static final chc v = a("sniff");
   public static final chc w = a("investigate");
   public static final chc x = a("roar");
   public static final chc y = a("emerge");
   public static final chc z = a("dig");
   private final String A;
   private final int B;

   private chc(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static chc a(String $$0) {
      return it.a(kd.E, $$0, new chc($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         chc $$1 = (chc)$$0;
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
