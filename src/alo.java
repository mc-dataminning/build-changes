public record alo(att a, alb b, jt<akz> c, erf d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
