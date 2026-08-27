public class enz {
   public static final enz a = new enz("advancements");
   public static final enz b = new enz("stats");
   public static final enz c = new enz("playerdata");
   public static final enz d = new enz("players");
   public static final enz e = new enz("level.dat");
   public static final enz f = new enz("level.dat_old");
   public static final enz g = new enz("icon.png");
   public static final enz h = new enz("session.lock");
   public static final enz i = new enz("generated");
   public static final enz j = new enz("datapacks");
   public static final enz k = new enz("resources.zip");
   public static final enz l = new enz(".");
   private final String m;

   private enz(String $$0) {
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
