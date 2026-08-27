public class cei {
   public static final cei a = a("core");
   public static final cei b = a("idle");
   public static final cei c = a("work");
   public static final cei d = a("play");
   public static final cei e = a("rest");
   public static final cei f = a("meet");
   public static final cei g = a("panic");
   public static final cei h = a("raid");
   public static final cei i = a("pre_raid");
   public static final cei j = a("hide");
   public static final cei k = a("fight");
   public static final cei l = a("celebrate");
   public static final cei m = a("admire_item");
   public static final cei n = a("avoid");
   public static final cei o = a("ride");
   public static final cei p = a("play_dead");
   public static final cei q = a("long_jump");
   public static final cei r = a("ram");
   public static final cei s = a("tongue");
   public static final cei t = a("swim");
   public static final cei u = a("lay_spawn");
   public static final cei v = a("sniff");
   public static final cei w = a("investigate");
   public static final cei x = a("roar");
   public static final cei y = a("emerge");
   public static final cei z = a("dig");
   private final String A;
   private final int B;

   private cei(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cei a(String $$0) {
      return io.a(jy.F, $$0, new cei($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cei $$1 = (cei)$$0;
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
