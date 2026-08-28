public class eti {
   public static final eti a = new eti("advancements");
   public static final eti b = new eti("stats");
   public static final eti c = new eti("playerdata");
   public static final eti d = new eti("players");
   public static final eti e = new eti("level.dat");
   public static final eti f = new eti("level.dat_old");
   public static final eti g = new eti("icon.png");
   public static final eti h = new eti("session.lock");
   public static final eti i = new eti("generated");
   public static final eti j = new eti("datapacks");
   public static final eti k = new eti("resources.zip");
   public static final eti l = new eti(".");
   private final String m;

   private eti(String $$0) {
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
