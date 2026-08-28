public class acq implements zo<acd> {
   public static final zf<we, acq> a = zo.a(acq::a, acq::new);
   private final brv b;
   private final boolean c;

   public acq(brv $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acq(we $$0) {
      this.b = brv.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zq<acq> a() {
      return ags.m;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public brv e() {
      return this.b;
   }
}
