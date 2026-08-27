public class egd {
   public static final egd a = new egd("advancements");
   public static final egd b = new egd("stats");
   public static final egd c = new egd("playerdata");
   public static final egd d = new egd("players");
   public static final egd e = new egd("level.dat");
   public static final egd f = new egd("level.dat_old");
   public static final egd g = new egd("icon.png");
   public static final egd h = new egd("session.lock");
   public static final egd i = new egd("generated");
   public static final egd j = new egd("datapacks");
   public static final egd k = new egd("resources.zip");
   public static final egd l = new egd(".");
   private final String m;

   private egd(String $$0) {
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
