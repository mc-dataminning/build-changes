import java.util.function.Consumer;

public class elm extends gan {
   private static final sw a = sw.c("mco.reset.world.seed");
   private final Consumer<emi> b;
   private epr c;
   private emc G = emc.a;
   private boolean H = true;
   private final sw I;

   public elm(Consumer<emi> $$0, sw $$1) {
      super(sw.c("mco.reset.world.generate"));
      this.b = $$0;
      this.I = $$1;
   }

   @Override
   public void f() {
      this.c.a();
      super.f();
   }

   @Override
   public void b() {
      this.c = new epr(this.f.h, this.g / 2 - 100, h(2), 200, 20, null, sw.c("mco.reset.world.seed"));
      this.c.m(32);
      this.e(this.c);
      this.c(this.c);
      this.d(epp.a(emc::a).a(emc.values()).a(this.G).a(this.g / 2 - 102, h(4), 205, 20, sw.c("selectWorld.mapType"), ($$0, $$1) -> this.G = $$1));
      this.d(epp.b(this.H).a(this.g / 2 - 102, h(6) - 2, 205, 20, sw.c("selectWorld.mapFeatures"), ($$0, $$1) -> this.H = $$1));
      this.d(epi.a(this.I, $$0 -> this.b.accept(new emi(this.c.b(), this.G, this.H))).a(this.g / 2 - 102, h(12), 97, 20).a());
      this.d(epi.a(sv.k, $$0 -> this.aw_()).a(this.g / 2 + 8, h(12), 97, 20).a());
   }

   @Override
   public void aw_() {
      this.b.accept(null);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, this.e, this.g / 2, 17, 16777215);
      $$0.a(this.i, a, this.g / 2 - 100, h(1), 10526880, false);
      this.c.a($$0, $$1, $$2, $$3);
      super.a($$0, $$1, $$2, $$3);
   }
}
