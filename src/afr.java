public record afr(anj a, afg b, hl<aff> c, ecm d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
