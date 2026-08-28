public class acn implements zl<aca> {
   public static final zc<wb, acn> a = zl.a(acn::a, acn::new);
   private final brp b;
   private final boolean c;

   public acn(brp $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acn(wb $$0) {
      this.b = brp.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(wb $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zn<acn> a() {
      return agp.m;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public brp e() {
      return this.b;
   }
}
