public class emp {
   public static final emp a = new emp("advancements");
   public static final emp b = new emp("stats");
   public static final emp c = new emp("playerdata");
   public static final emp d = new emp("players");
   public static final emp e = new emp("level.dat");
   public static final emp f = new emp("level.dat_old");
   public static final emp g = new emp("icon.png");
   public static final emp h = new emp("session.lock");
   public static final emp i = new emp("generated");
   public static final emp j = new emp("datapacks");
   public static final emp k = new emp("resources.zip");
   public static final emp l = new emp(".");
   private final String m;

   private emp(String $$0) {
      this.m = $$0;
   }

   public String a() {
      return this.m;
   }

   @Override
   public String toString() {
      return "/" + this.m;
   }
}
