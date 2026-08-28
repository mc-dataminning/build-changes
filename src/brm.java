import jdk.jfr.consumer.RecordedEvent;

public record brm(double a, double b, double c) {
   public static brm a(RecordedEvent $$0) {
      return new brm((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
