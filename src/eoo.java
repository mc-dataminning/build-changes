import java.util.function.Consumer;

public class eoo extends gew {
   private static final ti b = ti.c("mco.reset.world.seed");
   public static final ti a = ti.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int y = 210;
   private final evu z = new evu(this);
   private final Consumer<epk> A;
   private esu B;
   private epe C = epe.a;
   private boolean D = true;
   private final ti E;

   public eoo(Consumer<epk> $$0, ti $$1) {
      super(a);
      this.A = $$0;
      this.E = $$1;
   }

   @Override
   public void aD_() {
      this.B = new esu(this.i, 210, 20, ti.c("mco.reset.world.seed"));
      this.B.l(32);
      this.c(this.B);
      this.z.a(new etr(this.e, this.i));
      evy $$0 = this.z.c(evy.d()).a(10);
      $$0.a(evq.a(this.i, this.B, b));
      $$0.a(ess.a(epe::a).a(epe.values()).a(this.C).a(0, 0, 210, 20, ti.c("selectWorld.mapType"), ($$0x, $$1x) -> this.C = $$1x));
      $$0.a(ess.b(this.D).a(0, 0, 210, 20, ti.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.D = $$1x));
      evy $$1 = this.z.b(evy.e().a(10));
      $$1.a(esl.a(this.E, $$0x -> this.A.accept(this.C())).a());
      $$1.a(esl.a(th.k, $$0x -> this.au_()).a());
      this.z.a($$1x -> {
         esj var10000 = this.d($$1x);
      });
      this.b();
   }

   private epk C() {
      return new epk(this.B.a(), this.C, this.D);
   }

   @Override
   protected void b() {
      this.z.a();
   }

   @Override
   public void au_() {
      this.A.accept(null);
   }
}
