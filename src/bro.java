import jdk.jfr.consumer.RecordedEvent;

public record bro(double a, double b, double c) {
   public static bro a(RecordedEvent $$0) {
      return new bro((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
