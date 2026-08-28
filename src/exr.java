public record exr(evm b, evm c, evm d) {
   public static final exr a = new exr(evm.b, new evm(0.0, 0.0, -1.0), new evm(0.0, 1.0, 0.0));

   public evm a() {
      return this.c.c(this.d);
   }
}
