public class eto {
   public static final eto a = new eto("advancements");
   public static final eto b = new eto("stats");
   public static final eto c = new eto("playerdata");
   public static final eto d = new eto("players");
   public static final eto e = new eto("level.dat");
   public static final eto f = new eto("level.dat_old");
   public static final eto g = new eto("icon.png");
   public static final eto h = new eto("session.lock");
   public static final eto i = new eto("generated");
   public static final eto j = new eto("datapacks");
   public static final eto k = new eto("resources.zip");
   public static final eto l = new eto(".");
   private final String m;

   private eto(String $$0) {
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
