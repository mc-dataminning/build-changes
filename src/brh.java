import jdk.jfr.consumer.RecordedEvent;

public record brh(double a, double b, double c) {
   public static brh a(RecordedEvent $$0) {
      return new brh((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
