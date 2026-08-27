public class ebv {
   public static final ebv a = new ebv("advancements");
   public static final ebv b = new ebv("stats");
   public static final ebv c = new ebv("playerdata");
   public static final ebv d = new ebv("players");
   public static final ebv e = new ebv("level.dat");
   public static final ebv f = new ebv("level.dat_old");
   public static final ebv g = new ebv("icon.png");
   public static final ebv h = new ebv("session.lock");
   public static final ebv i = new ebv("generated");
   public static final ebv j = new ebv("datapacks");
   public static final ebv k = new ebv("resources.zip");
   public static final ebv l = new ebv(".");
   private final String m;

   private ebv(String $$0) {
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
