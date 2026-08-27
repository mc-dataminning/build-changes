import jdk.jfr.consumer.RecordedEvent;

public record bhl(double a, double b, double c) {
   public static bhl a(RecordedEvent $$0) {
      return new bhl((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
