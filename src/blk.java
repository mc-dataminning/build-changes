public record blk<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> blk<T> a(String $$0) {
      return new blk<>($$0);
   }
}
