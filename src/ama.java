public record ama(aui a, alm b, ju<alk> c, esn d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
