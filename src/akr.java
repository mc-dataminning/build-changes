public record akr(asu a, akf b, iu<ake> c, eng d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
