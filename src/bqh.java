import jdk.jfr.consumer.RecordedEvent;

public record bqh(double a, double b, double c) {
   public static bqh a(RecordedEvent $$0) {
      return new bqh((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
