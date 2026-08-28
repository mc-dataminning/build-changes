import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fek extends gwq {
   private static final wz b = wz.c("mco.reset.world.seed");
   public static final wz a = wz.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final flz C = new flz(this);
   private final Consumer<ffg> D;
   private fiv E;
   private ffa F = ffa.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final wz I;

   public fek(Consumer<ffg> $$0, wz $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aT_() {
      this.E = new fiv(this.o, 210, 20, wz.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.k, this.o);
      fmd $$0 = this.C.c(fmd.d()).a(10);
      $$0.a(flv.a(this.o, this.E, b));
      $$0.a(fit.a(ffa::a).a(ffa.values()).a(this.F).a(0, 0, 210, 20, wz.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(fit.b(this.G).a(0, 0, 210, 20, wz.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      fmd $$1 = this.C.b(fmd.e().a(10));
      $$1.a(fim.a(this.I, $$0x -> this.D.accept(this.C())).a());
      $$1.a(fim.a(wy.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         fik var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aI_() {
      this.b(this.E);
   }

   private void a(fmd $$0) {
      atp $$1 = ats.c();
      $$1.a();
      $$0.a(fim.a(wz.c("selectWorld.experiments"), $$1x -> this.l.a(new ftf(this, $$1, $$0xx -> {
            this.H.clear();

            for (atm $$1xx : $$0xx.f()) {
               if ($$1xx.l() == atq.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.l.a(this);
         }))).a(210).a());
   }

   private ffg C() {
      return new ffg(this.E.a(), this.F, this.G, this.H);
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
