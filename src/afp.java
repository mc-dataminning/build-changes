public record afp(anf a, afe b, hn<afd> c, ech d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
