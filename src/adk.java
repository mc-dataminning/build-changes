public record adk(akn a, ada b, hl<acz> c, dze d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
