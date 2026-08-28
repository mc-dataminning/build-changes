public class aed implements zs<ace> {
   public static final zj<wl, aed> a = zs.a(aed::a, aed::new);
   private final int b;
   private final alb c;

   public aed(int $$0, cys<?> $$1) {
      this.b = $$0;
      this.c = $$1.a();
   }

   private aed(wl $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
   }

   private void a(wl $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<aed> a() {
      return agq.Y;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public alb b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
