public class ewa {
   public static final ewa a = new ewa("advancements");
   public static final ewa b = new ewa("stats");
   public static final ewa c = new ewa("playerdata");
   public static final ewa d = new ewa("players");
   public static final ewa e = new ewa("level.dat");
   public static final ewa f = new ewa("level.dat_old");
   public static final ewa g = new ewa("icon.png");
   public static final ewa h = new ewa("session.lock");
   public static final ewa i = new ewa("generated");
   public static final ewa j = new ewa("datapacks");
   public static final ewa k = new ewa("resources.zip");
   public static final ewa l = new ewa(".");
   private final String m;

   private ewa(String $$0) {
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
