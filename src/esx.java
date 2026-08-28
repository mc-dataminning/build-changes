public class esx {
   public static final esx a = new esx("advancements");
   public static final esx b = new esx("stats");
   public static final esx c = new esx("playerdata");
   public static final esx d = new esx("players");
   public static final esx e = new esx("level.dat");
   public static final esx f = new esx("level.dat_old");
   public static final esx g = new esx("icon.png");
   public static final esx h = new esx("session.lock");
   public static final esx i = new esx("generated");
   public static final esx j = new esx("datapacks");
   public static final esx k = new esx("resources.zip");
   public static final esx l = new esx(".");
   private final String m;

   private esx(String $$0) {
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
