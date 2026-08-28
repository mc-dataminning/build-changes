public record amb(auj a, aln b, ju<all> c, etb d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
