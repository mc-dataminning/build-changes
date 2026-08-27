import jdk.jfr.consumer.RecordedEvent;

public record bgi(double a, double b, double c) {
   public static bgi a(RecordedEvent $$0) {
      return new bgi((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
