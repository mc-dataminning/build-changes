public record agb(float b, boolean c) implements zc<abr> {
   public static final yt<vr, agb> a = zc.a(agb::a, agb::new);

   private agb(vr $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static agb a(btz $$0) {
      return new agb($$0.f(), $$0.l());
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public ze<agb> a() {
      return agk.cq;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
