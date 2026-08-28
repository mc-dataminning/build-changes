public class acd implements zc<abr> {
   public static final yt<vr, acd> a = zc.a(acd::a, acd::new);
   private final btn b;
   private final boolean c;

   public acd(btn $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acd(vr $$0) {
      this.b = btn.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vr $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public ze<acd> a() {
      return agk.l;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public btn e() {
      return this.b;
   }
}
