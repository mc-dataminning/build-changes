public class ebu {
   public static final ebu a = new ebu("advancements");
   public static final ebu b = new ebu("stats");
   public static final ebu c = new ebu("playerdata");
   public static final ebu d = new ebu("players");
   public static final ebu e = new ebu("level.dat");
   public static final ebu f = new ebu("level.dat_old");
   public static final ebu g = new ebu("icon.png");
   public static final ebu h = new ebu("session.lock");
   public static final ebu i = new ebu("generated");
   public static final ebu j = new ebu("datapacks");
   public static final ebu k = new ebu("resources.zip");
   public static final ebu l = new ebu(".");
   private final String m;

   private ebu(String $$0) {
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
