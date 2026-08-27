import java.util.function.Consumer;

public class eot extends gfb {
   private static final tl b = tl.c("mco.reset.world.seed");
   public static final tl a = tl.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int y = 210;
   private final evz z = new evz(this);
   private final Consumer<epp> A;
   private esz B;
   private epj C = epj.a;
   private boolean D = true;
   private final tl E;

   public eot(Consumer<epp> $$0, tl $$1) {
      super(a);
      this.A = $$0;
      this.E = $$1;
   }

   @Override
   public void aI_() {
      this.B = new esz(this.i, 210, 20, tl.c("mco.reset.world.seed"));
      this.B.l(32);
      this.c(this.B);
      this.z.a(new etw(this.e, this.i));
      ewd $$0 = this.z.c(ewd.d()).a(10);
      $$0.a(evv.a(this.i, this.B, b));
      $$0.a(esx.a(epj::a).a(epj.values()).a(this.C).a(0, 0, 210, 20, tl.c("selectWorld.mapType"), ($$0x, $$1x) -> this.C = $$1x));
      $$0.a(esx.b(this.D).a(0, 0, 210, 20, tl.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.D = $$1x));
      ewd $$1 = this.z.b(ewd.e().a(10));
      $$1.a(esq.a(this.E, $$0x -> this.A.accept(this.C())).a());
      $$1.a(esq.a(tk.k, $$0x -> this.az_()).a());
      this.z.a($$1x -> {
         eso var10000 = this.d($$1x);
      });
      this.b();
   }

   private epp C() {
      return new epp(this.B.a(), this.C, this.D);
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
