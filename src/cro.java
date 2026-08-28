public class cro {
   public static final cro a = a("core");
   public static final cro b = a("idle");
   public static final cro c = a("work");
   public static final cro d = a("play");
   public static final cro e = a("rest");
   public static final cro f = a("meet");
   public static final cro g = a("panic");
   public static final cro h = a("raid");
   public static final cro i = a("pre_raid");
   public static final cro j = a("hide");
   public static final cro k = a("fight");
   public static final cro l = a("celebrate");
   public static final cro m = a("admire_item");
   public static final cro n = a("avoid");
   public static final cro o = a("ride");
   public static final cro p = a("play_dead");
   public static final cro q = a("long_jump");
   public static final cro r = a("ram");
   public static final cro s = a("tongue");
   public static final cro t = a("swim");
   public static final cro u = a("lay_spawn");
   public static final cro v = a("sniff");
   public static final cro w = a("investigate");
   public static final cro x = a("roar");
   public static final cro y = a("emerge");
   public static final cro z = a("dig");
   private final String A;
   private final int B;

   private cro(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cro a(String $$0) {
      return kd.a(ma.C, $$0, new cro($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cro $$1 = (cro)$$0;
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
