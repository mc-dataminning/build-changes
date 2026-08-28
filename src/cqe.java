public class cqe {
   public static final cqe a = a("core");
   public static final cqe b = a("idle");
   public static final cqe c = a("work");
   public static final cqe d = a("play");
   public static final cqe e = a("rest");
   public static final cqe f = a("meet");
   public static final cqe g = a("panic");
   public static final cqe h = a("raid");
   public static final cqe i = a("pre_raid");
   public static final cqe j = a("hide");
   public static final cqe k = a("fight");
   public static final cqe l = a("celebrate");
   public static final cqe m = a("admire_item");
   public static final cqe n = a("avoid");
   public static final cqe o = a("ride");
   public static final cqe p = a("play_dead");
   public static final cqe q = a("long_jump");
   public static final cqe r = a("ram");
   public static final cqe s = a("tongue");
   public static final cqe t = a("swim");
   public static final cqe u = a("lay_spawn");
   public static final cqe v = a("sniff");
   public static final cqe w = a("investigate");
   public static final cqe x = a("roar");
   public static final cqe y = a("emerge");
   public static final cqe z = a("dig");
   private final String A;
   private final int B;

   private cqe(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cqe a(String $$0) {
      return kd.a(ly.C, $$0, new cqe($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cqe $$1 = (cqe)$$0;
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
