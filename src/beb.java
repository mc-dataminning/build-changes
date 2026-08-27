import jdk.jfr.consumer.RecordedEvent;

public record beb(double a, double b, double c) {
   public static beb a(RecordedEvent $$0) {
      return new beb((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
