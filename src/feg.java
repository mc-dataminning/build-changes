import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class feg extends gxb {
   private static final xe b = xe.c("mco.reset.world.seed");
   public static final xe a = xe.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int B = 210;
   private final fma C = new fma(this);
   private final Consumer<ffc> D;
   private fiw E;
   private few F = few.a;
   private boolean G = true;
   private final Set<String> H = new HashSet<>();
   private final xe I;

   public feg(Consumer<ffc> $$0, xe $$1) {
      super(a);
      this.D = $$0;
      this.I = $$1;
   }

   @Override
   public void aN_() {
      this.E = new fiw(this.p, 210, 20, xe.c("mco.reset.world.seed"));
      this.E.f(32);
      this.C.a(this.l, this.p);
      fme $$0 = this.C.c(fme.d()).a(10);
      $$0.a(flw.a(this.p, this.E, b));
      $$0.a(fiu.a(few::a).a(few.values()).a(this.F).a(0, 0, 210, 20, xe.c("selectWorld.mapType"), ($$0x, $$1x) -> this.F = $$1x));
      $$0.a(fiu.b(this.G).a(0, 0, 210, 20, xe.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.G = $$1x));
      this.a($$0);
      fme $$1 = this.C.b(fme.e().a(10));
      $$1.a(fin.a(this.I, $$0x -> this.D.accept(this.C())).a());
      $$1.a(fin.a(xd.k, $$0x -> this.d()).a());
      this.C.a($$1x -> {
         fil var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aC_() {
      this.b(this.E);
   }

   private void a(fme $$0) {
      ato $$1 = atr.c();
      $$1.a();
      $$0.a(fin.a(xe.c("selectWorld.experiments"), $$1x -> this.m.a(new ftk(this, $$1, $$0xx -> {
            this.H.clear();

            for (atl $$1xx : $$0xx.f()) {
               if ($$1xx.l() == atp.d) {
                  this.H.add($$1xx.g());
               }
            }

            this.m.a(this);
         }))).a(210).a());
   }

   private ffc C() {
      return new ffc(this.E.a(), this.F, this.G, this.H);
   }

   @Override
   protected void c() {
      this.C.a();
   }

   @Override
   public void d() {
      this.D.accept(null);
   }
}
