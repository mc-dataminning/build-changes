public class exz {
   public static final exz a = new exz("advancements");
   public static final exz b = new exz("stats");
   public static final exz c = new exz("playerdata");
   public static final exz d = new exz("players");
   public static final exz e = new exz("level.dat");
   public static final exz f = new exz("level.dat_old");
   public static final exz g = new exz("icon.png");
   public static final exz h = new exz("session.lock");
   public static final exz i = new exz("generated");
   public static final exz j = new exz("datapacks");
   public static final exz k = new exz("resources.zip");
   public static final exz l = new exz(".");
   private final String m;

   private exz(String $$0) {
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
