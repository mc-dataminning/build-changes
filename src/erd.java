public class erd {
   public static final erd a = new erd("advancements");
   public static final erd b = new erd("stats");
   public static final erd c = new erd("playerdata");
   public static final erd d = new erd("players");
   public static final erd e = new erd("level.dat");
   public static final erd f = new erd("level.dat_old");
   public static final erd g = new erd("icon.png");
   public static final erd h = new erd("session.lock");
   public static final erd i = new erd("generated");
   public static final erd j = new erd("datapacks");
   public static final erd k = new erd("resources.zip");
   public static final erd l = new erd(".");
   private final String m;

   private erd(String $$0) {
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
