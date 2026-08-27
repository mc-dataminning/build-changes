public class emy {
   public static final emy a = new emy("advancements");
   public static final emy b = new emy("stats");
   public static final emy c = new emy("playerdata");
   public static final emy d = new emy("players");
   public static final emy e = new emy("level.dat");
   public static final emy f = new emy("level.dat_old");
   public static final emy g = new emy("icon.png");
   public static final emy h = new emy("session.lock");
   public static final emy i = new emy("generated");
   public static final emy j = new emy("datapacks");
   public static final emy k = new emy("resources.zip");
   public static final emy l = new emy(".");
   private final String m;

   private emy(String $$0) {
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
