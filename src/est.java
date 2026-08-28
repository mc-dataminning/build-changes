public class est {
   public static final est a = new est("advancements");
   public static final est b = new est("stats");
   public static final est c = new est("playerdata");
   public static final est d = new est("players");
   public static final est e = new est("level.dat");
   public static final est f = new est("level.dat_old");
   public static final est g = new est("icon.png");
   public static final est h = new est("session.lock");
   public static final est i = new est("generated");
   public static final est j = new est("datapacks");
   public static final est k = new est("resources.zip");
   public static final est l = new est(".");
   private final String m;

   private est(String $$0) {
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
