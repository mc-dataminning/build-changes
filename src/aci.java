public class aci implements zh<abw> {
   public static final yy<vw, aci> a = zh.a(aci::a, aci::new);
   private final buo b;
   private final boolean c;

   public aci(buo $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aci(vw $$0) {
      this.b = buo.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vw $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zj<aci> a() {
      return agp.l;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public buo e() {
      return this.b;
   }
}
