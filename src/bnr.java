import jdk.jfr.consumer.RecordedEvent;

public record bnr(double a, double b, double c) {
   public static bnr a(RecordedEvent $$0) {
      return new bnr((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
