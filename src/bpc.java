import jdk.jfr.consumer.RecordedEvent;

public record bpc(double a, double b, double c) {
   public static bpc a(RecordedEvent $$0) {
      return new bpc((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
