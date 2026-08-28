public record alu(auf a, alg b, jy<ale> c, evm d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
