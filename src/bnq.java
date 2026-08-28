import jdk.jfr.consumer.RecordedEvent;

public record bnq(double a, double b, double c) {
   public static bnq a(RecordedEvent $$0) {
      return new bnq((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
