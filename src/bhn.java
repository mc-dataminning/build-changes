import jdk.jfr.consumer.RecordedEvent;

public record bhn(double a, double b, double c) {
   public static bhn a(RecordedEvent $$0) {
      return new bhn((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
