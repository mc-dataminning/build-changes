import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fhd extends hep {
   private static final xi b = xi.c("mco.reset.world.seed");
   public static final xi a = xi.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final fow C = new fow(this);
   private final Consumer<fhz> D;
   private flq E;
   private fht F = fht.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final xi I;

   public fhd(Consumer<fhz> $$0, xi $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aR_() {
      this.E = new flq(this.p, 210, 20, xi.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.l, this.p);
      fpa $$0 = this.C.c(fpa.d()).a(10);
      $$0.a(fos.a(this.p, this.E, b));
      $$0.a(flo.a(fht::a).a(fht.values()).a(this.F).a(0, 0, 210, 20, xi.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(flo.b(this.G).a(0, 0, 210, 20, xi.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      fpa $$1 = this.C.b(fpa.e().a(10));
      $$1.a(flh.a(this.I, $$0x -> this.D.accept(this.D())).a());
      $$1.a(flh.a(xh.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         flf var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aG_() {
      this.b(this.E);
   }

   private void a(fpa $$0) {
      aul $$1 = auo.c();
      $$1.a();
      $$0.a(flh.a(xi.c("selectWorld.experiments"), $$1x -> this.m.a(new fwb(this, $$1, $$0xx -> {
            this.H.clear();

            for (aui $$1xx : $$0xx.g()) {
               if ($$1xx.l() == aum.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.m.a(this);
         }))).a(210).a());
   }

   private fhz D() {
      return new fhz(this.E.a(), this.F, this.G, this.H);
   }

   @Override
   protected void c() {
      this.C.a();
   }

   @Override
   public void d() {
      this.D.accept(null);
   }
}
