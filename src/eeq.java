public class eeq {
   public static final eeq a = new eeq("advancements");
   public static final eeq b = new eeq("stats");
   public static final eeq c = new eeq("playerdata");
   public static final eeq d = new eeq("players");
   public static final eeq e = new eeq("level.dat");
   public static final eeq f = new eeq("level.dat_old");
   public static final eeq g = new eeq("icon.png");
   public static final eeq h = new eeq("session.lock");
   public static final eeq i = new eeq("generated");
   public static final eeq j = new eeq("datapacks");
   public static final eeq k = new eeq("resources.zip");
   public static final eeq l = new eeq(".");
   private final String m;

   private eeq(String $$0) {
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
