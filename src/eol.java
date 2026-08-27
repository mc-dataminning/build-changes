import java.util.function.Consumer;

public class eol extends ged {
   private static final te a = te.c("mco.reset.world.seed");
   private static final int b = 10;
   private static final int c = 210;
   private final evk y = new evk(this);
   private final Consumer<eph> z;
   private esr A;
   private epb B = epb.a;
   private boolean C = true;
   private final te D;

   public eol(Consumer<eph> $$0, te $$1) {
      super(te.c("mco.reset.world.generate"));
      this.z = $$0;
      this.D = $$1;
   }

   @Override
   public void aE_() {
      this.A = new esr(this.i, 208, 20, te.c("mco.reset.world.seed"));
      this.A.k(32);
      this.c(this.A);
      this.y.a(new etn(this.e, this.i));
      evo $$0 = this.y.c(evo.d()).a(10);
      $$0.c().b();
      evo $$1 = $$0.a(evo.d().a(4));
      $$1.a(new etn(a, this.i), evn::a);
      $$1.a(this.A, $$0x -> $$0x.a(1));
      $$0.a(esp.a(epb::a).a(epb.values()).a(this.B).a(0, 0, 210, 20, te.c("selectWorld.mapType"), ($$0x, $$1x) -> this.B = $$1x));
      $$0.a(esp.b(this.C).a(0, 0, 210, 20, te.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.C = $$1x));
      evo $$2 = this.y.b(evo.e().a(10));
      $$2.a(esi.a(this.D, $$0x -> this.z.accept(this.B())).a());
      $$2.a(esi.a(td.k, $$0x -> this.au_()).a());
      this.y.a($$1x -> {
         esg var10000 = this.d($$1x);
      });
      this.b();
   }

   private eph B() {
      return new eph(this.A.a(), this.B, this.C);
   }

   @Override
   protected void b() {
      this.y.a();
   }

   @Override
   public void au_() {
      this.z.accept(null);
   }
}
