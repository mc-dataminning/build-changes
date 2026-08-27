import jdk.jfr.consumer.RecordedEvent;

public record bma(double a, double b, double c) {
   public static bma a(RecordedEvent $$0) {
      return new bma((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
