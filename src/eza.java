public class eza {
   public static final eza a = new eza("advancements");
   public static final eza b = new eza("stats");
   public static final eza c = new eza("playerdata");
   public static final eza d = new eza("players");
   public static final eza e = new eza("level.dat");
   public static final eza f = new eza("level.dat_old");
   public static final eza g = new eza("icon.png");
   public static final eza h = new eza("session.lock");
   public static final eza i = new eza("generated");
   public static final eza j = new eza("datapacks");
   public static final eza k = new eza("resources.zip");
   public static final eza l = new eza(".");
   private final String m;

   private eza(String $$0) {
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
