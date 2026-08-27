import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class etd extends gkn {
   private static final vf b = vf.c("mco.reset.world.seed");
   public static final vf a = vf.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int v = 210;
   private final fao w = new fao(this);
   private final Consumer<etz> x;
   private exn y;
   private ett z = ett.a;
   private boolean A = true;
   private final Set<String> B = new HashSet<>();
   private final vf C;

   public etd(Consumer<etz> $$0, vf $$1) {
      super(a);
      this.x = $$0;
      this.C = $$1;
   }

   @Override
   public void aN_() {
      this.y = new exn(this.i, 210, 20, vf.c("mco.reset.world.seed"));
      this.y.f(32);
      this.c(this.y);
      this.w.a(new eyl(this.e, this.i));
      fas $$0 = this.w.c(fas.d()).a(10);
      $$0.a(fak.a(this.i, this.y, b));
      $$0.a(exl.a(ett::a).a(ett.values()).a(this.z).a(0, 0, 210, 20, vf.c("selectWorld.mapType"), ($$0x, $$1x) -> this.z = $$1x));
      $$0.a(exl.b(this.A).a(0, 0, 210, 20, vf.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.A = $$1x));
      this.a($$0);
      fas $$1 = this.w.b(fas.e().a(10));
      $$1.a(exe.a(this.C, $$0x -> this.x.accept(this.C())).a());
      $$1.a(exe.a(ve.k, $$0x -> this.aE_()).a());
      this.w.a($$1x -> {
         exc var10000 = this.d($$1x);
      });
      this.c();
   }

   private void a(fas $$0) {
      aps $$1 = apv.c();
      $$1.a();
      $$0.a(exe.a(vf.c("selectWorld.experiments"), $$1x -> this.f.a(new fhs(this, $$1, $$0xx -> {
            this.B.clear();

            for (app $$1xx : $$0xx.f()) {
               if ($$1xx.j() == apt.d) {
                  this.B.add($$1xx.f());
               }
            }

            this.f.a(this);
         }))).a(210).a());
   }

   private etz C() {
      return new etz(this.y.a(), this.z, this.A, this.B);
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
