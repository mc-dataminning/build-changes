public class aam implements zp<aai> {
   public static final zg<wf, aam> a = zp.a(aam::a, aam::new);
   private final int b;

   public aam(int $$0) {
      this.b = $$0;
   }

   private aam(wf $$0) {
      this.b = $$0.readInt();
   }

   private void a(wf $$0) {
      $$0.q(this.b);
   }

   @Override
   public zr<aam> a() {
      return aah.o;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }
}
