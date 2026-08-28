public record alt(auf a, alf b, jy<ald> c, evl d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
