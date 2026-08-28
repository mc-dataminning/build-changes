import jdk.jfr.consumer.RecordedEvent;

public record bqq(double a, double b, double c) {
   public static bqq a(RecordedEvent $$0) {
      return new bqq((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
