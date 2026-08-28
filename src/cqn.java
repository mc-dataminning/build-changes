public class cqn {
   public static final cqn a = a("core");
   public static final cqn b = a("idle");
   public static final cqn c = a("work");
   public static final cqn d = a("play");
   public static final cqn e = a("rest");
   public static final cqn f = a("meet");
   public static final cqn g = a("panic");
   public static final cqn h = a("raid");
   public static final cqn i = a("pre_raid");
   public static final cqn j = a("hide");
   public static final cqn k = a("fight");
   public static final cqn l = a("celebrate");
   public static final cqn m = a("admire_item");
   public static final cqn n = a("avoid");
   public static final cqn o = a("ride");
   public static final cqn p = a("play_dead");
   public static final cqn q = a("long_jump");
   public static final cqn r = a("ram");
   public static final cqn s = a("tongue");
   public static final cqn t = a("swim");
   public static final cqn u = a("lay_spawn");
   public static final cqn v = a("sniff");
   public static final cqn w = a("investigate");
   public static final cqn x = a("roar");
   public static final cqn y = a("emerge");
   public static final cqn z = a("dig");
   private final String A;
   private final int B;

   private cqn(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cqn a(String $$0) {
      return ke.a(mb.C, $$0, new cqn($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cqn $$1 = (cqn)$$0;
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
