import jdk.jfr.consumer.RecordedEvent;

public record bee(double a, double b, double c) {
   public static bee a(RecordedEvent $$0) {
      return new bee((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
