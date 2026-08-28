public record amg(aup a, als b, jw<alq> c, etq d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
