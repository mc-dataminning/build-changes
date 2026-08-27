public class eki {
   public static final eki a = new eki("advancements");
   public static final eki b = new eki("stats");
   public static final eki c = new eki("playerdata");
   public static final eki d = new eki("players");
   public static final eki e = new eki("level.dat");
   public static final eki f = new eki("level.dat_old");
   public static final eki g = new eki("icon.png");
   public static final eki h = new eki("session.lock");
   public static final eki i = new eki("generated");
   public static final eki j = new eki("datapacks");
   public static final eki k = new eki("resources.zip");
   public static final eki l = new eki(".");
   private final String m;

   private eki(String $$0) {
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
