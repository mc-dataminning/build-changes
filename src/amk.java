public record amk(aut a, alw b, jx<alu> c, eua d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
