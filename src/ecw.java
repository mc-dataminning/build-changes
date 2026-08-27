public class ecw {
   public static final ecw a = new ecw("advancements");
   public static final ecw b = new ecw("stats");
   public static final ecw c = new ecw("playerdata");
   public static final ecw d = new ecw("players");
   public static final ecw e = new ecw("level.dat");
   public static final ecw f = new ecw("level.dat_old");
   public static final ecw g = new ecw("icon.png");
   public static final ecw h = new ecw("session.lock");
   public static final ecw i = new ecw("generated");
   public static final ecw j = new ecw("datapacks");
   public static final ecw k = new ecw("resources.zip");
   public static final ecw l = new ecw(".");
   private final String m;

   private ecw(String $$0) {
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
