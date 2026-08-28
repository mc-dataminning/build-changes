public class aft implements zs<ach> {
   public static final zj<wi, aft> a = zs.a(aft::a, aft::new);
   private final int b;

   public aft(int $$0) {
      this.b = $$0;
   }

   private aft(wi $$0) {
      this.b = $$0.readByte();
   }

   private void a(wi $$0) {
      $$0.l(this.b);
   }

   @Override
   public zu<aft> a() {
      return agw.aI;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }
}
