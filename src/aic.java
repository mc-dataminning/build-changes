public record aic(apy a, ahq b, io<ahp> c, egs d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
