import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fds extends gvu {
   private static final wu b = wu.c("mco.reset.world.seed");
   public static final wu a = wu.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int A = 210;
   private final flh B = new flh(this);
   private final Consumer<feo> C;
   private fid D;
   private fei E = fei.a;
   private boolean F = true;
   private final Set<String> G = new HashSet<>();
   private final wu H;

   public fds(Consumer<feo> $$0, wu $$1) {
      super(a);
      this.C = $$0;
      this.H = $$1;
   }

   @Override
   public void aP_() {
      this.D = new fid(this.o, 210, 20, wu.c("mco.reset.world.seed"));
      this.D.f(32);
      this.B.a(this.k, this.o);
      fll $$0 = this.B.c(fll.d()).a(10);
      $$0.a(fld.a(this.o, this.D, b));
      $$0.a(fib.a(fei::a).a(fei.values()).a(this.E).a(0, 0, 210, 20, wu.c("selectWorld.mapType"), ($$0x, $$1x) -> this.E = $$1x));
      $$0.a(fib.b(this.F).a(0, 0, 210, 20, wu.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.F = $$1x));
      this.a($$0);
      fll $$1 = this.B.b(fll.e().a(10));
      $$1.a(fhu.a(this.H, $$0x -> this.C.accept(this.D())).a());
      $$1.a(fhu.a(wt.k, $$0x -> this.d()).a());
      this.B.a($$1x -> {
         fhs var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aE_() {
      this.b(this.D);
   }

   private void a(fll $$0) {
      ath $$1 = atk.c();
      $$1.a();
      $$0.a(fhu.a(wu.c("selectWorld.experiments"), $$1x -> this.l.a(new fsl(this, $$1, $$0xx -> {
            this.G.clear();

            for (ate $$1xx : $$0xx.f()) {
               if ($$1xx.l() == ati.d) {
                  this.G.add($$1xx.g());
               }
            }

            this.l.a(this);
         }))).a(210).a());
   }

   private feo D() {
      return new feo(this.D.a(), this.E, this.F, this.G);
   }

   @Override
   protected void c() {
      this.B.a();
   }

   @Override
   public void d() {
      this.C.accept(null);
   }
}
