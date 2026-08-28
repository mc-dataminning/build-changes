public record agk(float b, boolean c) implements zp<ace> {
   public static final zg<wf, agk> a = zp.a(agk::a, agk::new);

   private agk(wf $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static agk a(bsm $$0) {
      return new agk($$0.f(), $$0.l());
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zr<agk> a() {
      return agt.ci;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
