public class eve {
   public static final eve a = new eve("advancements");
   public static final eve b = new eve("stats");
   public static final eve c = new eve("playerdata");
   public static final eve d = new eve("players");
   public static final eve e = new eve("level.dat");
   public static final eve f = new eve("level.dat_old");
   public static final eve g = new eve("icon.png");
   public static final eve h = new eve("session.lock");
   public static final eve i = new eve("generated");
   public static final eve j = new eve("datapacks");
   public static final eve k = new eve("resources.zip");
   public static final eve l = new eve(".");
   private final String m;

   private eve(String $$0) {
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
