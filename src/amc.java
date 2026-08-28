public record amc(aup a, alo b, jz<alm> c, exf d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
