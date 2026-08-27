import jdk.jfr.consumer.RecordedEvent;

public record bgw(double a, double b, double c) {
   public static bgw a(RecordedEvent $$0) {
      return new bgw((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
