public class acs implements zq<acf> {
   public static final zh<wg, acs> a = zq.a(acs::a, acs::new);
   private final bsh b;
   private final boolean c;

   public acs(bsh $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acs(wg $$0) {
      this.b = bsh.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(wg $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zs<acs> a() {
      return agu.m;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bsh e() {
      return this.b;
   }
}
