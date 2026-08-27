import jdk.jfr.consumer.RecordedEvent;

public record bfm(double a, double b, double c) {
   public static bfm a(RecordedEvent $$0) {
      return new bfm((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
