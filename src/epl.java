import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class epl extends gfx {
   private static final ui b = ui.c("mco.reset.world.seed");
   public static final ui a = ui.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int y = 210;
   private final ewt z = new ewt(this);
   private final Consumer<eqh> A;
   private ets B;
   private eqb C = eqb.a;
   private boolean D = true;
   private final Set<String> E = new HashSet<>();
   private final ui F;

   public epl(Consumer<eqh> $$0, ui $$1) {
      super(a);
      this.A = $$0;
      this.F = $$1;
   }

   @Override
   public void aM_() {
      this.B = new ets(this.i, 210, 20, ui.c("mco.reset.world.seed"));
      this.B.l(32);
      this.c(this.B);
      this.z.a(new euq(this.e, this.i));
      ewx $$0 = this.z.c(ewx.d()).a(10);
      $$0.a(ewp.a(this.i, this.B, b));
      $$0.a(etq.a(eqb::a).a(eqb.values()).a(this.C).a(0, 0, 210, 20, ui.c("selectWorld.mapType"), ($$0x, $$1x) -> this.C = $$1x));
      $$0.a(etq.b(this.D).a(0, 0, 210, 20, ui.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.D = $$1x));
      this.a($$0);
      ewx $$1 = this.z.b(ewx.e().a(10));
      $$1.a(etj.a(this.F, $$0x -> this.A.accept(this.C())).a());
      $$1.a(etj.a(uh.k, $$0x -> this.aC_()).a());
      this.z.a($$1x -> {
         eth var10000 = this.d($$1x);
      });
      this.c();
   }

   private void a(ewx $$0) {
      aoe $$1 = aoh.c();
      $$1.a();
      $$0.a(etj.a(ui.c("selectWorld.experiments"), $$1x -> this.f.a(new fdv(this, $$1, $$0xx -> {
            this.E.clear();

            for (aob $$1xx : $$0xx.f()) {
               if ($$1xx.j() == aof.d) {
                  this.E.add($$1xx.f());
               }
            }

            this.f.a(this);
         }))).a(210).a());
   }

   private eqh C() {
      return new eqh(this.B.a(), this.C, this.D, this.E);
   }

   @Override
   protected void c() {
      this.z.a();
   }

   @Override
   public void aC_() {
      this.A.accept(null);
   }
}
