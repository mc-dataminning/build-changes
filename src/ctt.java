public class ctt {
   public static final ctt a = a("core");
   public static final ctt b = a("idle");
   public static final ctt c = a("work");
   public static final ctt d = a("play");
   public static final ctt e = a("rest");
   public static final ctt f = a("meet");
   public static final ctt g = a("panic");
   public static final ctt h = a("raid");
   public static final ctt i = a("pre_raid");
   public static final ctt j = a("hide");
   public static final ctt k = a("fight");
   public static final ctt l = a("celebrate");
   public static final ctt m = a("admire_item");
   public static final ctt n = a("avoid");
   public static final ctt o = a("ride");
   public static final ctt p = a("play_dead");
   public static final ctt q = a("long_jump");
   public static final ctt r = a("ram");
   public static final ctt s = a("tongue");
   public static final ctt t = a("swim");
   public static final ctt u = a("lay_spawn");
   public static final ctt v = a("sniff");
   public static final ctt w = a("investigate");
   public static final ctt x = a("roar");
   public static final ctt y = a("emerge");
   public static final ctt z = a("dig");
   private final String A;
   private final int B;

   private ctt(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static ctt a(String $$0) {
      return jt.a(mh.C, $$0, new ctt($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ctt $$1 = (ctt)$$0;
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
