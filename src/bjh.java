import jdk.jfr.consumer.RecordedEvent;

public record bjh(double a, double b, double c) {
   public static bjh a(RecordedEvent $$0) {
      return new bjh((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
