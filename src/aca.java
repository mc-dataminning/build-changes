public class aca implements zb<abn> {
   public static final ys<vr, aca> a = zb.a(aca::a, aca::new);
   private final bqa b;
   private final boolean c;

   public aca(bqa $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aca(vr $$0) {
      this.b = bqa.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vr $$0) {
      $$0.k(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zd<aca> a() {
      return afz.m;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bqa e() {
      return this.b;
   }
}
