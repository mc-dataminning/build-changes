public record alu(auf a, alg b, jy<ale> c, evk d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
