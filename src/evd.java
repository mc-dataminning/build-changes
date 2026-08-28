public class evd {
   public static final evd a = new evd("advancements");
   public static final evd b = new evd("stats");
   public static final evd c = new evd("playerdata");
   public static final evd d = new evd("players");
   public static final evd e = new evd("level.dat");
   public static final evd f = new evd("level.dat_old");
   public static final evd g = new evd("icon.png");
   public static final evd h = new evd("session.lock");
   public static final evd i = new evd("generated");
   public static final evd j = new evd("datapacks");
   public static final evd k = new evd("resources.zip");
   public static final evd l = new evd(".");
   private final String m;

   private evd(String $$0) {
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
