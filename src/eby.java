public class eby {
   public static final eby a = new eby("advancements");
   public static final eby b = new eby("stats");
   public static final eby c = new eby("playerdata");
   public static final eby d = new eby("players");
   public static final eby e = new eby("level.dat");
   public static final eby f = new eby("level.dat_old");
   public static final eby g = new eby("icon.png");
   public static final eby h = new eby("session.lock");
   public static final eby i = new eby("generated");
   public static final eby j = new eby("datapacks");
   public static final eby k = new eby("resources.zip");
   public static final eby l = new eby(".");
   private final String m;

   private eby(String $$0) {
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
