public interface arr {
   int a();

   String b();

   default tf d() {
      return tf.c(this.b());
   }
}
