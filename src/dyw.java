public class dyw {
   public static final dyw a = new dyw("advancements");
   public static final dyw b = new dyw("stats");
   public static final dyw c = new dyw("playerdata");
   public static final dyw d = new dyw("players");
   public static final dyw e = new dyw("level.dat");
   public static final dyw f = new dyw("level.dat_old");
   public static final dyw g = new dyw("icon.png");
   public static final dyw h = new dyw("session.lock");
   public static final dyw i = new dyw("generated");
   public static final dyw j = new dyw("datapacks");
   public static final dyw k = new dyw("resources.zip");
   public static final dyw l = new dyw(".");
   private final String m;

   private dyw(String $$0) {
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
