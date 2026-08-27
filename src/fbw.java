import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fbw extends gty {
   private static final wx b = wx.c("mco.reset.world.seed");
   public static final wx a = wx.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final fjm C = new fjm(this);
   private final Consumer<fcs> D;
   private fgi E;
   private fcm F = fcm.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final wx I;

   public fbw(Consumer<fcs> $$0, wx $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aM_() {
      this.E = new fgi(this.p, 210, 20, wx.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.l, this.p);
      fjq $$0 = this.C.c(fjq.d()).a(10);
      $$0.a(fji.a(this.p, this.E, b));
      $$0.a(fgg.a(fcm::a).a(fcm.values()).a(this.F).a(0, 0, 210, 20, wx.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(fgg.b(this.G).a(0, 0, 210, 20, wx.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      fjq $$1 = this.C.b(fjq.e().a(10));
      $$1.a(ffz.a(this.I, $$0x -> this.D.accept(this.C())).a());
      $$1.a(ffz.a(ww.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         ffx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aC_() {
      this.b(this.E);
   }

   private void a(fjq $$0) {
      ath $$1 = atk.c();
      $$1.a();
      $$0.a(ffz.a(wx.c("selectWorld.experiments"), $$1x -> this.m.a(new fqr(this, $$1, $$0xx -> {
            this.H.clear();

            for (ate $$1xx : $$0xx.f()) {
               if ($$1xx.l() == ati.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.m.a(this);
         }))).a(210).a());
   }

   private fcs C() {
      return new fcs(this.E.a(), this.F, this.G, this.H);
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
