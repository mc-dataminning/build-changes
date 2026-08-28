public class eqa {
   public static final eqa a = new eqa("advancements");
   public static final eqa b = new eqa("stats");
   public static final eqa c = new eqa("playerdata");
   public static final eqa d = new eqa("players");
   public static final eqa e = new eqa("level.dat");
   public static final eqa f = new eqa("level.dat_old");
   public static final eqa g = new eqa("icon.png");
   public static final eqa h = new eqa("session.lock");
   public static final eqa i = new eqa("generated");
   public static final eqa j = new eqa("datapacks");
   public static final eqa k = new eqa("resources.zip");
   public static final eqa l = new eqa(".");
   private final String m;

   private eqa(String $$0) {
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
