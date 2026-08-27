public class acw implements xz<aai> {
   public static final xq<us, acw> a = xz.a(acw::a, acw::new);
   private final int b;
   private final byte c;

   public acw(bof $$0, byte $$1) {
      this.b = $$0.aj();
      this.c = $$1;
   }

   private acw(us $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(us $$0) {
      $$0.c(this.b);
      $$0.k(this.c);
   }

   @Override
   public yb<acw> a() {
      return aet.am;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public bof a(cwe $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
