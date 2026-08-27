import jdk.jfr.consumer.RecordedEvent;

public record bdy(double a, double b, double c) {
   public static bdy a(RecordedEvent $$0) {
      return new bdy((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
