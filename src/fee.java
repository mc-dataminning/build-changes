import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fee extends gwj {
   private static final wy b = wy.c("mco.reset.world.seed");
   public static final wy a = wy.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int A = 210;
   private final flt B = new flt(this);
   private final Consumer<ffa> C;
   private fip D;
   private feu E = feu.a;
   private boolean F = true;
   private final Set<String> G = new HashSet<>();
   private final wy H;

   public fee(Consumer<ffa> $$0, wy $$1) {
      super(a);
      this.C = $$0;
      this.H = $$1;
   }

   @Override
   public void aP_() {
      this.D = new fip(this.o, 210, 20, wy.c("mco.reset.world.seed"));
      this.D.f(32);
      this.B.a(this.k, this.o);
      flx $$0 = this.B.c(flx.d()).a(10);
      $$0.a(flp.a(this.o, this.D, b));
      $$0.a(fin.a(feu::a).a(feu.values()).a(this.E).a(0, 0, 210, 20, wy.c("selectWorld.mapType"), ($$0x, $$1x) -> this.E = $$1x));
      $$0.a(fin.b(this.F).a(0, 0, 210, 20, wy.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.F = $$1x));
      this.a($$0);
      flx $$1 = this.B.b(flx.e().a(10));
      $$1.a(fig.a(this.H, $$0x -> this.C.accept(this.D())).a());
      $$1.a(fig.a(wx.k, $$0x -> this.d()).a());
      this.B.a($$1x -> {
         fie var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aE_() {
      this.b(this.D);
   }

   private void a(flx $$0) {
      ato $$1 = atr.c();
      $$1.a();
      $$0.a(fig.a(wy.c("selectWorld.experiments"), $$1x -> this.l.a(new fsz(this, $$1, $$0xx -> {
            this.G.clear();

            for (atl $$1xx : $$0xx.f()) {
               if ($$1xx.l() == atp.d) {
                  this.G.add($$1xx.g());
               }
            }

            this.l.a(this);
         }))).a(210).a());
   }

   private ffa D() {
      return new ffa(this.D.a(), this.E, this.F, this.G);
   }

   @Override
   protected void c() {
      this.B.a();
   }

   @Override
   public void d() {
      this.C.accept(null);
   }
}
