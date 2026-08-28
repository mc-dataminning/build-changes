public record amf(aus a, alr b, jl<alp> c, eyt d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
