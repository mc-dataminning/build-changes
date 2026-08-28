import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fdb extends gvf {
   private static final xo b = xo.c("mco.reset.world.seed");
   public static final xo a = xo.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final fkq C = new fkq(this);
   private final Consumer<fdx> D;
   private fhm E;
   private fdr F = fdr.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final xo I;

   public fdb(Consumer<fdx> $$0, xo $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aM_() {
      this.E = new fhm(this.p, 210, 20, xo.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.l, this.p);
      fku $$0 = this.C.c(fku.d()).a(10);
      $$0.a(fkm.a(this.p, this.E, b));
      $$0.a(fhk.a(fdr::a).a(fdr.values()).a(this.F).a(0, 0, 210, 20, xo.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(fhk.b(this.G).a(0, 0, 210, 20, xo.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      fku $$1 = this.C.b(fku.e().a(10));
      $$1.a(fhd.a(this.I, $$0x -> this.D.accept(this.E())).a());
      $$1.a(fhd.a(xn.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         fhb var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aB_() {
      this.b(this.E);
   }

   private void a(fku $$0) {
      atz $$1 = auc.c();
      $$1.a();
      $$0.a(fhd.a(xo.c("selectWorld.experiments"), $$1x -> this.m.a(new fru(this, $$1, $$0xx -> {
            this.H.clear();

            for (atw $$1xx : $$0xx.f()) {
               if ($$1xx.l() == aua.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.m.a(this);
         }))).a(210).a());
   }

   private fdx E() {
      return new fdx(this.E.a(), this.F, this.G, this.H);
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
