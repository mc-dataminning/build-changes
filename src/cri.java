public class cri {
   public static final cri a = a("core");
   public static final cri b = a("idle");
   public static final cri c = a("work");
   public static final cri d = a("play");
   public static final cri e = a("rest");
   public static final cri f = a("meet");
   public static final cri g = a("panic");
   public static final cri h = a("raid");
   public static final cri i = a("pre_raid");
   public static final cri j = a("hide");
   public static final cri k = a("fight");
   public static final cri l = a("celebrate");
   public static final cri m = a("admire_item");
   public static final cri n = a("avoid");
   public static final cri o = a("ride");
   public static final cri p = a("play_dead");
   public static final cri q = a("long_jump");
   public static final cri r = a("ram");
   public static final cri s = a("tongue");
   public static final cri t = a("swim");
   public static final cri u = a("lay_spawn");
   public static final cri v = a("sniff");
   public static final cri w = a("investigate");
   public static final cri x = a("roar");
   public static final cri y = a("emerge");
   public static final cri z = a("dig");
   private final String A;
   private final int B;

   private cri(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cri a(String $$0) {
      return ke.a(mb.C, $$0, new cri($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cri $$1 = (cri)$$0;
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
