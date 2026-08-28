import jdk.jfr.consumer.RecordedEvent;

public record bnn(double a, double b, double c) {
   public static bnn a(RecordedEvent $$0) {
      return new bnn((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
