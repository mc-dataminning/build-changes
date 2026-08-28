public record ahf(float b) implements zp<agv> {
   public static final zg<wf, ahf> a = zp.a(ahf::a, ahf::new);

   private ahf(wf $$0) {
      this($$0.readFloat());
   }

   private void a(wf $$0) {
      $$0.a(this.b);
   }

   @Override
   public zr<ahf> a() {
      return agt.bp;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }
}
