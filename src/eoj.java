import java.util.function.Consumer;

public class eoj extends ger {
   private static final tf a = tf.c("mco.reset.world.seed");
   private static final int b = 10;
   private static final int c = 210;
   private final evp y = new evp(this);
   private final Consumer<epf> z;
   private esp A;
   private eoz B = eoz.a;
   private boolean C = true;
   private final tf D;

   public eoj(Consumer<epf> $$0, tf $$1) {
      super(tf.c("mco.reset.world.generate"));
      this.z = $$0;
      this.D = $$1;
   }

   @Override
   public void aC_() {
      this.A = new esp(this.i, 210, 20, tf.c("mco.reset.world.seed"));
      this.A.l(32);
      this.c(this.A);
      this.y.a(new etm(this.e, this.i));
      evt $$0 = this.y.c(evt.d()).a(10);
      $$0.a(evl.a(this.i, this.A, a));
      $$0.a(esn.a(eoz::a).a(eoz.values()).a(this.B).a(0, 0, 210, 20, tf.c("selectWorld.mapType"), ($$0x, $$1x) -> this.B = $$1x));
      $$0.a(esn.b(this.C).a(0, 0, 210, 20, tf.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.C = $$1x));
      evt $$1 = this.y.b(evt.e().a(10));
      $$1.a(esg.a(this.D, $$0x -> this.z.accept(this.C())).a());
      $$1.a(esg.a(te.k, $$0x -> this.at_()).a());
      this.y.a($$1x -> {
         ese var10000 = this.d($$1x);
      });
      this.b();
   }

   private epf C() {
      return new epf(this.A.a(), this.B, this.C);
   }

   @Override
   protected void b() {
      this.y.a();
   }

   @Override
   public void at_() {
      this.z.accept(null);
   }
}
