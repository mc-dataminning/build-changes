public record aft(anl a, afi b, hn<afh> c, eco d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
