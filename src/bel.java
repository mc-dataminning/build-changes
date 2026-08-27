import jdk.jfr.consumer.RecordedEvent;

public record bel(double a, double b, double c) {
   public static bel a(RecordedEvent $$0) {
      return new bel((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
