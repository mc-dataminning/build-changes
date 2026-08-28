public class ept {
   public static final ept a = new ept("advancements");
   public static final ept b = new ept("stats");
   public static final ept c = new ept("playerdata");
   public static final ept d = new ept("players");
   public static final ept e = new ept("level.dat");
   public static final ept f = new ept("level.dat_old");
   public static final ept g = new ept("icon.png");
   public static final ept h = new ept("session.lock");
   public static final ept i = new ept("generated");
   public static final ept j = new ept("datapacks");
   public static final ept k = new ept("resources.zip");
   public static final ept l = new ept(".");
   private final String m;

   private ept(String $$0) {
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
