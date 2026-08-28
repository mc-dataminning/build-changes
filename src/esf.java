public class esf {
   public static final esf a = new esf("advancements");
   public static final esf b = new esf("stats");
   public static final esf c = new esf("playerdata");
   public static final esf d = new esf("players");
   public static final esf e = new esf("level.dat");
   public static final esf f = new esf("level.dat_old");
   public static final esf g = new esf("icon.png");
   public static final esf h = new esf("session.lock");
   public static final esf i = new esf("generated");
   public static final esf j = new esf("datapacks");
   public static final esf k = new esf("resources.zip");
   public static final esf l = new esf(".");
   private final String m;

   private esf(String $$0) {
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
