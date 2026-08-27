public class egt {
   public static final egt a = new egt("advancements");
   public static final egt b = new egt("stats");
   public static final egt c = new egt("playerdata");
   public static final egt d = new egt("players");
   public static final egt e = new egt("level.dat");
   public static final egt f = new egt("level.dat_old");
   public static final egt g = new egt("icon.png");
   public static final egt h = new egt("session.lock");
   public static final egt i = new egt("generated");
   public static final egt j = new egt("datapacks");
   public static final egt k = new egt("resources.zip");
   public static final egt l = new egt(".");
   private final String m;

   private egt(String $$0) {
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
