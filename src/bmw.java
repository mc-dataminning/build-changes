import jdk.jfr.consumer.RecordedEvent;

public record bmw(double a, double b, double c) {
   public static bmw a(RecordedEvent $$0) {
      return new bmw((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
