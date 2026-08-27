import jdk.jfr.consumer.RecordedEvent;

public record bkn(double a, double b, double c) {
   public static bkn a(RecordedEvent $$0) {
      return new bkn((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
