public class cqm {
   public static final cqm a = a("core");
   public static final cqm b = a("idle");
   public static final cqm c = a("work");
   public static final cqm d = a("play");
   public static final cqm e = a("rest");
   public static final cqm f = a("meet");
   public static final cqm g = a("panic");
   public static final cqm h = a("raid");
   public static final cqm i = a("pre_raid");
   public static final cqm j = a("hide");
   public static final cqm k = a("fight");
   public static final cqm l = a("celebrate");
   public static final cqm m = a("admire_item");
   public static final cqm n = a("avoid");
   public static final cqm o = a("ride");
   public static final cqm p = a("play_dead");
   public static final cqm q = a("long_jump");
   public static final cqm r = a("ram");
   public static final cqm s = a("tongue");
   public static final cqm t = a("swim");
   public static final cqm u = a("lay_spawn");
   public static final cqm v = a("sniff");
   public static final cqm w = a("investigate");
   public static final cqm x = a("roar");
   public static final cqm y = a("emerge");
   public static final cqm z = a("dig");
   private final String A;
   private final int B;

   private cqm(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cqm a(String $$0) {
      return ke.a(mb.C, $$0, new cqm($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cqm $$1 = (cqm)$$0;
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
