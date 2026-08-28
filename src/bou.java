import jdk.jfr.consumer.RecordedEvent;

public record bou(double a, double b, double c) {
   public static bou a(RecordedEvent $$0) {
      return new bou((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
