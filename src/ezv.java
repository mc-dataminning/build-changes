public class ezv {
   public static final ezv a = new ezv("advancements");
   public static final ezv b = new ezv("stats");
   public static final ezv c = new ezv("playerdata");
   public static final ezv d = new ezv("players");
   public static final ezv e = new ezv("level.dat");
   public static final ezv f = new ezv("level.dat_old");
   public static final ezv g = new ezv("icon.png");
   public static final ezv h = new ezv("session.lock");
   public static final ezv i = new ezv("generated");
   public static final ezv j = new ezv("datapacks");
   public static final ezv k = new ezv("resources.zip");
   public static final ezv l = new ezv(".");
   private final String m;

   private ezv(String $$0) {
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
