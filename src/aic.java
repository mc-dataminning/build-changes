public record aic(apx a, ahq b, io<ahp> c, egr d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
