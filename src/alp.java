public record alp(atu a, alc b, jt<ala> c, erj d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
