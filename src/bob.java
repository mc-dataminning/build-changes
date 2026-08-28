import jdk.jfr.consumer.RecordedEvent;

public record bob(double a, double b, double c) {
   public static bob a(RecordedEvent $$0) {
      return new bob((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
