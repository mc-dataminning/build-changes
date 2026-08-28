public class epw extends RuntimeException {
   private final xp a;

   public epw(xp $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public xp a() {
      return this.a;
   }
}
