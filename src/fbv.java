public record fbv(ezn b, ezn c, ezn d) {
   public static final fbv a = new fbv(ezn.c, new ezn(0.0, 0.0, -1.0), new ezn(0.0, 1.0, 0.0));

   public ezn a() {
      return this.c.c(this.d);
   }
}
