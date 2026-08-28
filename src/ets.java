public class ets {
   public static final ets a = new ets("advancements");
   public static final ets b = new ets("stats");
   public static final ets c = new ets("playerdata");
   public static final ets d = new ets("players");
   public static final ets e = new ets("level.dat");
   public static final ets f = new ets("level.dat_old");
   public static final ets g = new ets("icon.png");
   public static final ets h = new ets("session.lock");
   public static final ets i = new ets("generated");
   public static final ets j = new ets("datapacks");
   public static final ets k = new ets("resources.zip");
   public static final ets l = new ets(".");
   private final String m;

   private ets(String $$0) {
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
