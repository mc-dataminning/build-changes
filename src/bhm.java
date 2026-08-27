import jdk.jfr.consumer.RecordedEvent;

public record bhm(double a, double b, double c) {
   public static bhm a(RecordedEvent $$0) {
      return new bhm((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
