import java.util.function.Consumer;

public class eok extends gei {
   private static final tf a = tf.c("mco.reset.world.seed");
   private static final int b = 10;
   private static final int c = 210;
   private final evo y = new evo(this);
   private final Consumer<epg> z;
   private esq A;
   private epa B = epa.a;
   private boolean C = true;
   private final tf D;

   public eok(Consumer<epg> $$0, tf $$1) {
      super(tf.c("mco.reset.world.generate"));
      this.z = $$0;
      this.D = $$1;
   }

   @Override
   public void aE_() {
      this.A = new esq(this.i, 210, 20, tf.c("mco.reset.world.seed"));
      this.A.k(32);
      this.c(this.A);
      this.y.a(new etm(this.e, this.i));
      evs $$0 = this.y.c(evs.d()).a(10);
      $$0.c().b();
      evs $$1 = $$0.a(evs.d().a(4));
      $$1.a(new etm(a, this.i), evr::a);
      $$1.a(this.A);
      $$0.a(eso.a(epa::a).a(epa.values()).a(this.B).a(0, 0, 210, 20, tf.c("selectWorld.mapType"), ($$0x, $$1x) -> this.B = $$1x));
      $$0.a(eso.b(this.C).a(0, 0, 210, 20, tf.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.C = $$1x));
      evs $$2 = this.y.b(evs.e().a(10));
      $$2.a(esh.a(this.D, $$0x -> this.z.accept(this.B())).a());
      $$2.a(esh.a(te.k, $$0x -> this.au_()).a());
      this.y.a($$1x -> {
         esf var10000 = this.d($$1x);
      });
      this.b();
   }

   private epg B() {
      return new epg(this.A.a(), this.B, this.C);
   }

   @Override
   protected void b() {
      this.y.a();
   }

   @Override
   public void au_() {
      this.z.accept(null);
   }
}
