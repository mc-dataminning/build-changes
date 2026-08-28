import jdk.jfr.consumer.RecordedEvent;

public record bqz(double a, double b, double c) {
   public static bqz a(RecordedEvent $$0) {
      return new bqz((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
