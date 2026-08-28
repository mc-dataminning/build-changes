public record alh(atk a, akv b, jq<akt> c, eqi d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
