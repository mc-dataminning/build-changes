public class acr implements zp<ace> {
   public static final zg<wf, acr> a = zp.a(acr::a, acr::new);
   private final bsa b;
   private final boolean c;

   public acr(bsa $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acr(wf $$0) {
      this.b = bsa.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(wf $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zr<acr> a() {
      return agt.m;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bsa e() {
      return this.b;
   }
}
