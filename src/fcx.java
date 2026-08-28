import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fcx extends gvb {
   private static final xl b = xl.c("mco.reset.world.seed");
   public static final xl a = xl.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final fkm C = new fkm(this);
   private final Consumer<fdt> D;
   private fhi E;
   private fdn F = fdn.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final xl I;

   public fcx(Consumer<fdt> $$0, xl $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aN_() {
      this.E = new fhi(this.p, 210, 20, xl.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.l, this.p);
      fkq $$0 = this.C.c(fkq.d()).a(10);
      $$0.a(fki.a(this.p, this.E, b));
      $$0.a(fhg.a(fdn::a).a(fdn.values()).a(this.F).a(0, 0, 210, 20, xl.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(fhg.b(this.G).a(0, 0, 210, 20, xl.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      fkq $$1 = this.C.b(fkq.e().a(10));
      $$1.a(fgz.a(this.I, $$0x -> this.D.accept(this.C())).a());
      $$1.a(fgz.a(xk.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         fgx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aD_() {
      this.b(this.E);
   }

   private void a(fkq $$0) {
      atw $$1 = atz.c();
      $$1.a();
      $$0.a(fgz.a(xl.c("selectWorld.experiments"), $$1x -> this.m.a(new frq(this, $$1, $$0xx -> {
            this.H.clear();

            for (att $$1xx : $$0xx.f()) {
               if ($$1xx.l() == atx.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.m.a(this);
         }))).a(210).a());
   }

   private fdt C() {
      return new fdt(this.E.a(), this.F, this.G, this.H);
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
