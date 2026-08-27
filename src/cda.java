public class cda {
   public static final cda a = a("core");
   public static final cda b = a("idle");
   public static final cda c = a("work");
   public static final cda d = a("play");
   public static final cda e = a("rest");
   public static final cda f = a("meet");
   public static final cda g = a("panic");
   public static final cda h = a("raid");
   public static final cda i = a("pre_raid");
   public static final cda j = a("hide");
   public static final cda k = a("fight");
   public static final cda l = a("celebrate");
   public static final cda m = a("admire_item");
   public static final cda n = a("avoid");
   public static final cda o = a("ride");
   public static final cda p = a("play_dead");
   public static final cda q = a("long_jump");
   public static final cda r = a("ram");
   public static final cda s = a("tongue");
   public static final cda t = a("swim");
   public static final cda u = a("lay_spawn");
   public static final cda v = a("sniff");
   public static final cda w = a("investigate");
   public static final cda x = a("roar");
   public static final cda y = a("emerge");
   public static final cda z = a("dig");
   private final String A;
   private final int B;

   private cda(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cda a(String $$0) {
      return ht.a(jd.F, $$0, new cda($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cda $$1 = (cda)$$0;
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
