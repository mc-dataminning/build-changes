public record amb(aue a, alp b, jp<aln> c, eqa d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
