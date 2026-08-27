public class eiq {
   public static final eiq a = new eiq("advancements");
   public static final eiq b = new eiq("stats");
   public static final eiq c = new eiq("playerdata");
   public static final eiq d = new eiq("players");
   public static final eiq e = new eiq("level.dat");
   public static final eiq f = new eiq("level.dat_old");
   public static final eiq g = new eiq("icon.png");
   public static final eiq h = new eiq("session.lock");
   public static final eiq i = new eiq("generated");
   public static final eiq j = new eiq("datapacks");
   public static final eiq k = new eiq("resources.zip");
   public static final eiq l = new eiq(".");
   private final String m;

   private eiq(String $$0) {
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
