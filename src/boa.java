import jdk.jfr.consumer.RecordedEvent;

public record boa(double a, double b, double c) {
   public static boa a(RecordedEvent $$0) {
      return new boa((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
