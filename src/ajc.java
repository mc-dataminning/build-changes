public class ajc implements zb<ajb> {
   public static final ys<vu, ajc> a = zb.a(ajc::a, ajc::new);
   private final long b;

   public ajc(long $$0) {
      this.b = $$0;
   }

   private ajc(vu $$0) {
      this.b = $$0.readLong();
   }

   private void a(vu $$0) {
      $$0.b(this.b);
   }

   @Override
   public zd<ajc> a() {
      return aja.b;
   }

   public void a(ajb $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
