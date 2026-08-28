import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fgg extends hdk {
   private static final xd b = xd.c("mco.reset.world.seed");
   public static final xd a = xd.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final fny C = new fny(this);
   private final Consumer<fhc> D;
   private fkt E;
   private fgw F = fgw.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final xd I;

   public fgg(Consumer<fhc> $$0, xd $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aR_() {
      this.E = new fkt(this.p, 210, 20, xd.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.l, this.p);
      foc $$0 = this.C.c(foc.d()).a(10);
      $$0.a(fnu.a(this.p, this.E, b));
      $$0.a(fkr.a(fgw::a).a(fgw.values()).a(this.F).a(0, 0, 210, 20, xd.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(fkr.b(this.G).a(0, 0, 210, 20, xd.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      foc $$1 = this.C.b(foc.e().a(10));
      $$1.a(fkk.a(this.I, $$0x -> this.D.accept(this.D())).a());
      $$1.a(fkk.a(xc.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         fki var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aG_() {
      this.b(this.E);
   }

   private void a(foc $$0) {
      aue $$1 = auh.c();
      $$1.a();
      $$0.a(fkk.a(xd.c("selectWorld.experiments"), $$1x -> this.m.a(new fvd(this, $$1, $$0xx -> {
            this.H.clear();

            for (aub $$1xx : $$0xx.f()) {
               if ($$1xx.l() == auf.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.m.a(this);
         }))).a(210).a());
   }

   private fhc D() {
      return new fhc(this.E.a(), this.F, this.G, this.H);
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
