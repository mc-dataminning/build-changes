public class eel {
   public static final eel a = new eel("advancements");
   public static final eel b = new eel("stats");
   public static final eel c = new eel("playerdata");
   public static final eel d = new eel("players");
   public static final eel e = new eel("level.dat");
   public static final eel f = new eel("level.dat_old");
   public static final eel g = new eel("icon.png");
   public static final eel h = new eel("session.lock");
   public static final eel i = new eel("generated");
   public static final eel j = new eel("datapacks");
   public static final eel k = new eel("resources.zip");
   public static final eel l = new eel(".");
   private final String m;

   private eel(String $$0) {
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
