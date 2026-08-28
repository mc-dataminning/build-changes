public class eqg {
   public static final eqg a = new eqg("advancements");
   public static final eqg b = new eqg("stats");
   public static final eqg c = new eqg("playerdata");
   public static final eqg d = new eqg("players");
   public static final eqg e = new eqg("level.dat");
   public static final eqg f = new eqg("level.dat_old");
   public static final eqg g = new eqg("icon.png");
   public static final eqg h = new eqg("session.lock");
   public static final eqg i = new eqg("generated");
   public static final eqg j = new eqg("datapacks");
   public static final eqg k = new eqg("resources.zip");
   public static final eqg l = new eqg(".");
   private final String m;

   private eqg(String $$0) {
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
