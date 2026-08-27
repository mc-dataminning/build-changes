public class egk {
   public static final egk a = new egk("advancements");
   public static final egk b = new egk("stats");
   public static final egk c = new egk("playerdata");
   public static final egk d = new egk("players");
   public static final egk e = new egk("level.dat");
   public static final egk f = new egk("level.dat_old");
   public static final egk g = new egk("icon.png");
   public static final egk h = new egk("session.lock");
   public static final egk i = new egk("generated");
   public static final egk j = new egk("datapacks");
   public static final egk k = new egk("resources.zip");
   public static final egk l = new egk(".");
   private final String m;

   private egk(String $$0) {
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
