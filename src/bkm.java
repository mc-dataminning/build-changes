import jdk.jfr.consumer.RecordedEvent;

public record bkm(double a, double b, double c) {
   public static bkm a(RecordedEvent $$0) {
      return new bkm((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
