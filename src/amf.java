public record amf(aus a, alr b, jm<alp> c, ezn d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
