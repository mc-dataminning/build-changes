import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class ete extends gko {
   private static final vf b = vf.c("mco.reset.world.seed");
   public static final vf a = vf.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int v = 210;
   private final fap w = new fap(this);
   private final Consumer<eua> x;
   private exo y;
   private etu z = etu.a;
   private boolean A = true;
   private final Set<String> B = new HashSet<>();
   private final vf C;

   public ete(Consumer<eua> $$0, vf $$1) {
      super(a);
      this.x = $$0;
      this.C = $$1;
   }

   @Override
   public void aN_() {
      this.y = new exo(this.i, 210, 20, vf.c("mco.reset.world.seed"));
      this.y.f(32);
      this.c(this.y);
      this.w.a(new eym(this.e, this.i));
      fat $$0 = this.w.c(fat.d()).a(10);
      $$0.a(fal.a(this.i, this.y, b));
      $$0.a(exm.a(etu::a).a(etu.values()).a(this.z).a(0, 0, 210, 20, vf.c("selectWorld.mapType"), ($$0x, $$1x) -> this.z = $$1x));
      $$0.a(exm.b(this.A).a(0, 0, 210, 20, vf.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.A = $$1x));
      this.a($$0);
      fat $$1 = this.w.b(fat.e().a(10));
      $$1.a(exf.a(this.C, $$0x -> this.x.accept(this.D())).a());
      $$1.a(exf.a(ve.k, $$0x -> this.aE_()).a());
      this.w.a($$1x -> {
         exd var10000 = this.d($$1x);
      });
      this.c();
   }

   private void a(fat $$0) {
      aps $$1 = apv.c();
      $$1.a();
      $$0.a(exf.a(vf.c("selectWorld.experiments"), $$1x -> this.f.a(new fht(this, $$1, $$0xx -> {
            this.B.clear();

            for (app $$1xx : $$0xx.f()) {
               if ($$1xx.j() == apt.d) {
                  this.B.add($$1xx.f());
               }
            }

            this.f.a(this);
         }))).a(210).a());
   }

   private eua D() {
      return new eua(this.y.a(), this.z, this.A, this.B);
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
