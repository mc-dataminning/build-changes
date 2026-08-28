public record amh(auu a, alt b, jm<alr> c, fab d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
