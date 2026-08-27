import java.util.function.Consumer;

public class eov extends gfd {
   private static final tn b = tn.c("mco.reset.world.seed");
   public static final tn a = tn.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int y = 210;
   private final ewb z = new ewb(this);
   private final Consumer<epr> A;
   private etb B;
   private epl C = epl.a;
   private boolean D = true;
   private final tn E;

   public eov(Consumer<epr> $$0, tn $$1) {
      super(a);
      this.A = $$0;
      this.E = $$1;
   }

   @Override
   public void aH_() {
      this.B = new etb(this.i, 210, 20, tn.c("mco.reset.world.seed"));
      this.B.l(32);
      this.c(this.B);
      this.z.a(new ety(this.e, this.i));
      ewf $$0 = this.z.c(ewf.d()).a(10);
      $$0.a(evx.a(this.i, this.B, b));
      $$0.a(esz.a(epl::a).a(epl.values()).a(this.C).a(0, 0, 210, 20, tn.c("selectWorld.mapType"), ($$0x, $$1x) -> this.C = $$1x));
      $$0.a(esz.b(this.D).a(0, 0, 210, 20, tn.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.D = $$1x));
      ewf $$1 = this.z.b(ewf.e().a(10));
      $$1.a(ess.a(this.E, $$0x -> this.A.accept(this.D())).a());
      $$1.a(ess.a(tm.k, $$0x -> this.az_()).a());
      this.z.a($$1x -> {
         esq var10000 = this.d($$1x);
      });
      this.b();
   }

   private epr D() {
      return new epr(this.B.a(), this.C, this.D);
   }

   @Override
   protected void b() {
      this.z.a();
   }

   @Override
   public void az_() {
      this.A.accept(null);
   }
}
