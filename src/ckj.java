public class ckj {
   public static final ckj a = a("core");
   public static final ckj b = a("idle");
   public static final ckj c = a("work");
   public static final ckj d = a("play");
   public static final ckj e = a("rest");
   public static final ckj f = a("meet");
   public static final ckj g = a("panic");
   public static final ckj h = a("raid");
   public static final ckj i = a("pre_raid");
   public static final ckj j = a("hide");
   public static final ckj k = a("fight");
   public static final ckj l = a("celebrate");
   public static final ckj m = a("admire_item");
   public static final ckj n = a("avoid");
   public static final ckj o = a("ride");
   public static final ckj p = a("play_dead");
   public static final ckj q = a("long_jump");
   public static final ckj r = a("ram");
   public static final ckj s = a("tongue");
   public static final ckj t = a("swim");
   public static final ckj u = a("lay_spawn");
   public static final ckj v = a("sniff");
   public static final ckj w = a("investigate");
   public static final ckj x = a("roar");
   public static final ckj y = a("emerge");
   public static final ckj z = a("dig");
   private final String A;
   private final int B;

   private ckj(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static ckj a(String $$0) {
      return iy.a(ki.E, $$0, new ckj($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ckj $$1 = (ckj)$$0;
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
