public class eqi {
   public static final eqi a = new eqi("advancements");
   public static final eqi b = new eqi("stats");
   public static final eqi c = new eqi("playerdata");
   public static final eqi d = new eqi("players");
   public static final eqi e = new eqi("level.dat");
   public static final eqi f = new eqi("level.dat_old");
   public static final eqi g = new eqi("icon.png");
   public static final eqi h = new eqi("session.lock");
   public static final eqi i = new eqi("generated");
   public static final eqi j = new eqi("datapacks");
   public static final eqi k = new eqi("resources.zip");
   public static final eqi l = new eqi(".");
   private final String m;

   private eqi(String $$0) {
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
