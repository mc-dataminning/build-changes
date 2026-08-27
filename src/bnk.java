import jdk.jfr.consumer.RecordedEvent;

public record bnk(double a, double b, double c) {
   public static bnk a(RecordedEvent $$0) {
      return new bnk((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
