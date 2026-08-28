public class act implements zr<acg> {
   public static final zi<wh, act> a = zr.a(act::a, act::new);
   private final bsx b;
   private final boolean c;

   public act(bsx $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private act(wh $$0) {
      this.b = bsx.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(wh $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zt<act> a() {
      return agz.m;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bsx e() {
      return this.b;
   }
}
