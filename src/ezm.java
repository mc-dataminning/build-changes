import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class ezm extends grl {
   private static final wg b = wg.c("mco.reset.world.seed");
   public static final wg a = wg.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int y = 210;
   private final fhc z = new fhc(this);
   private final Consumer<fai> A;
   private fdy B;
   private fac C = fac.a;
   private boolean D = true;
   private final Set<String> E = new HashSet<>();
   private final wg F;

   public ezm(Consumer<fai> $$0, wg $$1) {
      super(a);
      this.A = $$0;
      this.F = $$1;
   }

   @Override
   public void aN_() {
      this.B = new fdy(this.m, 210, 20, wg.c("mco.reset.world.seed"));
      this.B.f(32);
      this.z.a(this.i, this.m);
      fhg $$0 = this.z.c(fhg.d()).a(10);
      $$0.a(fgy.a(this.m, this.B, b));
      $$0.a(fdw.a(fac::a).a(fac.values()).a(this.C).a(0, 0, 210, 20, wg.c("selectWorld.mapType"), ($$0x, $$1x) -> this.C = $$1x));
      $$0.a(fdw.b(this.D).a(0, 0, 210, 20, wg.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.D = $$1x));
      this.a($$0);
      fhg $$1 = this.z.b(fhg.e().a(10));
      $$1.a(fdp.a(this.F, $$0x -> this.A.accept(this.C())).a());
      $$1.a(fdp.a(wf.k, $$0x -> this.d()).a());
      this.z.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aD_() {
      this.b(this.B);
   }

   private void a(fhg $$0) {
      asn $$1 = asq.c();
      $$1.a();
      $$0.a(fdp.a(wg.c("selectWorld.experiments"), $$1x -> this.j.a(new fog(this, $$1, $$0xx -> {
            this.E.clear();

            for (ask $$1xx : $$0xx.f()) {
               if ($$1xx.l() == aso.d) {
                  this.E.add($$1xx.g());
               }
            }

            this.j.a(this);
         }))).a(210).a());
   }

   private fai C() {
      return new fai(this.B.a(), this.C, this.D, this.E);
   }

   @Override
   protected void c() {
      this.z.a();
   }

   @Override
   public void d() {
      this.A.accept(null);
   }
}
