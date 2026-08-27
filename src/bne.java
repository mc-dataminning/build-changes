import jdk.jfr.consumer.RecordedEvent;

public record bne(double a, double b, double c) {
   public static bne a(RecordedEvent $$0) {
      return new bne((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
