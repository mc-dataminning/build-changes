public class evc {
   public static final evc a = new evc("advancements");
   public static final evc b = new evc("stats");
   public static final evc c = new evc("playerdata");
   public static final evc d = new evc("players");
   public static final evc e = new evc("level.dat");
   public static final evc f = new evc("level.dat_old");
   public static final evc g = new evc("icon.png");
   public static final evc h = new evc("session.lock");
   public static final evc i = new evc("generated");
   public static final evc j = new evc("datapacks");
   public static final evc k = new evc("resources.zip");
   public static final evc l = new evc(".");
   private final String m;

   private evc(String $$0) {
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
