import jdk.jfr.consumer.RecordedEvent;

public record bpg(double a, double b, double c) {
   public static bpg a(RecordedEvent $$0) {
      return new bpg((double)$$0.getFloat("jvmSystem"), (double)$$0.getFloat("jvmUser"), (double)$$0.getFloat("machineTotal"));
   }
}
