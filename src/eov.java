public class eov {
   public static final eov a = new eov("advancements");
   public static final eov b = new eov("stats");
   public static final eov c = new eov("playerdata");
   public static final eov d = new eov("players");
   public static final eov e = new eov("level.dat");
   public static final eov f = new eov("level.dat_old");
   public static final eov g = new eov("icon.png");
   public static final eov h = new eov("session.lock");
   public static final eov i = new eov("generated");
   public static final eov j = new eov("datapacks");
   public static final eov k = new eov("resources.zip");
   public static final eov l = new eov(".");
   private final String m;

   private eov(String $$0) {
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
