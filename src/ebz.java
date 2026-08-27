public class ebz {
   public static final ebz a = new ebz("advancements");
   public static final ebz b = new ebz("stats");
   public static final ebz c = new ebz("playerdata");
   public static final ebz d = new ebz("players");
   public static final ebz e = new ebz("level.dat");
   public static final ebz f = new ebz("level.dat_old");
   public static final ebz g = new ebz("icon.png");
   public static final ebz h = new ebz("session.lock");
   public static final ebz i = new ebz("generated");
   public static final ebz j = new ebz("datapacks");
   public static final ebz k = new ebz("resources.zip");
   public static final ebz l = new ebz(".");
   private final String m;

   private ebz(String $$0) {
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
