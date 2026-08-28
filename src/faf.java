public class faf {
   public static final faf a = new faf("advancements");
   public static final faf b = new faf("stats");
   public static final faf c = new faf("playerdata");
   public static final faf d = new faf("players");
   public static final faf e = new faf("level.dat");
   public static final faf f = new faf("level.dat_old");
   public static final faf g = new faf("icon.png");
   public static final faf h = new faf("session.lock");
   public static final faf i = new faf("generated");
   public static final faf j = new faf("datapacks");
   public static final faf k = new faf("resources.zip");
   public static final faf l = new faf(".");
   private final String m;

   private faf(String $$0) {
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
