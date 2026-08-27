public record akp(ass a, akd b, is<akc> c, emx d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
