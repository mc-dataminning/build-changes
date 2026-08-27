import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class era extends ghr {
   private static final ur b = ur.c("mco.reset.world.seed");
   public static final ur a = ur.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int v = 210;
   private final eyj w = new eyj(this);
   private final Consumer<erw> x;
   private evi y;
   private erq z = erq.a;
   private boolean A = true;
   private final Set<String> B = new HashSet<>();
   private final ur C;

   public era(Consumer<erw> $$0, ur $$1) {
      super(a);
      this.x = $$0;
      this.C = $$1;
   }

   @Override
   public void aP_() {
      this.y = new evi(this.i, 210, 20, ur.c("mco.reset.world.seed"));
      this.y.l(32);
      this.c(this.y);
      this.w.a(new ewg(this.e, this.i));
      eyn $$0 = this.w.c(eyn.d()).a(10);
      $$0.a(eyf.a(this.i, this.y, b));
      $$0.a(evg.a(erq::a).a(erq.values()).a(this.z).a(0, 0, 210, 20, ur.c("selectWorld.mapType"), ($$0x, $$1x) -> this.z = $$1x));
      $$0.a(evg.b(this.A).a(0, 0, 210, 20, ur.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.A = $$1x));
      this.a($$0);
      eyn $$1 = this.w.b(eyn.e().a(10));
      $$1.a(euz.a(this.C, $$0x -> this.x.accept(this.C())).a());
      $$1.a(euz.a(uq.k, $$0x -> this.aF_()).a());
      this.w.a($$1x -> {
         eux var10000 = this.d($$1x);
      });
      this.c();
   }

   private void a(eyn $$0) {
      aos $$1 = aov.c();
      $$1.a();
      $$0.a(euz.a(ur.c("selectWorld.experiments"), $$1x -> this.f.a(new ffn(this, $$1, $$0xx -> {
            this.B.clear();

            for (aop $$1xx : $$0xx.f()) {
               if ($$1xx.j() == aot.d) {
                  this.B.add($$1xx.f());
               }
            }

            this.f.a(this);
         }))).a(210).a());
   }

   private erw C() {
      return new erw(this.y.a(), this.z, this.A, this.B);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   @Override
   public void aF_() {
      this.x.accept(null);
   }
}
