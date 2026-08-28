public record alp(atu a, alc b, jt<ala> c, erl d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
