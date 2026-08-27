import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class eve extends gmv {
   private static final vq b = vq.c("mco.reset.world.seed");
   public static final vq a = vq.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int v = 210;
   private final fct w = new fct(this);
   private final Consumer<ewa> x;
   private ezq y;
   private evu z = evu.a;
   private boolean A = true;
   private final Set<String> B = new HashSet<>();
   private final vq C;

   public eve(Consumer<ewa> $$0, vq $$1) {
      super(a);
      this.x = $$0;
      this.C = $$1;
   }

   @Override
   public void aQ_() {
      this.y = new ezq(this.i, 210, 20, vq.c("mco.reset.world.seed"));
      this.y.f(32);
      this.w.a(new fao(this.e, this.i));
      fcx $$0 = this.w.c(fcx.d()).a(10);
      $$0.a(fcp.a(this.i, this.y, b));
      $$0.a(ezo.a(evu::a).a(evu.values()).a(this.z).a(0, 0, 210, 20, vq.c("selectWorld.mapType"), ($$0x, $$1x) -> this.z = $$1x));
      $$0.a(ezo.b(this.A).a(0, 0, 210, 20, vq.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.A = $$1x));
      this.a($$0);
      fcx $$1 = this.w.b(fcx.e().a(10));
      $$1.a(ezh.a(this.C, $$0x -> this.x.accept(this.E())).a());
      $$1.a(ezh.a(vp.k, $$0x -> this.d()).a());
      this.w.a($$1x -> {
         ezf var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   protected void aH_() {
      this.c(this.y);
   }

   private void a(fcx $$0) {
      arl $$1 = aro.c();
      $$1.a();
      $$0.a(ezh.a(vq.c("selectWorld.experiments"), $$1x -> this.f.a(new fjx(this, $$1, $$0xx -> {
            this.B.clear();

            for (ari $$1xx : $$0xx.f()) {
               if ($$1xx.j() == arm.d) {
                  this.B.add($$1xx.f());
               }
            }

            this.f.a(this);
         }))).a(210).a());
   }

   private ewa E() {
      return new ewa(this.y.a(), this.z, this.A, this.B);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   @Override
   public void d() {
      this.x.accept(null);
   }
}
