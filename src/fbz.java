public record fbz(ezr b, ezr c, ezr d) {
   public static final fbz a = new fbz(ezr.c, new ezr(0.0, 0.0, -1.0), new ezr(0.0, 1.0, 0.0));

   public ezr a() {
      return this.c.c(this.d);
   }
}
