public class evi extends gmv {
   private static final int a = 212;
   private static final vq b = vq.c("mco.configure.world.name");
   private static final vq c = vq.c("mco.configure.world.description");
   private final euq v;
   private final eth w;
   private ezq x;
   private ezq y;

   public evi(euq $$0, eth $$1) {
      super(vq.c("mco.configure.world.settings.title"));
      this.v = $$0;
      this.w = $$1;
   }

   @Override
   public void aQ_() {
      int $$0 = this.g / 2 - 106;
      String $$1 = this.w.e == eth.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      ezh $$2 = ezh.a(vq.c($$1), $$0x -> {
         if (this.w.e == eth.c.b) {
            vq $$1x = vq.c("mco.configure.world.close.question.line1");
            vq $$2x = vq.c("mco.configure.world.close.question.line2");
            this.f.a(new euw($$0xx -> {
               if ($$0xx) {
                  this.v.a(this);
               } else {
                  this.f.a(this);
               }
            }, euw.a.b, $$1x, $$2x, true));
         } else {
            this.v.a(false, this);
         }
      }).a(this.g / 2 - 53, g(0), 106, 20).a();
      this.d($$2);
      this.y = new ezq(this.f.h, $$0, g(4), 212, 20, vq.c("mco.configure.world.name"));
      this.y.f(32);
      this.y.a(this.w.b());
      this.d(this.y);
      this.x = new ezq(this.f.h, $$0, g(8), 212, 20, vq.c("mco.configure.world.description"));
      this.x.f(32);
      this.x.a(this.w.a());
      this.d(this.x);
      ezh $$3 = this.d(ezh.a(vq.c("mco.configure.world.buttons.done"), $$0x -> this.g()).a($$0 - 2, g(12), 106, 20).a());
      this.y.b($$1x -> $$3.j = !ac.b($$1x));
      this.d(ezh.a(vp.e, $$0x -> this.d()).a(this.g / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   protected void aH_() {
      this.c(this.y);
   }

   @Override
   public void d() {
      this.f.a(this.v);
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      $$0.a(this.i, b, this.g / 2 - 106, g(3), -1, false);
      $$0.a(this.i, c, this.g / 2 - 106, g(7), -1, false);
   }

   public void g() {
      this.v.a(this.y.a(), this.x.a());
   }
}
