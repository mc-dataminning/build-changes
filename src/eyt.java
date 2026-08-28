public class eyt {
   public static final eyt a = new eyt("advancements");
   public static final eyt b = new eyt("stats");
   public static final eyt c = new eyt("playerdata");
   public static final eyt d = new eyt("players");
   public static final eyt e = new eyt("level.dat");
   public static final eyt f = new eyt("level.dat_old");
   public static final eyt g = new eyt("icon.png");
   public static final eyt h = new eyt("session.lock");
   public static final eyt i = new eyt("generated");
   public static final eyt j = new eyt("datapacks");
   public static final eyt k = new eyt("resources.zip");
   public static final eyt l = new eyt(".");
   private final String m;

   private eyt(String $$0) {
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
