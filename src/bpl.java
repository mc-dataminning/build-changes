import jdk.jfr.consumer.RecordedEvent;

public record bpl(double a, double b, double c) {
   public static bpl a(RecordedEvent $$0) {
      return new bpl((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
