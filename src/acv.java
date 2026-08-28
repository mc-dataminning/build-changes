public class acv implements zw<aci> {
   public static final zn<wm, acv> a = zw.a(acv::a, acv::new);
   private final bqs b;
   private final boolean c;

   public acv(bqs $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acv(wm $$0) {
      this.b = bqs.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(wm $$0) {
      $$0.k(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zy<acv> a() {
      return agu.m;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bqs e() {
      return this.b;
   }
}
