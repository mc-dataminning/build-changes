import jdk.jfr.consumer.RecordedEvent;

public record boe(double a, double b, double c) {
   public static boe a(RecordedEvent $$0) {
      return new boe((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
