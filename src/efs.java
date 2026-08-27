public class efs {
   public static final efs a = new efs("advancements");
   public static final efs b = new efs("stats");
   public static final efs c = new efs("playerdata");
   public static final efs d = new efs("players");
   public static final efs e = new efs("level.dat");
   public static final efs f = new efs("level.dat_old");
   public static final efs g = new efs("icon.png");
   public static final efs h = new efs("session.lock");
   public static final efs i = new efs("generated");
   public static final efs j = new efs("datapacks");
   public static final efs k = new efs("resources.zip");
   public static final efs l = new efs(".");
   private final String m;

   private efs(String $$0) {
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
