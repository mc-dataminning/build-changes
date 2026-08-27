public class cnn {
   public static final cnn a = a("core");
   public static final cnn b = a("idle");
   public static final cnn c = a("work");
   public static final cnn d = a("play");
   public static final cnn e = a("rest");
   public static final cnn f = a("meet");
   public static final cnn g = a("panic");
   public static final cnn h = a("raid");
   public static final cnn i = a("pre_raid");
   public static final cnn j = a("hide");
   public static final cnn k = a("fight");
   public static final cnn l = a("celebrate");
   public static final cnn m = a("admire_item");
   public static final cnn n = a("avoid");
   public static final cnn o = a("ride");
   public static final cnn p = a("play_dead");
   public static final cnn q = a("long_jump");
   public static final cnn r = a("ram");
   public static final cnn s = a("tongue");
   public static final cnn t = a("swim");
   public static final cnn u = a("lay_spawn");
   public static final cnn v = a("sniff");
   public static final cnn w = a("investigate");
   public static final cnn x = a("roar");
   public static final cnn y = a("emerge");
   public static final cnn z = a("dig");
   private final String A;
   private final int B;

   private cnn(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cnn a(String $$0) {
      return jk.a(le.E, $$0, new cnn($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cnn $$1 = (cnn)$$0;
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
