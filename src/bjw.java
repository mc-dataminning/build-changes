import jdk.jfr.consumer.RecordedEvent;

public record bjw(double a, double b, double c) {
   public static bjw a(RecordedEvent $$0) {
      return new bjw((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
