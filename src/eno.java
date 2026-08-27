public class eno {
   public static final eno a = new eno("advancements");
   public static final eno b = new eno("stats");
   public static final eno c = new eno("playerdata");
   public static final eno d = new eno("players");
   public static final eno e = new eno("level.dat");
   public static final eno f = new eno("level.dat_old");
   public static final eno g = new eno("icon.png");
   public static final eno h = new eno("session.lock");
   public static final eno i = new eno("generated");
   public static final eno j = new eno("datapacks");
   public static final eno k = new eno("resources.zip");
   public static final eno l = new eno(".");
   private final String m;

   private eno(String $$0) {
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
