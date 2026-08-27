public record ahp(api a, ahd b, im<ahc> c, ega d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
