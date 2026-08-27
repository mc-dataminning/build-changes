public class dv extends Exception {
   private final tm a;

   public dv(tm $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public tm a() {
      return this.a;
   }
}
