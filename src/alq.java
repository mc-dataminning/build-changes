public record alq(att a, ale b, jh<alc> c, erl d) implements AutoCloseable {
   @Override
   public void close() {
      this.a.close();
   }
}
