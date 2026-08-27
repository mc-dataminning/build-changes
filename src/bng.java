import jdk.jfr.consumer.RecordedEvent;

public record bng(double a, double b, double c) {
   public static bng a(RecordedEvent $$0) {
      return new bng((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
