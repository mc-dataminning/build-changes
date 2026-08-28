import jdk.jfr.consumer.RecordedEvent;

public record bpr(double a, double b, double c) {
   public static bpr a(RecordedEvent $$0) {
      return new bpr((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
