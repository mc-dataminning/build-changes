import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class etf extends gkp {
   private static final vf b = vf.c("mco.reset.world.seed");
   public static final vf a = vf.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int v = 210;
   private final faq w = new faq(this);
   private final Consumer<eub> x;
   private exp y;
   private etv z = etv.a;
   private boolean A = true;
   private final Set<String> B = new HashSet<>();
   private final vf C;

   public etf(Consumer<eub> $$0, vf $$1) {
      super(a);
      this.x = $$0;
      this.C = $$1;
   }

   @Override
   public void aN_() {
      this.y = new exp(this.i, 210, 20, vf.c("mco.reset.world.seed"));
      this.y.f(32);
      this.c(this.y);
      this.w.a(new eyn(this.e, this.i));
      fau $$0 = this.w.c(fau.d()).a(10);
      $$0.a(fam.a(this.i, this.y, b));
      $$0.a(exn.a(etv::a).a(etv.values()).a(this.z).a(0, 0, 210, 20, vf.c("selectWorld.mapType"), ($$0x, $$1x) -> this.z = $$1x));
      $$0.a(exn.b(this.A).a(0, 0, 210, 20, vf.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.A = $$1x));
      this.a($$0);
      fau $$1 = this.w.b(fau.e().a(10));
      $$1.a(exg.a(this.C, $$0x -> this.x.accept(this.D())).a());
      $$1.a(exg.a(ve.k, $$0x -> this.aE_()).a());
      this.w.a($$1x -> {
         exe var10000 = this.d($$1x);
      });
      this.c();
   }

   private void a(fau $$0) {
      apt $$1 = apw.c();
      $$1.a();
      $$0.a(exg.a(vf.c("selectWorld.experiments"), $$1x -> this.f.a(new fhu(this, $$1, $$0xx -> {
            this.B.clear();

            for (apq $$1xx : $$0xx.f()) {
               if ($$1xx.j() == apu.d) {
                  this.B.add($$1xx.f());
               }
            }

            this.f.a(this);
         }))).a(210).a());
   }

   private eub D() {
      return new eub(this.y.a(), this.z, this.A, this.B);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   @Override
   public void aE_() {
      this.x.accept(null);
   }
}
