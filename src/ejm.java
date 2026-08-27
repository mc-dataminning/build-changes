public class ejm {
   public static final ejm a = new ejm("advancements");
   public static final ejm b = new ejm("stats");
   public static final ejm c = new ejm("playerdata");
   public static final ejm d = new ejm("players");
   public static final ejm e = new ejm("level.dat");
   public static final ejm f = new ejm("level.dat_old");
   public static final ejm g = new ejm("icon.png");
   public static final ejm h = new ejm("session.lock");
   public static final ejm i = new ejm("generated");
   public static final ejm j = new ejm("datapacks");
   public static final ejm k = new ejm("resources.zip");
   public static final ejm l = new ejm(".");
   private final String m;

   private ejm(String $$0) {
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
