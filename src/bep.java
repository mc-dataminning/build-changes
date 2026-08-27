import jdk.jfr.consumer.RecordedEvent;

public record bep(double a, double b, double c) {
   public static bep a(RecordedEvent $$0) {
      return new bep((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
