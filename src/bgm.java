import jdk.jfr.consumer.RecordedEvent;

public record bgm(double a, double b, double c) {
   public static bgm a(RecordedEvent $$0) {
      return new bgm((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
