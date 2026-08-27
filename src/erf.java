import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class erf extends ghw {
   private static final uv b = uv.c("mco.reset.world.seed");
   public static final uv a = uv.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int v = 210;
   private final eyo w = new eyo(this);
   private final Consumer<esb> x;
   private evn y;
   private erv z = erv.a;
   private boolean A = true;
   private final Set<String> B = new HashSet<>();
   private final uv C;

   public erf(Consumer<esb> $$0, uv $$1) {
      super(a);
      this.x = $$0;
      this.C = $$1;
   }

   @Override
   public void aQ_() {
      this.y = new evn(this.i, 210, 20, uv.c("mco.reset.world.seed"));
      this.y.l(32);
      this.c(this.y);
      this.w.a(new ewl(this.e, this.i));
      eys $$0 = this.w.c(eys.d()).a(10);
      $$0.a(eyk.a(this.i, this.y, b));
      $$0.a(evl.a(erv::a).a(erv.values()).a(this.z).a(0, 0, 210, 20, uv.c("selectWorld.mapType"), ($$0x, $$1x) -> this.z = $$1x));
      $$0.a(evl.b(this.A).a(0, 0, 210, 20, uv.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.A = $$1x));
      this.a($$0);
      eys $$1 = this.w.b(eys.e().a(10));
      $$1.a(eve.a(this.C, $$0x -> this.x.accept(this.C())).a());
      $$1.a(eve.a(uu.k, $$0x -> this.aG_()).a());
      this.w.a($$1x -> {
         evc var10000 = this.d($$1x);
      });
      this.c();
   }

   private void a(eys $$0) {
      aow $$1 = aoz.c();
      $$1.a();
      $$0.a(eve.a(uv.c("selectWorld.experiments"), $$1x -> this.f.a(new ffs(this, $$1, $$0xx -> {
            this.B.clear();

            for (aot $$1xx : $$0xx.f()) {
               if ($$1xx.j() == aox.d) {
                  this.B.add($$1xx.f());
               }
            }

            this.f.a(this);
         }))).a(210).a());
   }

   private esb C() {
      return new esb(this.y.a(), this.z, this.A, this.B);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   @Override
   public void aG_() {
      this.x.accept(null);
   }
}
