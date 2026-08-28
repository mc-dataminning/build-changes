public record amc(auf a, alq b, jp<alo> c, eqd d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
