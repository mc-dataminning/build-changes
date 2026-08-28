public record agf(float b, boolean c) implements zk<abz> {
   public static final zb<wa, agf> a = zk.a(agf::a, agf::new);

   private agf(wa $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static agf a(brt $$0) {
      return new agf($$0.f(), $$0.l());
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zm<agf> a() {
      return ago.ci;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
