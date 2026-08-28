public class ewb {
   public static final ewb a = new ewb("advancements");
   public static final ewb b = new ewb("stats");
   public static final ewb c = new ewb("playerdata");
   public static final ewb d = new ewb("players");
   public static final ewb e = new ewb("level.dat");
   public static final ewb f = new ewb("level.dat_old");
   public static final ewb g = new ewb("icon.png");
   public static final ewb h = new ewb("session.lock");
   public static final ewb i = new ewb("generated");
   public static final ewb j = new ewb("datapacks");
   public static final ewb k = new ewb("resources.zip");
   public static final ewb l = new ewb(".");
   private final String m;

   private ewb(String $$0) {
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
