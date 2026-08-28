public class com {
   public static final com a = a("core");
   public static final com b = a("idle");
   public static final com c = a("work");
   public static final com d = a("play");
   public static final com e = a("rest");
   public static final com f = a("meet");
   public static final com g = a("panic");
   public static final com h = a("raid");
   public static final com i = a("pre_raid");
   public static final com j = a("hide");
   public static final com k = a("fight");
   public static final com l = a("celebrate");
   public static final com m = a("admire_item");
   public static final com n = a("avoid");
   public static final com o = a("ride");
   public static final com p = a("play_dead");
   public static final com q = a("long_jump");
   public static final com r = a("ram");
   public static final com s = a("tongue");
   public static final com t = a("swim");
   public static final com u = a("lay_spawn");
   public static final com v = a("sniff");
   public static final com w = a("investigate");
   public static final com x = a("roar");
   public static final com y = a("emerge");
   public static final com z = a("dig");
   private final String A;
   private final int B;

   private com(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static com a(String $$0) {
      return jz.a(lt.C, $$0, new com($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         com $$1 = (com)$$0;
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
