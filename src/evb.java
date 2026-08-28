public class evb {
   public static final evb a = new evb("advancements");
   public static final evb b = new evb("stats");
   public static final evb c = new evb("playerdata");
   public static final evb d = new evb("players");
   public static final evb e = new evb("level.dat");
   public static final evb f = new evb("level.dat_old");
   public static final evb g = new evb("icon.png");
   public static final evb h = new evb("session.lock");
   public static final evb i = new evb("generated");
   public static final evb j = new evb("datapacks");
   public static final evb k = new evb("resources.zip");
   public static final evb l = new evb(".");
   private final String m;

   private evb(String $$0) {
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
