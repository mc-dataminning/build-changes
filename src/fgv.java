import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fgv extends hee {
   private static final xh b = xh.c("mco.reset.world.seed");
   public static final xh a = xh.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final fon C = new fon(this);
   private final Consumer<fhr> D;
   private fli E;
   private fhl F = fhl.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final xh I;

   public fgv(Consumer<fhr> $$0, xh $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aS_() {
      this.E = new fli(this.p, 210, 20, xh.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.l, this.p);
      fos $$0 = this.C.c(fos.d()).a(10);
      $$0.a(foj.a(this.p, this.E, b));
      $$0.a(flg.a(fhl::a).a(fhl.values()).a(this.F).a(0, 0, 210, 20, xh.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(flg.b(this.G).a(0, 0, 210, 20, xh.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      fos $$1 = this.C.b(fos.e().a(10));
      $$1.a(fkz.a(this.I, $$0x -> this.D.accept(this.D())).a());
      $$1.a(fkz.a(xg.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         fkx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aH_() {
      this.b(this.E);
   }

   private void a(fos $$0) {
      auk $$1 = aun.c();
      $$1.a();
      $$0.a(fkz.a(xh.c("selectWorld.experiments"), $$1x -> this.m.a(new fvs(this, $$1, $$0xx -> {
            this.H.clear();

            for (auh $$1xx : $$0xx.g()) {
               if ($$1xx.l() == aul.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.m.a(this);
         }))).a(210).a());
   }

   private fhr D() {
      return new fhr(this.E.a(), this.F, this.G, this.H);
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
