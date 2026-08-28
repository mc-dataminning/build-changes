public record aly(aub a, alm b, jp<alk> c, epx d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
