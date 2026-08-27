import jdk.jfr.consumer.RecordedEvent;

public record blp(double a, double b, double c) {
   public static blp a(RecordedEvent $$0) {
      return new blp((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
