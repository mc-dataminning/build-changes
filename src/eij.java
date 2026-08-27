public class eij {
   public static final eij a = new eij("advancements");
   public static final eij b = new eij("stats");
   public static final eij c = new eij("playerdata");
   public static final eij d = new eij("players");
   public static final eij e = new eij("level.dat");
   public static final eij f = new eij("level.dat_old");
   public static final eij g = new eij("icon.png");
   public static final eij h = new eij("session.lock");
   public static final eij i = new eij("generated");
   public static final eij j = new eij("datapacks");
   public static final eij k = new eij("resources.zip");
   public static final eij l = new eij(".");
   private final String m;

   private eij(String $$0) {
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
