import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fdd extends gvh {
   private static final xp b = xp.c("mco.reset.world.seed");
   public static final xp a = xp.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final fks C = new fks(this);
   private final Consumer<fdz> D;
   private fho E;
   private fdt F = fdt.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final xp I;

   public fdd(Consumer<fdz> $$0, xp $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aM_() {
      this.E = new fho(this.p, 210, 20, xp.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.l, this.p);
      fkw $$0 = this.C.c(fkw.d()).a(10);
      $$0.a(fko.a(this.p, this.E, b));
      $$0.a(fhm.a(fdt::a).a(fdt.values()).a(this.F).a(0, 0, 210, 20, xp.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(fhm.b(this.G).a(0, 0, 210, 20, xp.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      fkw $$1 = this.C.b(fkw.e().a(10));
      $$1.a(fhf.a(this.I, $$0x -> this.D.accept(this.E())).a());
      $$1.a(fhf.a(xo.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         fhd var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aB_() {
      this.b(this.E);
   }

   private void a(fkw $$0) {
      aua $$1 = aud.c();
      $$1.a();
      $$0.a(fhf.a(xp.c("selectWorld.experiments"), $$1x -> this.m.a(new frw(this, $$1, $$0xx -> {
            this.H.clear();

            for (atx $$1xx : $$0xx.f()) {
               if ($$1xx.l() == aub.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.m.a(this);
         }))).a(210).a());
   }

   private fdz E() {
      return new fdz(this.E.a(), this.F, this.G, this.H);
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
