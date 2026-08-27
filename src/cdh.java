public class cdh {
   public static final cdh a = a("core");
   public static final cdh b = a("idle");
   public static final cdh c = a("work");
   public static final cdh d = a("play");
   public static final cdh e = a("rest");
   public static final cdh f = a("meet");
   public static final cdh g = a("panic");
   public static final cdh h = a("raid");
   public static final cdh i = a("pre_raid");
   public static final cdh j = a("hide");
   public static final cdh k = a("fight");
   public static final cdh l = a("celebrate");
   public static final cdh m = a("admire_item");
   public static final cdh n = a("avoid");
   public static final cdh o = a("ride");
   public static final cdh p = a("play_dead");
   public static final cdh q = a("long_jump");
   public static final cdh r = a("ram");
   public static final cdh s = a("tongue");
   public static final cdh t = a("swim");
   public static final cdh u = a("lay_spawn");
   public static final cdh v = a("sniff");
   public static final cdh w = a("investigate");
   public static final cdh x = a("roar");
   public static final cdh y = a("emerge");
   public static final cdh z = a("dig");
   private final String A;
   private final int B;

   private cdh(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cdh a(String $$0) {
      return ht.a(jd.F, $$0, new cdh($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cdh $$1 = (cdh)$$0;
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
