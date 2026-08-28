import jdk.jfr.consumer.RecordedEvent;

public record bod(double a, double b, double c) {
   public static bod a(RecordedEvent $$0) {
      return new bod((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
