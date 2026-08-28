public record alt(auf a, alf b, jy<ald> c, ewi d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
