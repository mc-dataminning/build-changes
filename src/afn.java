public class afn implements zs<ace> {
   public static final zj<wl, afn> a = zs.a(afn::a, afn::new);
   private final float b;
   private final int c;
   private final int d;

   public afn(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afn(wl $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zu<afn> a() {
      return agq.aG;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public float b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
