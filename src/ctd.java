public class ctd {
   public static final ctd a = a("core");
   public static final ctd b = a("idle");
   public static final ctd c = a("work");
   public static final ctd d = a("play");
   public static final ctd e = a("rest");
   public static final ctd f = a("meet");
   public static final ctd g = a("panic");
   public static final ctd h = a("raid");
   public static final ctd i = a("pre_raid");
   public static final ctd j = a("hide");
   public static final ctd k = a("fight");
   public static final ctd l = a("celebrate");
   public static final ctd m = a("admire_item");
   public static final ctd n = a("avoid");
   public static final ctd o = a("ride");
   public static final ctd p = a("play_dead");
   public static final ctd q = a("long_jump");
   public static final ctd r = a("ram");
   public static final ctd s = a("tongue");
   public static final ctd t = a("swim");
   public static final ctd u = a("lay_spawn");
   public static final ctd v = a("sniff");
   public static final ctd w = a("investigate");
   public static final ctd x = a("roar");
   public static final ctd y = a("emerge");
   public static final ctd z = a("dig");
   private final String A;
   private final int B;

   private ctd(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static ctd a(String $$0) {
      return js.a(mg.C, $$0, new ctd($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         ctd $$1 = (ctd)$$0;
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
