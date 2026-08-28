public record amd(aul a, alp b, jv<aln> c, etf d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
