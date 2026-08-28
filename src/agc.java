public record agc(float b, boolean c) implements zd<abs> {
   public static final yu<vs, agc> a = zd.a(agc::a, agc::new);

   private agc(vs $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static agc a(buh $$0) {
      return new agc($$0.f(), $$0.l());
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zf<agc> a() {
      return agl.cq;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
