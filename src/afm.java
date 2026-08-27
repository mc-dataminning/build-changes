public record afm(anc a, afb b, hl<afa> c, ecc d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
