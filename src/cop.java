public class cop {
   public static final cop a = a("core");
   public static final cop b = a("idle");
   public static final cop c = a("work");
   public static final cop d = a("play");
   public static final cop e = a("rest");
   public static final cop f = a("meet");
   public static final cop g = a("panic");
   public static final cop h = a("raid");
   public static final cop i = a("pre_raid");
   public static final cop j = a("hide");
   public static final cop k = a("fight");
   public static final cop l = a("celebrate");
   public static final cop m = a("admire_item");
   public static final cop n = a("avoid");
   public static final cop o = a("ride");
   public static final cop p = a("play_dead");
   public static final cop q = a("long_jump");
   public static final cop r = a("ram");
   public static final cop s = a("tongue");
   public static final cop t = a("swim");
   public static final cop u = a("lay_spawn");
   public static final cop v = a("sniff");
   public static final cop w = a("investigate");
   public static final cop x = a("roar");
   public static final cop y = a("emerge");
   public static final cop z = a("dig");
   private final String A;
   private final int B;

   private cop(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cop a(String $$0) {
      return jv.a(lp.E, $$0, new cop($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cop $$1 = (cop)$$0;
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
