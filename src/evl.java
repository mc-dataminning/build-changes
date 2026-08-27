import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class evl extends gnd {
   private static final vq b = vq.c("mco.reset.world.seed");
   public static final vq a = vq.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int v = 210;
   private final fda w = new fda(this);
   private final Consumer<ewh> x;
   private ezx y;
   private ewb z = ewb.a;
   private boolean A = true;
   private final Set<String> B = new HashSet<>();
   private final vq C;

   public evl(Consumer<ewh> $$0, vq $$1) {
      super(a);
      this.x = $$0;
      this.C = $$1;
   }

   @Override
   public void aQ_() {
      this.y = new ezx(this.i, 210, 20, vq.c("mco.reset.world.seed"));
      this.y.f(32);
      this.w.a(new fav(this.e, this.i));
      fde $$0 = this.w.c(fde.d()).a(10);
      $$0.a(fcw.a(this.i, this.y, b));
      $$0.a(ezv.a(ewb::a).a(ewb.values()).a(this.z).a(0, 0, 210, 20, vq.c("selectWorld.mapType"), ($$0x, $$1x) -> this.z = $$1x));
      $$0.a(ezv.b(this.A).a(0, 0, 210, 20, vq.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.A = $$1x));
      this.a($$0);
      fde $$1 = this.w.b(fde.e().a(10));
      $$1.a(ezo.a(this.C, $$0x -> this.x.accept(this.E())).a());
      $$1.a(ezo.a(vp.k, $$0x -> this.d()).a());
      this.w.a($$1x -> {
         ezm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aH_() {
      this.b(this.y);
   }

   private void a(fde $$0) {
      arm $$1 = arp.c();
      $$1.a();
      $$0.a(ezo.a(vq.c("selectWorld.experiments"), $$1x -> this.f.a(new fke(this, $$1, $$0xx -> {
            this.B.clear();

            for (arj $$1xx : $$0xx.f()) {
               if ($$1xx.j() == arn.d) {
                  this.B.add($$1xx.f());
               }
            }

            this.f.a(this);
         }))).a(210).a());
   }

   private ewh E() {
      return new ewh(this.y.a(), this.z, this.A, this.B);
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
