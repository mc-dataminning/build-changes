public record alk(atn a, aky b, je<akw> c, epd d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
