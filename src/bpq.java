import jdk.jfr.consumer.RecordedEvent;

public record bpq(double a, double b, double c) {
   public static bpq a(RecordedEvent $$0) {
      return new bpq((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
