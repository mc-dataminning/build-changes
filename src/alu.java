public record alu(auf a, alg b, jy<ale> c, evl d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
