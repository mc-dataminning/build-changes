import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class exf extends gpe {
   private static final vu b = vu.c("mco.reset.world.seed");
   public static final vu a = vu.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int v = 210;
   private final fev w = new fev(this);
   private final Consumer<eyb> x;
   private fbr y;
   private exv z = exv.a;
   private boolean A = true;
   private final Set<String> B = new HashSet<>();
   private final vu C;

   public exf(Consumer<eyb> $$0, vu $$1) {
      super(a);
      this.x = $$0;
      this.C = $$1;
   }

   @Override
   public void aO_() {
      this.y = new fbr(this.i, 210, 20, vu.c("mco.reset.world.seed"));
      this.y.f(32);
      this.w.a(new fcp(this.e, this.i));
      fez $$0 = this.w.c(fez.d()).a(10);
      $$0.a(fer.a(this.i, this.y, b));
      $$0.a(fbp.a(exv::a).a(exv.values()).a(this.z).a(0, 0, 210, 20, vu.c("selectWorld.mapType"), ($$0x, $$1x) -> this.z = $$1x));
      $$0.a(fbp.b(this.A).a(0, 0, 210, 20, vu.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.A = $$1x));
      this.a($$0);
      fez $$1 = this.w.b(fez.e().a(10));
      $$1.a(fbi.a(this.C, $$0x -> this.x.accept(this.E())).a());
      $$1.a(fbi.a(vt.k, $$0x -> this.d()).a());
      this.w.a($$1x -> {
         fbg var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aF_() {
      this.b(this.y);
   }

   private void a(fez $$0) {
      arz $$1 = asc.c();
      $$1.a();
      $$0.a(fbi.a(vu.c("selectWorld.experiments"), $$1x -> this.f.a(new fma(this, $$1, $$0xx -> {
            this.B.clear();

            for (arw $$1xx : $$0xx.f()) {
               if ($$1xx.l() == asa.d) {
                  this.B.add($$1xx.g());
               }
            }

            this.f.a(this);
         }))).a(210).a());
   }

   private eyb E() {
      return new eyb(this.y.a(), this.z, this.A, this.B);
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
