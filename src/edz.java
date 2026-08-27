public class edz {
   public static final edz a = new edz("advancements");
   public static final edz b = new edz("stats");
   public static final edz c = new edz("playerdata");
   public static final edz d = new edz("players");
   public static final edz e = new edz("level.dat");
   public static final edz f = new edz("level.dat_old");
   public static final edz g = new edz("icon.png");
   public static final edz h = new edz("session.lock");
   public static final edz i = new edz("generated");
   public static final edz j = new edz("datapacks");
   public static final edz k = new edz("resources.zip");
   public static final edz l = new edz(".");
   private final String m;

   private edz(String $$0) {
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
