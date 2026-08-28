public class aex implements zs<ach> {
   public static final zj<wi, aex> a = zs.a(aex::a, aex::new);
   private final int b;
   private final byte c;

   public aex(bui $$0, byte $$1) {
      this.b = $$0.as();
      this.c = $$1;
   }

   private aex(wi $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(wi $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
   }

   @Override
   public zu<aex> a() {
      return agw.an;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public bui a(dff $$0) {
      return $$0.a(this.b);
   }

   public float b() {
      return azn.a(this.c);
   }
}
