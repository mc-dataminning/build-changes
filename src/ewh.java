import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class ewh extends gob {
   private static final vs b = vs.c("mco.reset.world.seed");
   public static final vs a = vs.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int v = 210;
   private final fdw w = new fdw(this);
   private final Consumer<exd> x;
   private fat y;
   private ewx z = ewx.a;
   private boolean A = true;
   private final Set<String> B = new HashSet<>();
   private final vs C;

   public ewh(Consumer<exd> $$0, vs $$1) {
      super(a);
      this.x = $$0;
      this.C = $$1;
   }

   @Override
   public void aP_() {
      this.y = new fat(this.i, 210, 20, vs.c("mco.reset.world.seed"));
      this.y.f(32);
      this.w.a(new fbr(this.e, this.i));
      fea $$0 = this.w.c(fea.d()).a(10);
      $$0.a(fds.a(this.i, this.y, b));
      $$0.a(far.a(ewx::a).a(ewx.values()).a(this.z).a(0, 0, 210, 20, vs.c("selectWorld.mapType"), ($$0x, $$1x) -> this.z = $$1x));
      $$0.a(far.b(this.A).a(0, 0, 210, 20, vs.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.A = $$1x));
      this.a($$0);
      fea $$1 = this.w.b(fea.e().a(10));
      $$1.a(fak.a(this.C, $$0x -> this.x.accept(this.E())).a());
      $$1.a(fak.a(vr.k, $$0x -> this.d()).a());
      this.w.a($$1x -> {
         fai var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aG_() {
      this.b(this.y);
   }

   private void a(fea $$0) {
      arq $$1 = art.c();
      $$1.a();
      $$0.a(fak.a(vs.c("selectWorld.experiments"), $$1x -> this.f.a(new fla(this, $$1, $$0xx -> {
            this.B.clear();

            for (arn $$1xx : $$0xx.f()) {
               if ($$1xx.j() == arr.d) {
                  this.B.add($$1xx.f());
               }
            }

            this.f.a(this);
         }))).a(210).a());
   }

   private exd E() {
      return new exd(this.y.a(), this.z, this.A, this.B);
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
