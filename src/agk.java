public record agk(float b, boolean c) implements zv<ach> {
   public static final zm<wl, agk> a = zv.a(agk::a, agk::new);

   private agk(wl $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static agk a(bre $$0) {
      return new agk($$0.f(), $$0.l());
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zx<agk> a() {
      return agt.cf;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
