public class acr implements zs<ace> {
   public static final zj<wl, acr> a = zs.a(acr::a, acr::new);
   private final bqm b;
   private final boolean c;

   public acr(bqm $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acr(wl $$0) {
      this.b = bqm.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.k(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zu<acr> a() {
      return agq.m;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bqm e() {
      return this.b;
   }
}
