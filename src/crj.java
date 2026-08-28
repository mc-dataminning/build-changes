public class crj {
   public static final crj a = a("core");
   public static final crj b = a("idle");
   public static final crj c = a("work");
   public static final crj d = a("play");
   public static final crj e = a("rest");
   public static final crj f = a("meet");
   public static final crj g = a("panic");
   public static final crj h = a("raid");
   public static final crj i = a("pre_raid");
   public static final crj j = a("hide");
   public static final crj k = a("fight");
   public static final crj l = a("celebrate");
   public static final crj m = a("admire_item");
   public static final crj n = a("avoid");
   public static final crj o = a("ride");
   public static final crj p = a("play_dead");
   public static final crj q = a("long_jump");
   public static final crj r = a("ram");
   public static final crj s = a("tongue");
   public static final crj t = a("swim");
   public static final crj u = a("lay_spawn");
   public static final crj v = a("sniff");
   public static final crj w = a("investigate");
   public static final crj x = a("roar");
   public static final crj y = a("emerge");
   public static final crj z = a("dig");
   private final String A;
   private final int B;

   private crj(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static crj a(String $$0) {
      return kd.a(ma.C, $$0, new crj($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         crj $$1 = (crj)$$0;
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
