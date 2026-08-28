public class epu {
   public static final epu a = new epu("advancements");
   public static final epu b = new epu("stats");
   public static final epu c = new epu("playerdata");
   public static final epu d = new epu("players");
   public static final epu e = new epu("level.dat");
   public static final epu f = new epu("level.dat_old");
   public static final epu g = new epu("icon.png");
   public static final epu h = new epu("session.lock");
   public static final epu i = new epu("generated");
   public static final epu j = new epu("datapacks");
   public static final epu k = new epu("resources.zip");
   public static final epu l = new epu(".");
   private final String m;

   private epu(String $$0) {
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
