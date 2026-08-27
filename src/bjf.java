import jdk.jfr.consumer.RecordedEvent;

public record bjf(double a, double b, double c) {
   public static bjf a(RecordedEvent $$0) {
      return new bjf((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
