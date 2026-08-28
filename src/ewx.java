public class ewx {
   public static final ewx a = new ewx("advancements");
   public static final ewx b = new ewx("stats");
   public static final ewx c = new ewx("playerdata");
   public static final ewx d = new ewx("players");
   public static final ewx e = new ewx("level.dat");
   public static final ewx f = new ewx("level.dat_old");
   public static final ewx g = new ewx("icon.png");
   public static final ewx h = new ewx("session.lock");
   public static final ewx i = new ewx("generated");
   public static final ewx j = new ewx("datapacks");
   public static final ewx k = new ewx("resources.zip");
   public static final ewx l = new ewx(".");
   private final String m;

   private ewx(String $$0) {
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
