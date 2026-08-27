public class afr implements yp<afn> {
   public static final yg<vi, afr> a = yp.a(afr::a, afr::new);
   private final boc b;

   public afr(boc $$0) {
      this.b = $$0;
   }

   private afr(vi $$0) {
      this.b = boc.a($$0.readUnsignedByte());
   }

   private void a(vi $$0) {
      $$0.k(this.b.a());
   }

   @Override
   public yr<afr> a() {
      return afl.bg;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public boc b() {
      return this.b;
   }
}
