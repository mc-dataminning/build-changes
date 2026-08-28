import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fei extends gwo {
   private static final wz b = wz.c("mco.reset.world.seed");
   public static final wz a = wz.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final flx C = new flx(this);
   private final Consumer<ffe> D;
   private fit E;
   private fey F = fey.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final wz I;

   public fei(Consumer<ffe> $$0, wz $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aT_() {
      this.E = new fit(this.o, 210, 20, wz.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.k, this.o);
      fmb $$0 = this.C.c(fmb.d()).a(10);
      $$0.a(flt.a(this.o, this.E, b));
      $$0.a(fir.a(fey::a).a(fey.values()).a(this.F).a(0, 0, 210, 20, wz.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(fir.b(this.G).a(0, 0, 210, 20, wz.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      fmb $$1 = this.C.b(fmb.e().a(10));
      $$1.a(fik.a(this.I, $$0x -> this.D.accept(this.C())).a());
      $$1.a(fik.a(wy.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         fii var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aI_() {
      this.b(this.E);
   }

   private void a(fmb $$0) {
      atp $$1 = ats.c();
      $$1.a();
      $$0.a(fik.a(wz.c("selectWorld.experiments"), $$1x -> this.l.a(new ftd(this, $$1, $$0xx -> {
            this.H.clear();

            for (atm $$1xx : $$0xx.f()) {
               if ($$1xx.l() == atq.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.l.a(this);
         }))).a(210).a());
   }

   private ffe C() {
      return new ffe(this.E.a(), this.F, this.G, this.H);
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
