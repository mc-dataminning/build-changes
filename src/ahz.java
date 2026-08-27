public record ahz(aps a, ahn b, io<ahm> c, egl d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
