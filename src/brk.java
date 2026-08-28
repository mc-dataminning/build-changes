import jdk.jfr.consumer.RecordedEvent;

public record brk(double a, double b, double c) {
   public static brk a(RecordedEvent $$0) {
      return new brk((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
