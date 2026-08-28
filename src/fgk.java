import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fgk extends hdp {
   private static final xe b = xe.c("mco.reset.world.seed");
   public static final xe a = xe.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final foc C = new foc(this);
   private final Consumer<fhg> D;
   private fkx E;
   private fha F = fha.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final xe I;

   public fgk(Consumer<fhg> $$0, xe $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aS_() {
      this.E = new fkx(this.p, 210, 20, xe.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.l, this.p);
      fog $$0 = this.C.c(fog.d()).a(10);
      $$0.a(fny.a(this.p, this.E, b));
      $$0.a(fkv.a(fha::a).a(fha.values()).a(this.F).a(0, 0, 210, 20, xe.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(fkv.b(this.G).a(0, 0, 210, 20, xe.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      fog $$1 = this.C.b(fog.e().a(10));
      $$1.a(fko.a(this.I, $$0x -> this.D.accept(this.D())).a());
      $$1.a(fko.a(xd.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         fkm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aH_() {
      this.b(this.E);
   }

   private void a(fog $$0) {
      aug $$1 = auj.c();
      $$1.a();
      $$0.a(fko.a(xe.c("selectWorld.experiments"), $$1x -> this.m.a(new fvh(this, $$1, $$0xx -> {
            this.H.clear();

            for (aud $$1xx : $$0xx.f()) {
               if ($$1xx.l() == auh.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.m.a(this);
         }))).a(210).a());
   }

   private fhg D() {
      return new fhg(this.E.a(), this.F, this.G, this.H);
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
