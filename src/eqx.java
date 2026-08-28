public class eqx {
   public static final eqx a = new eqx("advancements");
   public static final eqx b = new eqx("stats");
   public static final eqx c = new eqx("playerdata");
   public static final eqx d = new eqx("players");
   public static final eqx e = new eqx("level.dat");
   public static final eqx f = new eqx("level.dat_old");
   public static final eqx g = new eqx("icon.png");
   public static final eqx h = new eqx("session.lock");
   public static final eqx i = new eqx("generated");
   public static final eqx j = new eqx("datapacks");
   public static final eqx k = new eqx("resources.zip");
   public static final eqx l = new eqx(".");
   private final String m;

   private eqx(String $$0) {
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
