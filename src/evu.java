public record evu(etp b, etp c, etp d) {
   public static final evu a = new evu(etp.b, new etp(0.0, 0.0, -1.0), new etp(0.0, 1.0, 0.0));

   public etp a() {
      return this.c.c(this.d);
   }
}
