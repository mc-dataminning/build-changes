public class ebt {
   public static final ebt a = new ebt("advancements");
   public static final ebt b = new ebt("stats");
   public static final ebt c = new ebt("playerdata");
   public static final ebt d = new ebt("players");
   public static final ebt e = new ebt("level.dat");
   public static final ebt f = new ebt("level.dat_old");
   public static final ebt g = new ebt("icon.png");
   public static final ebt h = new ebt("session.lock");
   public static final ebt i = new ebt("generated");
   public static final ebt j = new ebt("datapacks");
   public static final ebt k = new ebt("resources.zip");
   public static final ebt l = new ebt(".");
   private final String m;

   private ebt(String $$0) {
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
