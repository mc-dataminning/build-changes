public class ece {
   public static final ece a = new ece("advancements");
   public static final ece b = new ece("stats");
   public static final ece c = new ece("playerdata");
   public static final ece d = new ece("players");
   public static final ece e = new ece("level.dat");
   public static final ece f = new ece("level.dat_old");
   public static final ece g = new ece("icon.png");
   public static final ece h = new ece("session.lock");
   public static final ece i = new ece("generated");
   public static final ece j = new ece("datapacks");
   public static final ece k = new ece("resources.zip");
   public static final ece l = new ece(".");
   private final String m;

   private ece(String $$0) {
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
