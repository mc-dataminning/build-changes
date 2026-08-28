public class ade implements aac<acr> {
   public static final zt<ws, ade> a = aac.a(ade::a, ade::new);
   private final btb b;
   private final boolean c;

   public ade(btb $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ade(ws $$0) {
      this.b = btb.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(ws $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public aae<ade> a() {
      return ahk.m;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public btb e() {
      return this.b;
   }
}
