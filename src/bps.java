import jdk.jfr.consumer.RecordedEvent;

public record bps(double a, double b, double c) {
   public static bps a(RecordedEvent $$0) {
      return new bps((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
