import jdk.jfr.consumer.RecordedEvent;

public record bnz(double a, double b, double c) {
   public static bnz a(RecordedEvent $$0) {
      return new bnz((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
