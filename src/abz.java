public class abz implements zb<abm> {
   public static final ys<vu, abz> a = zb.a(abz::a, abz::new);
   private final bpj b;
   private final boolean c;

   public abz(bpj $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private abz(vu $$0) {
      this.b = bpj.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.k(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zd<abz> a() {
      return afx.m;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bpj e() {
      return this.b;
   }
}
