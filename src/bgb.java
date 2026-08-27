import jdk.jfr.consumer.RecordedEvent;

public record bgb(double a, double b, double c) {
   public static bgb a(RecordedEvent $$0) {
      return new bgb((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
