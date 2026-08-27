public class aat implements xx<aag> {
   public static final xo<uq, aat> a = xx.a(aat::a, aat::new);
   private final blt b;
   private final boolean c;

   public aat(blt $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aat(uq $$0) {
      this.b = blt.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(uq $$0) {
      $$0.k(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public xz<aat> a() {
      return aeq.m;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public blt e() {
      return this.b;
   }
}
