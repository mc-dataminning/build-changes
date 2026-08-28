import jdk.jfr.consumer.RecordedEvent;

public record bsk(double a, double b, double c) {
   public static bsk a(RecordedEvent $$0) {
      return new bsk((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
