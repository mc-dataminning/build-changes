import jdk.jfr.consumer.RecordedEvent;

public record brz(double a, double b, double c) {
   public static brz a(RecordedEvent $$0) {
      return new brz((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
