import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class eto extends gld {
   private static final vg b = vg.c("mco.reset.world.seed");
   public static final vg a = vg.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int v = 210;
   private final fbb w = new fbb(this);
   private final Consumer<euk> x;
   private eya y;
   private eue z = eue.a;
   private boolean A = true;
   private final Set<String> B = new HashSet<>();
   private final vg C;

   public eto(Consumer<euk> $$0, vg $$1) {
      super(a);
      this.x = $$0;
      this.C = $$1;
   }

   @Override
   public void aP_() {
      this.y = new eya(this.i, 210, 20, vg.c("mco.reset.world.seed"));
      this.y.f(32);
      this.c(this.y);
      this.w.a(new eyy(this.e, this.i));
      fbf $$0 = this.w.c(fbf.d()).a(10);
      $$0.a(fax.a(this.i, this.y, b));
      $$0.a(exy.a(eue::a).a(eue.values()).a(this.z).a(0, 0, 210, 20, vg.c("selectWorld.mapType"), ($$0x, $$1x) -> this.z = $$1x));
      $$0.a(exy.b(this.A).a(0, 0, 210, 20, vg.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.A = $$1x));
      this.a($$0);
      fbf $$1 = this.w.b(fbf.e().a(10));
      $$1.a(exr.a(this.C, $$0x -> this.x.accept(this.E())).a());
      $$1.a(exr.a(vf.k, $$0x -> this.d()).a());
      this.w.a($$1x -> {
         exp var10000 = this.d($$1x);
      });
      this.c();
   }

   private void a(fbf $$0) {
      apu $$1 = apx.c();
      $$1.a();
      $$0.a(exr.a(vg.c("selectWorld.experiments"), $$1x -> this.f.a(new fif(this, $$1, $$0xx -> {
            this.B.clear();

            for (apr $$1xx : $$0xx.f()) {
               if ($$1xx.j() == apv.d) {
                  this.B.add($$1xx.f());
               }
            }

            this.f.a(this);
         }))).a(210).a());
   }

   private euk E() {
      return new euk(this.y.a(), this.z, this.A, this.B);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   @Override
   public void d() {
      this.x.accept(null);
   }
}
