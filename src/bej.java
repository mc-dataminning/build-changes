import jdk.jfr.consumer.RecordedEvent;

public record bej(double a, double b, double c) {
   public static bej a(RecordedEvent $$0) {
      return new bej((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
