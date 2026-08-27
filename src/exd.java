import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class exd extends gpb {
   private static final vu b = vu.c("mco.reset.world.seed");
   public static final vu a = vu.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int v = 210;
   private final fet w = new fet(this);
   private final Consumer<exz> x;
   private fbp y;
   private ext z = ext.a;
   private boolean A = true;
   private final Set<String> B = new HashSet<>();
   private final vu C;

   public exd(Consumer<exz> $$0, vu $$1) {
      super(a);
      this.x = $$0;
      this.C = $$1;
   }

   @Override
   public void aO_() {
      this.y = new fbp(this.i, 210, 20, vu.c("mco.reset.world.seed"));
      this.y.f(32);
      this.w.a(new fcn(this.e, this.i));
      fex $$0 = this.w.c(fex.d()).a(10);
      $$0.a(fep.a(this.i, this.y, b));
      $$0.a(fbn.a(ext::a).a(ext.values()).a(this.z).a(0, 0, 210, 20, vu.c("selectWorld.mapType"), ($$0x, $$1x) -> this.z = $$1x));
      $$0.a(fbn.b(this.A).a(0, 0, 210, 20, vu.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.A = $$1x));
      this.a($$0);
      fex $$1 = this.w.b(fex.e().a(10));
      $$1.a(fbg.a(this.C, $$0x -> this.x.accept(this.E())).a());
      $$1.a(fbg.a(vt.k, $$0x -> this.d()).a());
      this.w.a($$1x -> {
         fbe var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aF_() {
      this.b(this.y);
   }

   private void a(fex $$0) {
      arz $$1 = asc.c();
      $$1.a();
      $$0.a(fbg.a(vu.c("selectWorld.experiments"), $$1x -> this.f.a(new fly(this, $$1, $$0xx -> {
            this.B.clear();

            for (arw $$1xx : $$0xx.f()) {
               if ($$1xx.l() == asa.d) {
                  this.B.add($$1xx.g());
               }
            }

            this.f.a(this);
         }))).a(210).a());
   }

   private exz E() {
      return new exz(this.y.a(), this.z, this.A, this.B);
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
