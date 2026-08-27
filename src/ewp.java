public record ewp(euk b, euk c, euk d) {
   public static final ewp a = new ewp(euk.b, new euk(0.0, 0.0, -1.0), new euk(0.0, 1.0, 0.0));

   public euk a() {
      return this.c.c(this.d);
   }
}
