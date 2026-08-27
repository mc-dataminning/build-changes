import jdk.jfr.consumer.RecordedEvent;

public record bhg(double a, double b, double c) {
   public static bhg a(RecordedEvent $$0) {
      return new bhg((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
