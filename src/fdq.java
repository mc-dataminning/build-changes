import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class fdq extends gvs {
   private static final wu b = wu.c("mco.reset.world.seed");
   public static final wu a = wu.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int A = 210;
   private final flf B = new flf(this);
   private final Consumer<fem> C;
   private fib D;
   private feg E = feg.a;
   private boolean F = true;
   private final Set<String> G = new HashSet<>();
   private final wu H;

   public fdq(Consumer<fem> $$0, wu $$1) {
      super(a);
      this.C = $$0;
      this.H = $$1;
   }

   @Override
   public void aP_() {
      this.D = new fib(this.o, 210, 20, wu.c("mco.reset.world.seed"));
      this.D.f(32);
      this.B.a(this.k, this.o);
      flj $$0 = this.B.c(flj.d()).a(10);
      $$0.a(flb.a(this.o, this.D, b));
      $$0.a(fhz.a(feg::a).a(feg.values()).a(this.E).a(0, 0, 210, 20, wu.c("selectWorld.mapType"), ($$0x, $$1x) -> this.E = $$1x));
      $$0.a(fhz.b(this.F).a(0, 0, 210, 20, wu.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.F = $$1x));
      this.a($$0);
      flj $$1 = this.B.b(flj.e().a(10));
      $$1.a(fhs.a(this.H, $$0x -> this.C.accept(this.E())).a());
      $$1.a(fhs.a(wt.k, $$0x -> this.d()).a());
      this.B.a($$1x -> {
         fhq var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aE_() {
      this.b(this.D);
   }

   private void a(flj $$0) {
      ath $$1 = atk.c();
      $$1.a();
      $$0.a(fhs.a(wu.c("selectWorld.experiments"), $$1x -> this.l.a(new fsj(this, $$1, $$0xx -> {
            this.G.clear();

            for (ate $$1xx : $$0xx.f()) {
               if ($$1xx.l() == ati.d) {
                  this.G.add($$1xx.g());
               }
            }

            this.l.a(this);
         }))).a(210).a());
   }

   private fem E() {
      return new fem(this.D.a(), this.E, this.F, this.G);
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
