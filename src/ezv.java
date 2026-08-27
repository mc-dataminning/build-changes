import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class ezv extends gru {
   private static final wi b = wi.c("mco.reset.world.seed");
   public static final wi a = wi.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int y = 210;
   private final fhl z = new fhl(this);
   private final Consumer<far> A;
   private feh B;
   private fal C = fal.a;
   private boolean D = true;
   private final Set<String> E = new HashSet<>();
   private final wi F;

   public ezv(Consumer<far> $$0, wi $$1) {
      super(a);
      this.A = $$0;
      this.F = $$1;
   }

   @Override
   public void aM_() {
      this.B = new feh(this.m, 210, 20, wi.c("mco.reset.world.seed"));
      this.B.f(32);
      this.z.a(this.i, this.m);
      fhp $$0 = this.z.c(fhp.d()).a(10);
      $$0.a(fhh.a(this.m, this.B, b));
      $$0.a(fef.a(fal::a).a(fal.values()).a(this.C).a(0, 0, 210, 20, wi.c("selectWorld.mapType"), ($$0x, $$1x) -> this.C = $$1x));
      $$0.a(fef.b(this.D).a(0, 0, 210, 20, wi.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.D = $$1x));
      this.a($$0);
      fhp $$1 = this.z.b(fhp.e().a(10));
      $$1.a(fdy.a(this.F, $$0x -> this.A.accept(this.C())).a());
      $$1.a(fdy.a(wh.k, $$0x -> this.d()).a());
      this.z.a($$1x -> {
         fdw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aC_() {
      this.b(this.B);
   }

   private void a(fhp $$0) {
      asp $$1 = ass.c();
      $$1.a();
      $$0.a(fdy.a(wi.c("selectWorld.experiments"), $$1x -> this.j.a(new fop(this, $$1, $$0xx -> {
            this.E.clear();

            for (asm $$1xx : $$0xx.f()) {
               if ($$1xx.l() == asq.d) {
                  this.E.add($$1xx.g());
               }
            }

            this.j.a(this);
         }))).a(210).a());
   }

   private far C() {
      return new far(this.B.a(), this.C, this.D, this.E);
   }

   @Override
   protected void c() {
      this.z.a();
   }

   @Override
   public void d() {
      this.A.accept(null);
   }
}
