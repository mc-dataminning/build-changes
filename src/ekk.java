public class ekk {
   public static final ekk a = new ekk("advancements");
   public static final ekk b = new ekk("stats");
   public static final ekk c = new ekk("playerdata");
   public static final ekk d = new ekk("players");
   public static final ekk e = new ekk("level.dat");
   public static final ekk f = new ekk("level.dat_old");
   public static final ekk g = new ekk("icon.png");
   public static final ekk h = new ekk("session.lock");
   public static final ekk i = new ekk("generated");
   public static final ekk j = new ekk("datapacks");
   public static final ekk k = new ekk("resources.zip");
   public static final ekk l = new ekk(".");
   private final String m;

   private ekk(String $$0) {
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
