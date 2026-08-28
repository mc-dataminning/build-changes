public class eps {
   public static final eps a = new eps("advancements");
   public static final eps b = new eps("stats");
   public static final eps c = new eps("playerdata");
   public static final eps d = new eps("players");
   public static final eps e = new eps("level.dat");
   public static final eps f = new eps("level.dat_old");
   public static final eps g = new eps("icon.png");
   public static final eps h = new eps("session.lock");
   public static final eps i = new eps("generated");
   public static final eps j = new eps("datapacks");
   public static final eps k = new eps("resources.zip");
   public static final eps l = new eps(".");
   private final String m;

   private eps(String $$0) {
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
