import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class esx extends gkc {
   private static final vd b = vd.c("mco.reset.world.seed");
   public static final vd a = vd.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int v = 210;
   private final fai w = new fai(this);
   private final Consumer<ett> x;
   private exh y;
   private etn z = etn.a;
   private boolean A = true;
   private final Set<String> B = new HashSet<>();
   private final vd C;

   public esx(Consumer<ett> $$0, vd $$1) {
      super(a);
      this.x = $$0;
      this.C = $$1;
   }

   @Override
   public void aN_() {
      this.y = new exh(this.i, 210, 20, vd.c("mco.reset.world.seed"));
      this.y.e(32);
      this.c(this.y);
      this.w.a(new eyf(this.e, this.i));
      fam $$0 = this.w.c(fam.d()).a(10);
      $$0.a(fae.a(this.i, this.y, b));
      $$0.a(exf.a(etn::a).a(etn.values()).a(this.z).a(0, 0, 210, 20, vd.c("selectWorld.mapType"), ($$0x, $$1x) -> this.z = $$1x));
      $$0.a(exf.b(this.A).a(0, 0, 210, 20, vd.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.A = $$1x));
      this.a($$0);
      fam $$1 = this.w.b(fam.e().a(10));
      $$1.a(ewy.a(this.C, $$0x -> this.x.accept(this.C())).a());
      $$1.a(ewy.a(vc.k, $$0x -> this.aE_()).a());
      this.w.a($$1x -> {
         eww var10000 = this.d($$1x);
      });
      this.c();
   }

   private void a(fam $$0) {
      apn $$1 = apq.c();
      $$1.a();
      $$0.a(ewy.a(vd.c("selectWorld.experiments"), $$1x -> this.f.a(new fhm(this, $$1, $$0xx -> {
            this.B.clear();

            for (apk $$1xx : $$0xx.f()) {
               if ($$1xx.j() == apo.d) {
                  this.B.add($$1xx.f());
               }
            }

            this.f.a(this);
         }))).a(210).a());
   }

   private ett C() {
      return new ett(this.y.a(), this.z, this.A, this.B);
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
