import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class eqo extends ghe {
   private static final ur b = ur.c("mco.reset.world.seed");
   public static final ur a = ur.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int v = 210;
   private final exw w = new exw(this);
   private final Consumer<erk> x;
   private euv y;
   private ere z = ere.a;
   private boolean A = true;
   private final Set<String> B = new HashSet<>();
   private final ur C;

   public eqo(Consumer<erk> $$0, ur $$1) {
      super(a);
      this.x = $$0;
      this.C = $$1;
   }

   @Override
   public void aO_() {
      this.y = new euv(this.i, 210, 20, ur.c("mco.reset.world.seed"));
      this.y.l(32);
      this.c(this.y);
      this.w.a(new evt(this.e, this.i));
      eya $$0 = this.w.c(eya.d()).a(10);
      $$0.a(exs.a(this.i, this.y, b));
      $$0.a(eut.a(ere::a).a(ere.values()).a(this.z).a(0, 0, 210, 20, ur.c("selectWorld.mapType"), ($$0x, $$1x) -> this.z = $$1x));
      $$0.a(eut.b(this.A).a(0, 0, 210, 20, ur.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.A = $$1x));
      this.a($$0);
      eya $$1 = this.w.b(eya.e().a(10));
      $$1.a(eum.a(this.C, $$0x -> this.x.accept(this.C())).a());
      $$1.a(eum.a(uq.k, $$0x -> this.aE_()).a());
      this.w.a($$1x -> {
         euk var10000 = this.d($$1x);
      });
      this.c();
   }

   private void a(eya $$0) {
      aoo $$1 = aor.c();
      $$1.a();
      $$0.a(eum.a(ur.c("selectWorld.experiments"), $$1x -> this.f.a(new ffa(this, $$1, $$0xx -> {
            this.B.clear();

            for (aol $$1xx : $$0xx.f()) {
               if ($$1xx.j() == aop.d) {
                  this.B.add($$1xx.f());
               }
            }

            this.f.a(this);
         }))).a(210).a());
   }

   private erk C() {
      return new erk(this.y.a(), this.z, this.A, this.B);
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
