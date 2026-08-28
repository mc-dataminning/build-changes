import jdk.jfr.consumer.RecordedEvent;

public record boc(double a, double b, double c) {
   public static boc a(RecordedEvent $$0) {
      return new boc((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
