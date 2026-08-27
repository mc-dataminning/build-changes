public class eot {
   public static final eot a = new eot("advancements");
   public static final eot b = new eot("stats");
   public static final eot c = new eot("playerdata");
   public static final eot d = new eot("players");
   public static final eot e = new eot("level.dat");
   public static final eot f = new eot("level.dat_old");
   public static final eot g = new eot("icon.png");
   public static final eot h = new eot("session.lock");
   public static final eot i = new eot("generated");
   public static final eot j = new eot("datapacks");
   public static final eot k = new eot("resources.zip");
   public static final eot l = new eot(".");
   private final String m;

   private eot(String $$0) {
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
