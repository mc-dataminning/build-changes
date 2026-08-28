public class evu {
   public static final evu a = new evu("advancements");
   public static final evu b = new evu("stats");
   public static final evu c = new evu("playerdata");
   public static final evu d = new evu("players");
   public static final evu e = new evu("level.dat");
   public static final evu f = new evu("level.dat_old");
   public static final evu g = new evu("icon.png");
   public static final evu h = new evu("session.lock");
   public static final evu i = new evu("generated");
   public static final evu j = new evu("datapacks");
   public static final evu k = new evu("resources.zip");
   public static final evu l = new evu(".");
   private final String m;

   private evu(String $$0) {
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
