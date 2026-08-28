public class epw {
   public static final epw a = new epw("advancements");
   public static final epw b = new epw("stats");
   public static final epw c = new epw("playerdata");
   public static final epw d = new epw("players");
   public static final epw e = new epw("level.dat");
   public static final epw f = new epw("level.dat_old");
   public static final epw g = new epw("icon.png");
   public static final epw h = new epw("session.lock");
   public static final epw i = new epw("generated");
   public static final epw j = new epw("datapacks");
   public static final epw k = new epw("resources.zip");
   public static final epw l = new epw(".");
   private final String m;

   private epw(String $$0) {
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
