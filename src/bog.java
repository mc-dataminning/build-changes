import jdk.jfr.consumer.RecordedEvent;

public record bog(double a, double b, double c) {
   public static bog a(RecordedEvent $$0) {
      return new bog((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
