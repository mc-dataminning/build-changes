public class ecg {
   public static final ecg a = new ecg("advancements");
   public static final ecg b = new ecg("stats");
   public static final ecg c = new ecg("playerdata");
   public static final ecg d = new ecg("players");
   public static final ecg e = new ecg("level.dat");
   public static final ecg f = new ecg("level.dat_old");
   public static final ecg g = new ecg("icon.png");
   public static final ecg h = new ecg("session.lock");
   public static final ecg i = new ecg("generated");
   public static final ecg j = new ecg("datapacks");
   public static final ecg k = new ecg("resources.zip");
   public static final ecg l = new ecg(".");
   private final String m;

   private ecg(String $$0) {
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
