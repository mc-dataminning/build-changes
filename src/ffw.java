import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class ffw extends hct {
   private static final xd b = xd.c("mco.reset.world.seed");
   public static final xd a = xd.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final fno C = new fno(this);
   private final Consumer<fgs> D;
   private fkj E;
   private fgm F = fgm.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final xd I;

   public ffw(Consumer<fgs> $$0, xd $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aT_() {
      this.E = new fkj(this.p, 210, 20, xd.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.l, this.p);
      fns $$0 = this.C.c(fns.d()).a(10);
      $$0.a(fnk.a(this.p, this.E, b));
      $$0.a(fkh.a(fgm::a).a(fgm.values()).a(this.F).a(0, 0, 210, 20, xd.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(fkh.b(this.G).a(0, 0, 210, 20, xd.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      fns $$1 = this.C.b(fns.e().a(10));
      $$1.a(fka.a(this.I, $$0x -> this.D.accept(this.D())).a());
      $$1.a(fka.a(xc.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         fjy var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aI_() {
      this.b(this.E);
   }

   private void a(fns $$0) {
      aud $$1 = aug.c();
      $$1.a();
      $$0.a(fka.a(xd.c("selectWorld.experiments"), $$1x -> this.m.a(new fut(this, $$1, $$0xx -> {
            this.H.clear();

            for (aua $$1xx : $$0xx.f()) {
               if ($$1xx.l() == aue.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.m.a(this);
         }))).a(210).a());
   }

   private fgs D() {
      return new fgs(this.E.a(), this.F, this.G, this.H);
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
