public record amq(ave a, amc b, jn<ama> c, fan d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
