import jdk.jfr.consumer.RecordedEvent;

public record bbh(double a, double b, double c) {
   public static bbh a(RecordedEvent $$0) {
      return new bbh((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
