public record amc(auf a, alq b, jp<alo> c, eqc d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
