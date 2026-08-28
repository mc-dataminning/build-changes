import jdk.jfr.consumer.RecordedEvent;

public record bof(double a, double b, double c) {
   public static bof a(RecordedEvent $$0) {
      return new bof((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
