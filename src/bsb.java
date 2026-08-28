import jdk.jfr.consumer.RecordedEvent;

public record bsb(double a, double b, double c) {
   public static bsb a(RecordedEvent $$0) {
      return new bsb((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
