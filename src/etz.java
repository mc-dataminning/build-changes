public class etz {
   public static final etz a = new etz("advancements");
   public static final etz b = new etz("stats");
   public static final etz c = new etz("playerdata");
   public static final etz d = new etz("players");
   public static final etz e = new etz("level.dat");
   public static final etz f = new etz("level.dat_old");
   public static final etz g = new etz("icon.png");
   public static final etz h = new etz("session.lock");
   public static final etz i = new etz("generated");
   public static final etz j = new etz("datapacks");
   public static final etz k = new etz("resources.zip");
   public static final etz l = new etz(".");
   private final String m;

   private etz(String $$0) {
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
