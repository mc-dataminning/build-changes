public record afs(float b, boolean c) implements ze<abq> {
   public static final yv<vx, afs> a = ze.a(afs::a, afs::new);

   private afs(vx $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static afs a(bqf $$0) {
      return new afs($$0.f(), $$0.l());
   }

   private void a(vx $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zg<afs> a() {
      return agb.ce;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
