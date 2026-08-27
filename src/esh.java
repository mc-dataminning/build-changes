import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class esh extends gjl {
   private static final vb b = vb.c("mco.reset.world.seed");
   public static final vb a = vb.c("mco.reset.world.generate");
   private static final int c = 10;
   private static final int v = 210;
   private final ezr w = new ezr(this);
   private final Consumer<etd> x;
   private ewq y;
   private esx z = esx.a;
   private boolean A = true;
   private final Set<String> B = new HashSet<>();
   private final vb C;

   public esh(Consumer<etd> $$0, vb $$1) {
      super(a);
      this.x = $$0;
      this.C = $$1;
   }

   @Override
   public void aP_() {
      this.y = new ewq(this.i, 210, 20, vb.c("mco.reset.world.seed"));
      this.y.l(32);
      this.c(this.y);
      this.w.a(new exo(this.e, this.i));
      ezv $$0 = this.w.c(ezv.d()).a(10);
      $$0.a(ezn.a(this.i, this.y, b));
      $$0.a(ewo.a(esx::a).a(esx.values()).a(this.z).a(0, 0, 210, 20, vb.c("selectWorld.mapType"), ($$0x, $$1x) -> this.z = $$1x));
      $$0.a(ewo.b(this.A).a(0, 0, 210, 20, vb.c("selectWorld.mapFeatures"), ($$0x, $$1x) -> this.A = $$1x));
      this.a($$0);
      ezv $$1 = this.w.b(ezv.e().a(10));
      $$1.a(ewh.a(this.C, $$0x -> this.x.accept(this.C())).a());
      $$1.a(ewh.a(va.k, $$0x -> this.aF_()).a());
      this.w.a($$1x -> {
         ewf var10000 = this.d($$1x);
      });
      this.c();
   }

   private void a(ezv $$0) {
      apd $$1 = apg.c();
      $$1.a();
      $$0.a(ewh.a(vb.c("selectWorld.experiments"), $$1x -> this.f.a(new fgv(this, $$1, $$0xx -> {
            this.B.clear();

            for (apa $$1xx : $$0xx.f()) {
               if ($$1xx.j() == ape.d) {
                  this.B.add($$1xx.f());
               }
            }

            this.f.a(this);
         }))).a(210).a());
   }

   private etd C() {
      return new etd(this.y.a(), this.z, this.A, this.B);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   @Override
   public void aF_() {
      this.x.accept(null);
   }
}
