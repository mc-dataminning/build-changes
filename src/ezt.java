public class ezt {
   public static final ezt a = new ezt("advancements");
   public static final ezt b = new ezt("stats");
   public static final ezt c = new ezt("playerdata");
   public static final ezt d = new ezt("players");
   public static final ezt e = new ezt("level.dat");
   public static final ezt f = new ezt("level.dat_old");
   public static final ezt g = new ezt("icon.png");
   public static final ezt h = new ezt("session.lock");
   public static final ezt i = new ezt("generated");
   public static final ezt j = new ezt("datapacks");
   public static final ezt k = new ezt("resources.zip");
   public static final ezt l = new ezt(".");
   private final String m;

   private ezt(String $$0) {
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
