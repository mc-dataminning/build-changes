import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fby extends gty {
   private static final wx b = wx.c("mco.reset.world.seed");
   public static final wx a = wx.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final fjn C = new fjn(this);
   private final Consumer<fcu> D;
   private fgj E;
   private fco F = fco.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final wx I;

   public fby(Consumer<fcu> $$0, wx $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aN_() {
      this.E = new fgj(this.p, 210, 20, wx.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.l, this.p);
      fjr $$0 = this.C.c(fjr.d()).a(10);
      $$0.a(fjj.a(this.p, this.E, b));
      $$0.a(fgh.a(fco::a).a(fco.values()).a(this.F).a(0, 0, 210, 20, wx.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(fgh.b(this.G).a(0, 0, 210, 20, wx.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      fjr $$1 = this.C.b(fjr.e().a(10));
      $$1.a(fga.a(this.I, $$0x -> this.D.accept(this.C())).a());
      $$1.a(fga.a(ww.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         ffy var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aD_() {
      this.b(this.E);
   }

   private void a(fjr $$0) {
      ati $$1 = atl.c();
      $$1.a();
      $$0.a(fga.a(wx.c("selectWorld.experiments"), $$1x -> this.m.a(new fqr(this, $$1, $$0xx -> {
            this.H.clear();

            for (atf $$1xx : $$0xx.f()) {
               if ($$1xx.l() == atj.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.m.a(this);
         }))).a(210).a());
   }

   private fcu C() {
      return new fcu(this.E.a(), this.F, this.G, this.H);
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
