public record fbn(ezh b, ezh c, ezh d) {
   public static final fbn a = new fbn(ezh.c, new ezh(0.0, 0.0, -1.0), new ezh(0.0, 1.0, 0.0));

   public ezh a() {
      return this.c.c(this.d);
   }
}
