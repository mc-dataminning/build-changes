public class evt {
   public static final evt a = new evt("advancements");
   public static final evt b = new evt("stats");
   public static final evt c = new evt("playerdata");
   public static final evt d = new evt("players");
   public static final evt e = new evt("level.dat");
   public static final evt f = new evt("level.dat_old");
   public static final evt g = new evt("icon.png");
   public static final evt h = new evt("session.lock");
   public static final evt i = new evt("generated");
   public static final evt j = new evt("datapacks");
   public static final evt k = new evt("resources.zip");
   public static final evt l = new evt(".");
   private final String m;

   private evt(String $$0) {
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
