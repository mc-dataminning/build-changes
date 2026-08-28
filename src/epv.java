public class epv {
   public static final epv a = new epv("advancements");
   public static final epv b = new epv("stats");
   public static final epv c = new epv("playerdata");
   public static final epv d = new epv("players");
   public static final epv e = new epv("level.dat");
   public static final epv f = new epv("level.dat_old");
   public static final epv g = new epv("icon.png");
   public static final epv h = new epv("session.lock");
   public static final epv i = new epv("generated");
   public static final epv j = new epv("datapacks");
   public static final epv k = new epv("resources.zip");
   public static final epv l = new epv(".");
   private final String m;

   private epv(String $$0) {
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
