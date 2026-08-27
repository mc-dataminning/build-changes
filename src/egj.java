public class egj {
   public static final egj a = new egj("advancements");
   public static final egj b = new egj("stats");
   public static final egj c = new egj("playerdata");
   public static final egj d = new egj("players");
   public static final egj e = new egj("level.dat");
   public static final egj f = new egj("level.dat_old");
   public static final egj g = new egj("icon.png");
   public static final egj h = new egj("session.lock");
   public static final egj i = new egj("generated");
   public static final egj j = new egj("datapacks");
   public static final egj k = new egj("resources.zip");
   public static final egj l = new egj(".");
   private final String m;

   private egj(String $$0) {
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
