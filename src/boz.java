import jdk.jfr.consumer.RecordedEvent;

public record boz(double a, double b, double c) {
   public static boz a(RecordedEvent $$0) {
      return new boz((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
