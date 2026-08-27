public class aha implements zb<afz> {
   public static final ys<vu, aha> a = zb.a(aha::a, aha::new);
   private final int b;
   private final akh c;
   private final boolean d;

   public aha(int $$0, cxf<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private aha(vu $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zd<aha> a() {
      return afx.bG;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public akh e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
