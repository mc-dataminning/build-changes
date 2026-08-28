public class epp {
   public static final epp a = new epp("advancements");
   public static final epp b = new epp("stats");
   public static final epp c = new epp("playerdata");
   public static final epp d = new epp("players");
   public static final epp e = new epp("level.dat");
   public static final epp f = new epp("level.dat_old");
   public static final epp g = new epp("icon.png");
   public static final epp h = new epp("session.lock");
   public static final epp i = new epp("generated");
   public static final epp j = new epp("datapacks");
   public static final epp k = new epp("resources.zip");
   public static final epp l = new epp(".");
   private final String m;

   private epp(String $$0) {
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
