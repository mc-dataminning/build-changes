import jdk.jfr.consumer.RecordedEvent;

public record bqr(double a, double b, double c) {
   public static bqr a(RecordedEvent $$0) {
      return new bqr((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
