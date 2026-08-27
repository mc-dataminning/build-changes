public record afs(ank a, afh b, hn<afg> c, ecm d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
