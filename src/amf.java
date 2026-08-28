public record amf(aus a, alr b, jm<alp> c, ezi d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
