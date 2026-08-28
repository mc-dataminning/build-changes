public class csr {
   public static final csr a = a("core");
   public static final csr b = a("idle");
   public static final csr c = a("work");
   public static final csr d = a("play");
   public static final csr e = a("rest");
   public static final csr f = a("meet");
   public static final csr g = a("panic");
   public static final csr h = a("raid");
   public static final csr i = a("pre_raid");
   public static final csr j = a("hide");
   public static final csr k = a("fight");
   public static final csr l = a("celebrate");
   public static final csr m = a("admire_item");
   public static final csr n = a("avoid");
   public static final csr o = a("ride");
   public static final csr p = a("play_dead");
   public static final csr q = a("long_jump");
   public static final csr r = a("ram");
   public static final csr s = a("tongue");
   public static final csr t = a("swim");
   public static final csr u = a("lay_spawn");
   public static final csr v = a("sniff");
   public static final csr w = a("investigate");
   public static final csr x = a("roar");
   public static final csr y = a("emerge");
   public static final csr z = a("dig");
   private final String A;
   private final int B;

   private csr(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static csr a(String $$0) {
      return jr.a(mf.C, $$0, new csr($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         csr $$1 = (csr)$$0;
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
