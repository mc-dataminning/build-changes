public class eyl {
   public static final eyl a = new eyl("advancements");
   public static final eyl b = new eyl("stats");
   public static final eyl c = new eyl("playerdata");
   public static final eyl d = new eyl("players");
   public static final eyl e = new eyl("level.dat");
   public static final eyl f = new eyl("level.dat_old");
   public static final eyl g = new eyl("icon.png");
   public static final eyl h = new eyl("session.lock");
   public static final eyl i = new eyl("generated");
   public static final eyl j = new eyl("datapacks");
   public static final eyl k = new eyl("resources.zip");
   public static final eyl l = new eyl(".");
   private final String m;

   private eyl(String $$0) {
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
