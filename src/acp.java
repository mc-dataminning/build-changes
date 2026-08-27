public class acp implements vf<abe> {
   private final int a;

   public acp(int $$0) {
      this.a = $$0;
   }

   public acp(sq $$0) {
      this.a = $$0.readShort();
   }

   @Override
   public void a(sq $$0) {
      $$0.l(this.a);
   }

   public void a(abe $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }
}
