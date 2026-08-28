public class erb {
   public static final erb a = new erb("advancements");
   public static final erb b = new erb("stats");
   public static final erb c = new erb("playerdata");
   public static final erb d = new erb("players");
   public static final erb e = new erb("level.dat");
   public static final erb f = new erb("level.dat_old");
   public static final erb g = new erb("icon.png");
   public static final erb h = new erb("session.lock");
   public static final erb i = new erb("generated");
   public static final erb j = new erb("datapacks");
   public static final erb k = new erb("resources.zip");
   public static final erb l = new erb(".");
   private final String m;

   private erb(String $$0) {
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
