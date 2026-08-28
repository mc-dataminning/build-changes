public class crf {
   public static final crf a = a("core");
   public static final crf b = a("idle");
   public static final crf c = a("work");
   public static final crf d = a("play");
   public static final crf e = a("rest");
   public static final crf f = a("meet");
   public static final crf g = a("panic");
   public static final crf h = a("raid");
   public static final crf i = a("pre_raid");
   public static final crf j = a("hide");
   public static final crf k = a("fight");
   public static final crf l = a("celebrate");
   public static final crf m = a("admire_item");
   public static final crf n = a("avoid");
   public static final crf o = a("ride");
   public static final crf p = a("play_dead");
   public static final crf q = a("long_jump");
   public static final crf r = a("ram");
   public static final crf s = a("tongue");
   public static final crf t = a("swim");
   public static final crf u = a("lay_spawn");
   public static final crf v = a("sniff");
   public static final crf w = a("investigate");
   public static final crf x = a("roar");
   public static final crf y = a("emerge");
   public static final crf z = a("dig");
   private final String A;
   private final int B;

   private crf(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static crf a(String $$0) {
      return kd.a(ma.C, $$0, new crf($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         crf $$1 = (crf)$$0;
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
