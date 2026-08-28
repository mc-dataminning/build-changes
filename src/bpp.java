import jdk.jfr.consumer.RecordedEvent;

public record bpp(double a, double b, double c) {
   public static bpp a(RecordedEvent $$0) {
      return new bpp((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
