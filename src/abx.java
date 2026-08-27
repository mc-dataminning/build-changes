public class abx implements yz<abk> {
   public static final yq<vs, abx> a = yz.a(abx::a, abx::new);
   private final bon b;
   private final boolean c;

   public abx(bon $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private abx(vs $$0) {
      this.b = bon.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vs $$0) {
      $$0.k(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zb<abx> a() {
      return afv.m;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bon e() {
      return this.b;
   }
}
