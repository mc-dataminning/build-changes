public class cqo {
   public static final cqo a = a("core");
   public static final cqo b = a("idle");
   public static final cqo c = a("work");
   public static final cqo d = a("play");
   public static final cqo e = a("rest");
   public static final cqo f = a("meet");
   public static final cqo g = a("panic");
   public static final cqo h = a("raid");
   public static final cqo i = a("pre_raid");
   public static final cqo j = a("hide");
   public static final cqo k = a("fight");
   public static final cqo l = a("celebrate");
   public static final cqo m = a("admire_item");
   public static final cqo n = a("avoid");
   public static final cqo o = a("ride");
   public static final cqo p = a("play_dead");
   public static final cqo q = a("long_jump");
   public static final cqo r = a("ram");
   public static final cqo s = a("tongue");
   public static final cqo t = a("swim");
   public static final cqo u = a("lay_spawn");
   public static final cqo v = a("sniff");
   public static final cqo w = a("investigate");
   public static final cqo x = a("roar");
   public static final cqo y = a("emerge");
   public static final cqo z = a("dig");
   private final String A;
   private final int B;

   private cqo(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cqo a(String $$0) {
      return ke.a(mb.C, $$0, new cqo($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cqo $$1 = (cqo)$$0;
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
