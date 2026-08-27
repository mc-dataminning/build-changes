import java.util.function.Consumer;

public class eon extends gex {
   private static final tl b = tl.c("mco.reset.world.seed");
   public static final tl a = tl.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int y = 210;
   private final evu z = new evu(this);
   private final Consumer<epj> A;
   private est B;
   private epd C = epd.a;
   private boolean D = true;
   private final tl E;

   public eon(Consumer<epj> $$0, tl $$1) {
      super(a);
      this.A = $$0;
      this.E = $$1;
   }

   @Override
   public void aH_() {
      this.B = new est(this.i, 210, 20, tl.c("mco.reset.world.seed"));
      this.B.l(32);
      this.c(this.B);
      this.z.a(new etr(this.e, this.i));
      evy $$0 = this.z.c(evy.d()).a(10);
      $$0.a(evq.a(this.i, this.B, b));
      $$0.a(esr.a(epd::a).a(epd.values()).a(this.C).a(0, 0, 210, 20, tl.c("selectWorld.mapType"), ($$0x, $$1x) -> this.C = $$1x));
      $$0.a(esr.b(this.D).a(0, 0, 210, 20, tl.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.D = $$1x));
      evy $$1 = this.z.b(evy.e().a(10));
      $$1.a(esk.a(this.E, $$0x -> this.A.accept(this.D())).a());
      $$1.a(esk.a(tk.k, $$0x -> this.az_()).a());
      this.z.a($$1x -> {
         esi var10000 = this.d($$1x);
      });
      this.b();
   }

   private epj D() {
      return new epj(this.B.a(), this.C, this.D);
   }

   @Override
   protected void b() {
      this.z.a();
   }

   @Override
   public void az_() {
      this.A.accept(null);
   }
}
