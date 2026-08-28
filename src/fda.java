import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fda extends gve {
   private static final xo b = xo.c("mco.reset.world.seed");
   public static final xo a = xo.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final fkp C = new fkp(this);
   private final Consumer<fdw> D;
   private fhl E;
   private fdq F = fdq.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final xo I;

   public fda(Consumer<fdw> $$0, xo $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aM_() {
      this.E = new fhl(this.p, 210, 20, xo.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.l, this.p);
      fkt $$0 = this.C.c(fkt.d()).a(10);
      $$0.a(fkl.a(this.p, this.E, b));
      $$0.a(fhj.a(fdq::a).a(fdq.values()).a(this.F).a(0, 0, 210, 20, xo.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(fhj.b(this.G).a(0, 0, 210, 20, xo.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      fkt $$1 = this.C.b(fkt.e().a(10));
      $$1.a(fhc.a(this.I, $$0x -> this.D.accept(this.D())).a());
      $$1.a(fhc.a(xn.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         fha var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aC_() {
      this.b(this.E);
   }

   private void a(fkt $$0) {
      atz $$1 = auc.c();
      $$1.a();
      $$0.a(fhc.a(xo.c("selectWorld.experiments"), $$1x -> this.m.a(new frt(this, $$1, $$0xx -> {
            this.H.clear();

            for (atw $$1xx : $$0xx.f()) {
               if ($$1xx.l() == aua.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.m.a(this);
         }))).a(210).a());
   }

   private fdw D() {
      return new fdw(this.E.a(), this.F, this.G, this.H);
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
