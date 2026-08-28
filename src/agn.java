public record agn(float b, boolean c) implements zs<ach> {
   public static final zj<wi, agn> a = zs.a(agn::a, agn::new);

   private agn(wi $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static agn a(bsq $$0) {
      return new agn($$0.f(), $$0.l());
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<agn> a() {
      return agw.ci;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
