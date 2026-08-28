public class ezf {
   public static final ezf a = new ezf("advancements");
   public static final ezf b = new ezf("stats");
   public static final ezf c = new ezf("playerdata");
   public static final ezf d = new ezf("players");
   public static final ezf e = new ezf("level.dat");
   public static final ezf f = new ezf("level.dat_old");
   public static final ezf g = new ezf("icon.png");
   public static final ezf h = new ezf("session.lock");
   public static final ezf i = new ezf("generated");
   public static final ezf j = new ezf("datapacks");
   public static final ezf k = new ezf("resources.zip");
   public static final ezf l = new ezf(".");
   private final String m;

   private ezf(String $$0) {
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
